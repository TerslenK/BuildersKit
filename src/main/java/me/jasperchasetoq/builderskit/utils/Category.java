package me.jasperchasetoq.builderskit.utils;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.jasperchasetoq.builderskit.BuildersKit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class Category {
    public static final ItemGroup MAIN = new ItemGroup(new NamespacedKey(BuildersKit.getAddon(),"builderskit_main"),new CustomItemStack(Material.GRASS_BLOCK, "&4Builders Kit"));

    public static void setup(BuildersKit bk){
        MAIN.register(bk);
    }
}
