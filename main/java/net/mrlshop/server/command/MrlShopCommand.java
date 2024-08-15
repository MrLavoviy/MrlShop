package net.mrlshop.server.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.mrlshop.util.Helpa;
import net.mrlshop.util.MrlShopItem;
import net.mrlshop.util.MrlShopItems;

public class MrlShopCommand {

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess access, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(CommandManager.literal("mrlshop").then(CommandManager.literal("buy").then(CommandManager.argument("count", IntegerArgumentType.integer(1, 2304)).then(CommandManager.literal("dirt").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.dirt, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("clay").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.clay, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("cactus").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.cactus, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("bamboo").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.bamboo, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("sugar_cane").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.sugar_cane, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("kelp").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.kelp, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("sweet_berries").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.sweet_berries, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("paper").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.paper, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("sugar").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.sugar, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("bone_meal").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.bone_meal, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("nether_wart").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.nether_wart, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("arrow").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.arrow, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("gravel").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.gravel, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("sand").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.sand, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("soul_sand").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.soul_sand, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("soul_soil").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.soul_soil, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("oak_planks").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.oak_planks, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("spruce_planks").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.spruce_planks, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("birch_planks").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.birch_planks, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("dark_oak_planks").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.dark_oak_planks, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("acacia_planks").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.acacia_planks, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("mangrove_planks").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.mangrove_planks, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("cherry_planks").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.cherry_planks, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("crimson_planks").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.crimson_planks, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("warped_planks").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.warped_planks, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("carrot").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.carrot, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("potato").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.potato, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("tropical_fish").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.tropical_fish, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("ink_sac").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.ink_sac, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("cobblestone").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.cobblestone, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("granite").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.granite, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("diorite").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.diorite, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("andesite").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.andesite, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("tuff").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.tuff, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("basalt").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.basalt, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("melon").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.melon, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("pumpkin").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.pumpkin, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("egg").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.egg, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("chicken").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.chicken, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("rabbit").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.rabbit, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("cod").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.cod, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("salmon").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.salmon, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("rabbit_foot").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.rabbit_foot, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("cobbled_deepslate").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.cobbled_deepslate, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("end_stone").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.end_stone, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("glass").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.glass, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("porkchop").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.porkchop, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("mutton").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.mutton, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("glow_ink_sac").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.glow_ink_sac, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("spider_eye").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.spider_eye, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("stone").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.stone, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("dripstone_block").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.dripstone_block, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("blackstone").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.blackstone, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("chorus_fruit").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.chorus_fruit, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("beef").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.beef, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("coal").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.coal, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("magma_cream").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.magma_cream, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("deepslate").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.deepslate, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("bone_block").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.bone_block, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("shroomlight").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.shroomlight, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("calcite").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.calcite, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("fire_charge").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.fire_charge, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("phantom_membrane").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.phantom_membrane, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("oak_log").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.oak_log, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("spruce_log").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.spruce_log, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("birch_log").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.birch_log, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("dark_oak_log").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.dark_oak_log, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("acacia_log").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.acacia_log, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("mangrove_log").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.mangrove_log, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("cherry_log").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.cherry_log, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("crimson_stem").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.crimson_stem, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("warped_stem").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.warped_stem, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("apple").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.apple, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("glowstone_dust").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.glowstone_dust, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("prismarine").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.prismarine, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("magma_block").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.magma_block, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("ice").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.ice, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("wool").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.wool, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("prismarine_bricks").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.prismarine_bricks, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("dark_prismarine").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.dark_prismarine, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("pufferfish").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.pufferfish, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("copper_ingot").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.copper_ingot, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("rabbit_hide").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.rabbit_hide, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("honey_bottle").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.honey_bottle, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("iron_ingot").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.iron_ingot, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("amethyst_shard").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.amethyst_shard, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("honeycomb").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.honeycomb, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("gunpowder").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.gunpowder, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("packed_ice").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.packed_ice, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("end_rod").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.end_rod, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("wind_charge").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.wind_charge, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("redstone").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.redstone, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("leather").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.leather, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("turtle_scute").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.turtle_scute, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("armadillo_scute").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.armadillo_scute, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("sea_lantern").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.sea_lantern, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("candle").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.candle, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("book").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.book, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("gold_ingot").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.gold_ingot, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("slime_ball").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.slime_ball, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("dragon_breath").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.dragon_breath, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("blue_ice").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.blue_ice, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("sponge").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.sponge, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("wet_sponge").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.wet_sponge, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("ender_pearl").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.ender_pearl, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("emerald").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.emerald, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("quartz").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.quartz, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("blaze_rod").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.blaze_rod, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("breeze_rod").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.breeze_rod, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("dragon_head").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.dragon_head, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("wither_skeleton_skull").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.wither_skeleton_skull, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("lapis_lazuli").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.lapis_lazuli, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("nautilus_shell").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.nautilus_shell, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("verdant_froglight").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.verdant_froglight, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("ochre_froglight").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.ochre_froglight, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("pearlescent_froglight").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.pearlescent_froglight, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("diamond").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.diamond, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("skeleton_skull").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.skeleton_skull, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("player_head").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.player_head, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("zombie_head").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.zombie_head, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("creeper_head").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.creeper_head, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("enchanted_golden_apple").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.enchanted_golden_apple, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("heart_of_the_sea").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.heart_of_the_sea, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("shulker_shell").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.shulker_shell, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("piglin_head").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.piglin_head, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("obsidian").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.obsidian, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("crying_obsidian").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.crying_obsidian, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("netherite_ingot").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.netherite_ingot, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("sculk").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.sculk, IntegerArgumentType.getInteger(context, "count"));
                        })))
                        .then(CommandManager.literal("nether_star").executes((context -> {
                            return buy(context.getSource(), MrlShopItems.nether_star, IntegerArgumentType.getInteger(context, "count"));
                        })))))
                .then(CommandManager.literal("sell").then(CommandManager.argument("count", IntegerArgumentType.integer(1, 2304)).then(CommandManager.literal("dirt").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.dirt, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("clay").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.clay, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("cactus").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.cactus, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("bamboo").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.bamboo, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("sugar_cane").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.sugar_cane, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("kelp").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.kelp, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("sweet_berries").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.sweet_berries, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("paper").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.paper, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("sugar").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.sugar, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("bone_meal").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.bone_meal, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("nether_wart").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.nether_wart, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("arrow").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.arrow, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("gravel").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.gravel, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("sand").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.sand, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("soul_sand").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.soul_sand, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("soul_soil").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.soul_soil, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("oak_planks").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.oak_planks, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("spruce_planks").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.spruce_planks, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("birch_planks").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.birch_planks, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("dark_oak_planks").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.dark_oak_planks, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("acacia_planks").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.acacia_planks, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("mangrove_planks").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.mangrove_planks, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("cherry_planks").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.cherry_planks, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("crimson_planks").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.crimson_planks, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("warped_planks").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.warped_planks, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("carrot").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.carrot, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("potato").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.potato, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("tropical_fish").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.tropical_fish, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("ink_sac").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.ink_sac, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("cobblestone").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.cobblestone, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("granite").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.granite, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("diorite").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.diorite, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("andesite").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.andesite, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("tuff").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.tuff, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("basalt").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.basalt, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("melon").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.melon, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("pumpkin").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.pumpkin, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("egg").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.egg, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("chicken").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.chicken, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("rabbit").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.rabbit, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("cod").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.cod, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("salmon").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.salmon, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("rabbit_foot").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.rabbit_foot, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("cobbled_deepslate").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.cobbled_deepslate, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("end_stone").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.end_stone, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("glass").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.glass, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("porkchop").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.porkchop, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("mutton").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.mutton, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("glow_ink_sac").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.glow_ink_sac, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("spider_eye").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.spider_eye, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("stone").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.stone, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("dripstone_block").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.dripstone_block, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("blackstone").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.blackstone, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("chorus_fruit").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.chorus_fruit, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("beef").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.beef, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("coal").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.coal, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("magma_cream").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.magma_cream, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("deepslate").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.deepslate, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("bone_block").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.bone_block, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("shroomlight").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.shroomlight, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("calcite").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.calcite, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("fire_charge").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.fire_charge, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("phantom_membrane").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.phantom_membrane, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("oak_log").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.oak_log, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("spruce_log").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.spruce_log, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("birch_log").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.birch_log, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("dark_oak_log").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.dark_oak_log, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("acacia_log").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.acacia_log, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("mangrove_log").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.mangrove_log, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("cherry_log").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.cherry_log, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("crimson_stem").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.crimson_stem, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("warped_stem").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.warped_stem, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("apple").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.apple, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("glowstone_dust").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.glowstone_dust, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("prismarine").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.prismarine, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("magma_block").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.magma_block, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("ice").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.ice, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("wool").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.wool, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("prismarine_bricks").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.prismarine_bricks, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("dark_prismarine").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.dark_prismarine, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("pufferfish").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.pufferfish, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("copper_ingot").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.copper_ingot, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("rabbit_hide").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.rabbit_hide, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("honey_bottle").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.honey_bottle, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("iron_ingot").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.iron_ingot, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("amethyst_shard").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.amethyst_shard, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("honeycomb").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.honeycomb, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("gunpowder").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.gunpowder, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("packed_ice").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.packed_ice, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("end_rod").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.end_rod, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("wind_charge").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.wind_charge, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("redstone").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.redstone, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("leather").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.leather, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("turtle_scute").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.turtle_scute, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("armadillo_scute").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.armadillo_scute, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("sea_lantern").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.sea_lantern, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("candle").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.candle, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("book").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.book, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("gold_ingot").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.gold_ingot, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("slime_ball").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.slime_ball, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("dragon_breath").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.dragon_breath, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("blue_ice").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.blue_ice, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("sponge").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.sponge, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("wet_sponge").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.wet_sponge, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("ender_pearl").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.ender_pearl, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("emerald").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.emerald, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("quartz").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.quartz, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("blaze_rod").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.blaze_rod, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("breeze_rod").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.breeze_rod, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("dragon_head").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.dragon_head, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("wither_skeleton_skull").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.wither_skeleton_skull, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("lapis_lazuli").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.lapis_lazuli, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("nautilus_shell").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.nautilus_shell, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("verdant_froglight").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.verdant_froglight, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("ochre_froglight").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.ochre_froglight, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("pearlescent_froglight").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.pearlescent_froglight, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("diamond").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.diamond, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("skeleton_skull").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.skeleton_skull, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("player_head").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.player_head, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("zombie_head").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.zombie_head, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("creeper_head").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.creeper_head, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("enchanted_golden_apple").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.enchanted_golden_apple, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("heart_of_the_sea").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.heart_of_the_sea, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("shulker_shell").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.shulker_shell, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("piglin_head").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.piglin_head, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("obsidian").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.obsidian, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("crying_obsidian").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.crying_obsidian, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("netherite_ingot").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.netherite_ingot, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("sculk").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.sculk, IntegerArgumentType.getInteger(context, "count"));
                                })))
                                .then(CommandManager.literal("nether_star").executes((context -> {
                                    return sell(context.getSource(), MrlShopItems.nether_star, IntegerArgumentType.getInteger(context, "count"));
                                })))))
                        .then((CommandManager.literal("getprice").then(CommandManager.literal("dirt").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.dirt);
                                })))
                                .then(CommandManager.literal("clay").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.clay);
                                })))
                                .then(CommandManager.literal("cactus").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.cactus);
                                })))
                                .then(CommandManager.literal("bamboo").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.bamboo);
                                })))
                                .then(CommandManager.literal("sugar_cane").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.sugar_cane);
                                })))
                                .then(CommandManager.literal("kelp").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.kelp);
                                })))
                                .then(CommandManager.literal("sweet_berries").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.sweet_berries);
                                })))
                                .then(CommandManager.literal("paper").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.paper);
                                })))
                                .then(CommandManager.literal("sugar").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.sugar);
                                })))
                                .then(CommandManager.literal("bone_meal").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.bone_meal);
                                })))
                                .then(CommandManager.literal("nether_wart").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.nether_wart);
                                })))
                                .then(CommandManager.literal("arrow").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.arrow);
                                })))
                                .then(CommandManager.literal("gravel").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.gravel);
                                })))
                                .then(CommandManager.literal("sand").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.sand);
                                })))
                                .then(CommandManager.literal("soul_sand").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.soul_sand);
                                })))
                                .then(CommandManager.literal("soul_soil").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.soul_soil);
                                })))
                                .then(CommandManager.literal("oak_planks").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.oak_planks);
                                })))
                                .then(CommandManager.literal("spruce_planks").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.spruce_planks);
                                })))
                                .then(CommandManager.literal("birch_planks").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.birch_planks);
                                })))
                                .then(CommandManager.literal("dark_oak_planks").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.dark_oak_planks);
                                })))
                                .then(CommandManager.literal("acacia_planks").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.acacia_planks);
                                })))
                                .then(CommandManager.literal("mangrove_planks").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.mangrove_planks);
                                })))
                                .then(CommandManager.literal("cherry_planks").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.cherry_planks);
                                })))
                                .then(CommandManager.literal("crimson_planks").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.crimson_planks);
                                })))
                                .then(CommandManager.literal("warped_planks").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.warped_planks);
                                })))
                                .then(CommandManager.literal("carrot").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.carrot);
                                })))
                                .then(CommandManager.literal("potato").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.potato);
                                })))
                                .then(CommandManager.literal("tropical_fish").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.tropical_fish);
                                })))
                                .then(CommandManager.literal("ink_sac").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.ink_sac);
                                })))
                                .then(CommandManager.literal("cobblestone").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.cobblestone);
                                })))
                                .then(CommandManager.literal("granite").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.granite);
                                })))
                                .then(CommandManager.literal("diorite").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.diorite);
                                })))
                                .then(CommandManager.literal("andesite").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.andesite);
                                })))
                                .then(CommandManager.literal("tuff").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.tuff);
                                })))
                                .then(CommandManager.literal("basalt").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.basalt);
                                })))
                                .then(CommandManager.literal("melon").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.melon);
                                })))
                                .then(CommandManager.literal("pumpkin").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.pumpkin);
                                })))
                                .then(CommandManager.literal("egg").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.egg);
                                })))
                                .then(CommandManager.literal("chicken").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.chicken);
                                })))
                                .then(CommandManager.literal("rabbit").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.rabbit);
                                })))
                                .then(CommandManager.literal("cod").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.cod);
                                })))
                                .then(CommandManager.literal("salmon").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.salmon);
                                })))
                                .then(CommandManager.literal("rabbit_foot").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.rabbit_foot);
                                })))
                                .then(CommandManager.literal("cobbled_deepslate").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.cobbled_deepslate);
                                })))
                                .then(CommandManager.literal("end_stone").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.end_stone);
                                })))
                                .then(CommandManager.literal("glass").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.glass);
                                })))
                                .then(CommandManager.literal("porkchop").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.porkchop);
                                })))
                                .then(CommandManager.literal("mutton").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.mutton);
                                })))
                                .then(CommandManager.literal("glow_ink_sac").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.glow_ink_sac);
                                })))
                                .then(CommandManager.literal("spider_eye").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.spider_eye);
                                })))
                                .then(CommandManager.literal("stone").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.stone);
                                })))
                                .then(CommandManager.literal("dripstone_block").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.dripstone_block);
                                })))
                                .then(CommandManager.literal("blackstone").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.blackstone);
                                })))
                                .then(CommandManager.literal("chorus_fruit").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.chorus_fruit);
                                })))
                                .then(CommandManager.literal("beef").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.beef);
                                })))
                                .then(CommandManager.literal("coal").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.coal);
                                })))
                                .then(CommandManager.literal("magma_cream").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.magma_cream);
                                })))
                                .then(CommandManager.literal("deepslate").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.deepslate);
                                })))
                                .then(CommandManager.literal("bone_block").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.bone_block);
                                })))
                                .then(CommandManager.literal("shroomlight").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.shroomlight);
                                })))
                                .then(CommandManager.literal("calcite").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.calcite);
                                })))
                                .then(CommandManager.literal("fire_charge").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.fire_charge);
                                })))
                                .then(CommandManager.literal("phantom_membrane").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.phantom_membrane);
                                })))
                                .then(CommandManager.literal("oak_log").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.oak_log);
                                })))
                                .then(CommandManager.literal("spruce_log").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.spruce_log);
                                })))
                                .then(CommandManager.literal("birch_log").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.birch_log);
                                })))
                                .then(CommandManager.literal("dark_oak_log").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.dark_oak_log);
                                })))
                                .then(CommandManager.literal("acacia_log").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.acacia_log);
                                })))
                                .then(CommandManager.literal("mangrove_log").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.mangrove_log);
                                })))
                                .then(CommandManager.literal("cherry_log").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.cherry_log);
                                })))
                                .then(CommandManager.literal("crimson_stem").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.crimson_stem);
                                })))
                                .then(CommandManager.literal("warped_stem").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.warped_stem);
                                })))
                                .then(CommandManager.literal("apple").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.apple);
                                })))
                                .then(CommandManager.literal("glowstone_dust").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.glowstone_dust);
                                })))
                                .then(CommandManager.literal("prismarine").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.prismarine);
                                })))
                                .then(CommandManager.literal("magma_block").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.magma_block);
                                })))
                                .then(CommandManager.literal("ice").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.ice);
                                })))
                                .then(CommandManager.literal("wool").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.wool);
                                })))
                                .then(CommandManager.literal("prismarine_bricks").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.prismarine_bricks);
                                })))
                                .then(CommandManager.literal("dark_prismarine").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.dark_prismarine);
                                })))
                                .then(CommandManager.literal("pufferfish").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.pufferfish);
                                })))
                                .then(CommandManager.literal("copper_ingot").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.copper_ingot);
                                })))
                                .then(CommandManager.literal("rabbit_hide").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.rabbit_hide);
                                })))
                                .then(CommandManager.literal("honey_bottle").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.honey_bottle);
                                })))
                                .then(CommandManager.literal("iron_ingot").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.iron_ingot);
                                })))
                                .then(CommandManager.literal("amethyst_shard").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.amethyst_shard);
                                })))
                                .then(CommandManager.literal("honeycomb").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.honeycomb);
                                })))
                                .then(CommandManager.literal("gunpowder").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.gunpowder);
                                })))
                                .then(CommandManager.literal("packed_ice").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.packed_ice);
                                })))
                                .then(CommandManager.literal("end_rod").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.end_rod);
                                })))
                                .then(CommandManager.literal("wind_charge").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.wind_charge);
                                })))
                                .then(CommandManager.literal("redstone").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.redstone);
                                })))
                                .then(CommandManager.literal("leather").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.leather);
                                })))
                                .then(CommandManager.literal("turtle_scute").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.turtle_scute);
                                })))
                                .then(CommandManager.literal("armadillo_scute").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.armadillo_scute);
                                })))
                                .then(CommandManager.literal("sea_lantern").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.sea_lantern);
                                })))
                                .then(CommandManager.literal("candle").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.candle);
                                })))
                                .then(CommandManager.literal("book").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.book);
                                })))
                                .then(CommandManager.literal("gold_ingot").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.gold_ingot);
                                })))
                                .then(CommandManager.literal("slime_ball").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.slime_ball);
                                })))
                                .then(CommandManager.literal("dragon_breath").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.dragon_breath);
                                })))
                                .then(CommandManager.literal("blue_ice").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.blue_ice);
                                })))
                                .then(CommandManager.literal("sponge").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.sponge);
                                })))
                                .then(CommandManager.literal("wet_sponge").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.wet_sponge);
                                })))
                                .then(CommandManager.literal("ender_pearl").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.ender_pearl);
                                })))
                                .then(CommandManager.literal("emerald").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.emerald);
                                })))
                                .then(CommandManager.literal("quartz").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.quartz);
                                })))
                                .then(CommandManager.literal("blaze_rod").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.blaze_rod);
                                })))
                                .then(CommandManager.literal("breeze_rod").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.breeze_rod);
                                })))
                                .then(CommandManager.literal("dragon_head").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.dragon_head);
                                })))
                                .then(CommandManager.literal("wither_skeleton_skull").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.wither_skeleton_skull);
                                })))
                                .then(CommandManager.literal("lapis_lazuli").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.lapis_lazuli);
                                })))
                                .then(CommandManager.literal("nautilus_shell").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.nautilus_shell);
                                })))
                                .then(CommandManager.literal("verdant_froglight").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.verdant_froglight);
                                })))
                                .then(CommandManager.literal("ochre_froglight").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.ochre_froglight);
                                })))
                                .then(CommandManager.literal("pearlescent_froglight").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.pearlescent_froglight);
                                })))
                                .then(CommandManager.literal("diamond").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.diamond);
                                })))
                                .then(CommandManager.literal("skeleton_skull").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.skeleton_skull);
                                })))
                                .then(CommandManager.literal("player_head").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.player_head);
                                })))
                                .then(CommandManager.literal("zombie_head").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.zombie_head);
                                })))
                                .then(CommandManager.literal("creeper_head").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.creeper_head);
                                })))
                                .then(CommandManager.literal("enchanted_golden_apple").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.enchanted_golden_apple);
                                })))
                                .then(CommandManager.literal("heart_of_the_sea").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.heart_of_the_sea);
                                })))
                                .then(CommandManager.literal("shulker_shell").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.shulker_shell);
                                })))
                                .then(CommandManager.literal("piglin_head").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.piglin_head);
                                })))
                                .then(CommandManager.literal("obsidian").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.obsidian);
                                })))
                                .then(CommandManager.literal("crying_obsidian").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.crying_obsidian);
                                })))
                                .then(CommandManager.literal("netherite_ingot").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.netherite_ingot);
                                })))
                                .then(CommandManager.literal("sculk").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.sculk);
                                })))
                                .then(CommandManager.literal("nether_star").executes((context -> {
                                    return getprice(context.getSource(), MrlShopItems.nether_star);
                                }))))));
    }

    public static int buy(ServerCommandSource source, MrlShopItem item, int count) {
        return Helpa.buy(source, item, count);
    }

    public static int sell(ServerCommandSource source, MrlShopItem item, int count) {
        return Helpa.sell(source, item, count);
    }

    public static int getprice(ServerCommandSource source, MrlShopItem item) {
        return Helpa.getprice(source, item);
    }
}