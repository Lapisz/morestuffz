package com.lapisz.morestuffz.ctabs;

import com.lapisz.morestuffz.item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMisc extends CreativeTabs {

	public CreativeTabMisc(String lable) {
		super(lable);
	}
	
	@Override
	public Item getTabIconItem() {
		return MItems.tossableTnt;
	}

}
