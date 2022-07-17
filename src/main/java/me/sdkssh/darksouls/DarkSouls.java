package me.sdkssh.darksouls;

import me.sdkssh.darksouls.events.DeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public class DarkSouls extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new DeathListener(), this);
        super.onEnable();
    }
}
