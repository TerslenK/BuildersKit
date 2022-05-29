package me.jasperchasetoq.builderskit.implementations;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.jasperchasetoq.builderskit.BuildersKit;
import me.jasperchasetoq.builderskit.implementations.items.BuildersBlock;
import me.jasperchasetoq.builderskit.utils.Category;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class BuilderItems {
    public static SlimefunItemStack BB_DEEPSLATE_BRICKS = new SlimefunItemStack("BB_DEEPSLATE_BRICK", Material.DEEPSLATE_BRICKS, "&aBB Deepslate Bricks", "", "&7Builders block");
    public static SlimefunItemStack BB_DIAMOND_BLOCK = new SlimefunItemStack("BB_DIAMOND_BLOCK", Material.DIAMOND_BLOCK, "&aBB Diamond Block", "", "&7Builders block");
    public static SlimefunItemStack BB_GLOWSTONE = new SlimefunItemStack("BB_GLOWSTONE", Material.GLOWSTONE, "&aBB Glowstone", "", "&7Builders block");
    public static SlimefunItemStack BB_DEEPSLATE_BRICK_SLAB = new SlimefunItemStack("BB_DEEPSLATE_BRICK_SLAB", Material.DEEPSLATE_BRICK_SLAB, "&aBB Deepslate Brick Slab", "", "&7Builders block");
    public static SlimefunItemStack BB_DEEPSLATE_BRICK_WALL = new SlimefunItemStack("BB_DEEPSLATE_BRICK_WALL", Material.DEEPSLATE_BRICK_WALL, "&aBB Deepslate Brick Wall", "", "&7Builders block");
    public static SlimefunItemStack BB_DEEPSLATE_BRICK_STAIRS = new SlimefunItemStack("BB_DEEPSLATE_BRICK_STAIRS", Material.DEEPSLATE_BRICK_STAIRS, "&aBB Deepslate Brick Stairs", "", "&7Builders block");
    public static SlimefunItemStack BB_STONE_BRICK = new SlimefunItemStack("BB_STONE_BRICK", Material.STONE_BRICKS, "&aBB Stone Brick", "", "&7Builders block");


    public static void setup(BuildersKit bk) {
        new BuildersBlock(Category.MAIN, BB_DEEPSLATE_BRICK_SLAB, RecipeType.ENHANCED_CRAFTING_TABLE,new ItemStack[] {
                new ItemStack(Material.DEEPSLATE_BRICK_SLAB),    new ItemStack(Material.DEEPSLATE_BRICK_SLAB),                              new ItemStack(Material.DEEPSLATE_BRICK_SLAB),
                new ItemStack(Material.DEEPSLATE_BRICK_SLAB),    new ItemStack(Material.NETHER_STAR),                              new ItemStack(Material.DEEPSLATE_BRICK_SLAB),
                new ItemStack(Material.DEEPSLATE_BRICK_SLAB),    new ItemStack(Material.DEEPSLATE_BRICK_SLAB),                              new ItemStack(Material.DEEPSLATE_BRICK_SLAB),
        }).register(bk);
    }


    public static void setup(BuildersKit bk) {new BuildersBlock(Category.MAIN, BB_DEEPSLATE_BRICKS, RecipeType.ENHANCED_CRAFTING_TABLE,new ItemStack[] {
            new ItemStack(Material.DEEPSLATE_BRICKS),    new ItemStack(Material.DEEPSLATE_BRICKS),                              new ItemStack(Material.DEEPSLATE_BRICKS),
            new ItemStack(Material.DEEPSLATE_BRICKS),    new ItemStack(Material.NETHER_STAR),                              new ItemStack(Material.DEEPSLATE_BRICKS),
            new ItemStack(Material.DEEPSLATE_BRICKS),    new ItemStack(Material.DEEPSLATE_BRICKS),                              new ItemStack(Material.DEEPSLATE_BRICKS),
    },new CustomItemStack(BB_DEEPSLATE_BRICKS,16)
    ).register(bk);


        public static void setup(BuildersKit bk) {
            new BuildersBlock(Category.MAIN, BB_DEEPSLATE_BRICK_WALL, RecipeType.ENHANCED_CRAFTING_TABLE,new ItemStack[] {
                    new ItemStack(Material.DEEPSLATE_BRICK_WALL),    new ItemStack(Material.DEEPSLATE_BRICK_WALL),                              new ItemStack(Material.DEEPSLATE_BRICK_WALL),
                    new ItemStack(Material.DEEPSLATE_BRICK_WALL),    new ItemStack(Material.NETHER_STAR),                              new ItemStack(Material.DEEPSLATE_BRICK_WALL),
                    new ItemStack(Material.DEEPSLATE_BRICK_WALL),    new ItemStack(Material.DEEPSLATE_BRICK_WALL),                              new ItemStack(Material.DEEPSLATE_BRICK_WALL),
            }).register(bk);
        }
    }
    public static void setup(BuildersKit bk) {
        new BuildersBlock(Category.MAIN, BB_DEEPSLATE_BRICKS, RecipeType.ENHANCED_CRAFTING_TABLE,new ItemStack[] {
                new ItemStack(Material.DEEPSLATE_BRICKS),    new ItemStack(Material.DEEPSLATE_BRICKS),                              new ItemStack(Material.DEEPSLATE_BRICKS),
                new ItemStack(Material.DEEPSLATE_BRICKS),    new ItemStack(Material.NETHER_STAR),                              new ItemStack(Material.DEEPSLATE_BRICKS),
                new ItemStack(Material.DEEPSLATE_BRICKS),    new ItemStack(Material.DEEPSLATE_BRICKS),                              new ItemStack(Material.DEEPSLATE_BRICKS),
        }).register(bk);

        new BuildersBlock(Category.MAIN, BB_DIAMOND_BLOCK, RecipeType.ENHANCED_CRAFTING_TABLE,new ItemStack[] {
                new ItemStack(Material.DIAMOND_BLOCK),    new ItemStack(Material.DIAMOND_BLOCK),                              new ItemStack(Material.DIAMOND_BLOCK),
                new ItemStack(Material.DIAMOND_BLOCK),    new ItemStack(Material.NETHER_STAR),                              new ItemStack(Material.DIAMOND_BLOCK),
                new ItemStack(Material.DIAMOND_BLOCK),    new ItemStack(Material.DIAMOND_BLOCK),                              new ItemStack(Material.DIAMOND_BLOCK),
        }).register(bk);
    }

}
