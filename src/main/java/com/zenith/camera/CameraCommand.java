package com.zenith.cinematics.camera;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import java.util.List;
public class CameraCommand implements CommandExecutor {
    private final List<Location> points = new ArrayList<>();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) return true;
        if (args.length == 0) return false;
        if (args[0].equalsIgnoreCase("add")) {
            points.add(player.getLocation());
            player.sendMessage("Point added.");
        } else if (args[0].equalsIgnoreCase("start")) {
            if (points.size() < 4) { player.sendMessage("Need 4 points."); return true; }
            new ScenePlayer().play(player, points, 200);
        } else if (args[0].equalsIgnoreCase("clear")) {
            points.clear();
            player.sendMessage("Cleared.");
        }
        return true;
    }
}
