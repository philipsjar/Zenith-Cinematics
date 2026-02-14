package com.zenith.cinematics.camera;
import com.zenith.cinematics.ZenithPlugin;
import com.zenith.cinematics.util.Interpolator;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;
import java.util.List;
public class ScenePlayer {
    public void play(Player player, List<Location> points, int durationTicks) {
        if (points.size() < 4) return;
        GameMode oldMode = player.getGameMode();
        player.setGameMode(GameMode.SPECTATOR);
        new BukkitRunnable() {
            int tick = 0;
            @Override
            public void run() {
                if (tick >= durationTicks || !player.isOnline()) {
                    player.setGameMode(oldMode);
                    this.cancel();
                    return;
                }
                double progress = (double) tick / durationTicks;
                double range = progress * (points.size() - 3);
                int i = (int) range;
                double t = range - i;
                Vector pos = Interpolator.catmullRom(points.get(i).toVector(), points.get(i+1).toVector(), points.get(i+2).toVector(), points.get(i+3).toVector(), t);
                player.teleport(pos.toLocation(player.getWorld()));
                tick++;
            }
        }.runTaskTimer(ZenithPlugin.getInstance(), 0L, 1L);
    }
}
