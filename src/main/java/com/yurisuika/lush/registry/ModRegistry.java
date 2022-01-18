package com.yurisuika.lush.registry;

import com.yurisuika.lush.Lush;
import com.yurisuika.seasons.Seasons;
import com.yurisuika.seasons.utils.Season;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.yurisuika.lush.Lush.MOD_ID;

public class ModRegistry {

    public static void registerBoats() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "alder_boat"), Lush.ALDER_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_boat"), Lush.APPLE_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ash_boat"), Lush.ASH_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "aspen_boat"), Lush.ASPEN_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cedar_boat"), Lush.CEDAR_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cherry_boat"), Lush.CHERRY_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chestnut_boat"), Lush.CHESTNUT_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "citrus_boat"), Lush.CITRUS_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cottonwood_boat"), Lush.COTTONWOOD_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cypress_boat"), Lush.CYPRESS_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ebony_boat"), Lush.EBONY_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_boat"), Lush.FIR_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gum_boat"), Lush.GUM_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hawthorn_boat"), Lush.HAWTHORN_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hazel_boat"), Lush.HAZEL_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hemlock_boat"), Lush.HEMLOCK_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hickory_boat"), Lush.HICKORY_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "juniper_boat"), Lush.JUNIPER_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "larch_boat"), Lush.LARCH_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mahogany_boat"), Lush.MAHOGANY_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "maple_boat"), Lush.MAPLE_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mesquite_boat"), Lush.MESQUITE_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "peach_boat"), Lush.PEACH_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pear_boat"), Lush.PEAR_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pine_boat"), Lush.PINE_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redwood_boat"), Lush.REDWOOD_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rosewood_boat"), Lush.ROSEWOOD_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "teak_boat"), Lush.TEAK_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "walnut_boat"), Lush.WALNUT_BOAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "willow_boat"), Lush.WILLOW_BOAT);
    }

    public static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Lush.ALDER_FENCE, 300);
        registry.add(Lush.ALDER_FENCE_GATE, 300);

        registry.add(Lush.APPLE_FENCE, 300);
        registry.add(Lush.APPLE_FENCE_GATE, 300);

        registry.add(Lush.ASH_FENCE, 300);
        registry.add(Lush.ASH_FENCE_GATE, 300);

        registry.add(Lush.ASPEN_FENCE, 300);
        registry.add(Lush.ASPEN_FENCE_GATE, 300);

        registry.add(Lush.CEDAR_FENCE, 300);
        registry.add(Lush.CEDAR_FENCE_GATE, 300);

        registry.add(Lush.CHERRY_FENCE, 300);
        registry.add(Lush.CHERRY_FENCE_GATE, 300);

        registry.add(Lush.CHESTNUT_FENCE, 300);
        registry.add(Lush.CHESTNUT_FENCE_GATE, 300);

        registry.add(Lush.CITRUS_FENCE, 300);
        registry.add(Lush.CITRUS_FENCE_GATE, 300);

        registry.add(Lush.COTTONWOOD_FENCE, 300);
        registry.add(Lush.COTTONWOOD_FENCE_GATE, 300);

        registry.add(Lush.CYPRESS_FENCE, 300);
        registry.add(Lush.CYPRESS_FENCE_GATE, 300);

        registry.add(Lush.EBONY_FENCE, 300);
        registry.add(Lush.EBONY_FENCE_GATE, 300);

        registry.add(Lush.FIR_FENCE, 300);
        registry.add(Lush.FIR_FENCE_GATE, 300);

        registry.add(Lush.GUM_FENCE, 300);
        registry.add(Lush.GUM_FENCE_GATE, 300);

        registry.add(Lush.HAWTHORN_FENCE, 300);
        registry.add(Lush.HAWTHORN_FENCE_GATE, 300);

        registry.add(Lush.HAZEL_FENCE, 300);
        registry.add(Lush.HAZEL_FENCE_GATE, 300);

        registry.add(Lush.HEMLOCK_FENCE, 300);
        registry.add(Lush.HEMLOCK_FENCE_GATE, 300);

        registry.add(Lush.HICKORY_FENCE, 300);
        registry.add(Lush.HICKORY_FENCE_GATE, 300);

        registry.add(Lush.JUNIPER_FENCE, 300);
        registry.add(Lush.JUNIPER_FENCE_GATE, 300);

        registry.add(Lush.LARCH_FENCE, 300);
        registry.add(Lush.LARCH_FENCE_GATE, 300);

        registry.add(Lush.MAHOGANY_FENCE, 300);
        registry.add(Lush.MAHOGANY_FENCE_GATE, 300);

        registry.add(Lush.MAPLE_FENCE, 300);
        registry.add(Lush.MAPLE_FENCE_GATE, 300);

        registry.add(Lush.MESQUITE_FENCE, 300);
        registry.add(Lush.MESQUITE_FENCE_GATE, 300);

        registry.add(Lush.PEACH_FENCE, 300);
        registry.add(Lush.PEACH_FENCE_GATE, 300);

        registry.add(Lush.PEAR_FENCE, 300);
        registry.add(Lush.PEAR_FENCE_GATE, 300);

        registry.add(Lush.PINE_FENCE, 300);
        registry.add(Lush.PINE_FENCE_GATE, 300);

        registry.add(Lush.REDWOOD_FENCE, 300);
        registry.add(Lush.REDWOOD_FENCE_GATE, 300);

        registry.add(Lush.ROSEWOOD_FENCE, 300);
        registry.add(Lush.ROSEWOOD_FENCE_GATE, 300);

        registry.add(Lush.TEAK_FENCE, 300);
        registry.add(Lush.TEAK_FENCE_GATE, 300);

        registry.add(Lush.WALNUT_FENCE, 300);
        registry.add(Lush.WALNUT_FENCE_GATE, 300);

        registry.add(Lush.WILLOW_FENCE, 300);
        registry.add(Lush.WILLOW_FENCE_GATE, 300);
    }

    public static void registerFlammables() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(Lush.ALDER_LOG, 5, 5);
        registry.add(Lush.ALDER_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_ALDER_LOG, 5, 5);
        registry.add(Lush.STRIPPED_ALDER_WOOD, 5, 5);
        registry.add(Lush.ALDER_PLANKS, 5, 20);
        registry.add(Lush.ALDER_SLAB, 5, 20);
        registry.add(Lush.ALDER_STAIRS, 5, 20);
        registry.add(Lush.ALDER_FENCE, 5, 20);
        registry.add(Lush.ALDER_FENCE_GATE, 5, 20);
        registry.add(Lush.ALDER_LEAVES, 30, 60);

        registry.add(Lush.APPLE_LOG, 5, 5);
        registry.add(Lush.APPLE_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_APPLE_LOG, 5, 5);
        registry.add(Lush.STRIPPED_APPLE_WOOD, 5, 5);
        registry.add(Lush.APPLE_PLANKS, 5, 20);
        registry.add(Lush.APPLE_SLAB, 5, 20);
        registry.add(Lush.APPLE_STAIRS, 5, 20);
        registry.add(Lush.APPLE_FENCE, 5, 20);
        registry.add(Lush.APPLE_FENCE_GATE, 5, 20);
        registry.add(Lush.APPLE_LEAVES, 30, 60);

        registry.add(Lush.ASH_LOG, 5, 5);
        registry.add(Lush.ASH_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_ASH_LOG, 5, 5);
        registry.add(Lush.STRIPPED_ASH_WOOD, 5, 5);
        registry.add(Lush.ASH_PLANKS, 5, 20);
        registry.add(Lush.ASH_SLAB, 5, 20);
        registry.add(Lush.ASH_STAIRS, 5, 20);
        registry.add(Lush.ASH_FENCE, 5, 20);
        registry.add(Lush.ASH_FENCE_GATE, 5, 20);
        registry.add(Lush.ASH_LEAVES, 30, 60);

        registry.add(Lush.ASPEN_LOG, 5, 5);
        registry.add(Lush.ASPEN_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_ASPEN_LOG, 5, 5);
        registry.add(Lush.STRIPPED_ASPEN_WOOD, 5, 5);
        registry.add(Lush.ASPEN_PLANKS, 5, 20);
        registry.add(Lush.ASPEN_SLAB, 5, 20);
        registry.add(Lush.ASPEN_STAIRS, 5, 20);
        registry.add(Lush.ASPEN_FENCE, 5, 20);
        registry.add(Lush.ASPEN_FENCE_GATE, 5, 20);
        registry.add(Lush.ASPEN_LEAVES, 30, 60);

        registry.add(Lush.CEDAR_LOG, 5, 5);
        registry.add(Lush.CEDAR_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_CEDAR_LOG, 5, 5);
        registry.add(Lush.STRIPPED_CEDAR_WOOD, 5, 5);
        registry.add(Lush.CEDAR_PLANKS, 5, 20);
        registry.add(Lush.CEDAR_SLAB, 5, 20);
        registry.add(Lush.CEDAR_STAIRS, 5, 20);
        registry.add(Lush.CEDAR_FENCE, 5, 20);
        registry.add(Lush.CEDAR_FENCE_GATE, 5, 20);
        registry.add(Lush.CEDAR_LEAVES, 30, 60);

        registry.add(Lush.CHERRY_LOG, 5, 5);
        registry.add(Lush.CHERRY_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_CHERRY_LOG, 5, 5);
        registry.add(Lush.STRIPPED_CHERRY_WOOD, 5, 5);
        registry.add(Lush.CHERRY_PLANKS, 5, 20);
        registry.add(Lush.CHERRY_SLAB, 5, 20);
        registry.add(Lush.CHERRY_STAIRS, 5, 20);
        registry.add(Lush.CHERRY_FENCE, 5, 20);
        registry.add(Lush.CHERRY_FENCE_GATE, 5, 20);
        registry.add(Lush.CHERRY_LEAVES, 30, 60);

        registry.add(Lush.CHESTNUT_LOG, 5, 5);
        registry.add(Lush.CHESTNUT_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_CHESTNUT_LOG, 5, 5);
        registry.add(Lush.STRIPPED_CHESTNUT_WOOD, 5, 5);
        registry.add(Lush.CHESTNUT_PLANKS, 5, 20);
        registry.add(Lush.CHESTNUT_SLAB, 5, 20);
        registry.add(Lush.CHESTNUT_STAIRS, 5, 20);
        registry.add(Lush.CHESTNUT_FENCE, 5, 20);
        registry.add(Lush.CHESTNUT_FENCE_GATE, 5, 20);
        registry.add(Lush.CHESTNUT_LEAVES, 30, 60);

        registry.add(Lush.CITRUS_LOG, 5, 5);
        registry.add(Lush.CITRUS_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_CITRUS_LOG, 5, 5);
        registry.add(Lush.STRIPPED_CITRUS_WOOD, 5, 5);
        registry.add(Lush.CITRUS_PLANKS, 5, 20);
        registry.add(Lush.CITRUS_SLAB, 5, 20);
        registry.add(Lush.CITRUS_STAIRS, 5, 20);
        registry.add(Lush.CITRUS_FENCE, 5, 20);
        registry.add(Lush.CITRUS_FENCE_GATE, 5, 20);
        registry.add(Lush.CITRUS_LEAVES, 30, 60);

        registry.add(Lush.COTTONWOOD_LOG, 5, 5);
        registry.add(Lush.COTTONWOOD_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_COTTONWOOD_LOG, 5, 5);
        registry.add(Lush.STRIPPED_COTTONWOOD_WOOD, 5, 5);
        registry.add(Lush.COTTONWOOD_PLANKS, 5, 20);
        registry.add(Lush.COTTONWOOD_SLAB, 5, 20);
        registry.add(Lush.COTTONWOOD_STAIRS, 5, 20);
        registry.add(Lush.COTTONWOOD_FENCE, 5, 20);
        registry.add(Lush.COTTONWOOD_FENCE_GATE, 5, 20);
        registry.add(Lush.COTTONWOOD_LEAVES, 30, 60);

        registry.add(Lush.CYPRESS_LOG, 5, 5);
        registry.add(Lush.CYPRESS_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_CYPRESS_LOG, 5, 5);
        registry.add(Lush.STRIPPED_CYPRESS_WOOD, 5, 5);
        registry.add(Lush.CYPRESS_PLANKS, 5, 20);
        registry.add(Lush.CYPRESS_SLAB, 5, 20);
        registry.add(Lush.CYPRESS_STAIRS, 5, 20);
        registry.add(Lush.CYPRESS_FENCE, 5, 20);
        registry.add(Lush.CYPRESS_FENCE_GATE, 5, 20);
        registry.add(Lush.CYPRESS_LEAVES, 30, 60);

        registry.add(Lush.EBONY_LOG, 5, 5);
        registry.add(Lush.EBONY_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_EBONY_LOG, 5, 5);
        registry.add(Lush.STRIPPED_EBONY_WOOD, 5, 5);
        registry.add(Lush.EBONY_PLANKS, 5, 20);
        registry.add(Lush.EBONY_SLAB, 5, 20);
        registry.add(Lush.EBONY_STAIRS, 5, 20);
        registry.add(Lush.EBONY_FENCE, 5, 20);
        registry.add(Lush.EBONY_FENCE_GATE, 5, 20);
        registry.add(Lush.EBONY_LEAVES, 30, 60);
        
        registry.add(Lush.FIR_LOG, 5, 5);
        registry.add(Lush.FIR_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_FIR_LOG, 5, 5);
        registry.add(Lush.STRIPPED_FIR_WOOD, 5, 5);
        registry.add(Lush.FIR_PLANKS, 5, 20);
        registry.add(Lush.FIR_SLAB, 5, 20);
        registry.add(Lush.FIR_STAIRS, 5, 20);
        registry.add(Lush.FIR_FENCE, 5, 20);
        registry.add(Lush.FIR_FENCE_GATE, 5, 20);
        registry.add(Lush.FIR_LEAVES, 30, 60);

        registry.add(Lush.GUM_LOG, 5, 5);
        registry.add(Lush.GUM_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_GUM_LOG, 5, 5);
        registry.add(Lush.STRIPPED_GUM_WOOD, 5, 5);
        registry.add(Lush.GUM_PLANKS, 5, 20);
        registry.add(Lush.GUM_SLAB, 5, 20);
        registry.add(Lush.GUM_STAIRS, 5, 20);
        registry.add(Lush.GUM_FENCE, 5, 20);
        registry.add(Lush.GUM_FENCE_GATE, 5, 20);
        registry.add(Lush.GUM_LEAVES, 30, 60);

        registry.add(Lush.HAWTHORN_LOG, 5, 5);
        registry.add(Lush.HAWTHORN_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_HAWTHORN_LOG, 5, 5);
        registry.add(Lush.STRIPPED_HAWTHORN_WOOD, 5, 5);
        registry.add(Lush.HAWTHORN_PLANKS, 5, 20);
        registry.add(Lush.HAWTHORN_SLAB, 5, 20);
        registry.add(Lush.HAWTHORN_STAIRS, 5, 20);
        registry.add(Lush.HAWTHORN_FENCE, 5, 20);
        registry.add(Lush.HAWTHORN_FENCE_GATE, 5, 20);
        registry.add(Lush.HAWTHORN_LEAVES, 30, 60);

        registry.add(Lush.HAZEL_LOG, 5, 5);
        registry.add(Lush.HAZEL_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_HAZEL_LOG, 5, 5);
        registry.add(Lush.STRIPPED_HAZEL_WOOD, 5, 5);
        registry.add(Lush.HAZEL_PLANKS, 5, 20);
        registry.add(Lush.HAZEL_SLAB, 5, 20);
        registry.add(Lush.HAZEL_STAIRS, 5, 20);
        registry.add(Lush.HAZEL_FENCE, 5, 20);
        registry.add(Lush.HAZEL_FENCE_GATE, 5, 20);
        registry.add(Lush.HAZEL_LEAVES, 30, 60);

        registry.add(Lush.HEMLOCK_LOG, 5, 5);
        registry.add(Lush.HEMLOCK_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_HEMLOCK_LOG, 5, 5);
        registry.add(Lush.STRIPPED_HEMLOCK_WOOD, 5, 5);
        registry.add(Lush.HEMLOCK_PLANKS, 5, 20);
        registry.add(Lush.HEMLOCK_SLAB, 5, 20);
        registry.add(Lush.HEMLOCK_STAIRS, 5, 20);
        registry.add(Lush.HEMLOCK_FENCE, 5, 20);
        registry.add(Lush.HEMLOCK_FENCE_GATE, 5, 20);
        registry.add(Lush.HEMLOCK_LEAVES, 30, 60);

        registry.add(Lush.HICKORY_LOG, 5, 5);
        registry.add(Lush.HICKORY_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_HICKORY_LOG, 5, 5);
        registry.add(Lush.STRIPPED_HICKORY_WOOD, 5, 5);
        registry.add(Lush.HICKORY_PLANKS, 5, 20);
        registry.add(Lush.HICKORY_SLAB, 5, 20);
        registry.add(Lush.HICKORY_STAIRS, 5, 20);
        registry.add(Lush.HICKORY_FENCE, 5, 20);
        registry.add(Lush.HICKORY_FENCE_GATE, 5, 20);
        registry.add(Lush.HICKORY_LEAVES, 30, 60);

        registry.add(Lush.JUNIPER_LOG, 5, 5);
        registry.add(Lush.JUNIPER_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_JUNIPER_LOG, 5, 5);
        registry.add(Lush.STRIPPED_JUNIPER_WOOD, 5, 5);
        registry.add(Lush.JUNIPER_PLANKS, 5, 20);
        registry.add(Lush.JUNIPER_SLAB, 5, 20);
        registry.add(Lush.JUNIPER_STAIRS, 5, 20);
        registry.add(Lush.JUNIPER_FENCE, 5, 20);
        registry.add(Lush.JUNIPER_FENCE_GATE, 5, 20);
        registry.add(Lush.JUNIPER_LEAVES, 30, 60);

        registry.add(Lush.LARCH_LOG, 5, 5);
        registry.add(Lush.LARCH_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_LARCH_LOG, 5, 5);
        registry.add(Lush.STRIPPED_LARCH_WOOD, 5, 5);
        registry.add(Lush.LARCH_PLANKS, 5, 20);
        registry.add(Lush.LARCH_SLAB, 5, 20);
        registry.add(Lush.LARCH_STAIRS, 5, 20);
        registry.add(Lush.LARCH_FENCE, 5, 20);
        registry.add(Lush.LARCH_FENCE_GATE, 5, 20);
        registry.add(Lush.LARCH_LEAVES, 30, 60);

        registry.add(Lush.MAHOGANY_LOG, 5, 5);
        registry.add(Lush.MAHOGANY_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_MAHOGANY_LOG, 5, 5);
        registry.add(Lush.STRIPPED_MAHOGANY_WOOD, 5, 5);
        registry.add(Lush.MAHOGANY_PLANKS, 5, 20);
        registry.add(Lush.MAHOGANY_SLAB, 5, 20);
        registry.add(Lush.MAHOGANY_STAIRS, 5, 20);
        registry.add(Lush.MAHOGANY_FENCE, 5, 20);
        registry.add(Lush.MAHOGANY_FENCE_GATE, 5, 20);
        registry.add(Lush.MAHOGANY_LEAVES, 30, 60);

        registry.add(Lush.MAPLE_LOG, 5, 5);
        registry.add(Lush.MAPLE_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_MAPLE_LOG, 5, 5);
        registry.add(Lush.STRIPPED_MAPLE_WOOD, 5, 5);
        registry.add(Lush.MAPLE_PLANKS, 5, 20);
        registry.add(Lush.MAPLE_SLAB, 5, 20);
        registry.add(Lush.MAPLE_STAIRS, 5, 20);
        registry.add(Lush.MAPLE_FENCE, 5, 20);
        registry.add(Lush.MAPLE_FENCE_GATE, 5, 20);
        registry.add(Lush.MAPLE_LEAVES, 30, 60);

        registry.add(Lush.MESQUITE_LOG, 5, 5);
        registry.add(Lush.MESQUITE_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_MESQUITE_LOG, 5, 5);
        registry.add(Lush.STRIPPED_MESQUITE_WOOD, 5, 5);
        registry.add(Lush.MESQUITE_PLANKS, 5, 20);
        registry.add(Lush.MESQUITE_SLAB, 5, 20);
        registry.add(Lush.MESQUITE_STAIRS, 5, 20);
        registry.add(Lush.MESQUITE_FENCE, 5, 20);
        registry.add(Lush.MESQUITE_FENCE_GATE, 5, 20);
        registry.add(Lush.MESQUITE_LEAVES, 30, 60);

        registry.add(Lush.PEACH_LOG, 5, 5);
        registry.add(Lush.PEACH_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_PEACH_LOG, 5, 5);
        registry.add(Lush.STRIPPED_PEACH_WOOD, 5, 5);
        registry.add(Lush.PEACH_PLANKS, 5, 20);
        registry.add(Lush.PEACH_SLAB, 5, 20);
        registry.add(Lush.PEACH_STAIRS, 5, 20);
        registry.add(Lush.PEACH_FENCE, 5, 20);
        registry.add(Lush.PEACH_FENCE_GATE, 5, 20);
        registry.add(Lush.PEACH_LEAVES, 30, 60);

        registry.add(Lush.PEAR_LOG, 5, 5);
        registry.add(Lush.PEAR_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_PEAR_LOG, 5, 5);
        registry.add(Lush.STRIPPED_PEAR_WOOD, 5, 5);
        registry.add(Lush.PEAR_PLANKS, 5, 20);
        registry.add(Lush.PEAR_SLAB, 5, 20);
        registry.add(Lush.PEAR_STAIRS, 5, 20);
        registry.add(Lush.PEAR_FENCE, 5, 20);
        registry.add(Lush.PEAR_FENCE_GATE, 5, 20);
        registry.add(Lush.PEAR_LEAVES, 30, 60);

        registry.add(Lush.PINE_LOG, 5, 5);
        registry.add(Lush.PINE_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_PINE_LOG, 5, 5);
        registry.add(Lush.STRIPPED_PINE_WOOD, 5, 5);
        registry.add(Lush.PINE_PLANKS, 5, 20);
        registry.add(Lush.PINE_SLAB, 5, 20);
        registry.add(Lush.PINE_STAIRS, 5, 20);
        registry.add(Lush.PINE_FENCE, 5, 20);
        registry.add(Lush.PINE_FENCE_GATE, 5, 20);
        registry.add(Lush.PINE_LEAVES, 30, 60);

        registry.add(Lush.REDWOOD_LOG, 5, 5);
        registry.add(Lush.REDWOOD_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_REDWOOD_LOG, 5, 5);
        registry.add(Lush.STRIPPED_REDWOOD_WOOD, 5, 5);
        registry.add(Lush.REDWOOD_PLANKS, 5, 20);
        registry.add(Lush.REDWOOD_SLAB, 5, 20);
        registry.add(Lush.REDWOOD_STAIRS, 5, 20);
        registry.add(Lush.REDWOOD_FENCE, 5, 20);
        registry.add(Lush.REDWOOD_FENCE_GATE, 5, 20);
        registry.add(Lush.REDWOOD_LEAVES, 30, 60);

        registry.add(Lush.ROSEWOOD_LOG, 5, 5);
        registry.add(Lush.ROSEWOOD_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_ROSEWOOD_LOG, 5, 5);
        registry.add(Lush.STRIPPED_ROSEWOOD_WOOD, 5, 5);
        registry.add(Lush.ROSEWOOD_PLANKS, 5, 20);
        registry.add(Lush.ROSEWOOD_SLAB, 5, 20);
        registry.add(Lush.ROSEWOOD_STAIRS, 5, 20);
        registry.add(Lush.ROSEWOOD_FENCE, 5, 20);
        registry.add(Lush.ROSEWOOD_FENCE_GATE, 5, 20);
        registry.add(Lush.ROSEWOOD_LEAVES, 30, 60);

        registry.add(Lush.TEAK_LOG, 5, 5);
        registry.add(Lush.TEAK_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_TEAK_LOG, 5, 5);
        registry.add(Lush.STRIPPED_TEAK_WOOD, 5, 5);
        registry.add(Lush.TEAK_PLANKS, 5, 20);
        registry.add(Lush.TEAK_SLAB, 5, 20);
        registry.add(Lush.TEAK_STAIRS, 5, 20);
        registry.add(Lush.TEAK_FENCE, 5, 20);
        registry.add(Lush.TEAK_FENCE_GATE, 5, 20);
        registry.add(Lush.TEAK_LEAVES, 30, 60);

        registry.add(Lush.WALNUT_LOG, 5, 5);
        registry.add(Lush.WALNUT_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_WALNUT_LOG, 5, 5);
        registry.add(Lush.STRIPPED_WALNUT_WOOD, 5, 5);
        registry.add(Lush.WALNUT_PLANKS, 5, 20);
        registry.add(Lush.WALNUT_SLAB, 5, 20);
        registry.add(Lush.WALNUT_STAIRS, 5, 20);
        registry.add(Lush.WALNUT_FENCE, 5, 20);
        registry.add(Lush.WALNUT_FENCE_GATE, 5, 20);
        registry.add(Lush.WALNUT_LEAVES, 30, 60);

        registry.add(Lush.WILLOW_LOG, 5, 5);
        registry.add(Lush.WILLOW_WOOD, 5, 5);
        registry.add(Lush.STRIPPED_WILLOW_LOG, 5, 5);
        registry.add(Lush.STRIPPED_WILLOW_WOOD, 5, 5);
        registry.add(Lush.WILLOW_PLANKS, 5, 20);
        registry.add(Lush.WILLOW_SLAB, 5, 20);
        registry.add(Lush.WILLOW_STAIRS, 5, 20);
        registry.add(Lush.WILLOW_FENCE, 5, 20);
        registry.add(Lush.WILLOW_FENCE_GATE, 5, 20);
        registry.add(Lush.WILLOW_LEAVES, 30, 60);
    }

    public static void registerStrippables() {
        StrippableBlockRegistry.register(Lush.ALDER_LOG, Lush.STRIPPED_ALDER_LOG);
        StrippableBlockRegistry.register(Lush.ALDER_WOOD, Lush.STRIPPED_ALDER_WOOD);

        StrippableBlockRegistry.register(Lush.APPLE_LOG, Lush.STRIPPED_APPLE_LOG);
        StrippableBlockRegistry.register(Lush.APPLE_WOOD, Lush.STRIPPED_APPLE_WOOD);

        StrippableBlockRegistry.register(Lush.ASH_LOG, Lush.STRIPPED_ASH_LOG);
        StrippableBlockRegistry.register(Lush.ASH_WOOD, Lush.STRIPPED_ASH_WOOD);

        StrippableBlockRegistry.register(Lush.ASPEN_LOG, Lush.STRIPPED_ASPEN_LOG);
        StrippableBlockRegistry.register(Lush.ASPEN_WOOD, Lush.STRIPPED_ASPEN_WOOD);

        StrippableBlockRegistry.register(Lush.CEDAR_LOG, Lush.STRIPPED_CEDAR_LOG);
        StrippableBlockRegistry.register(Lush.CEDAR_WOOD, Lush.STRIPPED_CEDAR_WOOD);

        StrippableBlockRegistry.register(Lush.CHERRY_LOG, Lush.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register(Lush.CHERRY_WOOD, Lush.STRIPPED_CHERRY_WOOD);

        StrippableBlockRegistry.register(Lush.CHESTNUT_LOG, Lush.STRIPPED_CHESTNUT_LOG);
        StrippableBlockRegistry.register(Lush.CHESTNUT_WOOD, Lush.STRIPPED_CHESTNUT_WOOD);

        StrippableBlockRegistry.register(Lush.CITRUS_LOG, Lush.STRIPPED_CITRUS_LOG);
        StrippableBlockRegistry.register(Lush.CITRUS_WOOD, Lush.STRIPPED_CITRUS_WOOD);

        StrippableBlockRegistry.register(Lush.COTTONWOOD_LOG, Lush.STRIPPED_COTTONWOOD_LOG);
        StrippableBlockRegistry.register(Lush.COTTONWOOD_WOOD, Lush.STRIPPED_COTTONWOOD_WOOD);

        StrippableBlockRegistry.register(Lush.CYPRESS_LOG, Lush.STRIPPED_CYPRESS_LOG);
        StrippableBlockRegistry.register(Lush.CYPRESS_WOOD, Lush.STRIPPED_CYPRESS_WOOD);

        StrippableBlockRegistry.register(Lush.EBONY_LOG, Lush.STRIPPED_EBONY_LOG);
        StrippableBlockRegistry.register(Lush.EBONY_WOOD, Lush.STRIPPED_EBONY_WOOD);

        StrippableBlockRegistry.register(Lush.FIR_LOG, Lush.STRIPPED_FIR_LOG);
        StrippableBlockRegistry.register(Lush.FIR_WOOD, Lush.STRIPPED_FIR_WOOD);

        StrippableBlockRegistry.register(Lush.GUM_LOG, Lush.STRIPPED_GUM_LOG);
        StrippableBlockRegistry.register(Lush.GUM_WOOD, Lush.STRIPPED_GUM_WOOD);

        StrippableBlockRegistry.register(Lush.HAWTHORN_LOG, Lush.STRIPPED_HAWTHORN_LOG);
        StrippableBlockRegistry.register(Lush.HAWTHORN_WOOD, Lush.STRIPPED_HAWTHORN_WOOD);

        StrippableBlockRegistry.register(Lush.HAZEL_LOG, Lush.STRIPPED_HAZEL_LOG);
        StrippableBlockRegistry.register(Lush.HAZEL_WOOD, Lush.STRIPPED_HAZEL_WOOD);

        StrippableBlockRegistry.register(Lush.HEMLOCK_LOG, Lush.STRIPPED_HEMLOCK_LOG);
        StrippableBlockRegistry.register(Lush.HEMLOCK_WOOD, Lush.STRIPPED_HEMLOCK_WOOD);

        StrippableBlockRegistry.register(Lush.HICKORY_LOG, Lush.STRIPPED_HICKORY_LOG);
        StrippableBlockRegistry.register(Lush.HICKORY_WOOD, Lush.STRIPPED_HICKORY_WOOD);

        StrippableBlockRegistry.register(Lush.JUNIPER_LOG, Lush.STRIPPED_JUNIPER_LOG);
        StrippableBlockRegistry.register(Lush.JUNIPER_WOOD, Lush.STRIPPED_JUNIPER_WOOD);

        StrippableBlockRegistry.register(Lush.LARCH_LOG, Lush.STRIPPED_LARCH_LOG);
        StrippableBlockRegistry.register(Lush.LARCH_WOOD, Lush.STRIPPED_LARCH_WOOD);

        StrippableBlockRegistry.register(Lush.MAHOGANY_LOG, Lush.STRIPPED_MAHOGANY_LOG);
        StrippableBlockRegistry.register(Lush.MAHOGANY_WOOD, Lush.STRIPPED_MAHOGANY_WOOD);

        StrippableBlockRegistry.register(Lush.MAPLE_LOG, Lush.STRIPPED_MAPLE_LOG);
        StrippableBlockRegistry.register(Lush.MAPLE_WOOD, Lush.STRIPPED_MAPLE_WOOD);

        StrippableBlockRegistry.register(Lush.MESQUITE_LOG, Lush.STRIPPED_MESQUITE_LOG);
        StrippableBlockRegistry.register(Lush.MESQUITE_WOOD, Lush.STRIPPED_MESQUITE_WOOD);

        StrippableBlockRegistry.register(Lush.PEACH_LOG, Lush.STRIPPED_PEACH_LOG);
        StrippableBlockRegistry.register(Lush.PEACH_WOOD, Lush.STRIPPED_PEACH_WOOD);

        StrippableBlockRegistry.register(Lush.PEAR_LOG, Lush.STRIPPED_PEAR_LOG);
        StrippableBlockRegistry.register(Lush.PEAR_WOOD, Lush.STRIPPED_PEAR_WOOD);

        StrippableBlockRegistry.register(Lush.PINE_LOG, Lush.STRIPPED_PINE_LOG);
        StrippableBlockRegistry.register(Lush.PINE_WOOD, Lush.STRIPPED_PINE_WOOD);

        StrippableBlockRegistry.register(Lush.REDWOOD_LOG, Lush.STRIPPED_REDWOOD_LOG);
        StrippableBlockRegistry.register(Lush.REDWOOD_WOOD, Lush.STRIPPED_REDWOOD_WOOD);

        StrippableBlockRegistry.register(Lush.ROSEWOOD_LOG, Lush.STRIPPED_ROSEWOOD_LOG);
        StrippableBlockRegistry.register(Lush.ROSEWOOD_WOOD, Lush.STRIPPED_ROSEWOOD_WOOD);

        StrippableBlockRegistry.register(Lush.TEAK_LOG, Lush.STRIPPED_TEAK_LOG);
        StrippableBlockRegistry.register(Lush.TEAK_WOOD, Lush.STRIPPED_TEAK_WOOD);

        StrippableBlockRegistry.register(Lush.WALNUT_LOG, Lush.STRIPPED_WALNUT_LOG);
        StrippableBlockRegistry.register(Lush.WALNUT_WOOD, Lush.STRIPPED_WALNUT_WOOD);

        StrippableBlockRegistry.register(Lush.WILLOW_LOG, Lush.STRIPPED_WILLOW_LOG);
        StrippableBlockRegistry.register(Lush.WILLOW_WOOD, Lush.STRIPPED_WILLOW_WOOD);
    }

    public static void registerCompostables() {
        CompostingChanceRegistry registry = CompostingChanceRegistry.INSTANCE;

        registry.add(Lush.ALDER_LEAVES, 0.30F);
        registry.add(Lush.ALDER_SAPLING, 0.30F);

        registry.add(Lush.APPLE_LEAVES, 0.30F);
        registry.add(Lush.APPLE_SAPLING, 0.30F);

        registry.add(Lush.ASH_LEAVES, 0.30F);
        registry.add(Lush.ASH_SAPLING, 0.30F);

        registry.add(Lush.ASPEN_LEAVES, 0.30F);
        registry.add(Lush.ASPEN_SAPLING, 0.30F);

        registry.add(Lush.CEDAR_LEAVES, 0.30F);
        registry.add(Lush.CEDAR_SAPLING, 0.30F);

        registry.add(Lush.CHERRY_LEAVES, 0.30F);
        registry.add(Lush.CHERRY_SAPLING, 0.30F);

        registry.add(Lush.CHESTNUT_LEAVES, 0.30F);
        registry.add(Lush.CHESTNUT_SAPLING, 0.30F);

        registry.add(Lush.CITRUS_LEAVES, 0.30F);
        registry.add(Lush.CITRUS_SAPLING, 0.30F);

        registry.add(Lush.COTTONWOOD_LEAVES, 0.30F);
        registry.add(Lush.COTTONWOOD_SAPLING, 0.30F);

        registry.add(Lush.CYPRESS_LEAVES, 0.30F);
        registry.add(Lush.CYPRESS_SAPLING, 0.30F);

        registry.add(Lush.EBONY_LEAVES, 0.30F);
        registry.add(Lush.EBONY_SAPLING, 0.30F);

        registry.add(Lush.FIR_LEAVES, 0.30F);
        registry.add(Lush.FIR_SAPLING, 0.30F);

        registry.add(Lush.GUM_LEAVES, 0.30F);
        registry.add(Lush.GUM_SAPLING, 0.30F);

        registry.add(Lush.HAWTHORN_LEAVES, 0.30F);
        registry.add(Lush.HAWTHORN_SAPLING, 0.30F);

        registry.add(Lush.HAZEL_LEAVES, 0.30F);
        registry.add(Lush.HAZEL_SAPLING, 0.30F);

        registry.add(Lush.HEMLOCK_LEAVES, 0.30F);
        registry.add(Lush.HEMLOCK_SAPLING, 0.30F);

        registry.add(Lush.HICKORY_LEAVES, 0.30F);
        registry.add(Lush.HICKORY_SAPLING, 0.30F);

        registry.add(Lush.JUNIPER_LEAVES, 0.30F);
        registry.add(Lush.JUNIPER_SAPLING, 0.30F);

        registry.add(Lush.LARCH_LEAVES, 0.30F);
        registry.add(Lush.LARCH_SAPLING, 0.30F);

        registry.add(Lush.MAHOGANY_LEAVES, 0.30F);
        registry.add(Lush.MAHOGANY_SAPLING, 0.30F);

        registry.add(Lush.MAPLE_LEAVES, 0.30F);
        registry.add(Lush.MAPLE_SAPLING, 0.30F);

        registry.add(Lush.MESQUITE_LEAVES, 0.30F);
        registry.add(Lush.MESQUITE_SAPLING, 0.30F);

        registry.add(Lush.PEACH_LEAVES, 0.30F);
        registry.add(Lush.PEACH_SAPLING, 0.30F);

        registry.add(Lush.PEAR_LEAVES, 0.30F);
        registry.add(Lush.PEAR_SAPLING, 0.30F);

        registry.add(Lush.PINE_LEAVES, 0.30F);
        registry.add(Lush.PINE_SAPLING, 0.30F);

        registry.add(Lush.REDWOOD_LEAVES, 0.30F);
        registry.add(Lush.REDWOOD_SAPLING, 0.30F);

        registry.add(Lush.ROSEWOOD_LEAVES, 0.30F);
        registry.add(Lush.ROSEWOOD_SAPLING, 0.30F);

        registry.add(Lush.TEAK_LEAVES, 0.30F);
        registry.add(Lush.TEAK_SAPLING, 0.30F);

        registry.add(Lush.WALNUT_LEAVES, 0.30F);
        registry.add(Lush.WALNUT_SAPLING, 0.30F);

        registry.add(Lush.WILLOW_LEAVES, 0.30F);
        registry.add(Lush.WILLOW_SAPLING, 0.30F);

    }

    public static void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ALDER_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ALDER_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ALDER_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ALDER_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_ALDER_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.APPLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.APPLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.APPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.APPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_APPLE_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ASH_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ASH_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ASH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ASH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_ASH_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ASPEN_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ASPEN_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ASPEN_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ASPEN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_ASPEN_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CEDAR_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CEDAR_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CEDAR_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CEDAR_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_CEDAR_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CHERRY_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CHERRY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CHERRY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_CHERRY_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CHESTNUT_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CHESTNUT_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CHESTNUT_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CHESTNUT_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_CHESTNUT_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CITRUS_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CITRUS_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CITRUS_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CITRUS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_CITRUS_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.COTTONWOOD_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.COTTONWOOD_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.COTTONWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.COTTONWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_COTTONWOOD_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CYPRESS_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CYPRESS_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CYPRESS_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.CYPRESS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_CYPRESS_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.EBONY_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.EBONY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.EBONY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.EBONY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_EBONY_SAPLING, RenderLayer.getCutout());
        
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.FIR_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.FIR_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.FIR_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.FIR_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_FIR_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.GUM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.GUM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.GUM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.GUM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_GUM_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HAWTHORN_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HAWTHORN_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HAWTHORN_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HAWTHORN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_HAWTHORN_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HAZEL_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HAZEL_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HAZEL_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HAZEL_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_HAZEL_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HEMLOCK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HEMLOCK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HEMLOCK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HEMLOCK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_HEMLOCK_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HICKORY_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HICKORY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HICKORY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.HICKORY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_HICKORY_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.JUNIPER_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.JUNIPER_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.JUNIPER_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.JUNIPER_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_JUNIPER_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.LARCH_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.LARCH_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.LARCH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.LARCH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_LARCH_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.MAHOGANY_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.MAHOGANY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.MAHOGANY_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.MAHOGANY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_MAHOGANY_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.MAPLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.MAPLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.MAPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_MAPLE_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.MESQUITE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.MESQUITE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.MESQUITE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.MESQUITE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_MESQUITE_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.PEACH_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.PEACH_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.PEACH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.PEACH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_PEACH_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.PEAR_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.PEAR_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.PEAR_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.PEAR_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_PEAR_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.PINE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.PINE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.PINE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_PINE_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.REDWOOD_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.REDWOOD_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.REDWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.REDWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_REDWOOD_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ROSEWOOD_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ROSEWOOD_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ROSEWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.ROSEWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_ROSEWOOD_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.TEAK_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.TEAK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.TEAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.TEAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_TEAK_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.WALNUT_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.WALNUT_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.WALNUT_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.WALNUT_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_WALNUT_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Lush.WILLOW_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.WILLOW_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.WILLOW_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.WILLOW_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_WILLOW_SAPLING, RenderLayer.getCutout());
    }

    @Environment(EnvType.CLIENT)
    public static void registerColorProviders() {
        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.ALDER_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.APPLE_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.ASPEN_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x537047;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x566F48;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x5C6E4A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x566F48;
                                }
                            }
