package com.mrgreaper2004.twistedmod3.blocks;

import com.mrgreaper2004.twistedmod3.TwistedMod3;
import com.mrgreaper2004.twistedmod3.item.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by mrgre on 31/01/2017.
 */
public class ModBlocks {

    public static Block bunnyBlock;

    public static void preInit(){
        //this is where we will initialise the items

        bunnyBlock = new BlockBunnyBlock("bunny_block", Material.IRON);

        registerBlocks();
    }

    public static void registerBlocks(){
        registerBlock(bunnyBlock,"bunny_block");


    }

    public static void registerBlock(Block block,String name){
        GameRegistry.register(block,new ResourceLocation(TwistedMod3.MODID,name));
        GameRegistry.register(new ItemBlock(block),new ResourceLocation(TwistedMod3.MODID,name));
    }

    public static void registerRenders(){
        registerRender(bunnyBlock);


    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        //Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(block,0,new ModelResourceLocation(TwistedMod3.MODID+":"+block.getUnlocalizedName().substring(5),"inventory"));//substring to remove "item."
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(TwistedMod3.MODID+":"+item.getUnlocalizedName().substring(5),"inventory"));//substring to remove "item."
    }

}
