package net.mrlshop.util;

import net.minecraft.item.Item;

public class MrlShopItem {
    public int price;
    public Item item;
    MrlShopItem(int price, Item item) {
        this.price = price;
        this.item = item;
    }
}
