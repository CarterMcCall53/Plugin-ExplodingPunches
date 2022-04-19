package org.tartarsauce.explodingpunchesplugin;

import jdk.jfr.Event;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExplodingPunchesPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
