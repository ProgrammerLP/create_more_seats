package net.adeptstack.cms.registry;

import com.tterrag.registrate.util.entry.EntityEntry;
import net.adeptstack.cms.CMSMod;
import net.adeptstack.cms.entities.ModernSeatEntity;
import net.minecraft.world.entity.MobCategory;

import java.util.function.Supplier;

public class CMSEntities {
    public static Supplier<EntityEntry<ModernSeatEntity>> MODERN_SEAT;

    public static void register() {
        MODERN_SEAT = () -> CMSMod.REGISTRATE
                .<ModernSeatEntity>entity("modern_seat", ModernSeatEntity::new, MobCategory.MISC)
                .properties(b -> b.fireImmune()
                        .sized(0.25f, 0.85f)
                        .setTrackingRange(5)
                        .setUpdateInterval(Integer.MAX_VALUE)
                        .setShouldReceiveVelocityUpdates(false)
                )
                .renderer(() -> ModernSeatEntity.Render::new)
                .register();
    }
}
