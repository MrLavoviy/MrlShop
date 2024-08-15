package net.mrlshop.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mrlshop.MrlShop;

public class ModItems {
    public static final Item COIN = Registry.register(Registries.ITEM, Identifier.of(MrlShop.id, "coin"), new Item(new Item.Settings()));
    public static void RegisterModItems() {
        MrlShop.LOGGER.info("Registering ModItems for " + MrlShop.id);
    }
}