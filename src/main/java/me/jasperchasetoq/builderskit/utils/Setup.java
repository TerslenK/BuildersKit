package me.jasperchasetoq.builderskit.utils;

import me.jasperchasetoq.builderskit.BuildersKit;
import me.jasperchasetoq.builderskit.implementations.BuilderItems;

public class Setup {
    public static void setup(BuildersKit bk) {
        BuilderItems.setup(bk);
        Category.setup(bk);
    }
}
