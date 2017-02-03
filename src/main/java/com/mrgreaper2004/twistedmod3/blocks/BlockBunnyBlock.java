package com.mrgreaper2004.twistedmod3.blocks;

import com.mrgreaper2004.twistedmod3.TwistedMod3;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by mrgre on 03/02/2017.
 */
public class BlockBunnyBlock extends Block {

    public BlockBunnyBlock(String name,Material blockMaterialIn) {
        super(blockMaterialIn);
        this.setCreativeTab(TwistedMod3.tabTwistedMod);
        this.setUnlocalizedName(name);
        this.setHardness(10);
        this.setResistance(6000);
        this.setSoundType(SoundType.SLIME);
    }


}
