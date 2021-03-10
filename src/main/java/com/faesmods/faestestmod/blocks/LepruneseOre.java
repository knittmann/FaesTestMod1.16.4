/**
 * This class describes the leprunese ore which is generated in the world and can be
 * mined with a pickaxe.
 */
package com.faesmods.faestestmod.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class LepruneseOre extends OreBlock {

    /**
     * Constructor for the leprunese ore block generated in the world and
     * that can be mined.
     */
    public LepruneseOre() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f, 4.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }



//    @Override
//    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
//        return 1;
//    }
}
