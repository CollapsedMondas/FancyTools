package at.xander.fancytools.item;

import at.xander.fancytools.main.FancyTools;
import net.minecraft.item.ItemSpade;

public class FancyShovel extends ItemSpade{

	public FancyShovel(ToolMaterial material, String unlocName) {
		super(material);
		setUnlocalizedName(unlocName);
		setRegistryName(FancyTools.MODID, unlocName);
		FancyTools.proxy.registerTexture(this, unlocName);
	}

}
