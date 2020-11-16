package com.croissantcraft.er.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import net.minecraftforge.common.ToolType;

public class CroissantOre extends Block
{
    public CroissantOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(4.0F, 5.0F)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));

    }
}
