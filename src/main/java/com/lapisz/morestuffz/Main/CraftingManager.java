package com.lapisz.morestuffz.Main;

//import com.lapisz.tools.ModTools;

import com.lapisz.morestuffz.blocks.MBlocks;
import com.lapisz.morestuffz.item.MItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
		//Shaped
		GameRegistry.addRecipe(new ItemStack(MBlocks.SteelMineralBlock, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.ingotSteel});
		GameRegistry.addRecipe(new ItemStack(Blocks.command_block, 64), new Object[]{"FGF","BOB","BEB", 'F', Blocks.diamond_block, 'G', Blocks.emerald_block, 
			'B', Blocks.beacon, 'O', Blocks.dragon_egg, 'E', Blocks.end_stone});
		GameRegistry.addRecipe(new ItemStack(MBlocks.ObsidianMineralBlock, 1), new Object[]{"KKK","KKK","KKK", 'K', MItems.ingotObsidian});
		GameRegistry.addRecipe(new ItemStack(MBlocks.RubyMineralBlock, 1), new Object[]{"VVV","VVV","VVV", 'V', MItems.gemRuby});
		GameRegistry.addRecipe(new ItemStack(MBlocks.SapphireMineralBlock, 1), new Object[]{"PPP","PPP","PPP", 'P', MItems.gemSapphire});
		GameRegistry.addRecipe(new ItemStack(MBlocks.ReinforcedGlass, 4), new Object[]{"CWC","WCW","CWC", 'C', MItems.ingotObsidian, 'W', Blocks.glass});
		GameRegistry.addRecipe(new ItemStack(MItems.beetrootGolden, 1), new Object[]{"AAB","ACA","BAA", 'A', Items.gold_nugget, 'B', Items.gold_ingot, 'C', MItems.beetrootCooked});
		
		//TOOL RECIPEZZZ
		GameRegistry.addRecipe(new ItemStack(MItems.pickaxeSapphire, 1), new Object[]{"PPP"," N "," P ", 'P', MItems.gemSapphire, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.swordSapphire, 1), new Object[]{" P "," P "," N ", 'P', MItems.gemSapphire, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.axeSapphire, 1), new Object[]{"PP ","PN "," P ", 'P', MItems.gemSapphire, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.spadeSapphire, 1), new Object[]{" P "," N "," P ", 'P', MItems.gemSapphire, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.hoeSapphire, 1), new Object[]{"PP "," N "," P ", 'P', MItems.gemSapphire, 'N', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(MItems.pickaxeRuby, 1), new Object[]{"VVV"," N "," V ", 'V', MItems.gemRuby, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.swordRuby, 1), new Object[]{" V "," V "," N ", 'V', MItems.gemRuby, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.axeRuby, 1), new Object[]{"VV ","VN "," V ", 'V', MItems.gemRuby, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.spadeRuby, 1), new Object[]{" V "," N "," V ", 'V', MItems.gemRuby, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.hoeRuby, 1), new Object[]{"VV "," N "," V ", 'V', MItems.gemRuby, 'N', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(MItems.pickaxeEmerald, 1), new Object[]{"TTT"," N "," T ", 'T', Items.emerald, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.swordEmerald, 1), new Object[]{" T "," T "," N ", 'T', Items.emerald, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.axeEmerald, 1), new Object[]{"TT ","TN "," T ", 'T', Items.emerald, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.spadeEmerald, 1), new Object[]{" T "," N "," T ", 'T', Items.emerald, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.hoeEmerald, 1), new Object[]{"TT "," N "," T ", 'T', Items.emerald, 'N', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(MItems.pickaxeSteel, 1), new Object[]{"YYY"," N "," Y ", 'Y', MItems.ingotSteel, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.swordSteel, 1), new Object[]{" Y "," Y "," N ", 'Y', MItems.ingotSteel, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.axeSteel, 1), new Object[]{"YY ","YN "," Y ", 'Y', MItems.ingotSteel, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.spadeSteel, 1), new Object[]{" Y "," N "," Y ", 'Y', MItems.ingotSteel, 'N', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.hoeSteel, 1), new Object[]{"YY "," N "," Y ", 'Y', MItems.ingotSteel, 'N', Items.stick});
		
		//Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.ingotSteel, 9), MBlocks.SteelMineralBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.alloySapphireRaw, 4), Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, MItems.gemSapphire);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.ingotObsidian, 9), MBlocks.ObsidianMineralBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.nuggetSapphire, 9), MItems.gemSapphire);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.gemSapphire, 1), MItems.nuggetSapphire, MItems.nuggetSapphire, MItems.nuggetSapphire
				, MItems.nuggetSapphire, MItems.nuggetSapphire, MItems.nuggetSapphire, MItems.nuggetSapphire, MItems.nuggetSapphire
				, MItems.nuggetSapphire);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.gemSapphire, 9), MBlocks.SapphireMineralBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.gemRuby, 9), MBlocks.RubyMineralBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.tossableTnt, 4), Blocks.tnt, Items.gunpowder, Items.gunpowder, Items.gunpowder, Items.gunpowder);
	}
	public static void addSmeltingRec(){
		//SMELTING RECIPEZZZZZZ
		
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(MItems.ingotSteel, 1), 280.0F);
		GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(MItems.partialObsidian, 2), 280.0F);
		GameRegistry.addSmelting(MItems.partialObsidian, new ItemStack(MItems.ingotObsidian, 1), 140.0F);
		GameRegistry.addSmelting(MItems.alloySapphireRaw, new ItemStack(MItems.ingotAlloySapphire, 1), 280.0F);
		GameRegistry.addSmelting(MBlocks.SapphireOre, new ItemStack(MItems.gemSapphire, 1), 140.0F);
		GameRegistry.addSmelting(MItems.beetroot, new ItemStack(MItems.beetrootCooked, 1), 140.0F);
		GameRegistry.addSmelting(MBlocks.SpecialCobble, new ItemStack(MBlocks.SpecialStone), 140.0F);
	}
	
}
