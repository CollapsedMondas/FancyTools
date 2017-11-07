package at.xander.fancytools.item;

import at.xander.fancytools.main.FancyTools;
import net.minecraft.item.ItemPickaxe;

public class FancyPickaxe extends ItemPickaxe{

	public FancyPickaxe(ToolMaterial material, String unlocName) {
		super(material);
		setUnlocalizedName(unlocName);
		setRegistryName(FancyTools.MODID, unlocName);
		FancyTools.proxy.registerTexture(this, unlocName);
	}

}
