package net.adeptstack_cms.cmsmod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FlatModernSeatBlock extends ModernSeatBlockBase {
    public static final BooleanProperty SUPPORT = BooleanProperty.create("support");
    private static final VoxelShape SHAPE = Shapes.or(Block.box(0, 5, 0, 16, 8, 16), Block.box(0,8,9,16,16,16), Block.box(6,0,6,10,5,10));
    private static final VoxelShape SHAPE_SUPPORT = Shapes.or(Block.box(0, 5, 0, 16, 8, 16), Block.box(0,8,9,16,16,16));

    public FlatModernSeatBlock(Properties properties, DyeColor color) {
        super(properties, color);
        registerDefaultState(defaultBlockState().setValue(SUPPORT, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(SUPPORT);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState state = super.getStateForPlacement(context);
        return state.setValue(SUPPORT, shouldHaveSupport(context.getLevel(), context.getClickedPos()));
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos currentPos, BlockPos neighborPos) {
        if (direction.getAxis().isHorizontal()) {
            level.scheduleTick(currentPos, this, 1);
        }
        if (state.getValue(BlockStateProperties.WATERLOGGED)) {
            level.scheduleTick(currentPos, net.minecraft.world.level.material.Fluids.WATER, net.minecraft.world.level.material.Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(state, direction, neighborState, level, currentPos, neighborPos);
    }

    private boolean shouldHaveSupport(LevelAccessor level, BlockPos pos) {
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            for (int i = 1; i <= 3; i++) {
                BlockPos neighborPos = pos.relative(direction, i);
                BlockState neighborState = level.getBlockState(neighborPos);
                if (neighborState.isFaceSturdy(level, neighborPos, direction.getOpposite())) {
                    return true;
                }
                if (!(neighborState.getBlock() instanceof FlatModernSeatBlock) && !(neighborState.getBlock() instanceof FloorModernSeatBlock)) {
                    break;
                }
            }
        }
        return false;
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        BlockState newState = state.setValue(SUPPORT, shouldHaveSupport(level, pos));
        if (newState != state) {
            level.setBlock(pos, newState, 3);
        }
    }

    @Override
    public VoxelShape shape() {
        return SHAPE;
    }

    @Override
    public VoxelShape getShape(BlockState state, net.minecraft.world.level.BlockGetter level, BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        VoxelShape baseShape = state.getValue(SUPPORT) ? SHAPE_SUPPORT : SHAPE;
        Direction facing = state.getValue(FACING);
        return switch(facing) {
            case NORTH -> baseShape;
            case SOUTH -> net.adeptstack_cms.cmsmod.Utils.rotateShape(Direction.NORTH, Direction.WEST, baseShape);
            case WEST -> net.adeptstack_cms.cmsmod.Utils.rotateShape(Direction.NORTH, Direction.EAST, baseShape);
            default -> net.adeptstack_cms.cmsmod.Utils.rotateShape(Direction.NORTH, Direction.SOUTH, baseShape);
        };
    }
}