//                        return (BiomeColors.getFoliageColor(world, pos) - 0x19110B);
                            return 0x5C6E4A;
                        }
//                    return (FoliageColors.getColor(0.5, 1.0) - 0x19110B);
                        return 0x5C6E4A;
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x4F945E;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x50925A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x539054;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x50925A;
                                }
                            }
                            return 0x539054;
                        }
                        return 0x539054;
                    }
                },
                Lush.CEDAR_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.CHERRY_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.CHESTNUT_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.CITRUS_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.COTTONWOOD_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x537047;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x566F48;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x5C6E4A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x566F48;
                                }
                            }
//                        return (BiomeColors.getFoliageColor(world, pos) - 0x19110B);
                            return 0x5C6E4A;
                        }
//                    return (FoliageColors.getColor(0.5, 1.0) - 0x19110B);
                        return 0x5C6E4A;
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x4F945E;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x50925A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x539054;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x50925A;
                                }
                            }
                            return 0x539054;
                        }
                        return 0x539054;
                    }
                },
                Lush.CYPRESS_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.EBONY_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x537047;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x566F48;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x5C6E4A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x566F48;
                                }
                            }
//                        return (BiomeColors.getFoliageColor(world, pos) - 0x19110B);
                            return 0x5C6E4A;
                        }
