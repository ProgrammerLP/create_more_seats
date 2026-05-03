package net.adeptstack.cms.blocks;

import com.simibubi.create.foundation.block.ProperWaterloggedBlock;
import net.adeptstack.cms.Utils;
import net.adeptstack.cms.registry.CMSBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public abstract class ModernSeatBlockBase extends DirectionalSeatBlock implements ProperWaterloggedBlock {
    protected final DyeColor color;

    public ModernSeatBlockBase(Properties properties, DyeColor color) {
        super(properties, color);
        this.color = color;
        registerDefaultState(defaultBlockState().setValue(WATERLOGGED, false));
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack heldItem = player.getItemInHand(hand);
        if (heldItem.getItem() instanceof DyeItem dyeItem) {
            DyeColor dyeColor = dyeItem.getDyeColor();
            if (dyeColor != this.color) {
                if (world.isClientSide)
                    return InteractionResult.SUCCESS;
                BlockState newState = state.getBlock() instanceof FlatModernSeatBlock ? CMSBlocks.getSeatByColor(dyeColor).getDefaultState() : CMSBlocks.getFloorSeatByColor(dyeColor).getDefaultState();
                if (state.hasProperty(FACING))
                    newState = newState.setValue(FACING, state.getValue(FACING));
                if (state.hasProperty(WATERLOGGED))
                    newState = newState.setValue(WATERLOGGED, state.getValue(WATERLOGGED));
                world.setBlockAndUpdate(pos, newState);
                if (!player.isCreative())
                    heldItem.shrink(1);
                return InteractionResult.SUCCESS;
            }
            return InteractionResult.PASS;
        }
        return super.use(state, world, pos, player, hand, result);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public abstract VoxelShape shape();

    @Override
    public void updateEntityAfterFallOn(BlockGetter reader, Entity entity) {
        BlockPos pos = entity.blockPosition();
        if(entity instanceof Player || !(entity instanceof LivingEntity) || !canBePickedUp(entity) || isSeatOccupied(entity.level(), pos)) {
            if(entity.isSuppressingBounce()) {
                super.updateEntityAfterFallOn(reader, entity);
                return;
            }

            Vec3 vec3 = entity.getDeltaMovement();
            if(vec3.y < 0) {
                double d0 = entity instanceof LivingEntity ? 1 : 0.8;
                entity.setDeltaMovement(vec3.x, -vec3.y * 0.66 * d0, vec3.z);
            }

            return;
        }
        if(reader.getBlockState(pos).getBlock() != this) return;
        sitDown(entity.level(), pos, entity);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch(state.getValue(FACING)) {
            case NORTH -> shape();
            case SOUTH -> Utils.rotateShape(Direction.NORTH, Direction.SOUTH, shape());
            case WEST -> Utils.rotateShape(Direction.NORTH, Direction.WEST, shape());
            case EAST -> Utils.rotateShape(Direction.NORTH, Direction.EAST, shape());
            default -> shape();
        };
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return getShape(state, level, pos, context);
    }
}
