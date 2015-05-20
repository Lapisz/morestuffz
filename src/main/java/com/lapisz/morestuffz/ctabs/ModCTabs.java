package com.lapisz.morestuffz.ctabs;

import net.minecraft.creativetab.CreativeTabs;

public class ModCTabs {
	
	public static CreativeTabs tabModBlocks;
	public static CreativeTabs tabModTools;
	public static CreativeTabs tabModMisc;
	public static CreativeTabs tabModItems;
	
	
	public static void initializeTabs() {
		tabModBlocks = new CreativeTabBlocks("tabModBlocks");
		tabModMisc = new CreativeTabMisc("tabModMisc");
		tabModTools = new CreativeTabTools("tabModTools");
		tabModItems = new CreativeTabItems("tabModItems");
	}
}
