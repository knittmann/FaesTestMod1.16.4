package com.faesmods.faestestmod.init;

import com.faesmods.faestestmod.FaesTestMod;
import com.faesmods.faestestmod.blocks.LepruneseBlock;
import com.faesmods.faestestmod.blocks.LepruneseOre;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FaesTestMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FaesTestMod.MOD_ID);

    /**
     * Initiates the DeferredRegister(s) so they can be used for registering individual mod components below
     */
    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // BLOCKS (always register blocks before items because items usually need the blocks)
    public static final RegistryObject<Block> LEPRUNESE_BLOCK = BLOCKS.register("leprunese_block", LepruneseBlock::new);
    public static final RegistryObject<Block> LEPRUNESE_ORE = BLOCKS.register("leprunese_ore", LepruneseOre::new);

    // ITEMS
    public static final RegistryObject<Item> LEPRUNESE_BLOCK_ITEM = ITEMS.register("leprunese_block", () ->
            new BlockItem(LEPRUNESE_BLOCK.get(), new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> LEPRUNESE_ORE_ITEM = ITEMS.register("leprunese_ore", () ->
            new BlockItem(LEPRUNESE_ORE.get(), new Item.Properties().group(ModSetup.ITEM_GROUP)));
}
