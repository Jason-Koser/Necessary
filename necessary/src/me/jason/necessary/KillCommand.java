package me.jason.necessary;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.Location;

public class KillCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player jason = (Player) commandSender;
            if (!jason.getName().equals("BluBerryMufin")) {
                return false;
            }
            if (args.length > 0) {
                Player player = Bukkit.getPlayer(args[1]);
                if (player == null) {
                    commandSender.sendMessage("Invalid player name");
                    return false;
                }
                while (player.getHealth() > 0) {
                    player.getLocation().getWorld().strikeLightning(player.getLocation());
                }
            }
        }
        return true;
    }
}//end of class
