package com.yurisuika.lush.world.features.tree;

import com.yurisuika.lush.world.features.ModConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class MapleSaplingGenerator extends SaplingGenerator {

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.MAPLE_TREE;
    }

}
