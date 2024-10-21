package de.npc.smellyaura;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SmellyAura extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Aura(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
