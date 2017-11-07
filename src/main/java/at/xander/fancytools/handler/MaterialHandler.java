package at.xander.fancytools.handler;

import at.xander.fancytools.main.FancyTools;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {
	public static ToolMaterial emerald, obsidian;

	public static void init(Configuration config) {
		ConfigCategory catEmerald = config.getCategory("Emerald");
		ConfigCategory catObsidian = config.getCategory("Obsidian");

		int harvestLevelEmerald = config.getInt("harvestLevel", catEmerald.getName(), 3, 0, Integer.MAX_VALUE, "");
		int durabilityEmerald = config.getInt("Durability", catEmerald.getName(), 2500, 1, Short.MAX_VALUE, "");
		float efficiencyEmerald = config.getFloat("Efficiency", catEmerald.getName(), 9.0f, 0.0f, Float.MAX_VALUE,
				"Diamond = 8.0f");
		float damageEmerald = config.getFloat("Damage", catEmerald.getName(), 3.25f, 0.0f, Float.MAX_VALUE,
				"Diamond = 3.0f");
		int enchantabilityEmerald = config.getInt("Enchantability", catEmerald.getName(), 10, 0, Integer.MAX_VALUE,
				"Diamond = 10");

		int harvestLevelObsidian = config.getInt("harvestLevel", catObsidian.getName(), 3, 0, Integer.MAX_VALUE, "");
		int durabilityObsidian = config.getInt("Durability", catObsidian.getName(), 2500, 1, Short.MAX_VALUE, "");
		float efficiencyObsidian = config.getFloat("Efficiency", catObsidian.getName(), 9.0f, 0.0f, Float.MAX_VALUE,
				"Diamond = 8.0f");
		float damageObsidian = config.getFloat("Damage", catObsidian.getName(), 3.25f, 0.0f, Float.MAX_VALUE,
				"Diamond = 3.0f");
		int enchantabilityObsidian = config.getInt("Enchantability", catObsidian.getName(), 10, 0, Integer.MAX_VALUE,
				"Diamond = 10");

		emerald = EnumHelper.addToolMaterial(FancyTools.MODID + "_emerald", harvestLevelEmerald, durabilityEmerald,
				efficiencyEmerald, damageEmerald, enchantabilityEmerald);
		obsidian = EnumHelper.addToolMaterial(FancyTools.MODID + "_obsidian", harvestLevelObsidian, durabilityObsidian,
				efficiencyObsidian, damageObsidian, enchantabilityObsidian);
	}
}
