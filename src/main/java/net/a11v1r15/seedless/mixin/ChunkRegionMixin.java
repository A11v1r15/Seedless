package net.a11v1r15.seedless.mixin;

import net.minecraft.util.math.random.RandomSeed;
import net.minecraft.world.ChunkRegion;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChunkRegion.class)
public class ChunkRegionMixin {
	@Inject(method = "getSeed()J", at = @At("RETURN"), cancellable = true)
	private void seedless$ChunkRegionMixin(CallbackInfoReturnable<Long> cir) {
	  cir.setReturnValue(RandomSeed.getSeed());
	}
}