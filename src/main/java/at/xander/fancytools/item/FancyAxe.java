package at.xander.fancytools.item;

import at.xander.fancytools.main.FancyTools;
import net.minecraft.item.ItemAxe;

public class FancyAxe extends ItemAxe{

	public FancyAxe(ToolMaterial material, float damage, float speed, String unlocName) {
		super(material, damage, speed);
		setUnlocalizedName(FancyTools.MODID + "." + unlocName);
		setRegistryName(FancyTools.MODID, unlocName);
		FancyTools.proxy.registerTexture(this, unlocName);
	}

}
