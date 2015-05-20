package com.lapisz.morestuffz.blocks;


import com.lapisz.morestuffz.Main.MainRegistry;
import com.lapisz.morestuffz.ctabs.ModCTabs;
import com.lapisz.morestuffz.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.audio.SoundList.SoundEntry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class MBlocks {
	public static void mainRegistry(){
		initializeBlock();
		registerItem();
	}
	
	
	
	public static Block SteelMineralBlock;
	public static Block ObsidianMineralBlock;
	public static Block SapphireOre;
	public static Block SapphireMineralBlock;
	public static Block RubyMineralBlock;
	public static Block ReinforcedGlass;
	public static Block RubyOre;
	public static Block SpecialStone;
	public static Block SpecialCobble;
	
	//CROPS
	public static Block cropBeetroot;
	
	public static void initializeBlock(){
		SteelMineralBlock = new SteelMineralBlock(Material.rock).setBlockName("blockSteel").setCreativeTab(ModCTabs.tabModBlocks).setBlockTextureName(RefStrings.MODID + ":blockSteel").setHardness(7.0F).setResistance(12.5F);
		ObsidianMineralBlock = new ObsidianMineralBlock(Material.rock).setBlockName("blockObsidian").setCreativeTab(ModCTabs.tabModBlocks).setBlockTextureName(RefStrings.MODID + ":blockObsidian").setHardness(65.0F).setResistance(2000.0F);
		SapphireMineralBlock = new SapphireMineralBlock(Material.rock).setBlockName("blockSapphire").setCreativeTab(ModCTabs.tabModBlocks).setBlockTextureName(RefStrings.MODID + ":blockSapphire").setHardness(5.0F).setResistance(10.0F);
		SapphireOre = new SapphireOre(Material.rock).setBlockName("oreSapphire").setCreativeTab(ModCTabs.tabModBlocks).setBlockTextureName(RefStrings.MODID + ":oreSapphire").setHardness(3.0F).setResistance(5.0F);
		RubyOre = new RubyOre(Material.rock).setBlockName("oreRuby").setCreativeTab(ModCTabs.tabModBlocks).setBlockTextureName(RefStrings.MODID + ":oreRuby").setHardness(3.0F).setResistance(5.0F);
		cropBeetroot = new cropBeetroot().setBlockName("cropBeetroot").setBlockTextureName(RefStrings.MODID + ":cropBeetroot").setResistance(0.0F);
		RubyMineralBlock = new RubyMineralBlock(Material.rock).setBlockName("blockRuby").setCreativeTab(ModCTabs.tabModBlocks).setBlockTextureName(RefStrings.MODID + ":blockRuby").setHardness(5.0F).setResistance(10.0F);
		ReinforcedGlass = new ReinforcedGlass(Material.glass).setBlockName("hardglass").setCreativeTab(ModCTabs.tabModBlocks).setBlockTextureName(RefStrings.MODID + ":hardglass").setHardness(5.0F).setResistance(2000.0F);
		SpecialStone = new SpecialStone(Material.rock).setBlockName("stoneSpecial").setCreativeTab(ModCTabs.tabModBlocks).setBlockTextureName(RefStrings.MODID + ":stoneSpecial").setHardness(1.5F).setResistance(10.0F);
		SpecialCobble = new SpecialCobble(Material.rock).setBlockName("cobblestoneSpecial").setCreativeTab(ModCTabs.tabModBlocks).setBlockTextureName(RefStrings.MODID + ":cobblestoneSpecial").setHardness(1.5F).setResistance(10.0F);
	}
	
	public static void registerItem(){
		GameRegistry.registerBlock(SteelMineralBlock, SteelMineralBlock.getUnlocalizedName());
		GameRegistry.registerBlock(ObsidianMineralBlock, ObsidianMineralBlock.getUnlocalizedName());
		GameRegistry.registerBlock(SapphireOre, SapphireOre.getUnlocalizedName());
		GameRegistry.registerBlock(cropBeetroot, cropBeetroot.getUnlocalizedName());
		GameRegistry.registerBlock(SapphireMineralBlock, SapphireMineralBlock.getUnlocalizedName());
		GameRegistry.registerBlock(RubyMineralBlock, RubyMineralBlock.getUnlocalizedName());
		GameRegistry.registerBlock(ReinforcedGlass, ReinforcedGlass.getUnlocalizedName());
		GameRegistry.registerBlock(RubyOre, RubyOre.getUnlocalizedName());
		GameRegistry.registerBlock(SpecialStone, SpecialStone.getUnlocalizedName());
		GameRegistry.registerBlock(SpecialCobble, SpecialCobble.getUnlocalizedName());
	}
}
