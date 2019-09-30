package cn.lingyuncraft.laterrestart.manage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandHandler implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("LaterRestart")) {
            try {
                cn.lingyuncraft.laterrestart.feature.GetPlayer.getStart(Integer.parseInt(args[0]));
                sender.sendMessage("设置成功！");
                return true;
            } catch (ClassCastException | ArrayIndexOutOfBoundsException e) {
                sender.sendMessage("请输入正确的参数");
                return false;
            }
        }
        return false;
    }
}
