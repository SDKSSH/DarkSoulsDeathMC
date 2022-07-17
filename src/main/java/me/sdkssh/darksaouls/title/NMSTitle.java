package me.sdkssh.darksaouls.title;

import org.bukkit.entity.Player;

import static me.sdkssh.darksaouls.utils.Reflections.*;

public class NMSTitle {
    public static void sendTitle(Player p, String title, int fdit, int st, int fdot){
        try {
            Object ct = getMinecraftClass("IChatBaseComponent").getDeclaredClasses()[0].getMethod("a", String.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
