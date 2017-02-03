package com.mrgreaper2004.twistedmod3;

import com.mrgreaper2004.twistedmod3.blocks.ModBlocks;
import com.mrgreaper2004.twistedmod3.handlers.SoundHandler;
import com.mrgreaper2004.twistedmod3.item.ModItems;
import com.mrgreaper2004.twistedmod3.proxy.CommonProxy;

import com.mrgreaper2004.twistedmod3.tab.CreativeTabTwistedMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TwistedMod3.MODID, version = TwistedMod3.VERSION,name = TwistedMod3.NAME)
public class TwistedMod3 {
    //static strings
    public static final String MODID = "twistedmod3";//lowercase only has to be unique - makes sense
    public static final String VERSION = "1.0";
    public static final String NAME = "Twisted Mod 3";

    @SidedProxy(clientSide = "com.mrgreaper2004.twistedmod3.proxy.ClientProxy",serverSide = "com.mrgreaper2004.twistedmod3.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabTwistedMod tabTwistedMod;

    @Mod.Instance
    public static TwistedMod3 instance;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
        tabTwistedMod =new CreativeTabTwistedMod(CreativeTabs.getNextID(),"tab_twisted");
        ModItems.preInit();
        ModBlocks.preInit();
        proxy.preInit(event);
        SoundHandler.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
    }

    @EventHandler
    public void preinit(FMLPostInitializationEvent event){

        proxy.postInit(event);

    }

}
