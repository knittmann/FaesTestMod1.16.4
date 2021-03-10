//package com.faesmods.faestestmod.util;
//
//import com.faesmods.faestestmod.FaesTestMod;
//import com.faesmods.faestestmod.init.ModItems;
//import net.minecraft.item.ItemGroup;
//import net.minecraft.item.ItemStack;
//
//import java.util.function.Supplier;
//
//public class ModItemGroup extends ItemGroup {
//
//    private Supplier<ItemStack> displayStack;
//
//    public static final ModItemGroup ACCESSORIES = new ModItemGroup("accessories", () -> new ItemStack(ModItems.LEPRUNESE.get()));
//
//    private ModItemGroup(String label, Supplier<ItemStack> displayStack) {
//        super(label);
//        this.displayStack = displayStack;
//    }
//
//    @Override
//    public ItemStack createIcon() { return displayStack.get(); }
//}
