package com.lapisz.morestuffz.item;

import com.lapisz.morestuffz.Main.MainRegistry;
import com.lapisz.morestuffz.blocks.MBlocks;
import com.lapisz.morestuffz.ctabs.ModCTabs;
import com.lapisz.morestuffz.lib.RefStrings;
import com.lapisz.morestuffz.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.common.util.EnumHelper;

public class MItems {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	//TOOL AND ARMOR MATERIALS!!!
	
	public static ToolMaterial sapphire = EnumHelper.addToolMaterial("sapphire", 2, 700, 8.0F, 3.0F, 15);
	public static ToolMaterial ruby = EnumHelper.addToolMaterial("ruby", 2, 575, 11.5F, 2.9F, 15);
	public static ToolMaterial emerald = EnumHelper.addToolMaterial("emerald", 3, 800, 7.0F, 3.8F, 15);
	public static ToolMaterial steel = EnumHelper.addToolMaterial("steel", 3, 950, 6.5F, 3.3F, 12);
	
	public static ArmorMaterial saparmor = EnumHelper.addArmorMaterial("saparmor", 25, new int[]{3, 7, 5, 2}, 15);
	
	//ARMOR!!!!
	public static Item saphelm;
	public static Item sapbody;
	public static Item sappants;
	public static Item sapboots;
	
	//ITEMS!!
	
	public static Item ingotSteel;
	public static Item partialObsidian;
	public static Item ingotObsidian;
	public static Item alloySapphireRaw;
	public static Item ingotAlloySapphire;
	public static Item gemSapphire;
	public static Item nuggetSapphire;
	public static Item gemRuby;
	//TOOLS!
	
	public static Item pickaxeSapphire;
	public static Item spadeSapphire;
	public static Item axeSapphire;
	public static Item hoeSapphire;
	public static Item swordSapphire;
	
	public static Item pickaxeRuby;
	public static Item spadeRuby;
	public static Item axeRuby;
	public static Item hoeRuby;
	public static Item swordRuby;
	
	public static Item pickaxeEmerald;
	public static Item spadeEmerald;
	public static Item axeEmerald;
	public static Item hoeEmerald;
	public static Item swordEmerald;
	
	public static Item pickaxeSteel;
	public static Item spadeSteel;
	public static Item axeSteel;
	public static Item hoeSteel;
	public static Item swordSteel;
	//CROP ITEMS AND FOOOOD
	
	public static Item beetroot;
	public static Item seedsBeetroot;
	public static Item beetrootCooked;
	public static Item beetrootGolden;
	
	//PROJECtILES (ITEM)
	
	public static Item tossableTnt;
	
	
	//Initialize the item
	
