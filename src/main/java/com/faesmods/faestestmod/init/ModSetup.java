package com.faesmods.faestestmod.init;

import com.faesmods.faestestmod.FaesTestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FaesTestMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {

    public static final ItemGroup ITEM_GROUP = new ItemGroup("faestestmod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.LEPRUNESE_BLOCK.get());
        }
    };


}
