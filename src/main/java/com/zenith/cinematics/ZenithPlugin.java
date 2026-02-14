package com.zenith.cinematics;

import org.bukkit.plugin.java.JavaPlugin;

public class ZenithPlugin extends JavaPlugin {
    private static ZenithPlugin instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static ZenithPlugin getInstance() {
        return instance;
    }
}
