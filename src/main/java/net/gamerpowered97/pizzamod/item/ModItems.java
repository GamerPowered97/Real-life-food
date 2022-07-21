package net.gamerpowered97.pizzamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gamerpowered97.pizzamod.PizzaMod;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item PIZZA_SLICE = registerItem("pizza_slice",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PizzaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PizzaMod.LOGGER.info("Registering Mod Items for " + PizzaMod.MOD_ID);
    }
}
