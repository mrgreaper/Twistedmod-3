package com.mrgreaper2004.twistedmod3.proxy;

import com.mrgreaper2004.twistedmod3.TwistedMod3;
import com.mrgreaper2004.twistedmod3.item.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by mrgre on 31/01/2017.
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(TwistedMod3.MODID);
        registerModel(ModItems.deathOrb);

    }

    public void registerModel( Item item){
        ModelLoader.setCustomModelResourceLocation(item,0,new ModelResourceLocation(TwistedMod3.MODID+":"+item.getUnlocalizedName().substring(5),"inventory"));
    }

    @Override
    public void init(FMLInitializationEvent event) {
        ModItems.registerRenders();

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
