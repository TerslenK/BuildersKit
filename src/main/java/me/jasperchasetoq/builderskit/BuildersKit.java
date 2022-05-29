package me.jasperchasetoq.builderskit;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;

import me.jasperchasetoq.builderskit.utils.Setup;

import org.bukkit.plugin.java.JavaPlugin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BuildersKit extends JavaPlugin implements SlimefunAddon {
    private static BuildersKit addon;

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example

            //Right now this addon isn't public
            return;
        }

        setAddon(this);
        Setup.setup(this);
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
    public @NotNull JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }
    private static void setAddon(@Nullable BuildersKit pluginInstance) {
        addon = pluginInstance;
    }

    public static BuildersKit getAddon() {
        return addon;
    }
}


