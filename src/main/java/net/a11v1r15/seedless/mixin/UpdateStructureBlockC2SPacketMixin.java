package net.a11v1r15.seedless.mixin;

import net.minecraft.network.packet.c2s.play.UpdateStructureBlockC2SPacket;
import net.minecraft.util.math.random.RandomSeed;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(UpdateStructureBlockC2SPacket.class)
public class UpdateStructureBlockC2SPacketMixin {
	@Inject(method = "getSeed()J", at = @At("RETURN"), cancellable = true)
	private void seedless$UpdateStructureBlockC2SPacketMixin(CallbackInfoReturnable<Long> cir) {
	  cir.setReturnValue(RandomSeed.getSeed());
	}
}