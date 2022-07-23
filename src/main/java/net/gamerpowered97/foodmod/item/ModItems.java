package net.gamerpowered97.foodmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gamerpowered97.foodmod.FoodMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item PIZZA_SLICE = registerItem("pizza_slice",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_MOD).food(ModFoodComponents.PIZZA_SLICE)));

    public static final Item STRAWBERRY_DONUT = registerItem("strawberry_donut",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_MOD).food(ModFoodComponents.STRAWBERRY_DONUT)));

    public static final Item DOUGH = registerItem("dough",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_MOD).food(ModFoodComponents.DOUGH)));

    public static final Item PLAIN_DONUT = registerItem("plain_donut",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_MOD).food(ModFoodComponents.PLAIN_DONUT)));

    public static final Item FROSTING = registerItem("frosting",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_MOD).food(ModFoodComponents.FROSTING)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FoodMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FoodMod.LOGGER.info("Registering Mod Items for " + FoodMod.MOD_ID);
    }
}
