package net.leatherite.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class TobaccoPlant extends CropBlock {
    public TobaccoPlant() {
        super(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    }
}
