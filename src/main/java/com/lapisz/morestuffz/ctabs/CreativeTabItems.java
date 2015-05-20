package com.lapisz.morestuffz.ctabs;

import com.lapisz.morestuffz.item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabItems extends CreativeTabs {
	
	public CreativeTabItems(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}


	@Override
	public Item getTabIconItem() {
		return MItems.gemSapphire;
	}

}
