package net.opedroo52.mineralspawn.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(6).saturationMod(0.1f).effect(()->new MobEffectInstance(MobEffects.SATURATION,400,10),0.3f).build();

}
