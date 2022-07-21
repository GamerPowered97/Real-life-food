package net.gamerpowered97.foodmod;

import net.fabricmc.api.ModInitializer;
import net.gamerpowered97.foodmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodMod implements ModInitializer {
	public static final String MOD_ID = "foodmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
	}
}
