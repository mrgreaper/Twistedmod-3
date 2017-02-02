package com.mrgreaper2004.twistedmod3.item;

import com.mrgreaper2004.twistedmod3.TwistedMod3;
import net.minecraft.item.Item;

/**
 * Created by mrgre on 02/02/2017.
 */
public class ItemOrphanBalloon extends Item{
    public ItemOrphanBalloon(String name) {
        setUnlocalizedName(name);
        setCreativeTab(TwistedMod3.tabTwistedMod);
        setMaxStackSize(1);
    }
}
