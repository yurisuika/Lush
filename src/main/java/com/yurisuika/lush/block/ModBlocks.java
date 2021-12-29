package com.yurisuika.lush.block;

import com.yurisuika.lush.Lush;
import com.yurisuika.lush.item.ModItemGroup;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.yurisuika.lush.world.features.tree.FirSaplingGenerator;

import java.util.List;

public class ModBlocks {

    public static final Block STRIPPED_ACACIA_BRANCH = registerBlock("stripped_acacia_branch", new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block ACACIA_BRANCH = registerBlock("acacia_branch", new BranchBlock(STRIPPED_ACACIA_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_ACACIA_TWIG = registerBlock("stripped_acacia_twig", new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block ACACIA_TWIG = registerBlock("acacia_twig", new TwigBlock(STRIPPED_ACACIA_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD)));

    public static final Block STRIPPED_BIRCH_BRANCH = registerBlock("stripped_birch_branch", new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block BIRCH_BRANCH = registerBlock("birch_branch", new BranchBlock(STRIPPED_BIRCH_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_BIRCH_TWIG = registerBlock("stripped_birch_twig", new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block BIRCH_TWIG = registerBlock("birch_twig", new TwigBlock(STRIPPED_BIRCH_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD)));

    public static final Block STRIPPED_DARK_OAK_BRANCH = registerBlock("stripped_dark_oak_branch", new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block DARK_OAK_BRANCH = registerBlock("dark_oak_branch", new BranchBlock(STRIPPED_DARK_OAK_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_DARK_OAK_TWIG = registerBlock("stripped_dark_oak_twig", new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block DARK_OAK_TWIG = registerBlock("dark_oak_twig", new TwigBlock(STRIPPED_DARK_OAK_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD)));

    public static final Block STRIPPED_JUNGLE_BRANCH = registerBlock("stripped_jungle_branch", new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block JUNGLE_BRANCH = registerBlock("jungle_branch", new BranchBlock(STRIPPED_JUNGLE_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_JUNGLE_TWIG = registerBlock("stripped_jungle_twig", new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block JUNGLE_TWIG = registerBlock("jungle_twig", new TwigBlock(STRIPPED_JUNGLE_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD)));

    public static final Block STRIPPED_OAK_BRANCH = registerBlock("stripped_oak_branch", new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block OAK_BRANCH = registerBlock("oak_branch", new BranchBlock(STRIPPED_OAK_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_OAK_TWIG = registerBlock("stripped_oak_twig", new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block OAK_TWIG = registerBlock("oak_twig", new TwigBlock(STRIPPED_OAK_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD)));

    public static final Block STRIPPED_SPRUCE_BRANCH = registerBlock("stripped_spruce_branch", new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block SPRUCE_BRANCH = registerBlock("spruce_branch", new BranchBlock(STRIPPED_SPRUCE_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_SPRUCE_TWIG = registerBlock("stripped_spruce_twig", new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block SPRUCE_TWIG = registerBlock("spruce_twig", new TwigBlock(STRIPPED_SPRUCE_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD)));

    public static final Block FIR_LOG = registerBlock("fir_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block FIR_WOOD = registerBlock("fir_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_FIR_LOG = registerBlock("stripped_fir_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_FIR_WOOD = registerBlock("stripped_fir_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block FIR_LEAVES = registerBlock("fir_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block FIR_SAPLING = registerBlock("fir_sapling", new SaplingBlock(new FirSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)));
    public static final Block POTTED_FIR_SAPLING = registerBlockWithoutBlockItem("potted_fir_sapling", new FlowerPotBlock(FIR_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_OAK_SAPLING)));
    
    public static final Block STRIPPED_FIR_BRANCH = registerBlock("stripped_fir_branch", new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block FIR_BRANCH = registerBlock("fir_branch", new BranchBlock(STRIPPED_FIR_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_FIR_TWIG = registerBlock("stripped_fir_twig", new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block FIR_TWIG = registerBlock("fir_twig", new TwigBlock(STRIPPED_FIR_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD)));

    public static final Block FIR_PLANKS = registerBlock("fir_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block FIR_SLAB = registerBlock("fir_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    public static final Block FIR_STAIRS = registerBlock("fir_stairs", new StairsBlock(FIR_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS)));

    public static final Block FIR_FENCE = registerBlock("fir_fence", new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));
    public static final Block FIR_FENCE_GATE = registerBlock("fir_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)));

    public static final Block FIR_BUTTON = registerBlock("fir_button", new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON)));
    public static final Block FIR_PRESSURE_PLATE = registerBlock("fir_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block FIR_DOOR = registerBlock("fir_door", new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR)));
    public static final Block FIR_TRAPDOOR = registerBlock("fir_trapdoor", new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR)));

    @Environment(EnvType.CLIENT)
    public static void registerRendering() {

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    if (world != null && pos != null) {
//                        return BiomeColors.getFoliageColor(world, pos);
                        return (BiomeColors.getFoliageColor(world, pos) - 0x19110B);
//                        return 6188365;
                    }

//                    return FoliageColors.getColor(0.5, 1.0);
//                    return 6188365;
                    return (FoliageColors.getColor(0.5, 1.0) - 0x19110B);
//                    return (FoliageColors.getColor(0.5, 1.0) & 0x19110B) >> 1;
                },
                FIR_LEAVES
        );

        ColorProviderRegistry.ITEM.register(
                (stack, tintIndex) -> {
                    if (tintIndex > 0) return -1;

                    BlockColors colors = MinecraftClient.getInstance().getBlockColors();
                    return colors.getColor(((BlockItem) stack.getItem()).getBlock().getDefaultState(), null, null, tintIndex);
                },
                FIR_LEAVES
        );

    }

    /********************************************************************/

    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(Lush.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Lush.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Lush.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(ModItemGroup.LUSH)));
    }

    public static void registerBlocks() {
        System.out.println("Registering ModBlocks for " + Lush.MOD_ID);
    }

}
