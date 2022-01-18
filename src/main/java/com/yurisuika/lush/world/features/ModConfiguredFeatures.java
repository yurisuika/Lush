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

    //    SPRUCE = ConfiguredFeatures.register("spruce", Feature.TREE.configure(
//            (new Builder(BlockStateProvider.of(Blocks.SPRUCE_LOG),
//    new StraightTrunkPlacer(5, 2, 1), BlockStateProvider.of(Blocks.SPRUCE_LEAVES),
//    new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
//            new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> ALDER_TREE = register("alder",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.ALDER_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.ALDER_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> APPLE_TREE = register("apple",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.APPLE_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.APPLE_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> ASH_TREE = register("ash",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.ASH_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.ASH_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> ASPEN_TREE = register("aspen",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.ASPEN_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.ASPEN_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> CEDAR_TREE = register("cedar",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.CEDAR_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.CEDAR_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> CHERRY_TREE = register("cherry",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.CHERRY_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.CHERRY_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> CHESTNUT_TREE = register("chestnut",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.CHESTNUT_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.CHESTNUT_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> CITRUS_TREE = register("citrus",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.CITRUS_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.CITRUS_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> COTTONWOOD_TREE = register("cottonwood",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.COTTONWOOD_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.COTTONWOOD_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> CYPRESS_TREE = register("cypress",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.CYPRESS_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.CYPRESS_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> EBONY_TREE = register("ebony",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.EBONY_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.EBONY_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> FIR_TREE = register("fir",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.FIR_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.FIR_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> GUM_TREE = register("gum",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.GUM_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.GUM_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> HAWTHORN_TREE = register("hawthorn",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.HAWTHORN_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.HAWTHORN_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> HAZEL_TREE = register("hazel",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.HAZEL_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.HAZEL_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> HEMLOCK_TREE = register("hemlock",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.HEMLOCK_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.HEMLOCK_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> HICKORY_TREE = register("hickory",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.HICKORY_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.HICKORY_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> JUNIPER_TREE = register("juniper",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.JUNIPER_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.JUNIPER_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> LARCH_TREE = register("larch",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.LARCH_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.LARCH_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> MAHOGANY_TREE = register("mahogany",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.MAHOGANY_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.MAHOGANY_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> MAPLE_TREE = register("maple",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.MAPLE_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.MAPLE_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> MESQUITE_TREE = register("mesquite",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.MESQUITE_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.MESQUITE_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> PEACH_TREE = register("peach",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.PEACH_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.PEACH_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> PEAR_TREE = register("pear",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.PEAR_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.PEAR_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> PINE_TREE = register("pine",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.PINE_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.PINE_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> REDWOOD_TREE = register("redwood",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.REDWOOD_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.REDWOOD_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> ROSEWOOD_TREE = register("rosewood",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.ROSEWOOD_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.ROSEWOOD_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> TEAK_TREE = register("teak",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.TEAK_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.TEAK_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> WALNUT_TREE = register("walnut",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.WALNUT_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.WALNUT_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

    public static final ConfiguredFeature<TreeFeatureConfig, ?> WILLOW_TREE = register("willow",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Lush.WILLOW_LOG.getDefaultState()),
                    new StraightTrunkPlacer(5, 2, 1),
                    new SimpleBlockStateProvider(Lush.WILLOW_LEAVES.getDefaultState()),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), UniformIntProvider.create(1, 1), ConstantIntProvider.create(1)),
                    new TwoLayersFeatureSize(2, 0, 4)
            ).ignoreVines().build()));

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
