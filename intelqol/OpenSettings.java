package intelqol;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OpenSettings implements ICommand {
    @Override
    public String getCommandName() {
        return "intelqol";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/" + getCommandName();
    }

    @Override
    public List<String> getCommandAliases() {
        return new ArrayList<>(Arrays.asList("intelqol", "qol"));
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        /*EntityPlayerSP player = (EntityPlayerSP) sender;
        player.addChatMessage(new ChatComponentText("hi "+player.getName()+"!"));*/
        Main.display = Main.configFile.gui();
        return;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        return new ArrayList<>();
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(@NotNull ICommand o) {
        return 0;
    }
}

