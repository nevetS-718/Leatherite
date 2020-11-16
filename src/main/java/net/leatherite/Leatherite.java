package net.leatherite;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.leatherite.armor.BaseArmor;
import net.leatherite.blocks.GoldNetheriteBlock;
import net.leatherite.blocks.TobaccoPlant;
import net.leatherite.items.*;
import net.leatherite.potions.Drunkeness;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.sql.ResultSet;


public class Leatherite implements ModInitializer {

    //Creative Tab
    public static final ItemGroup ALL = FabricItemGroupBuilder.build(
            new Identifier("leatherite", "all"),
            () -> new ItemStack((Leatherite.LEATHERITE_HIDE)));

    public static final Item LEATHERITE_HIDE = new LeatheriteHide(new Item.Settings().group(Leatherite.ALL));
    public static final Block GOLDNETHERITEBLOCK = new GoldNetheriteBlock();
    public static final Item RAWVILLAGERMEAT = new RawVillagerMeat(new Item.Settings().group(Leatherite.ALL).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.8f).meat().statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 20*1000000), 0.1f).build()));
    public static final Item COOKEDVILLAGERMEAT = new CookedVillagerMeat(new Item.Settings().group(Leatherite.ALL).food(new FoodComponent.Builder().hunger(7).saturationModifier(10f).meat().statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 20*1000000), 0.1f).build()));
    public static final ArmorMaterial EMERALD_ARMOR = new EmeraldArmorMaterial();
    public static final Item TOBACCO = new Tobacco(new Item.Settings().group(Leatherite.ALL));
    public static final Item DRIEDTOBACCO = new DriedTobacco(new Item.Settings().group(Leatherite.ALL).food(new FoodComponent.Builder().hunger(4).saturationModifier(8f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*30), 1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*30), 1f).build()));
    public static final Item TOBACCOSEEDS = new TobaccoSeeds(new Item.Settings().group(Leatherite.ALL));
    public static final Block TOBACCOPLANT = new TobaccoPlant();
    public static final StatusEffect DRUNKENESS = new Drunkeness();
    public static final Item ALCOHOLBOTTLE = new BottleOfAlcohol();

    public void onInitialize() {
        //Blocks
        Registry.register(Registry.BLOCK, new Identifier("leatherite", "gold_infused_netherite_block"), GOLDNETHERITEBLOCK);
        Registry.register(Registry.BLOCK, new Identifier("leatherite", "tobacco"), TOBACCOPLANT);
        //Item
        Registry.register(Registry.ITEM, new Identifier("leatherite", "leatherite_hide"), LEATHERITE_HIDE);
        Registry.register(Registry.ITEM, new Identifier("leatherite", "gold_infused_netherite_block"), new BlockItem(GOLDNETHERITEBLOCK, new Item.Settings().group(Leatherite.ALL)));
        Registry.register(Registry.ITEM, new Identifier("leatherite", "tobacco"), TOBACCO);
        Registry.register(Registry.ITEM, new Identifier("leatherite", "dried_tobacco"), DRIEDTOBACCO);
        Registry.register(Registry.ITEM, new Identifier("leatherite", "tobacco_seeds"), TOBACCOSEEDS);
        //Food
        Registry.register(Registry.ITEM, new Identifier("leatherite", "raw_villager_meat"), RAWVILLAGERMEAT);
        Registry.register(Registry.ITEM, new Identifier("leatherite", "cooked_villager_meat"), COOKEDVILLAGERMEAT);
        //Potions
        Registry.register(Registry.ITEM, new Identifier("leatherite", "bottle_of_alcohol"), ALCOHOLBOTTLE);
        //Effects
        Registry.register(Registry.STATUS_EFFECT, new Identifier("leatherite", "drunkeness"), DRUNKENESS);
        //Tools
        Registry.register(Registry.ITEM, new Identifier("leatherite", "emerald_pickaxe"), new PickaxeBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier("leatherite", "emerald_axe"), new AxeBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier("leatherite", "emerald_shovel"), new ShovelBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier("leatherite", "emerald_hoe"), new HoeBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier("leatherite", "emerald_sword"), new SwordBase(new ToolMaterialEmerald()));
        //Armor
        Registry.register(Registry.ITEM, new Identifier("leatherite", "emerald_helmet"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier("leatherite", "emerald_chestplate"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier("leatherite", "emerald_leggings"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier("leatherite", "emerald_boots"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.FEET));

    }

}