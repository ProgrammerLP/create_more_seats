package net.adeptstack_cms.cmsmod.fabric;

import net.fabricmc.api.ModInitializer;

import net.adeptstack_cms.cmsmod.CMSMod;

public final class CMSModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        CMSMod.init();
    }
}
