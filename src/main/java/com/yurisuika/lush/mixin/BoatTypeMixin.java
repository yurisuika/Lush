package com.yurisuika.lush.mixin;

import com.yurisuika.lush.Lush;
import com.yurisuika.lush.util.ModBoatType;
import net.minecraft.block.Block;
import net.minecraft.entity.vehicle.BoatEntity;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.Arrays;

@Mixin(BoatEntity.Type.class)
public class BoatTypeMixin {

    @SuppressWarnings("InvokerTarget")
    @Invoker("<init>")
    private static BoatEntity.Type newType(String internalName, int internalId, Block baseBlock, String name) {
        throw new AssertionError();
    }

    @SuppressWarnings("ShadowTarget")
    @Shadow
    @Final
    @Mutable
    private static BoatEntity.Type[] field_7724;

    @SuppressWarnings("UnresolvedMixinReference")
    @Inject(method = "<clinit>", at = @At(value = "FIELD",
            opcode = Opcodes.PUTSTATIC,
            target = "Lnet/minecraft/entity/vehicle/BoatEntity$Type;field_7724:[Lnet/minecraft/entity/vehicle/BoatEntity$Type;",
            shift = At.Shift.AFTER))
    private static void addCustomBoatType(CallbackInfo ci) {
        var types = new ArrayList<>(Arrays.asList(field_7724));
        var last = types.get(types.size() - 1);

        var alder = newType("ALDER", last.ordinal() + 1, Lush.ALDER_PLANKS, "alder");
        ModBoatType.ALDER = alder;
        types.add(alder);

        var apple = newType("APPLE", last.ordinal() + 2, Lush.APPLE_PLANKS, "apple");
        ModBoatType.APPLE = apple;
        types.add(apple);
        
        var ash = newType("ASH", last.ordinal() + 3, Lush.ASH_PLANKS, "ash");
        ModBoatType.ASH = ash;
        types.add(ash);

        var aspen = newType("ASPEN", last.ordinal() + 4, Lush.ASPEN_PLANKS, "aspen");
        ModBoatType.ASPEN = aspen;
        types.add(aspen);

        var cedar = newType("CEDAR", last.ordinal() + 5, Lush.CEDAR_PLANKS, "cedar");
        ModBoatType.CEDAR = cedar;
        types.add(cedar);

        var cherry = newType("CHERRY", last.ordinal() + 6, Lush.CHERRY_PLANKS, "cherry");
        ModBoatType.CHERRY = cherry;
        types.add(cherry);

        var chestnut = newType("CHESTNUT", last.ordinal() + 7, Lush.CHESTNUT_PLANKS, "chestnut");
        ModBoatType.CHESTNUT = chestnut;
        types.add(chestnut);

        var citrus = newType("CITRUS", last.ordinal() + 8, Lush.CITRUS_PLANKS, "citrus");
        ModBoatType.CITRUS = citrus;
        types.add(citrus);

        var cottonwood = newType("COTTONWOOD", last.ordinal() + 9, Lush.COTTONWOOD_PLANKS, "cottonwood");
        ModBoatType.COTTONWOOD = cottonwood;
        types.add(cottonwood);

        var cypress = newType("CYPRESS", last.ordinal() + 10, Lush.CYPRESS_PLANKS, "cypress");
        ModBoatType.CYPRESS = cypress;
        types.add(cypress);

        var ebony = newType("EBONY", last.ordinal() + 11, Lush.EBONY_PLANKS, "ebony");
        ModBoatType.EBONY = ebony;
        types.add(ebony);

        var fir = newType("FIR", last.ordinal() + 12, Lush.FIR_PLANKS, "fir");
        ModBoatType.FIR = fir;
        types.add(fir);

        var gum = newType("GUM", last.ordinal() + 13, Lush.GUM_PLANKS, "gum");
        ModBoatType.GUM = gum;
        types.add(gum);

        var hawthorn = newType("HAWTHORN", last.ordinal() + 14, Lush.HAWTHORN_PLANKS, "hawthorn");
        ModBoatType.HAWTHORN = hawthorn;
        types.add(hawthorn);

        var hazel = newType("HAZEL", last.ordinal() + 15, Lush.HAZEL_PLANKS, "hazel");
        ModBoatType.HAZEL = hazel;
        types.add(hazel);

        var hemlock = newType("HEMLOCK", last.ordinal() + 16, Lush.HEMLOCK_PLANKS, "hemlock");
        ModBoatType.HEMLOCK = hemlock;
        types.add(hemlock);

        var hickory = newType("HICKORY", last.ordinal() + 17, Lush.HICKORY_PLANKS, "hickory");
        ModBoatType.HICKORY = hickory;
        types.add(hickory);

        var juniper = newType("JUNIPER", last.ordinal() + 18, Lush.JUNIPER_PLANKS, "juniper");
        ModBoatType.JUNIPER = juniper;
        types.add(juniper);

        var larch = newType("LARCH", last.ordinal() + 19, Lush.LARCH_PLANKS, "larch");
        ModBoatType.LARCH = larch;
        types.add(larch);

        var mahogany = newType("MAHOGANY", last.ordinal() + 20, Lush.MAHOGANY_PLANKS, "mahogany");
        ModBoatType.MAHOGANY = mahogany;
        types.add(mahogany);

        var maple = newType("MAPLE", last.ordinal() + 21, Lush.MAPLE_PLANKS, "maple");
        ModBoatType.MAPLE = maple;
        types.add(maple);

        var mesquite = newType("MESQUITE", last.ordinal() + 22, Lush.MESQUITE_PLANKS, "mesquite");
        ModBoatType.MESQUITE = mesquite;
        types.add(mesquite);

        var peach = newType("PEACH", last.ordinal() + 23, Lush.PEACH_PLANKS, "peach");
        ModBoatType.PEACH = peach;
        types.add(peach);

        var pear = newType("PEAR", last.ordinal() + 24, Lush.PEAR_PLANKS, "pear");
        ModBoatType.PEAR = pear;
        types.add(pear);

        var pine = newType("PINE", last.ordinal() + 25, Lush.PINE_PLANKS, "pine");
        ModBoatType.PINE = pine;
        types.add(pine);

        var redwood = newType("REDWOOD", last.ordinal() + 26, Lush.REDWOOD_PLANKS, "redwood");
        ModBoatType.REDWOOD = redwood;
        types.add(redwood);

        var rosewood = newType("ROSEWOOD", last.ordinal() + 27, Lush.ROSEWOOD_PLANKS, "rosewood");
        ModBoatType.ROSEWOOD = rosewood;
        types.add(rosewood);

        var teak = newType("TEAK", last.ordinal() + 28, Lush.TEAK_PLANKS, "teak");
        ModBoatType.TEAK = teak;
        types.add(teak);

        var walnut = newType("WALNUT", last.ordinal() + 29, Lush.WALNUT_PLANKS, "walnut");
        ModBoatType.WALNUT = walnut;
        types.add(walnut);

        var willow = newType("WILLOW", last.ordinal() + 30, Lush.WILLOW_PLANKS, "willow");
        ModBoatType.WILLOW = willow;
        types.add(willow);

        field_7724 = types.toArray(new BoatEntity.Type[0]);
    }
}