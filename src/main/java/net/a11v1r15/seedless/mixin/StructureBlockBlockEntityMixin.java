package net.a11v1r15.seedless.mixin;

import net.minecraft.block.entity.StructureBlockBlockEntity;
import net.minecraft.util.math.random.RandomSeed;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StructureBlockBlockEntity.class)
public class StructureBlockBlockEntityMixin {
	@Inject(method = "getSeed()J", at = @At("RETURN"), cancellable = true)
	private void seedless$StructureBlockBlockEntityMixin(CallbackInfoReturnable<Long> cir) {
	  cir.setReturnValue(RandomSeed.getSeed());
	}
}