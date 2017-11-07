package at.xander.fancytools.handler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegistryHandler {

	public static final RegistryHandler instance = new RegistryHandler();

	@SubscribeEvent
	public void onItemRegistry(Register<Item> event) {
		List<Item> itemList = new ArrayList<>();
		ItemHandler.init(itemList);
		for (Item i : itemList) {
			event.getRegistry().register(i);
		}
	}

	@SafeVarargs
	public static <T> void addAllToCollection(Collection<T> collection, T... values) {
		for(T t : values) {
			collection.add(t);
		}
	}

}
