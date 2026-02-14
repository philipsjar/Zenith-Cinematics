package com.zenith.cinematics;
import com.zenith.cinematics.camera.CameraCommand;
import org.bukkit.plugin.java.JavaPlugin;
public class ZenithPlugin extends JavaPlugin {
    private static ZenithPlugin instance;
    @Override
    public void onEnable() {
        instance = this;
        getCommand("cinematic").setExecutor(new CameraCommand());
    }
    public static ZenithPlugin getInstance() { return instance; }
}
