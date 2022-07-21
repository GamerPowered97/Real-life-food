package net.gamerpowered97.pizzamod;

import net.fabricmc.api.ModInitializer;
import net.gamerpowered97.pizzamod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PizzaMod implements ModInitializer {
	public static final String MOD_ID = "pizzamod";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
	}
}
