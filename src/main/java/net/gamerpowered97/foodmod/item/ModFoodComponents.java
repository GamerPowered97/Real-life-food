package net.gamerpowered97.foodmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PIZZA_SLICE = new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 900, 0), 0.3f).build();
    public static final FoodComponent STRAWBERRY_DONUT = new FoodComponent.Builder().hunger(6).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 0), 0.3f).build();
    public static final FoodComponent PLAIN_DONUT = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build();
    public static final FoodComponent FROSTING = new FoodComponent.Builder().hunger(1).saturationModifier(0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1), 1.0f).build();
    public static final FoodComponent DOUGH = new FoodComponent.Builder().hunger(2).saturationModifier(0f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 1), 1.0f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
}
