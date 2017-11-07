package at.xander.fancytools.item;

import at.xander.fancytools.main.FancyTools;
import net.minecraft.item.ItemHoe;

public class FancyHoe extends ItemHoe{

	public FancyHoe(ToolMaterial material, String unlocName) {
		super(material);
		setUnlocalizedName(unlocName);
		setRegistryName(FancyTools.MODID, unlocName);
		FancyTools.proxy.registerTexture(this, unlocName);
	}

}
