package com.yurisuika.lush.world.features.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;
import com.yurisuika.lush.world.features.ModConfiguredFeatures;

import java.util.Random;

public class FirSaplingGenerator extends SaplingGenerator{

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.FIR_TREE;
    }

}
