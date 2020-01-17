package me.jason.necessary;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Necessary extends JavaPlugin {
    @Override
    public void onEnable() {
        super.onEnable();
        getCommand("smite").setExecutor(new KillCommand());
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("BluBerryMufin");
        } else {
            if (args[0].equals("er")) {
                sender.sendMessage("DrDonutMcBacon");
            }
            if (args[0].equals("est")) {
                sender.sendMessage("BluBerryMufin");
            }
        }
        return true;
    }
}
