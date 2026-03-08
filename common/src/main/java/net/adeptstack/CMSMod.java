package net.adeptstack;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.adeptstack.cms.registry.CMSBlocks;
import net.adeptstack.cms.registry.CMSEntities;
import net.adeptstack.cms.registry.CMSTabs;

public final class CMSMod {
    public static final String MOD_ID = "cms";
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

    public static void init() {
        CMSTabs.CREATIVE_MODE_TABS.register();
        CMSEntities.register();
        CMSBlocks.register();

        try {
            Class<?> clazz = REGISTRATE.getClass();
            java.lang.reflect.Method registerMethod = null;
            while (clazz != null) {
                try {
                    registerMethod = clazz.getDeclaredMethod("register");
                    break;
                } catch (NoSuchMethodException ignored) {}
                clazz = clazz.getSuperclass();
            }
            if (registerMethod != null) {
                registerMethod.setAccessible(true);
                registerMethod.invoke(REGISTRATE);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to register CreateRegistrate via reflection", e);
        }
    }
}
