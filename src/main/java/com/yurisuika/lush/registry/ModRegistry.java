package com.yurisuika.lush.registry;

import com.yurisuika.lush.Lush;
import com.yurisuika.lush.block.ModBlocks;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.item.ItemConvertible;

public class ModRegistry {

    public static void registerFuels() {
        System.out.println("Now registering Fuels for " + Lush.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModBlocks.FIR_FENCE, 300);
        registry.add(ModBlocks.FIR_FENCE_GATE, 300);
    }

    public static void registerFlammables() {
        System.out.println("Now registering Flammables for " + Lush.MOD_ID);
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.OAK_BRANCH, 10, 20);
        registry.add(ModBlocks.OAK_TWIG, 20, 40);
        registry.add(ModBlocks.STRIPPED_OAK_BRANCH, 10, 20);
        registry.add(ModBlocks.STRIPPED_OAK_TWIG, 20, 40);

        registry.add(ModBlocks.SPRUCE_BRANCH, 10, 20);
        registry.add(ModBlocks.SPRUCE_TWIG, 20, 40);
        registry.add(ModBlocks.STRIPPED_SPRUCE_BRANCH, 10, 20);
        registry.add(ModBlocks.STRIPPED_SPRUCE_TWIG, 20, 40);

        registry.add(ModBlocks.BIRCH_BRANCH, 10, 20);
        registry.add(ModBlocks.BIRCH_TWIG, 20, 40);
        registry.add(ModBlocks.STRIPPED_BIRCH_BRANCH, 10, 20);
        registry.add(ModBlocks.STRIPPED_BIRCH_TWIG, 20, 40);

        registry.add(ModBlocks.JUNGLE_BRANCH, 10, 20);
        registry.add(ModBlocks.JUNGLE_TWIG, 20, 40);
        registry.add(ModBlocks.STRIPPED_JUNGLE_BRANCH, 10, 20);
        registry.add(ModBlocks.STRIPPED_JUNGLE_TWIG, 20, 40);

        registry.add(ModBlocks.DARK_OAK_BRANCH, 10, 20);
        registry.add(ModBlocks.DARK_OAK_TWIG, 20, 40);
        registry.add(ModBlocks.STRIPPED_DARK_OAK_BRANCH, 10, 20);
        registry.add(ModBlocks.STRIPPED_DARK_OAK_TWIG, 20, 40);

        registry.add(ModBlocks.ACACIA_BRANCH, 10, 20);
        registry.add(ModBlocks.ACACIA_TWIG, 20, 40);
        registry.add(ModBlocks.STRIPPED_ACACIA_BRANCH, 10, 20);
        registry.add(ModBlocks.STRIPPED_ACACIA_TWIG, 20, 40);
        
        registry.add(ModBlocks.FIR_LOG, 5, 5);
        registry.add(ModBlocks.FIR_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_FIR_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_FIR_WOOD, 5, 5);
        registry.add(ModBlocks.FIR_PLANKS, 5, 20);
        registry.add(ModBlocks.FIR_SLAB, 5, 20);
        registry.add(ModBlocks.FIR_STAIRS, 5, 20);
        registry.add(ModBlocks.FIR_FENCE, 5, 20);
        registry.add(ModBlocks.FIR_FENCE_GATE, 5, 20);
        registry.add(ModBlocks.FIR_LEAVES, 30, 60);
        registry.add(ModBlocks.FIR_BRANCH, 10, 20);
        registry.add(ModBlocks.FIR_TWIG, 20, 40);
        registry.add(ModBlocks.STRIPPED_FIR_BRANCH, 10, 20);
        registry.add(ModBlocks.STRIPPED_FIR_TWIG, 20, 40);
    }

    public static void registerStrippables() {
        System.out.println("Now registering Strippables for " + Lush.MOD_ID);

        StrippableBlockRegistry.register(ModBlocks.FIR_LOG, ModBlocks.STRIPPED_FIR_LOG);
        StrippableBlockRegistry.register(ModBlocks.FIR_WOOD, ModBlocks.STRIPPED_FIR_WOOD);
    }

    public static void registerCompostables() {
        System.out.println("Now registering Compostables for " + Lush.MOD_ID);
        CompostingChanceRegistry registry = CompostingChanceRegistry.INSTANCE;

        registry.add(ModBlocks.FIR_LEAVES, 0.30F);
        registry.add(ModBlocks.FIR_SAPLING, 0.30F);

    }

}
