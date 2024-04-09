package net.gamerpowered97.foodmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PIZZA_SLICE = new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1700, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 900, 0), 0.3f).build();
    public static final FoodComponent STRAWBERRY_DONUT = new FoodComponent.Builder().hunger(6).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 0), 0.3f).build();
    public static final FoodComponent PLAIN_DONUT = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build();
    public static final FoodComponent FROSTING = new FoodComponent.Builder().hunger(1).saturationModifier(0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1), 1.0f).alwaysEdible().build();
    public static final FoodComponent DOUGH = new FoodComponent.Builder().hunger(2).saturationModifier(0f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 1), 1.0f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).alwaysEdible().build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent WHEAT_DOUGH = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 1), 1.0f).build();
    public static final FoodComponent PLAIN_PIZZA_SLICE = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static final FoodComponent LETTUCE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).alwaysEdible().build();
    public static final FoodComponent BURGER = new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1700, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 700, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1700, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 900, 1), 0.2f).build();
    public static final FoodComponent CHICKEN_NUGGET = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 0), 1.0f).build();
    public static final FoodComponent CHOCOLATE_BAR = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 900, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400, 0), 1.0f).build();
    public static final FoodComponent BANANA = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 1), 1.0f).alwaysEdible().build();
}
