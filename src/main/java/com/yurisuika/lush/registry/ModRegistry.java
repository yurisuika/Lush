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
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.yurisuika.lush.Lush.MOD_ID;

public class ModRegistry {

    public static void registerBoats() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fir_boat"), Lush.FIR_BOAT);
    }

    public static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Lush.FIR_FENCE, 300);
        registry.add(Lush.FIR_FENCE_GATE, 300);
    }

    public static void registerFlammables() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(Lush.OAK_TRUNK, 5, 5);
        registry.add(Lush.OAK_BRANCH, 10, 20);
        registry.add(Lush.OAK_TWIG, 20, 40);
        registry.add(Lush.STRIPPED_OAK_TRUNK, 5, 5);
        registry.add(Lush.STRIPPED_OAK_BRANCH, 10, 20);
        registry.add(Lush.STRIPPED_OAK_TWIG, 20, 40);

        registry.add(Lush.SPRUCE_TRUNK, 5, 5);
        registry.add(Lush.SPRUCE_BRANCH, 10, 20);
        registry.add(Lush.SPRUCE_TWIG, 20, 40);
        registry.add(Lush.STRIPPED_SPRUCE_TRUNK, 5, 5);
        registry.add(Lush.STRIPPED_SPRUCE_BRANCH, 10, 20);
        registry.add(Lush.STRIPPED_SPRUCE_TWIG, 20, 40);

        registry.add(Lush.BIRCH_TRUNK, 5, 5);
        registry.add(Lush.BIRCH_BRANCH, 10, 20);
        registry.add(Lush.BIRCH_TWIG, 20, 40);
        registry.add(Lush.STRIPPED_BIRCH_TRUNK, 5, 5);
        registry.add(Lush.STRIPPED_BIRCH_BRANCH, 10, 20);
        registry.add(Lush.STRIPPED_BIRCH_TWIG, 20, 40);

        registry.add(Lush.JUNGLE_TRUNK, 5, 5);
        registry.add(Lush.JUNGLE_BRANCH, 10, 20);
        registry.add(Lush.JUNGLE_TWIG, 20, 40);
        registry.add(Lush.STRIPPED_JUNGLE_TRUNK, 5, 5);
        registry.add(Lush.STRIPPED_JUNGLE_BRANCH, 10, 20);
        registry.add(Lush.STRIPPED_JUNGLE_TWIG, 20, 40);

        registry.add(Lush.ACACIA_TRUNK, 5, 5);
        registry.add(Lush.ACACIA_BRANCH, 10, 20);
        registry.add(Lush.ACACIA_TWIG, 20, 40);
        registry.add(Lush.STRIPPED_ACACIA_TRUNK, 5, 5);
        registry.add(Lush.STRIPPED_ACACIA_BRANCH, 10, 20);
        registry.add(Lush.STRIPPED_ACACIA_TWIG, 20, 40);

        registry.add(Lush.DARK_OAK_TRUNK, 5, 5);
        registry.add(Lush.DARK_OAK_BRANCH, 10, 20);
        registry.add(Lush.DARK_OAK_TWIG, 20, 40);
        registry.add(Lush.STRIPPED_DARK_OAK_TRUNK, 5, 5);
        registry.add(Lush.STRIPPED_DARK_OAK_BRANCH, 10, 20);
        registry.add(Lush.STRIPPED_DARK_OAK_TWIG, 20, 40);
        
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
        registry.add(Lush.FIR_TRUNK, 5, 5);
        registry.add(Lush.FIR_BRANCH, 10, 20);
        registry.add(Lush.FIR_TWIG, 20, 40);
        registry.add(Lush.STRIPPED_FIR_TRUNK, 5, 5);
        registry.add(Lush.STRIPPED_FIR_BRANCH, 10, 20);
        registry.add(Lush.STRIPPED_FIR_TWIG, 20, 40);
    }

    public static void registerStrippables() {
        StrippableBlockRegistry.register(Lush.FIR_LOG, Lush.STRIPPED_FIR_LOG);
        StrippableBlockRegistry.register(Lush.FIR_WOOD, Lush.STRIPPED_FIR_WOOD);
    }

    public static void registerCompostables() {
        CompostingChanceRegistry registry = CompostingChanceRegistry.INSTANCE;

        registry.add(Lush.FIR_LEAVES, 0.30F);
        registry.add(Lush.FIR_SAPLING, 0.30F);

    }

    public static void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.FIR_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.FIR_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.FIR_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.FIR_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Lush.POTTED_FIR_SAPLING, RenderLayer.getCutout());
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

        ColorProviderRegistry.ITEM.register(
                (stack, tintIndex) -> {
                    if (tintIndex > 0) return -1;
                    BlockColors colors = MinecraftClient.getInstance().getBlockColors();
                    return colors.getColor(((BlockItem) stack.getItem()).getBlock().getDefaultState(), null, null, tintIndex);
                },
                Lush.FIR_LEAVES
        );

    }

}
