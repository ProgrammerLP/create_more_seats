package net.adeptstack.cms;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.adeptstack.cms.registry.CMSBlocks;
import net.adeptstack.cms.registry.CMSEntities;
import net.adeptstack.cms.registry.CMSTabs;

public final class CMSMod {
    public static final String MOD_ID = "cms";
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID)
            .defaultCreativeTab(CMSTabs.CMS_TAB.getKey());

    public static void init() {
        CMSTabs.CREATIVE_MODE_TABS.register();
        CMSEntities.register();
        CMSBlocks.register();
    }
}