//                    return (FoliageColors.getColor(0.5, 1.0) - 0x19110B);
                        return 0x5C6E4A;
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x4F945E;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x50925A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x539054;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x50925A;
                                }
                            }
                            return 0x539054;
                        }
                        return 0x539054;
                    }
                },
                Lush.FIR_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.GUM_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.HAWTHORN_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.HAZEL_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.HEMLOCK_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.HICKORY_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x537047;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x566F48;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x5C6E4A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x566F48;
                                }
                            }
//                        return (BiomeColors.getFoliageColor(world, pos) - 0x19110B);
                            return 0x5C6E4A;
                        }
//                    return (FoliageColors.getColor(0.5, 1.0) - 0x19110B);
                        return 0x5C6E4A;
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x4F945E;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x50925A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x539054;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x50925A;
                                }
                            }
                            return 0x539054;
                        }
                        return 0x539054;
                    }
                },
                Lush.JUNIPER_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x537047;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x566F48;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x5C6E4A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x566F48;
                                }
                            }
//                        return (BiomeColors.getFoliageColor(world, pos) - 0x19110B);
                            return 0x5C6E4A;
                        }
//                    return (FoliageColors.getColor(0.5, 1.0) - 0x19110B);
                        return 0x5C6E4A;
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x4F945E;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x50925A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x539054;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x50925A;
                                }
                            }
                            return 0x539054;
                        }
                        return 0x539054;
                    }
                },
                Lush.LARCH_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.MAHOGANY_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.MAPLE_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.MESQUITE_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.PEACH_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.PEAR_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x537047;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x566F48;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x5C6E4A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x566F48;
                                }
                            }
