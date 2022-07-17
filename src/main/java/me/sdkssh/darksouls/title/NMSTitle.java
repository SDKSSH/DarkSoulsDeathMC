package me.sdkssh.darksouls.title;

import org.bukkit.entity.Player;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static me.sdkssh.darksouls.utils.Reflections.*;

public class NMSTitle {
    public static void sendTitle(Player p, String title, int fdit, int st, int fdot){
        try {
            Object chatTitle = getMinecraftClass("IChatBaseComponent").getDeclaredClasses()[0].getMethod("a", String.class)
                    .invoke(null, "{\"text\": \"" + title + "\"}");
            Constructor<?> titleConstructor = getMinecraftClass("PacketPlayOutTitle").getConstructor(
                    getMinecraftClass("PacketPlayOutTitle").getDeclaredClasses()[0], getMinecraftClass("IChatBaseComponent"),
                    int.class, int.class, int.class);
            Object packet = titleConstructor.newInstance(
                    getMinecraftClass("PacketPlayOutTitle").getDeclaredClasses()[0].getField("TITLE").get(null), chatTitle,
                    fdit, st, fdot);
            sendPacket(p,packet);
        } catch (NoSuchMethodException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
