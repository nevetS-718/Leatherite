package net.leatherite.potions;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.player.PlayerEntity;

public class Drunkeness extends StatusEffect {
    public Drunkeness() {
    super(
            StatusEffectType.BENEFICIAL, 0xFF9C19);
    }
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            (entity).addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*5, 2));
            (entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*5, 4));
            (entity).addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20*5, 2));
            (entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20*5, 2));
        }
    }
}

