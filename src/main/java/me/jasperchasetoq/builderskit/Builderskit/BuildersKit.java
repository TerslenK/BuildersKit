package me.jasperchasetoq.builderskit.Builderskit;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class BuildersKit extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

        NamespacedKey categoryId = new NamespacedKey(this, "builderskit_category");
        CustomItemStack categoryItem = new CustomItemStack(Material.GRASS_BLOCK, "&4Builders Kit");

        ItemGroup itemGroup = new ItemGroup(categoryId, categoryItem);

        SlimefunItemStack itemStack = new SlimefunItemStack("MY_ADDON_ITEM", Material.DEEPSLATE_BRICKS, "&aBB Deepslate Bricks", "", "&7Builders block");

        ItemStack[] recipe = {
                new ItemStack(Material.DEEPSLATE_BRICKS),    new ItemStack(Material.DEEPSLATE_BRICKS),                              new ItemStack(Material.DEEPSLATE_BRICKS),
                new ItemStack(Material.DEEPSLATE_BRICKS),    new ItemStack(Material.NETHER_STAR),                              new ItemStack(Material.DEEPSLATE_BRICKS),
                new ItemStack(Material.DEEPSLATE_BRICKS),    new ItemStack(Material.DEEPSLATE_BRICKS),                              new ItemStack(Material.DEEPSLATE_BRICKS),
        };

        SlimefunItem sfItem = new SlimefunItem(itemGroup, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        sfItem.register(this);

    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }

}


