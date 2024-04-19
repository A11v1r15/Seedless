package net.a11v1r15.seedless.mixin;

import net.minecraft.client.gui.screen.world.WorldCreator;
import net.minecraft.util.math.random.RandomSeed;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WorldCreator.class)
public class WorldCreatorMixin {
	@Inject(method = "getSeed()Ljava/lang/String;", at = @At("RETURN"), cancellable = true)
	private void seedless$WorldCreatorMixin(CallbackInfoReturnable<String> cir) {
	  cir.setReturnValue(RandomSeed.getSeed() + "");
	}
}