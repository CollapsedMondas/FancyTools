package at.xander.fancytools.item;

import at.xander.fancytools.main.FancyTools;
import net.minecraft.item.ItemSword;

public class FancySword extends ItemSword{

	public FancySword(ToolMaterial material, String unlocName) {
		super(material);
		setUnlocalizedName(unlocName);
		setRegistryName(FancyTools.MODID, unlocName);
		FancyTools.proxy.registerTexture(this, unlocName);
	}

}
