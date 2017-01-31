package com.mrgreaper2004.twistedmod3.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by mrgre on 31/01/2017.
 */
public class CreativeTabTwistedMod extends CreativeTabs {

    public CreativeTabTwistedMod(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem(){
        return Items.RABBIT;
    }
}
