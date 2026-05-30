package net.adeptstack.cms.registry;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.contraptions.actors.seat.SeatInteractionBehaviour;
import com.simibubi.create.content.contraptions.actors.seat.SeatMovementBehaviour;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.foundation.item.ItemDescription;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.adeptstack.cms.blocks.FlatModernSeatBlock;
import net.adeptstack.cms.blocks.FloorModernSeatBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import static com.simibubi.create.api.behaviour.interaction.MovingInteractionBehaviour.interactionBehaviour;
import static com.simibubi.create.api.behaviour.movement.MovementBehaviour.movementBehaviour;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;
import static net.adeptstack.cms.CMSMod.REGISTRATE;

public class CMSBuilderTransformer {

    public static <B extends FlatModernSeatBlock, P> NonNullUnaryOperator<BlockBuilder<B, P>> modernSeatBlock() {
        return b -> b.initialProperties(SharedProperties::softMetal)
                .properties(p -> p.strength(3.0F, 6.0F))
                .transform(pickaxeOnly())
                .onRegister(interactionBehaviour(new SeatInteractionBehaviour()))
                .onRegister(movementBehaviour(new SeatMovementBehaviour()))
                .tag(AllTags.AllBlockTags.SEATS.tag)
                .item()
                .tag(AllTags.AllItemTags.SEATS.tag)
                .tab(CMSTabs.CMS_TAB.getKey())
                .onRegisterAfter(Registries.ITEM, v -> ItemDescription.useKey(v, "block.cms.modern_seat"))
                .build();
    }

    public static BlockEntry<FlatModernSeatBlock> ModernSeatBlock (MapColor colour, DyeColor color) {
        return REGISTRATE.block(color.getSerializedName() + "_modern_seat", p -> new FlatModernSeatBlock(p, color))
                .initialProperties(SharedProperties::softMetal)
                .properties(p -> p.sound(SoundType.METAL).mapColor(colour))
                .addLayer(() -> RenderType::translucent)
                .transform(modernSeatBlock())
                .properties(BlockBehaviour.Properties::noOcclusion)
                .register();
    }

    //Floor Chairs
    public static <B extends FloorModernSeatBlock, P> NonNullUnaryOperator<BlockBuilder<B, P>> modernFloorSeatBlock() {
        return b -> b.initialProperties(SharedProperties::softMetal)
                .properties(p -> p.strength(3.0F, 6.0F))
                .transform(pickaxeOnly())
                .onRegister(interactionBehaviour(new SeatInteractionBehaviour()))
                .onRegister(movementBehaviour(new SeatMovementBehaviour()))
                .tag(AllTags.AllBlockTags.SEATS.tag)
                .item()
                .tag(AllTags.AllItemTags.SEATS.tag)
                .tab(CMSTabs.CMS_TAB.getKey())
                .onRegisterAfter(Registries.ITEM, v -> ItemDescription.useKey(v, "block.cms.modern_seat"))
                .build();
    }

    public static BlockEntry<FloorModernSeatBlock> ModernFloorSeatBlock (MapColor colour, DyeColor color) {
        return REGISTRATE.block(color.getSerializedName() + "_floor_chair", p -> new FloorModernSeatBlock(p, color))
                .initialProperties(SharedProperties::softMetal)
                .properties(p -> p.sound(SoundType.METAL).mapColor(colour).noOcclusion())
                .addLayer(() -> RenderType::translucent)
                .transform(modernFloorSeatBlock())
                .properties(BlockBehaviour.Properties::noOcclusion)
                .register();
    }
}
