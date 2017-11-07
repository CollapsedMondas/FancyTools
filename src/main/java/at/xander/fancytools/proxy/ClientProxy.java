package at.xander.fancytools.proxy;

import java.util.Map;

import at.xander.fancytools.main.FancyTools;
import gnu.trove.map.hash.THashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends ServerProxy {

	private Map<Item, String> textures = new THashMap<>();

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e) {
		textures.forEach((item, name) -> {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
					new ModelResourceLocation(FancyTools.MODID + ":" + name, "inventory"));
		});
		textures = null;
		super.init(e);
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}

	public void registerTexture(Item item, String name) {
		textures.put(item, name);
	}
}