	public static void initializeItem(){
		//MISC ITEMS
		ingotSteel = new Item().setUnlocalizedName("ingotSteel").setCreativeTab(ModCTabs.tabModItems).setTextureName(RefStrings.MODID + ":ingotSteel");
		partialObsidian = new Item().setUnlocalizedName("partialObsidian").setCreativeTab(ModCTabs.tabModItems).setTextureName(RefStrings.MODID + ":partialObsidian");
		ingotObsidian = new Item().setUnlocalizedName("ingotObsidian").setCreativeTab(ModCTabs.tabModItems).setTextureName(RefStrings.MODID + ":ingotObsidian");
		alloySapphireRaw = new Item().setUnlocalizedName("alloySapphireRaw").setCreativeTab(ModCTabs.tabModItems).setTextureName(RefStrings.MODID + ":alloySapphireRaw");
		ingotAlloySapphire = new Item().setUnlocalizedName("ingotAlloySapphire").setCreativeTab(ModCTabs.tabModItems).setTextureName(RefStrings.MODID + ":ingotAlloySapphire");
		gemSapphire = new Item().setUnlocalizedName("gemSapphire").setCreativeTab(ModCTabs.tabModItems).setTextureName(RefStrings.MODID + ":gemSapphire");
		gemRuby = new Item().setUnlocalizedName("gemRuby").setCreativeTab(ModCTabs.tabModItems).setTextureName(RefStrings.MODID + ":gemRuby");
		nuggetSapphire = new Item().setUnlocalizedName("nuggetSapphire").setCreativeTab(ModCTabs.tabModItems).setTextureName(RefStrings.MODID + ":nuggetSapphire");
		
		//TOOL CLASSES
		
		pickaxeSapphire = new pickaxeSapphire(sapphire).setUnlocalizedName("pickaxeSapphire").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":pickaxeSapphire");
		axeSapphire = new axeSapphire(sapphire).setUnlocalizedName("axeSapphire").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":axeSapphire");
		hoeSapphire = new hoeSapphire(sapphire).setUnlocalizedName("hoeSapphire").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":hoeSapphire");
		swordSapphire = new swordSapphire(sapphire).setUnlocalizedName("swordSapphire").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":swordSapphire");
		spadeSapphire = new spadeSapphire(sapphire).setUnlocalizedName("spadeSapphire").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":spadeSapphire");
		
		pickaxeRuby = new pickaxeRuby(ruby).setUnlocalizedName("pickaxeRuby").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":pickaxeRuby");
		axeRuby = new axeRuby(ruby).setUnlocalizedName("axeRuby").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":notexture");
		hoeRuby = new hoeRuby(ruby).setUnlocalizedName("hoeRuby").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":notexture");
		swordRuby = new swordRuby(ruby).setUnlocalizedName("swordRuby").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":swordRuby");
		spadeRuby = new spadeRuby(ruby).setUnlocalizedName("spadeRuby").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":notexture");
		
		pickaxeEmerald = new pickaxeEmerald(emerald).setUnlocalizedName("pickaxeEmerald").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":pickaxeEmerald");
		axeEmerald = new axeEmerald(emerald).setUnlocalizedName("axeEmerald").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":notexture");
		hoeEmerald = new hoeEmerald(emerald).setUnlocalizedName("hoeEmerald").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":notexture");
		swordEmerald = new swordEmerald(emerald).setUnlocalizedName("swordEmerald").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":notexture");
		spadeEmerald = new spadeEmerald(emerald).setUnlocalizedName("spadeEmerald").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":notexture");
		
		pickaxeSteel = new pickaxeSteel(steel).setUnlocalizedName("pickaxeSteel").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":notexture");
		axeSteel = new axeSteel(steel).setUnlocalizedName("axeSteel").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":notexture");
		hoeSteel = new hoeSteel(steel).setUnlocalizedName("hoeSteel").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":notexture");
		swordSteel = new swordSteel(steel).setUnlocalizedName("swordSteel").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":notexture");
		spadeSteel = new spadeSteel(steel).setUnlocalizedName("spadeSteel").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":notexture");
		
		//ARMOR ITEMS
		
		saphelm = new saparmor(saparmor, MainRegistry.proxy.addArmor("saparmor"), 0).setUnlocalizedName("saphelm").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":saphelm");
		sapbody = new saparmor(saparmor, MainRegistry.proxy.addArmor("saparmor"), 1).setUnlocalizedName("sapbody").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":sapbody");
		sappants = new saparmor(saparmor, MainRegistry.proxy.addArmor("saparmor"), 2).setUnlocalizedName("sappants").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":sappants");
		sapboots = new saparmor(saparmor, MainRegistry.proxy.addArmor("saparmor"), 3).setUnlocalizedName("sapboots").setCreativeTab(ModCTabs.tabModTools).setTextureName(RefStrings.MODID + ":sapboots");
		
		//CROP STUFFZ AND FOOD
		
		beetroot = new beetroot(Item.getIdFromItem(beetroot), 2, false).setUnlocalizedName("beetroot").setCreativeTab(ModCTabs.tabModItems).setTextureName(RefStrings.MODID + ":beetroot").setMaxStackSize(32);
		seedsBeetroot = new ItemSeeds(MBlocks.cropBeetroot, Blocks.farmland).setUnlocalizedName("seedsBeetroot").setCreativeTab(ModCTabs.tabModItems).setTextureName(RefStrings.MODID + ":seedsBeetroot");
		beetrootCooked = new beetrootCooked(Item.getIdFromItem(beetrootCooked), 5, false).setUnlocalizedName("beetrootCooked").setCreativeTab(ModCTabs.tabModItems).setTextureName(RefStrings.MODID + ":beetrootCooked").setMaxStackSize(48);
		beetrootGolden = new beetrootGolden(Item.getIdFromItem(beetrootGolden), 7, false).setUnlocalizedName("beetrootGolden").setCreativeTab(ModCTabs.tabModItems).setTextureName(RefStrings.MODID + ":beetrootGolden").setMaxStackSize(48);
		
		//PROJECTILES (ITEM)
		
		tossableTnt = new tossableTnt().setUnlocalizedName("tossableTnt").setCreativeTab(ModCTabs.tabModMisc).setTextureName(RefStrings.MODID + ":tossableTnt");
		
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(ingotSteel, ingotSteel.getUnlocalizedName());
		GameRegistry.registerItem(partialObsidian, partialObsidian.getUnlocalizedName());
		GameRegistry.registerItem(ingotObsidian, ingotObsidian.getUnlocalizedName());
		GameRegistry.registerItem(alloySapphireRaw, alloySapphireRaw.getUnlocalizedName());
		GameRegistry.registerItem(ingotAlloySapphire, ingotAlloySapphire.getUnlocalizedName());
		GameRegistry.registerItem(gemSapphire, gemSapphire.getUnlocalizedName());
		GameRegistry.registerItem(nuggetSapphire, nuggetSapphire.getUnlocalizedName());
		GameRegistry.registerItem(gemRuby, gemRuby.getUnlocalizedName());
		
		//REGISTER TOOL ITEMZZZ
		
		GameRegistry.registerItem(pickaxeSapphire, pickaxeSapphire.getUnlocalizedName());
		GameRegistry.registerItem(axeSapphire, axeSapphire.getUnlocalizedName());
		GameRegistry.registerItem(spadeSapphire, spadeSapphire.getUnlocalizedName());
		GameRegistry.registerItem(hoeSapphire, hoeSapphire.getUnlocalizedName());
		GameRegistry.registerItem(swordSapphire, swordSapphire.getUnlocalizedName());
		
		GameRegistry.registerItem(pickaxeRuby, pickaxeRuby.getUnlocalizedName());
		GameRegistry.registerItem(axeRuby, axeRuby.getUnlocalizedName());
		GameRegistry.registerItem(spadeRuby, spadeRuby.getUnlocalizedName());
		GameRegistry.registerItem(hoeRuby, hoeRuby.getUnlocalizedName());
		GameRegistry.registerItem(swordRuby, swordRuby.getUnlocalizedName());
		
		GameRegistry.registerItem(pickaxeEmerald, pickaxeEmerald.getUnlocalizedName());
		GameRegistry.registerItem(axeEmerald, axeEmerald.getUnlocalizedName());
		GameRegistry.registerItem(spadeEmerald, spadeEmerald.getUnlocalizedName());
		GameRegistry.registerItem(hoeEmerald, hoeEmerald.getUnlocalizedName());
		GameRegistry.registerItem(swordEmerald, swordEmerald.getUnlocalizedName());
		
		GameRegistry.registerItem(pickaxeSteel, pickaxeSteel.getUnlocalizedName());
		GameRegistry.registerItem(axeSteel, axeSteel.getUnlocalizedName());
		GameRegistry.registerItem(spadeSteel, spadeSteel.getUnlocalizedName());
		GameRegistry.registerItem(hoeSteel, hoeSteel.getUnlocalizedName());
		GameRegistry.registerItem(swordSteel, swordSteel.getUnlocalizedName());
		
		//REGISTER ARMOR STUFFZZZ
		GameRegistry.registerItem(saphelm, saphelm.getUnlocalizedName());
		GameRegistry.registerItem(sapbody, sapbody.getUnlocalizedName());
		GameRegistry.registerItem(sappants, sappants.getUnlocalizedName());
		GameRegistry.registerItem(sapboots, sapboots.getUnlocalizedName());
		
		//REGISTER CROP ITEMZZ AND FOODZZZZZ
		GameRegistry.registerItem(beetroot, beetroot.getUnlocalizedName());
		GameRegistry.registerItem(seedsBeetroot, seedsBeetroot.getUnlocalizedName());
		GameRegistry.registerItem(beetrootCooked, beetrootCooked.getUnlocalizedName());
		GameRegistry.registerItem(beetrootGolden, beetrootGolden.getUnlocalizedName());
		
		//REGISTER PROJECTILES (ITEMS)
		
		GameRegistry.registerItem(tossableTnt, tossableTnt.getUnlocalizedName());
		
	}
}