//                        return (BiomeColors.getFoliageColor(world, pos) - 0x19110B);
                            return 0x5C6E4A;
                        }
//                    return (FoliageColors.getColor(0.5, 1.0) - 0x19110B);
                        return 0x5C6E4A;
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x4F945E;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x50925A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x539054;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x50925A;
                                }
                            }
                            return 0x539054;
                        }
                        return 0x539054;
                    }
                },
                Lush.PINE_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x537047;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x557048;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x566F48;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x5C6E4A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x5A6E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x596E49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x586F49;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x566F48;
                                }
                            }
//                        return (BiomeColors.getFoliageColor(world, pos) - 0x19110B);
                            return 0x5C6E4A;
                        }
//                    return (FoliageColors.getColor(0.5, 1.0) - 0x19110B);
                        return 0x5C6E4A;
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return 0x4F945E;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return 0x50935C;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return 0x50925A;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return 0x539054;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return 0x529055;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return 0x529157;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return 0x519259;
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return 0x50925A;
                                }
                            }
                            return 0x539054;
                        }
                        return 0x539054;
                    }
                },
                Lush.REDWOOD_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.ROSEWOOD_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.TEAK_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.WALNUT_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    FabricLoader loader = FabricLoader.getInstance();
                    if(loader.isModLoaded("catherine")) {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                    else {
                        if (world != null && pos != null) {
                            if (loader.isModLoaded("seasons")) {
                                MinecraftClient client = MinecraftClient.getInstance();
                                ClientPlayerEntity player = client.player;
                                assert player != null;
                                if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SPRING) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_SUMMER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_AUTUMN) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.EARLY_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.MID_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                                else if (Seasons.getCurrentSeason(player.world) == Season.LATE_WINTER) {
                                    return BiomeColors.getFoliageColor(world, pos);
                                }
                            }
                            return BiomeColors.getFoliageColor(world, pos);
                        }
                        return FoliageColors.getColor(0.5, 1.0);
                    }
                },
                Lush.WILLOW_LEAVES
        );

        ColorProviderRegistry.ITEM.register(
                (stack, tintIndex) -> {
                    if (tintIndex > 0) return -1;
                    BlockColors colors = MinecraftClient.getInstance().getBlockColors();
                    return colors.getColor(((BlockItem) stack.getItem()).getBlock().getDefaultState(), null, null, tintIndex);
                },
                Lush.ALDER_LEAVES,
                Lush.APPLE_LEAVES,
                Lush.ASH_LEAVES,
                Lush.ASPEN_LEAVES,
                Lush.CEDAR_LEAVES,
                Lush.CHERRY_LEAVES,
                Lush.CHESTNUT_LEAVES,
                Lush.CITRUS_LEAVES,
                Lush.COTTONWOOD_LEAVES,
                Lush.CYPRESS_LEAVES,
                Lush.EBONY_LEAVES,
                Lush.FIR_LEAVES,
                Lush.GUM_LEAVES,
                Lush.HAWTHORN_LEAVES,
                Lush.HAZEL_LEAVES,
                Lush.HEMLOCK_LEAVES,
                Lush.HICKORY_LEAVES,
                Lush.JUNIPER_LEAVES,
                Lush.LARCH_LEAVES,
                Lush.MAHOGANY_LEAVES,
                Lush.MAPLE_LEAVES,
                Lush.MESQUITE_LEAVES,
                Lush.PEACH_LEAVES,
                Lush.PEAR_LEAVES,
                Lush.PINE_LEAVES,
                Lush.REDWOOD_LEAVES,
                Lush.ROSEWOOD_LEAVES,
                Lush.TEAK_LEAVES,
                Lush.WALNUT_LEAVES,
                Lush.WILLOW_LEAVES
        );

    }

}
