package net.gamerpowered97.foodmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gamerpowered97.foodmod.FoodMod;
import net.gamerpowered97.foodmod.block.custom.LettuceVineBlock;
import net.gamerpowered97.foodmod.item.ModItemGroup;
import net.gamerpowered97.foodmod.block.custom.TomatoVineBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block TOMATO_VINE = registerBlockWithoutBlockItem("tomato_vine",
            new TomatoVineBlock(FabricBlockSettings.copy(Blocks.POTATOES).nonOpaque()), ModItemGroup.FOOD_MOD);

    public static final Block LETTUCE_VINE = registerBlockWithoutBlockItem("lettuce_vine",
            new LettuceVineBlock(FabricBlockSettings.copy(Blocks.BEETROOTS).nonOpaque()), ModItemGroup.FOOD_MOD);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(FoodMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(FoodMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        FoodMod.LOGGER.info("Registering ModBlocks for " + FoodMod.MOD_ID);
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(FoodMod.MOD_ID, name), block);
    }
}
