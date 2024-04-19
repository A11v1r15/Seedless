package net.a11v1r15.seedless.mixin;

import net.minecraft.screen.EnchantmentScreenHandler;
import net.minecraft.util.math.random.RandomSeed;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantmentScreenHandler.class)
public class EnchantmentScreenHandlerMixin {
	@Inject(method = "getSeed()I", at = @At("RETURN"), cancellable = true)
	private void seedless$EnchantmentScreenHandlerMixin(CallbackInfoReturnable<Integer> cir) {
	  cir.setReturnValue((int)RandomSeed.getSeed());
	}
}