package com.yurisuika.lush.item;

import com.yurisuika.lush.Lush;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SPRUCE = FabricItemGroupBuilder.build(new Identifier(Lush.MOD_ID, "spruce"),
            () -> new ItemStack(Items.SPRUCE_SAPLING));
    public static final ItemGroup BIRCH = FabricItemGroupBuilder.build(new Identifier(Lush.MOD_ID, "birch"),
            () -> new ItemStack(Items.BIRCH_SAPLING));
    public static final ItemGroup OAK = FabricItemGroupBuilder.build(new Identifier(Lush.MOD_ID, "oak"),
            () -> new ItemStack(Items.OAK_SAPLING));
    public static final ItemGroup DARK_OAK = FabricItemGroupBuilder.build(new Identifier(Lush.MOD_ID, "dark_oak"),
            () -> new ItemStack(Items.DARK_OAK_SAPLING));
    public static final ItemGroup JUNGLE = FabricItemGroupBuilder.build(new Identifier(Lush.MOD_ID, "jungle"),
            () -> new ItemStack(Items.JUNGLE_SAPLING));
    public static final ItemGroup ACACIA = FabricItemGroupBuilder.build(new Identifier(Lush.MOD_ID, "acacia"),
            () -> new ItemStack(Items.ACACIA_SAPLING));
}
