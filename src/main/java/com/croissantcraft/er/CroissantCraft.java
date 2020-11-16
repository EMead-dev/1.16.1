package com.croissantcraft.er;

import com.croissantcraft.er.utility.RegistryHandler;
import com.croissantcraft.er.world.gen.CroissantOreGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("cc")
@Mod.EventBusSubscriber(modid = CroissantCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CroissantCraft
{

    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "cc";

    public CroissantCraft()
    {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }


    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {

    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event)
    {
        CroissantOreGen.generate();
    }

    //Creative Tabs
    public static final ItemGroup TAB = new ItemGroup("CroissantTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(RegistryHandler.CROISSANT_INGOT.get());
        }
    };
}