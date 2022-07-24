package net.gamerpowered97.foodmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.gamerpowered97.foodmod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class FoodModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOMATO_VINE, RenderLayer.getCutout());
    }
}
