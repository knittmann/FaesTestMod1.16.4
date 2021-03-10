/*
  The entry class for Fae's Test Mod. Contains several methods/properties straight from Forge that
  are required for successful operation of the mod.

  @author: Fae (Krista Nittmann)
 * @version: 1.0.0
 */

package com.faesmods.faestestmod;

import com.faesmods.faestestmod.init.RegistryHandler;
import com.faesmods.faestestmod.world.gen.ModOreGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("faestestmod")
public class FaesTestMod {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "faestestmod";


    public FaesTestMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        //ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        // ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        RegistryHandler.init();

        // Register for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, ModOreGen::generateOres);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("FAE'S TEST MOD SETTING UP...");
        //ModOreGen.registerOres();
    }

    private void doClientStuff(final FMLClientSetupEvent event) { }
}
