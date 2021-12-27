package me.arthed.walljump.nms;

import net.minecraft.server.v1_11_R1.SoundCategory;
import net.minecraft.server.v1_11_R1.SoundEffectType;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_11_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_11_R1.util.CraftMagicNumbers;

public class NmsUtils_v1_11 implements NmsUtilsVersion {

    @Override
    public void playStepSound(Block block) {
        SoundEffectType soundEffectType = CraftMagicNumbers.getBlock(block).getStepSound();
        ((CraftWorld) block.getWorld()).getHandle().a(
                null,
                block.getX(), block.getY(), block.getZ(),
                soundEffectType.d(),
                SoundCategory.PLAYERS,
                soundEffectType.a() * 0.15F,
                soundEffectType.b()
        );
    }

}