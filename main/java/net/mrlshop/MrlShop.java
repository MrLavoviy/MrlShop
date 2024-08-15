package net.mrlshop;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.stat.Stat;
import net.mrlshop.item.ModItems;
import net.mrlshop.server.command.MrlShopCommand;
import net.mrlshop.stat.ModStats;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MrlShop implements ModInitializer {
	public static final String id = "mrlshop";
    public static final Logger LOGGER = LoggerFactory.getLogger(id);
	@Override
	public void onInitialize() {
		ModItems.RegisterModItems();
		ModStats.registerModStats();
		CommandRegistrationCallback.EVENT.register(MrlShopCommand::register);
	}
}