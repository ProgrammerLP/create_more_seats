package net.adeptstack.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.adeptstack.CMSMod;

@SuppressWarnings("removal")
@Mod(CMSMod.MOD_ID)
public final class CMSModForge {
    public CMSModForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(CMSMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        CMSMod.REGISTRATE.registerEventListeners(FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        CMSMod.init();
    }
}
