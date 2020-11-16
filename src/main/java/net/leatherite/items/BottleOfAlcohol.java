package net.leatherite.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.leatherite.Leatherite;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.util.UseAction;

public class BottleOfAlcohol extends Item {
    public BottleOfAlcohol() {
        super(new FabricItemSettings().group(Leatherite.ALL).maxCount(1).recipeRemainder(Items.GLASS_BOTTLE).food((new FoodComponent.Builder()).hunger(-2).saturationModifier(0f).statusEffect(new StatusEffectInstance(Leatherite.DRUNKENESS, 20*180), 1f).alwaysEdible().build()));
    }
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
}
