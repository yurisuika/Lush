package com.yurisuika.lush.mixin;

import com.yurisuika.lush.Lush;
import com.yurisuika.lush.util.ModBoatType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BoatEntity.class)
public class BoatDropsMixin {
    @Inject(method = "asItem", at = @At("HEAD"), cancellable = true)
    public void asItem(CallbackInfoReturnable<Item> ci) {
        if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.ALDER) {
            ci.setReturnValue(Lush.ALDER_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.APPLE) {
            ci.setReturnValue(Lush.APPLE_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.ASH) {
            ci.setReturnValue(Lush.ASH_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.ASPEN) {
            ci.setReturnValue(Lush.ASPEN_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.CEDAR) {
            ci.setReturnValue(Lush.CEDAR_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.CHERRY) {
            ci.setReturnValue(Lush.CHERRY_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.CHESTNUT) {
            ci.setReturnValue(Lush.CHESTNUT_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.CITRUS) {
            ci.setReturnValue(Lush.CITRUS_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.COTTONWOOD) {
            ci.setReturnValue(Lush.COTTONWOOD_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.CYPRESS) {
            ci.setReturnValue(Lush.CYPRESS_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.EBONY) {
            ci.setReturnValue(Lush.EBONY_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.FIR) {
            ci.setReturnValue(Lush.FIR_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.GUM) {
            ci.setReturnValue(Lush.GUM_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.HAWTHORN) {
            ci.setReturnValue(Lush.HAWTHORN_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.HAZEL) {
            ci.setReturnValue(Lush.HAZEL_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.HEMLOCK) {
            ci.setReturnValue(Lush.HEMLOCK_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.HICKORY) {
            ci.setReturnValue(Lush.HICKORY_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.JUNIPER) {
            ci.setReturnValue(Lush.JUNIPER_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.LARCH) {
            ci.setReturnValue(Lush.LARCH_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.MAHOGANY) {
            ci.setReturnValue(Lush.MAHOGANY_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.MAPLE) {
            ci.setReturnValue(Lush.MAPLE_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.MESQUITE) {
            ci.setReturnValue(Lush.MESQUITE_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.PEACH) {
            ci.setReturnValue(Lush.PEACH_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.PEAR) {
            ci.setReturnValue(Lush.PEAR_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.PINE) {
            ci.setReturnValue(Lush.PINE_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.REDWOOD) {
            ci.setReturnValue(Lush.REDWOOD_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.ROSEWOOD) {
            ci.setReturnValue(Lush.ROSEWOOD_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.TEAK) {
            ci.setReturnValue(Lush.TEAK_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.WALNUT) {
            ci.setReturnValue(Lush.WALNUT_BOAT);
        }
        else if (((BoatEntity)(Object)this).getBoatType() == ModBoatType.WILLOW) {
            ci.setReturnValue(Lush.WILLOW_BOAT);
        }
    }
}