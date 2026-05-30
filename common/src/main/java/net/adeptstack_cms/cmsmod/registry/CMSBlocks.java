package net.adeptstack_cms.cmsmod.registry;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.adeptstack_cms.cmsmod.blocks.FlatModernSeatBlock;
import net.adeptstack_cms.cmsmod.blocks.FloorModernSeatBlock;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.material.MapColor;

public class CMSBlocks {

    public static final BlockEntry<FlatModernSeatBlock> BLACK_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_BLACK, DyeColor.BLACK);

    public static final BlockEntry<FlatModernSeatBlock> BLUE_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_BLUE, DyeColor.BLUE);

    public static final BlockEntry<FlatModernSeatBlock> BROWN_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_BROWN, DyeColor.BROWN);

    public static final BlockEntry<FlatModernSeatBlock> CYAN_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_CYAN, DyeColor.CYAN);

    public static final BlockEntry<FlatModernSeatBlock> GRAY_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_GRAY, DyeColor.GRAY);

    public static final BlockEntry<FlatModernSeatBlock> GREEN_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_GREEN, DyeColor.GREEN);

    public static final BlockEntry<FlatModernSeatBlock> LIGHTBLUE_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_LIGHT_BLUE, DyeColor.LIGHT_BLUE);

    public static final BlockEntry<FlatModernSeatBlock> LIGHTGRAY_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_LIGHT_GRAY, DyeColor.LIGHT_GRAY);

    public static final BlockEntry<FlatModernSeatBlock> LIME_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_LIGHT_GREEN, DyeColor.LIME);

    public static final BlockEntry<FlatModernSeatBlock> MAGENTA_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_MAGENTA, DyeColor.MAGENTA);

    public static final BlockEntry<FlatModernSeatBlock> ORANGE_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_ORANGE, DyeColor.ORANGE);

    public static final BlockEntry<FlatModernSeatBlock> PINK_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_PINK, DyeColor.PINK);

    public static final BlockEntry<FlatModernSeatBlock> PURPLE_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_PURPLE, DyeColor.PURPLE);

    public static final BlockEntry<FlatModernSeatBlock> RED_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_RED, DyeColor.RED);

    public static final BlockEntry<FlatModernSeatBlock> WHITE_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.TERRACOTTA_WHITE, DyeColor.WHITE);

    public static final BlockEntry<FlatModernSeatBlock> YELLOW_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_YELLOW, DyeColor.YELLOW);

    //Floor Chairs
    public static final BlockEntry<FloorModernSeatBlock> BLACK_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_BLACK, DyeColor.BLACK);

    public static final BlockEntry<FloorModernSeatBlock> BLUE_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_BLUE, DyeColor.BLUE);

    public static final BlockEntry<FloorModernSeatBlock> BROWN_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_BROWN, DyeColor.BROWN);

    public static final BlockEntry<FloorModernSeatBlock> CYAN_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_CYAN, DyeColor.CYAN);

    public static final BlockEntry<FloorModernSeatBlock> GRAY_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_GRAY, DyeColor.GRAY);

    public static final BlockEntry<FloorModernSeatBlock> GREEN_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_GREEN, DyeColor.GREEN);

    public static final BlockEntry<FloorModernSeatBlock> LIGHTBLUE_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_LIGHT_BLUE, DyeColor.LIGHT_BLUE);

    public static final BlockEntry<FloorModernSeatBlock> LIGHTGRAY_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_LIGHT_GRAY, DyeColor.LIGHT_GRAY);

    public static final BlockEntry<FloorModernSeatBlock> LIME_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_LIGHT_GREEN, DyeColor.LIME);

    public static final BlockEntry<FloorModernSeatBlock> MAGENTA_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_MAGENTA, DyeColor.MAGENTA);

    public static final BlockEntry<FloorModernSeatBlock> ORANGE_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_ORANGE, DyeColor.ORANGE);

    public static final BlockEntry<FloorModernSeatBlock> PINK_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_PINK, DyeColor.PINK);

    public static final BlockEntry<FloorModernSeatBlock> PURPLE_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_PURPLE, DyeColor.PURPLE);

    public static final BlockEntry<FloorModernSeatBlock> RED_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_RED, DyeColor.RED);

    public static final BlockEntry<FloorModernSeatBlock> WHITE_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.TERRACOTTA_WHITE, DyeColor.WHITE);

    public static final BlockEntry<FloorModernSeatBlock> YELLOW_FLOOR_CHAIR =
            CMSBuilderTransformer.ModernFloorSeatBlock(MapColor.COLOR_YELLOW, DyeColor.YELLOW);

    public static BlockEntry<FlatModernSeatBlock> getSeatByColor(DyeColor color) {
        return switch (color) {
            case BLACK -> BLACK_MODERN_SEAT;
            case BLUE -> BLUE_MODERN_SEAT;
            case BROWN -> BROWN_MODERN_SEAT;
            case CYAN -> CYAN_MODERN_SEAT;
            case GRAY -> GRAY_MODERN_SEAT;
            case GREEN -> GREEN_MODERN_SEAT;
            case LIGHT_BLUE -> LIGHTBLUE_MODERN_SEAT;
            case LIGHT_GRAY -> LIGHTGRAY_MODERN_SEAT;
            case LIME -> LIME_MODERN_SEAT;
            case MAGENTA -> MAGENTA_MODERN_SEAT;
            case ORANGE -> ORANGE_MODERN_SEAT;
            case PINK -> PINK_MODERN_SEAT;
            case PURPLE -> PURPLE_MODERN_SEAT;
            case RED -> RED_MODERN_SEAT;
            case WHITE -> WHITE_MODERN_SEAT;
            case YELLOW -> YELLOW_MODERN_SEAT;
        };
    }

    public static BlockEntry<FloorModernSeatBlock> getFloorSeatByColor(DyeColor color) {
        return switch (color) {
            case BLACK -> BLACK_FLOOR_CHAIR;
            case BLUE -> BLUE_FLOOR_CHAIR;
            case BROWN -> BROWN_FLOOR_CHAIR;
            case CYAN -> CYAN_FLOOR_CHAIR;
            case GRAY -> GRAY_FLOOR_CHAIR;
            case GREEN -> GREEN_FLOOR_CHAIR;
            case LIGHT_BLUE -> LIGHTBLUE_FLOOR_CHAIR;
            case LIGHT_GRAY -> LIGHTGRAY_FLOOR_CHAIR;
            case LIME -> LIME_FLOOR_CHAIR;
            case MAGENTA -> MAGENTA_FLOOR_CHAIR;
            case ORANGE -> ORANGE_FLOOR_CHAIR;
            case PINK -> PINK_FLOOR_CHAIR;
            case PURPLE -> PURPLE_FLOOR_CHAIR;
            case RED -> RED_FLOOR_CHAIR;
            case WHITE -> WHITE_FLOOR_CHAIR;
            case YELLOW -> YELLOW_FLOOR_CHAIR;
        };
    }

    public static void register() {}
}
