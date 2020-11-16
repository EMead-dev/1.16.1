package com.croissantcraft.er.world.gen;

import com.croissantcraft.er.utility.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

import net.minecraftforge.registries.ForgeRegistries;

public class CroissantOreGen
{
    public static void generateOres()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            genOre(biome, 3, 10, 5, 50, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.CROISSANT_ORE.get().getDefaultState(), 6);
        }
    }

    public static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size)
    {
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }

    public static void generate()
    {
        generateOres();
    }
}
