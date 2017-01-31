package com.mrgreaper2004.twistedmod3.proxy;

import com.mrgreaper2004.twistedmod3.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by mrgre on 31/01/2017.
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        ModItems.registerRenders();

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
