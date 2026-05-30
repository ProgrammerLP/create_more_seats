package net.adeptstack_cms.cmsmod.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static net.adeptstack_cms.cmsmod.CMSMod.MOD_ID;

public class CMSTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> CMS_TAB = CREATIVE_MODE_TABS.register(new ResourceLocation(MOD_ID, "cms_tab"),
            () -> CreativeTabRegistry.create(
                    Component.translatable("itemGroup." + MOD_ID + ".cms_tab"), // Tab Name
                    () -> new ItemStack(CMSBlocks.CYAN_MODERN_SEAT.asItem()) // Icon
            ));
}
