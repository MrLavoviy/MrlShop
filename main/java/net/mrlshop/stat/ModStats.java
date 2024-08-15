package net.mrlshop.stat;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mrlshop.MrlShop;

public class ModStats {
    public static Identifier ITEMS_BOUGHT = register("items_bought");
    public static Identifier ITEMS_SOLD = register("items_sold");
    public static Identifier COINS_SPENT = register("coins_spent");
    public static Identifier COINS_OBTAINED = register("coins_obtained");
    public static Identifier register(String name) {
        Identifier id = Identifier.of(MrlShop.id, name);
        Registry.register(Registries.CUSTOM_STAT, name, id);
        return id;
    }
    public static void registerModStats() {
        MrlShop.LOGGER.info("Registering ModStats for" + MrlShop.id);
    }
}