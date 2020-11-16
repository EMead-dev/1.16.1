package com.croissantcraft.er.utility;

import com.croissantcraft.er.CroissantCraft;
import com.croissantcraft.er.armour.CroissantArmourMaterial;
import com.croissantcraft.er.blocks.BlockItemBase;
import com.croissantcraft.er.blocks.CroissantBlock;
import com.croissantcraft.er.blocks.CroissantOre;
import com.croissantcraft.er.items.Croissant;
import com.croissantcraft.er.items.ItemBase;
import com.croissantcraft.er.items.ToastedCroissant;
import com.croissantcraft.er.tools.CroissantItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CroissantCraft.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CroissantCraft.MOD_ID);


    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register((FMLJavaModLoadingContext.get().getModEventBus()));
    }


    //ITEMS
    public static final RegistryObject<Item> CROISSANT_INGOT = ITEMS.register("croissant_ingot", ItemBase::new);
    public static final RegistryObject<Item> CROISSANT_NUGGET = ITEMS.register("croissant_nugget", ItemBase::new);
    public static final RegistryObject<Croissant> CROISSANT = ITEMS.register("croissant", Croissant::new);
    public static final RegistryObject<ToastedCroissant> TOASTED_CROISSANT = ITEMS.register("toasted_croissant", ToastedCroissant::new);

    //TOOLS
    public static final RegistryObject<SwordItem> CROISSANT_SWORD = ITEMS.register("croissant_sword", () -> new SwordItem(CroissantItemTier.CROISSANT, 2, 0.0F, new Item.Properties().group(CroissantCraft.TAB).maxStackSize(1)));
    public static final RegistryObject<PickaxeItem> CROISSANT_PICKAXE = ITEMS.register("croissant_pickaxe", () -> new PickaxeItem(CroissantItemTier.CROISSANT, 0, 0.0F, new Item.Properties().group(CroissantCraft.TAB).maxStackSize(1)));
    public static final RegistryObject<AxeItem> CROISSANT_AXE = ITEMS.register("croissant_axe", () -> new AxeItem(CroissantItemTier.CROISSANT, 1, 0.0F, new Item.Properties().group(CroissantCraft.TAB).maxStackSize(1)));
    public static final RegistryObject<ShovelItem> CROISSANT_SHOVEL = ITEMS.register("croissant_shovel", () -> new ShovelItem(CroissantItemTier.CROISSANT, 0, 0.0F, new Item.Properties().group(CroissantCraft.TAB).maxStackSize(1)));
    public static final RegistryObject<HoeItem> CROISSANT_HOE = ITEMS.register("croissant_hoe", () -> new HoeItem(CroissantItemTier.CROISSANT, 0, 1.0F, new Item.Properties().group(CroissantCraft.TAB).maxStackSize(1)));

    //ARMOUR
    public static final RegistryObject<ArmorItem> CROISSANT_HELMET = ITEMS.register("croissant_helmet", () -> new ArmorItem(CroissantArmourMaterial.CROISSANT, EquipmentSlotType.HEAD, new Item.Properties().group(CroissantCraft.TAB)));
    public static final RegistryObject<ArmorItem> CROISSANT_CHESTPLATE = ITEMS.register("croissant_chestplate", () -> new ArmorItem(CroissantArmourMaterial.CROISSANT, EquipmentSlotType.CHEST, new Item.Properties().group(CroissantCraft.TAB)));
    public static final RegistryObject<ArmorItem> CROISSANT_LEGGINGS = ITEMS.register("croissant_leggings", () -> new ArmorItem(CroissantArmourMaterial.CROISSANT, EquipmentSlotType.LEGS, new Item.Properties().group(CroissantCraft.TAB)));
    public static final RegistryObject<ArmorItem> CROISSANT_BOOTS = ITEMS.register("croissant_boots", () -> new ArmorItem(CroissantArmourMaterial.CROISSANT, EquipmentSlotType.FEET, new Item.Properties().group(CroissantCraft.TAB)));

    //BLOCKS
    public static final RegistryObject<Block> CROISSANT_BLOCK = BLOCKS.register("croissant_block", CroissantBlock::new);
    public static final RegistryObject<Block> CROISSANT_ORE = BLOCKS.register("croissant_ore", CroissantOre::new);

    //BLOCK ITEMS
    public static final RegistryObject<Item> CROISSANT_BLOCK_ITEM = ITEMS.register("croissant_block", () -> new BlockItemBase(CROISSANT_BLOCK.get()));
    public static final RegistryObject<Item> CROISSANT_ORE_ITEM = ITEMS.register("croissant_ore", () -> new BlockItemBase(CROISSANT_ORE.get()));
}