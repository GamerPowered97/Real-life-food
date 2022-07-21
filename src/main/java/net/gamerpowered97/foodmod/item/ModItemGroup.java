package net.gamerpowered97.foodmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gamerpowered97.foodmod.FoodMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FOOD_MOD = FabricItemGroupBuilder.build(new Identifier(FoodMod.MOD_ID, "food_mod"),
            () -> new ItemStack(ModItems.PIZZA_SLICE));
}
