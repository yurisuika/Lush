package com.yurisuika.lush.world.features;

import com.yurisuika.lush.Lush;
import com.yurisuika.lush.block.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {

    public static final ConfiguredFeature<TreeFeatureConfig, ?> FIR_TREE = register("fir",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.FIR_LOG.getDefaultState()),
                    new StraightTrunkPlacer(8, 4, 3),
                    new SimpleBlockStateProvider(ModBlocks.FIR_LEAVES.getDefaultState()),
//                    new SimpleBlockStateProvider(ModBlocks.FIR_SAPLING.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)
            ).build()));

//    public static final ConfiguredFeature<TreeFeatureConfig,?> FIR_TREE;
//
//    public static void register() {
//        register("fir", FIR_TREE);
//    }
//
//    static {
//        FIR_TREE = Feature.TREE.configure(
//                new TreeFeatureConfig.Builder(
//                        BlockStateProvider.of(ModBlocks.FIR_LOG.getDefaultState()),
//                        new StraightTrunkPlacer(6, 4, 0),
//                        BlockStateProvider.of(ModBlocks.FIR_LEAVES.getDefaultState()),
//                        new PineFoliagePlacer(
//                                ConstantIntProvider.create(1),
//                                ConstantIntProvider.create(1),
//                                UniformIntProvider.create(3, 5)
//                        ),
//                        new TwoLayersFeatureSize(2, 0, 2)
//                )
//                        .ignoreVines()
//                        .decorators(
//                                Collections.singletonList(
//                                        new AlterGroundTreeDecorator(
//                                                new WeightedBlockStateProvider(
//                                                        DataPool.<BlockState>builder()
//                                                                .add(Blocks.GRASS_BLOCK.getDefaultState(), 1)
//                                                                .add(Blocks.PODZOL.getDefaultState(), 1)
//                                                )
//                                        )
//                                )
//                        )
//                        .build()
//        );
//    }

//    public static final ConfiguredFeature<?, ?> FIR_TREE_SPAWN = register(FIR_TREE
//            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING))
//                    .spreadHorizontally().applyChance(3)), FIR_TREE_KEY);

    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(Lush.MOD_ID, name));
    }

    private static ConfiguredFeature<TreeFeatureConfig, ?> register(String name,
                                                                    ConfiguredFeature<TreeFeatureConfig, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Lush.MOD_ID, name),
                configuredFeature);
    }

    private static ConfiguredFeature<?, ?> register(ConfiguredFeature<?, ?> configuredFeature,
                                                    RegistryKey<ConfiguredFeature<?, ?>> key) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), configuredFeature);
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + Lush.MOD_ID);
    }
    
}
