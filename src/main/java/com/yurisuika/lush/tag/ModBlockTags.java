package com.yurisuika.lush.tag;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModBlockTags {

    public static final Tag<Block> BRANCHES = TagFactory.BLOCK.create((new Identifier("lush", "branches")));
    public static final Tag<Block> TWIGS = TagFactory.BLOCK.create((new Identifier("lush", "twigs")));

}
