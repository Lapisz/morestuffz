package com.lapisz.morestuffz.Main;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.lapisz.morestuffz.*;
import com.lapisz.morestuffz.blocks.MBlocks;
import com.lapisz.morestuffz.ctabs.ModCTabs;
import com.lapisz.morestuffz.entity.ModEntity;
import com.lapisz.morestuffz.item.MItems;
import com.lapisz.morestuffz.lib.RefStrings;
import com.lapisz.morestuffz.world.MWorld;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Instance
	public static MainRegistry modInstance;

	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
			ModCTabs.initializeTabs();
			MBlocks.mainRegistry();
			ModEntity.mainRegistry();
			MItems.mainRegistry();
			MWorld.mainRegistry();
			CraftingManager.mainRegistry();
			proxy.registerRenderInfo();
			
			
	}
	
	
	
	@EventHandler
	public static void load(FMLInitializationEvent event) {
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabMoreStuffzItems", "en_US", "MoreStuffz Items");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabMoreStuffzBlocks", "en_US", "MoreStuffz Blocks");
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent) {

	}
}
