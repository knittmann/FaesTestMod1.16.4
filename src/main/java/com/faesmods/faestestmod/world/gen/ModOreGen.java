//package com.faesmods.faestestmod.world.gen;
//
//import com.faesmods.faestestmod.FaesTestMod;
//import com.faesmods.faestestmod.init.ModBlocks;
//import net.minecraft.util.registry.Registry;
//import net.minecraft.util.registry.WorldGenRegistries;
//import net.minecraft.world.biome.Biome;
//import net.minecraft.world.gen.GenerationStage;
//import net.minecraft.world.gen.feature.ConfiguredFeature;
//import net.minecraft.world.gen.feature.Feature;
//import net.minecraft.world.gen.feature.IFeatureConfig;
//import net.minecraft.world.gen.feature.OreFeatureConfig;
//import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
//import net.minecraftforge.event.world.BiomeLoadingEvent;
//import net.minecraftforge.eventbus.api.EventPriority;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//
//import java.util.ArrayList;
//
//@Mod.EventBusSubscriber
//public class ModOreGen {
//
//    //public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE",
//            //"end_stone", new BlockMatcher(Blocks.END_STONE));
//    private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<ConfiguredFeature<?, ?>>();
//    private static final ArrayList<ConfiguredFeature<?, ?>> netherOres = new ArrayList<ConfiguredFeature<?, ?>>();
//    private static final ArrayList<ConfiguredFeature<?, ?>> endOres = new ArrayList<ConfiguredFeature<?, ?>>();
//
//    public static void registerOres() {
//        overworldOres.add(register("leprunese_ore", Feature.ORE.withConfiguration(new OreFeatureConfig(
//                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.LEPRUNESE_ORE.get()
//                .getDefaultState(), 4)) //Vein Size
//                .range(64).square() //Spawn height start
//                .func_242731_b(64))); //Chunk spawn frequency
//    }
//
//    @SubscribeEvent(priority = EventPriority.HIGHEST)
//    public static void generateOres(BiomeLoadingEvent event) {
//        BiomeGenerationSettingsBuilder generation = event.getGeneration();
//        if(event.getCategory().equals(Biome.Category.NETHER)){
//            for(ConfiguredFeature<?, ?> ore : netherOres){
//                if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
//            }
//        }
//        if(event.getCategory().equals(Biome.Category.THEEND)){
//            for(ConfiguredFeature<?, ?> ore : endOres){
//                if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
//            }
//        }
//        for(ConfiguredFeature<?, ?> ore : overworldOres){
//            if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
//        }
//    }
//
//    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
//        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, FaesTestMod.MOD_ID + ":" + name, configuredFeature);
//    }
//}
