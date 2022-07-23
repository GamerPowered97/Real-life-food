package net.gamerpowered97.foodmod.block.custom;

import net.gamerpowered97.foodmod.item.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class TomatoVineBlock  extends CropBlock {
    public TomatoVineBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.TOMATO_SEEDS;
    }
}
