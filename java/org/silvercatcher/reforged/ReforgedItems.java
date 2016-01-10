package org.silvercatcher.reforged;

import java.util.ArrayList;
import java.util.List;

import org.silvercatcher.reforged.weapons.ItemBattleAxe;
import org.silvercatcher.reforged.weapons.ItemBoomerang;
import org.silvercatcher.reforged.weapons.ItemFireRod;
import org.silvercatcher.reforged.weapons.ItemNestOfBees;
import org.silvercatcher.reforged.weapons.ReforgedItem;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ReforgedItems {

	public static ReforgedItem NEST_OF_BEES;

	public static ReforgedItem FIREROD;
	
	public static ReforgedItem IRON_BATTLE_AXE;
	
	public static ReforgedItem WOODEN_BOOMERANG;
	
	public static ReforgedItem STONE_BOOMERANG;
	
	public static ReforgedItem GOLDEN_BOOMERANG;
	
	public static ReforgedItem IRON_BOOMERANG;
	
	public static ReforgedItem DIAMOND_BOOMERANG;
	
	public static List<ReforgedItem> registratonList = new ArrayList<ReforgedItem>();
	
	public static void createItems() {
		
		registratonList.add(NEST_OF_BEES = new ItemNestOfBees());
		registratonList.add(FIREROD = new ItemFireRod());
		registratonList.add(IRON_BATTLE_AXE = new ItemBattleAxe(ToolMaterial.IRON));
		registratonList.add(WOODEN_BOOMERANG = new ItemBoomerang(ToolMaterial.WOOD));
		registratonList.add(STONE_BOOMERANG = new ItemBoomerang(ToolMaterial.STONE));
		registratonList.add(GOLDEN_BOOMERANG = new ItemBoomerang(ToolMaterial.GOLD));
		registratonList.add(IRON_BOOMERANG = new ItemBoomerang(ToolMaterial.IRON));
		registratonList.add(DIAMOND_BOOMERANG = new ItemBoomerang(ToolMaterial.EMERALD));
		
	}
	
	public static void registerItems() {
		
		for(ReforgedItem item : registratonList) {
			GameRegistry.registerItem(item, item.getName());
		}
	}
	
	public static void registerRecipes() {
		
		for(ReforgedItem item : registratonList) {
			item.registerRecipes();
		}
	}
}
