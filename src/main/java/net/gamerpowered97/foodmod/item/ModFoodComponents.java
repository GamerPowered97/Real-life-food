package net.gamerpowered97.foodmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PIZZA_SLICE = new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 900, 0), 0.3f).build();
}
