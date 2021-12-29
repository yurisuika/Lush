package com.yurisuika.lush;

import com.yurisuika.lush.block.ModBlocks;
import com.yurisuika.lush.item.ModItems;
import com.yurisuika.lush.mixin.SignTypeAccessor;
import com.yurisuika.lush.util.ModRenderHelper;
import com.yurisuika.lush.world.features.ModConfiguredFeatures;
import com.yurisuika.lush.registry.ModRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SignItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lush implements ModInitializer {

	public static final String MOD_ID = "lush";

	public static final Logger LOGGER = LogManager.getLogger("lush");

	public static final SignType FIR_SIGN_TYPE = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("fir"));
	public static final Block FIR_SIGN = new SignBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.BROWN).noCollision().strength(1.0F).sounds(BlockSoundGroup.WOOD), FIR_SIGN_TYPE);
	public static final Block FIR_WALL_SIGN = new WallSignBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.BROWN).noCollision().strength(1.0F).sounds(BlockSoundGroup.WOOD).dropsLike(FIR_SIGN), FIR_SIGN_TYPE);


	@Override
	public void onInitialize() {
		LOGGER.info("Nature's bosom flows into your cup!");

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_sign"), FIR_SIGN);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fir_wall_sign"), FIR_WALL_SIGN);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_sign"), (Item)(new SignItem(new Item.Settings().maxCount(16).group(ItemGroup.DECORATIONS), FIR_SIGN, FIR_WALL_SIGN)));

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerBoats();
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModBlocks.registerRendering();

		ModRegistry.registerFuels();
		ModRegistry.registerStrippables();
		ModRegistry.registerFlammables();
		ModRegistry.registerCompostables();

		ModRenderHelper.registerRenderLayers();

	}

}
