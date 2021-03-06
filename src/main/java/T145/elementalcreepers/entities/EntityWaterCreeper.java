package T145.elementalcreepers.entities;

import T145.elementalcreepers.config.ModConfig;
import T145.elementalcreepers.entities.base.EntityBaseCreeper;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class EntityWaterCreeper extends EntityBaseCreeper {

	public EntityWaterCreeper(World world) {
		super(world);
	}

	@Override
	public void createExplosion(int explosionPower, boolean griefingEnabled) {
		int radius = getPowered() ? ModConfig.waterCreeperRadius * explosionPower : ModConfig.waterCreeperRadius;

		if (ModConfig.domeExplosion) {
			domeExplosion(radius, Blocks.WATER);
		} else {
			wildExplosion(radius, Blocks.WATER);
		}
	}
}