package net.a11v1r15.seedless.mixin;

import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.util.math.random.RandomSeed;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlaySoundS2CPacket.class)
public class PlaySoundS2CPacketMixin {
	@Inject(method = "getSeed()J", at = @At("RETURN"), cancellable = true)
	private void seedless$PlaySoundS2CPacketMixin(CallbackInfoReturnable<Long> cir) {
	  cir.setReturnValue(RandomSeed.getSeed());
	}
}