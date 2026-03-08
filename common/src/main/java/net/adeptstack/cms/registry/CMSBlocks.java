package net.adeptstack.cms.registry;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.adeptstack.cms.blocks.FlatModernSeatBlock;
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

    public static void register() {}
}
