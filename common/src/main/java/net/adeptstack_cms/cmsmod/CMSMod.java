package net.adeptstack_cms.cmsmod;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.adeptstack_cms.cmsmod.registry.CMSBlocks;
import net.adeptstack_cms.cmsmod.registry.CMSEntities;
import net.adeptstack_cms.cmsmod.registry.CMSTabs;

public final class CMSMod {
    public static final String MOD_ID = "cms";
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

    public static void init() {
        CMSTabs.CREATIVE_MODE_TABS.register();
        CMSEntities.register();
        CMSBlocks.register();
    }
}
