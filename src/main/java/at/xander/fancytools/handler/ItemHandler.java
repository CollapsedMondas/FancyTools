package at.xander.fancytools.handler;

import static at.xander.fancytools.handler.MaterialHandler.emerald;
import static at.xander.fancytools.handler.MaterialHandler.obsidian;

import java.util.List;

import at.xander.fancytools.item.FancyAxe;
import at.xander.fancytools.item.FancyHoe;
import at.xander.fancytools.item.FancyPickaxe;
import at.xander.fancytools.item.FancyShovel;
import at.xander.fancytools.item.FancySword;
import net.minecraft.item.Item;

public class ItemHandler {
	public static Item emeraldPickaxe, emeraldAxe, emeraldHoe, emeraldSword, emeraldShovel;
	public static Item obsidianPickaxe, obsidianAxe, obsidiandHoe, obsidianSword, obsidianShovel;

	public static void init(List<Item> registry) {
		emeraldAxe = new FancyAxe(emerald, 8.5f, -3.0f, "emerald_axe");
		obsidianAxe = new FancyAxe(obsidian, 8.5f, -3.2f, "obsidian_axe");

		emeraldPickaxe = new FancyPickaxe(emerald, "emerald_pickaxe");
		obsidianPickaxe = new FancyPickaxe(obsidian, "obsidian_pickaxe");

		emeraldHoe = new FancyHoe(emerald, "emerald_hoe");
		obsidiandHoe = new FancyHoe(obsidian, "obsidian_hoe");

		emeraldShovel = new FancyShovel(emerald, "emerald_shovel");
		obsidianShovel = new FancyShovel(obsidian, "obsidian_shovel");

		emeraldSword = new FancySword(emerald, "emerald_sword");
		obsidianSword = new FancySword(obsidian, "obsidian_sword");

		RegistryHandler.addAllToCollection(registry, emeraldAxe, obsidianAxe, emeraldPickaxe, obsidianPickaxe,
				emeraldHoe, obsidiandHoe, emeraldShovel, obsidianShovel, emeraldSword, obsidianSword);
	}

}
