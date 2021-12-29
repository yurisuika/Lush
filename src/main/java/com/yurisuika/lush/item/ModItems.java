package com.yurisuika.lush.item;

import com.yurisuika.lush.Lush;
import com.yurisuika.lush.util.ModBoatType;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BoatItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item FIR_BOAT = registerItem("fir_boat", new BoatItem(ModBoatType.FIR, new Item.Settings().maxCount(1).group(ModItemGroup.LUSH)));

//    public static final Item FIR_BOAT = new BoatItem(ModBoatType.FIR, new Item.Settings().maxCount(1).group(ModItemGroup.LUSH));

    /********************************************************************/

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Lush.MOD_ID, name), item);
    }

    public static void registerBoats() {
//        Registry.register(Registry.ITEM, new Identifier(Lush.MOD_ID, "fir_boat"), FIR_BOAT);
    }

    public static void registerItems() {
        System.out.println("Registering Mod Items for " + Lush.MOD_ID);
    }

}
