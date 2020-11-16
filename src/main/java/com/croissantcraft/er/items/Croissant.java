package com.croissantcraft.er.items;

import com.croissantcraft.er.CroissantCraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Croissant extends Item
{

    public Croissant() {
        super(new Item.Properties()
                .group(CroissantCraft.TAB)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(4)
                        .build())







        );
    }
}
