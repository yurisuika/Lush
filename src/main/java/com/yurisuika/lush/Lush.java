package com.yurisuika.lush;

import com.yurisuika.lush.block.*;
import com.yurisuika.lush.item.ModItemGroup;
import com.yurisuika.lush.mixin.SignTypeAccessor;
import com.yurisuika.lush.util.ModBoatType;
import com.yurisuika.lush.registry.ModRegistry;
import com.yurisuika.lush.world.features.tree.FirSaplingGenerator;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lush implements ModInitializer {

	public static final String MOD_ID = "lush";

	public static final Logger LOGGER = LogManager.getLogger("lush");

	public static final Block STRIPPED_OAK_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_OAK_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_OAK_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block OAK_TWIG = new TwigBlock(STRIPPED_OAK_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block OAK_BRANCH = new BranchBlock(STRIPPED_OAK_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block OAK_TRUNK = new TrunkBlock(STRIPPED_OAK_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));

	public static final Block STRIPPED_SPRUCE_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_SPRUCE_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_SPRUCE_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block SPRUCE_TWIG = new TwigBlock(STRIPPED_SPRUCE_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block SPRUCE_BRANCH = new BranchBlock(STRIPPED_SPRUCE_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block SPRUCE_TRUNK = new TrunkBlock(STRIPPED_SPRUCE_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));

	public static final Block STRIPPED_BIRCH_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_BIRCH_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_BIRCH_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block BIRCH_TWIG = new TwigBlock(STRIPPED_BIRCH_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block BIRCH_BRANCH = new BranchBlock(STRIPPED_BIRCH_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block BIRCH_TRUNK = new TrunkBlock(STRIPPED_BIRCH_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));

	public static final Block STRIPPED_JUNGLE_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_JUNGLE_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_JUNGLE_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block JUNGLE_TWIG = new TwigBlock(STRIPPED_JUNGLE_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block JUNGLE_BRANCH = new BranchBlock(STRIPPED_JUNGLE_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block JUNGLE_TRUNK = new TrunkBlock(STRIPPED_JUNGLE_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));

	public static final Block STRIPPED_ACACIA_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_ACACIA_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_ACACIA_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block ACACIA_TWIG = new TwigBlock(STRIPPED_ACACIA_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block ACACIA_BRANCH = new BranchBlock(STRIPPED_ACACIA_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block ACACIA_TRUNK = new TrunkBlock(STRIPPED_ACACIA_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));

	public static final Block STRIPPED_DARK_OAK_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_DARK_OAK_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_DARK_OAK_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block DARK_OAK_TWIG = new TwigBlock(STRIPPED_DARK_OAK_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block DARK_OAK_BRANCH = new BranchBlock(STRIPPED_DARK_OAK_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block DARK_OAK_TRUNK = new TrunkBlock(STRIPPED_DARK_OAK_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));

	public static final Block FIR_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
	public static final Block FIR_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block STRIPPED_FIR_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
	public static final Block STRIPPED_FIR_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block FIR_LEAVES =  new LushLeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES));
	public static final Block FIR_SAPLING = new SaplingBlock(new FirSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING));
	public static final Block POTTED_FIR_SAPLING = new FlowerPotBlock(FIR_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_OAK_SAPLING));
	public static final Block STRIPPED_FIR_TWIG = new StrippedTwigBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_FIR_BRANCH = new StrippedBranchBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block STRIPPED_FIR_TRUNK = new StrippedTrunkBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
	public static final Block FIR_TWIG = new TwigBlock(STRIPPED_FIR_TWIG, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block FIR_BRANCH = new BranchBlock(STRIPPED_FIR_BRANCH, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block FIR_TRUNK = new TrunkBlock(STRIPPED_FIR_TRUNK, FabricBlockSettings.copy(Blocks.OAK_WOOD));
	public static final Block FIR_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
	public static final Block FIR_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB));
	public static final Block FIR_STAIRS = new StairsBlock(FIR_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS));
	public static final Block FIR_FENCE = new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE));
	public static final Block FIR_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE));
	public static final Block FIR_BUTTON = new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON));
	public static final Block FIR_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE));
	public static final Block FIR_DOOR = new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR));
	public static final Block FIR_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR));
	public static final SignType FIR_SIGN_TYPE = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("fir"));
	public static final Block FIR_SIGN = new ModSignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), FIR_SIGN_TYPE);
	public static final Block FIR_WALL_SIGN = new ModWallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN).dropsLike(FIR_SIGN), FIR_SIGN_TYPE);
	public static final Item FIR_BOAT = new BoatItem(ModBoatType.FIR, new Item.Settings().maxCount(1).group(ModItemGroup.SPRUCE));

	@Override
	public void onInitialize() {
		LOGGER.info("Nature's bosom flows into your cup!");

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "oak_trunk"), OAK_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "oak_branch"), OAK_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "oak_twig"), OAK_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_oak_trunk"), STRIPPED_OAK_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_oak_branch"), STRIPPED_OAK_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_oak_twig"), STRIPPED_OAK_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_trunk"), new BlockItem(OAK_TRUNK, new Item.Settings().group(ModItemGroup.OAK)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_branch"), new BlockItem(OAK_BRANCH, new Item.Settings().group(ModItemGroup.OAK)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_twig"), new BlockItem(OAK_TWIG, new Item.Settings().group(ModItemGroup.OAK)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_trunk"), new BlockItem(STRIPPED_OAK_TRUNK, new Item.Settings().group(ModItemGroup.OAK)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_branch"), new BlockItem(STRIPPED_OAK_BRANCH, new Item.Settings().group(ModItemGroup.OAK)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_twig"), new BlockItem(STRIPPED_OAK_TWIG, new Item.Settings().group(ModItemGroup.OAK)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spruce_trunk"), SPRUCE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spruce_branch"), SPRUCE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spruce_twig"), SPRUCE_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_spruce_trunk"), STRIPPED_SPRUCE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_spruce_branch"), STRIPPED_SPRUCE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_spruce_twig"), STRIPPED_SPRUCE_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_trunk"), new BlockItem(SPRUCE_TRUNK, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_branch"), new BlockItem(SPRUCE_BRANCH, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_twig"), new BlockItem(SPRUCE_TWIG, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_trunk"), new BlockItem(STRIPPED_SPRUCE_TRUNK, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_branch"), new BlockItem(STRIPPED_SPRUCE_BRANCH, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_twig"), new BlockItem(STRIPPED_SPRUCE_TWIG, new Item.Settings().group(ModItemGroup.SPRUCE)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birch_trunk"), BIRCH_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birch_branch"), BIRCH_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birch_twig"), BIRCH_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_birch_trunk"), STRIPPED_BIRCH_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_birch_branch"), STRIPPED_BIRCH_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_birch_twig"), STRIPPED_BIRCH_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_trunk"), new BlockItem(BIRCH_TRUNK, new Item.Settings().group(ModItemGroup.BIRCH)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_branch"), new BlockItem(BIRCH_BRANCH, new Item.Settings().group(ModItemGroup.BIRCH)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_twig"), new BlockItem(BIRCH_TWIG, new Item.Settings().group(ModItemGroup.BIRCH)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_trunk"), new BlockItem(STRIPPED_BIRCH_TRUNK, new Item.Settings().group(ModItemGroup.BIRCH)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_branch"), new BlockItem(STRIPPED_BIRCH_BRANCH, new Item.Settings().group(ModItemGroup.BIRCH)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_twig"), new BlockItem(STRIPPED_BIRCH_TWIG, new Item.Settings().group(ModItemGroup.BIRCH)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_trunk"), JUNGLE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_branch"), JUNGLE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_twig"), JUNGLE_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_jungle_trunk"), STRIPPED_JUNGLE_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_jungle_branch"), STRIPPED_JUNGLE_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_jungle_twig"), STRIPPED_JUNGLE_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_trunk"), new BlockItem(JUNGLE_TRUNK, new Item.Settings().group(ModItemGroup.JUNGLE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_branch"), new BlockItem(JUNGLE_BRANCH, new Item.Settings().group(ModItemGroup.JUNGLE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_twig"), new BlockItem(JUNGLE_TWIG, new Item.Settings().group(ModItemGroup.JUNGLE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_trunk"), new BlockItem(STRIPPED_JUNGLE_TRUNK, new Item.Settings().group(ModItemGroup.JUNGLE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_branch"), new BlockItem(STRIPPED_JUNGLE_BRANCH, new Item.Settings().group(ModItemGroup.JUNGLE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_twig"), new BlockItem(STRIPPED_JUNGLE_TWIG, new Item.Settings().group(ModItemGroup.JUNGLE)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "acacia_trunk"), ACACIA_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "acacia_branch"), ACACIA_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "acacia_twig"), ACACIA_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_acacia_trunk"), STRIPPED_ACACIA_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_acacia_branch"), STRIPPED_ACACIA_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_acacia_twig"), STRIPPED_ACACIA_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_trunk"), new BlockItem(ACACIA_TRUNK, new Item.Settings().group(ModItemGroup.ACACIA)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_branch"), new BlockItem(ACACIA_BRANCH, new Item.Settings().group(ModItemGroup.ACACIA)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_twig"), new BlockItem(ACACIA_TWIG, new Item.Settings().group(ModItemGroup.ACACIA)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_trunk"), new BlockItem(STRIPPED_ACACIA_TRUNK, new Item.Settings().group(ModItemGroup.ACACIA)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_branch"), new BlockItem(STRIPPED_ACACIA_BRANCH, new Item.Settings().group(ModItemGroup.ACACIA)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_twig"), new BlockItem(STRIPPED_ACACIA_TWIG, new Item.Settings().group(ModItemGroup.ACACIA)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_oak_trunk"), DARK_OAK_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_oak_branch"), DARK_OAK_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_oak_twig"), DARK_OAK_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_dark_oak_trunk"), STRIPPED_DARK_OAK_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_dark_oak_branch"), STRIPPED_DARK_OAK_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_dark_oak_twig"), STRIPPED_DARK_OAK_TWIG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_trunk"), new BlockItem(DARK_OAK_TRUNK, new Item.Settings().group(ModItemGroup.DARK_OAK)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_branch"), new BlockItem(DARK_OAK_BRANCH, new Item.Settings().group(ModItemGroup.DARK_OAK)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_twig"), new BlockItem(DARK_OAK_TWIG, new Item.Settings().group(ModItemGroup.DARK_OAK)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_trunk"), new BlockItem(STRIPPED_DARK_OAK_TRUNK, new Item.Settings().group(ModItemGroup.DARK_OAK)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_branch"), new BlockItem(STRIPPED_DARK_OAK_BRANCH, new Item.Settings().group(ModItemGroup.DARK_OAK)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_twig"), new BlockItem(STRIPPED_DARK_OAK_TWIG, new Item.Settings().group(ModItemGroup.DARK_OAK)));

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_trunk"), FIR_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_branch"), FIR_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_twig"), FIR_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_fir_trunk"), STRIPPED_FIR_TRUNK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_fir_branch"), STRIPPED_FIR_BRANCH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_fir_twig"), STRIPPED_FIR_TWIG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_log"), FIR_LOG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_wood"), FIR_WOOD);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_fir_log"), STRIPPED_FIR_LOG);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_fir_wood"), STRIPPED_FIR_WOOD);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_leaves"), FIR_LEAVES);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_sapling"), FIR_SAPLING);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_fir_sapling"), POTTED_FIR_SAPLING);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_planks"), FIR_PLANKS);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_slab"), FIR_SLAB);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_stairs"), FIR_STAIRS);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_fence"), FIR_FENCE);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_fence_gate"), FIR_FENCE_GATE);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_button"), FIR_BUTTON);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_pressure_plate"), FIR_PRESSURE_PLATE);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_door"), FIR_DOOR);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_trapdoor"), FIR_TRAPDOOR);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_sign"), FIR_SIGN);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_wall_sign"), FIR_WALL_SIGN);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_trunk"), new BlockItem(FIR_TRUNK, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_branch"), new BlockItem(FIR_BRANCH, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_twig"), new BlockItem(FIR_TWIG, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_fir_trunk"), new BlockItem(STRIPPED_FIR_TRUNK, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_fir_branch"), new BlockItem(STRIPPED_FIR_BRANCH, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_fir_twig"), new BlockItem(STRIPPED_FIR_TWIG, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_log"), new BlockItem(FIR_LOG, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_wood"), new BlockItem(FIR_WOOD, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_fir_log"), new BlockItem(STRIPPED_FIR_LOG, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_fir_wood"), new BlockItem(STRIPPED_FIR_WOOD, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_leaves"), new BlockItem(FIR_LEAVES, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_sapling"), new BlockItem(FIR_SAPLING, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_planks"), new BlockItem(FIR_PLANKS, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_slab"), new BlockItem(FIR_SLAB, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_stairs"), new BlockItem(FIR_STAIRS, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_fence"), new BlockItem(FIR_FENCE, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_fence_gate"), new BlockItem(FIR_FENCE_GATE, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_button"), new BlockItem(FIR_BUTTON, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_pressure_plate"), new BlockItem(FIR_PRESSURE_PLATE, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_door"), new BlockItem(FIR_DOOR, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_trapdoor"), new BlockItem(FIR_TRAPDOOR, new Item.Settings().group(ModItemGroup.SPRUCE)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_sign"), (Item)(new SignItem(new Item.Settings().maxCount(16).group(ModItemGroup.SPRUCE), FIR_SIGN, FIR_WALL_SIGN)));

		ModRegistry.registerBoats();
		ModRegistry.registerFuels();
		ModRegistry.registerStrippables();
		ModRegistry.registerFlammables();
		ModRegistry.registerCompostables();
		ModRegistry.registerRenderLayers();
		ModRegistry.registerColorProviders();

	}

}
