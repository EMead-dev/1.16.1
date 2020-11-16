package com.croissantcraft.er.items;

import com.croissantcraft.er.CroissantCraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ToastedCroissant extends Item
{

    public ToastedCroissant() {
        super(new Item.Properties()
                .group(CroissantCraft.TAB)
                .food(new Food.Builder()
                        .hunger(12)
                        .saturation(6)
                        .build()));
    }
}
