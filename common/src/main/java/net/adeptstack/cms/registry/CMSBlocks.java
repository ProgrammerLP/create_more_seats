package net.adeptstack.cms.registry;

import com.simibubi.create.AllDisplaySources;
import com.simibubi.create.content.contraptions.actors.seat.SeatInteractionBehaviour;
import com.simibubi.create.content.contraptions.actors.seat.SeatMovementBehaviour;
import com.simibubi.create.foundation.block.DyedBlockList;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.foundation.item.ItemDescription;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.adeptstack.cms.blocks.ModernSeatBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.material.MapColor;

import static com.simibubi.create.api.behaviour.display.DisplaySource.displaySource;
import static com.simibubi.create.api.behaviour.interaction.MovingInteractionBehaviour.interactionBehaviour;
import static com.simibubi.create.api.behaviour.movement.MovementBehaviour.movementBehaviour;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;
import static net.adeptstack.CMSMod.REGISTRATE;

public class CMSBlocks {

    public static final BlockEntry<ModernSeatBlock> BLACK_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_BLACK, DyeColor.BLACK);

    public static final BlockEntry<ModernSeatBlock> BLUE_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_BLUE, DyeColor.BLUE);

    public static final BlockEntry<ModernSeatBlock> BROWN_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_BROWN, DyeColor.BROWN);

    public static final BlockEntry<ModernSeatBlock> CYAN_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_CYAN, DyeColor.CYAN);

    public static final BlockEntry<ModernSeatBlock> GRAY_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_GRAY, DyeColor.GRAY);

    public static final BlockEntry<ModernSeatBlock> GREEN_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_GREEN, DyeColor.GREEN);

    public static final BlockEntry<ModernSeatBlock> LIGHTBLUE_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_LIGHT_BLUE, DyeColor.LIGHT_BLUE);

    public static final BlockEntry<ModernSeatBlock> LIGHTGRAY_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_LIGHT_GRAY, DyeColor.LIGHT_GRAY);

    public static final BlockEntry<ModernSeatBlock> LIME_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_LIGHT_GREEN, DyeColor.LIME);

    public static final BlockEntry<ModernSeatBlock> MAGENTA_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_MAGENTA, DyeColor.MAGENTA);

    public static final BlockEntry<ModernSeatBlock> ORANGE_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_ORANGE, DyeColor.ORANGE);

    public static final BlockEntry<ModernSeatBlock> PINK_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_PINK, DyeColor.PINK);

    public static final BlockEntry<ModernSeatBlock> PURPLE_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_PURPLE, DyeColor.PURPLE);

    public static final BlockEntry<ModernSeatBlock> RED_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_RED, DyeColor.RED);

    public static final BlockEntry<ModernSeatBlock> WHITE_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.TERRACOTTA_WHITE, DyeColor.WHITE);

    public static final BlockEntry<ModernSeatBlock> YELLOW_MODERN_SEAT =
            CMSBuilderTransformer.ModernSeatBlock(MapColor.COLOR_YELLOW, DyeColor.YELLOW);

    public static void register() {}
}
