package net.gamerpowered97.foodmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gamerpowered97.foodmod.FoodMod;
import net.gamerpowered97.foodmod.block.ModBlocks;
import net.minecraft.item.AliasedBlockItem;
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

    public static final Item TOMATO = registerItem("tomato",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_MOD).food(ModFoodComponents.TOMATO)));

    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_MOD).food(ModFoodComponents.CHEESE)));

    public static final Item WHEAT_DOUGH = registerItem("wheat_dough",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_MOD).food(ModFoodComponents.WHEAT_DOUGH)));

    public static final Item PLAIN_PIZZA_SLICE = registerItem("plain_pizza_slice",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_MOD).food(ModFoodComponents.PLAIN_PIZZA_SLICE)));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_VINE,
                    new FabricItemSettings().group(ModItemGroup.FOOD_MOD)));

    public static final Item CHICKEN_NUGGET = registerItem("chicken_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_MOD).food(ModFoodComponents.CHICKEN_NUGGET)));

    public static final Item LETTUCE = registerItem("lettuce",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_MOD).food(ModFoodComponents.LETTUCE)));

   public static final Item LETTUCE_SEEDS = registerItem("lettuce_seeds",
           new AliasedBlockItem(ModBlocks.LETTUCE_VINE,
                   new FabricItemSettings().group(ModItemGroup.FOOD_MOD)));

    public static final Item BURGER = registerItem("burger",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_MOD).food(ModFoodComponents.BURGER)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FoodMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FoodMod.LOGGER.info("Registering Mod Items for " + FoodMod.MOD_ID);
    }
}
