package me.jasperchasetoq.builderskit;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
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

        BuildersBlock DEEPSLATE_BRICKS = new BuildersBlock(itemGroup, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        DEEPSLATE_BRICKS.register(this);

    }

    public class BuildersBlock extends SlimefunItem {

        public BuildersBlock(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
            super(itemGroup, item, recipeType, recipe);
        }

        @Override
        public void preRegister() {
            BlockUseHandler blockUseHandler = this::onBlockRightClick;
            addItemHandler(blockUseHandler);
        }

        private void onBlockRightClick(PlayerRightClickEvent event) {

        }


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


