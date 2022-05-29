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

    public static void setup(BuildersKit bk) {
        new BuildersBlock(Category.MAIN, BB_DEEPSLATE_BRICKS, RecipeType.ENHANCED_CRAFTING_TABLE,new ItemStack[] {
                new ItemStack(Material.DEEPSLATE_BRICKS),    new ItemStack(Material.DEEPSLATE_BRICKS),                              new ItemStack(Material.DEEPSLATE_BRICKS),
                new ItemStack(Material.DEEPSLATE_BRICKS),    new ItemStack(Material.NETHER_STAR),                              new ItemStack(Material.DEEPSLATE_BRICKS),
                new ItemStack(Material.DEEPSLATE_BRICKS),    new ItemStack(Material.DEEPSLATE_BRICKS),                              new ItemStack(Material.DEEPSLATE_BRICKS),
        }).register(bk);
    }
}
