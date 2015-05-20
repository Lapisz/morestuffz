package com.lapisz.morestuffz.entity;

import net.minecraft.entity.EntityList;

import com.lapisz.morestuffz.Main.MainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntity {
	public static void mainRegistry(){
		
	}
	public static void registerEntity(){
		createEntity(EntityThrownTnt.class, "ThrownTnt", 0x008521, 0x00FF0800);
	}
	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MainRegistry.modInstance, 96, 1, true);
		createEgg(randomId, solidColour, spotColour);
	}
	private static void createEgg(int randomId, int solidColour, int spotColour){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour, spotColour));
	}
}
