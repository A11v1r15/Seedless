package net.a11v1r15.seedless.mixin;

import net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket;
import net.minecraft.util.math.random.RandomSeed;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlaySoundFromEntityS2CPacket.class)
public class PlaySoundFromEntityS2CPacketMixin {
	@Inject(method = "getSeed()J", at = @At("RETURN"), cancellable = true)
	private void seedless$PlaySoundFromEntityS2CPacketMixin(CallbackInfoReturnable<Long> cir) {
	  cir.setReturnValue(RandomSeed.getSeed());
	}
}