package net.mrlshop.util;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.mrlshop.item.ModItems;
import net.mrlshop.stat.ModStats;

public class Helpa {
    public static int buy(ServerCommandSource source, MrlShopItem item, int count) {
        PlayerInventory inventory = source.getPlayer().getInventory();
        if (item.price * 2 * count > inventory.count(ModItems.COIN)) {
            source.getPlayer().sendMessage(Text.translatable("mrlshop.unsuccess").append(ModItems.COIN.getName()).append("]").setStyle(Style.EMPTY.withColor(0xff0000)));
            return -1;
        }
        int shouldDelete = item.price * 2 * count;
        for (int i = 0; i < 36; i++) {
            ItemStack stack = inventory.getStack(i);
            if (stack.isOf(ModItems.COIN)) {
                if (stack.getCount() > shouldDelete) {
                    stack.decrement(shouldDelete);
                    break;
                } else {
                    shouldDelete -= stack.getCount();
                    stack.decrement(stack.getCount());
                }
            }
        }
        inventory.insertStack(new ItemStack(item.item, count));
        source.getPlayer().sendMessage(Text.translatable("mrlshop.buy.0").append(Integer.toString(count)).append(" [").append(item.item.getName()).append(Text.translatable("mrlshop.buy.1")).append(Integer.toString(item.price * count * 2)).append(" [").append(ModItems.COIN.getName()).append("]"));
        source.getPlayer().increaseStat(ModStats.ITEMS_BOUGHT, count);
        source.getPlayer().increaseStat(ModStats.COINS_SPENT, item.price * count * 2);
        return 1;
    }

    public static int sell(ServerCommandSource source, MrlShopItem item, int count) {
        PlayerInventory inventory = source.getPlayer().getInventory();
        if (count > inventory.count(item.item)) {
            source.getPlayer().sendMessage(Text.translatable("mrlshop.unsuccess").append(item.item.getName()).append("]").setStyle(Style.EMPTY.withColor(0xff0000)));
            return -1;
        }
        int shouldDelete = count;
        for (int i = 0; i < 36; i++) {
            ItemStack stack = inventory.getStack(i);
            if (stack.isOf(item.item)) {
                if (stack.getCount() > shouldDelete) {
                    stack.decrement(shouldDelete);
                    break;
                } else {
                    shouldDelete -= stack.getCount();
                    stack.decrement(stack.getCount());
                }
            }
        }
        inventory.insertStack(new ItemStack(ModItems.COIN, item.price * count));
        source.getPlayer().sendMessage(Text.translatable("mrlshop.sell.0").append(Integer.toString(count)).append(" [").append(item.item.getName()).append(Text.translatable("mrlshop.sell.1")).append(Integer.toString(item.price * count)).append(" [").append(ModItems.COIN.getName()).append("]"));
        source.getPlayer().increaseStat(ModStats.ITEMS_SOLD, count);
        source.getPlayer().increaseStat(ModStats.COINS_OBTAINED, item.price * count);
        return 1;
    }
    public static int getprice(ServerCommandSource source, MrlShopItem item) {
        source.getPlayer().sendMessage(Text.translatable("mrlshop.getprice.0").append(item.item.getName()));
        source.getPlayer().sendMessage(Text.translatable("mrlshop.getprice.1").append(Integer.toString(item.price)));
        source.getPlayer().sendMessage(Text.translatable("mrlshop.getprice.2").append(Integer.toString(item.price * 2)));
        return 1;
    }
}