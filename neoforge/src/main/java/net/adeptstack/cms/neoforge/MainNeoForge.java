package net.adeptstack.cms.neoforge;



import net.adeptstack.cms.CMSMod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;

@Mod(CMSMod.MOD_ID)
public final class MainNeoForge {
    private static ModContainer modContainer;

    public MainNeoForge(ModContainer container) {
        modContainer = container;
        CMSMod.init();
        CMSMod.REGISTRATE.registerEventListeners(ModLoadingContext.get().getActiveContainer().getEventBus());
    }

    static ModContainer getModContainer() {
        return modContainer;
    }
}
