package com.mrgreaper2004.twistedmod3.item;

import com.mrgreaper2004.twistedmod3.TwistedMod3;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by mrgre on 31/01/2017.
 */
public class ModItems {

    public static Item twistedModItem;

    public static void preInit(){
        //this is where we will initialise the items
        twistedModItem = new Item().setUnlocalizedName("twistedmod_item").setCreativeTab(TwistedMod3.tabTwistedMod);
        registerItems();
    }

    public static void registerItems(){
        GameRegistry.register(twistedModItem,new ResourceLocation(TwistedMod3.MODID,"twistedmod_item"));
    }

    public static void registerRenders(){
        registerRender(twistedModItem);

    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(TwistedMod3.MODID+":"+item.getUnlocalizedName().substring(5),"inventory"));//substring to remove "item."
    }

}
