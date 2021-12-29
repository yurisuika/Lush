package com.yurisuika.lush.item;

import com.yurisuika.lush.Lush;
import com.yurisuika.lush.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup LUSH = FabricItemGroupBuilder.build(new Identifier(Lush.MOD_ID, "lush"),
            () -> new ItemStack(ModBlocks.FIR_SAPLING));
}
