package net.adeptstack.cms.registry;

import com.tterrag.registrate.util.entry.EntityEntry;
import net.adeptstack.CMSMod;
import net.adeptstack.cms.entities.ModernSeatEntity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.MobCategory;

public class CMSEntities {
    public static final EntityEntry<ModernSeatEntity> BIG_SEAT = CMSMod.REGISTRATE
            .<ModernSeatEntity>entity("modern_seat", ModernSeatEntity::new, MobCategory.MISC)
            .properties(b -> b.fireImmune()
                    .dimensions(EntityDimensions.fixed(0.25f, 0.85f))
					.trackRangeChunks(5)
					.trackedUpdateRate(Integer.MAX_VALUE)
					.forceTrackedVelocityUpdates(false)
			)
                    .renderer(() -> ModernSeatEntity.Render::new)
            .register();

    public static void register() {}
}
