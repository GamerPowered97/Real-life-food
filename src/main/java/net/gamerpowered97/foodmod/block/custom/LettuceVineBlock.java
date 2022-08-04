package net.gamerpowered97.foodmod.block.custom;

import net.gamerpowered97.foodmod.item.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class LettuceVineBlock extends CropBlock {
    public LettuceVineBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.LETTUCE_SEEDS;
    }
}
