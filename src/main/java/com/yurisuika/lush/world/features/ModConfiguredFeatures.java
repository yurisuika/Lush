package com.yurisuika.lush.world.features;

import com.yurisuika.lush.Lush;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {

//    public static final ConfiguredFeature<TreeFeatureConfig, ?> FIR_TREE = register("fir",
//            Feature.TREE.configure(new TreeFeatureConfig.Builder(
//                    new SimpleBlockStateProvider(Lush.FIR_LOG.getDefaultState()),
//                    new StraightTrunkPlacer(6, 4, 0),
//                    new SimpleBlockStateProvider(Lush.FIR_LEAVES.getDefaultState()),
//                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
//                    new TwoLayersFeatureSize(1, 0, 1)
//            ).build()));

    // net.minecraft.world.gen.feature.TreeConfiguredFeatures

    public static final ConfiguredFeature<TreeFeatureConfig, ?> FIR_TREE = register("fir",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.FIR_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.FIR_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

//    SPRUCE = ConfiguredFeatures.register("spruce", Feature.TREE.configure(
//            (new Builder(BlockStateProvider.of(Blocks.SPRUCE_LOG),
//    new StraightTrunkPlacer(5, 2, 1), BlockStateProvider.of(Blocks.SPRUCE_LEAVES),
//    new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
//            new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build()));

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
    
}
