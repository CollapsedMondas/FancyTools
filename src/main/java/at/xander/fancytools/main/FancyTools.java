package at.xander.fancytools.main;

import at.xander.fancytools.handler.MaterialHandler;
import at.xander.fancytools.handler.RegistryHandler;
import at.xander.fancytools.proxy.ServerProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = "Fancy Tools", modid = FancyTools.MODID, version = "1.0.2")
public class FancyTools {
	public static final String MODID = "fancytools";
	
	@Instance
	public static FancyTools instance;
	@SidedProxy(clientSide = "at.xander.fancytools.proxy.ClientProxy", serverSide = "at.xander.fancytools.proxy.ServerProxy")
	public static ServerProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		MinecraftForge.EVENT_BUS.register(RegistryHandler.instance);
		Configuration config = new Configuration(e.getSuggestedConfigurationFile());
		MaterialHandler.init(config);
		config.save();
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

}
