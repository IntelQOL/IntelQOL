package intelqol.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.Slot;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.StringUtils;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;
import intelqol.Main;
import scala.actors.threadpool.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Rosedrobe implements ICommand {
    public static boolean openWardrobe = false;
    public static int slot = 0;
    int windowId;

    @Override
    public String getCommandName() {
        return "autodrobe";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/" + getCommandName();
    }

    @Override
    public List<String> getCommandAliases() {
        return new ArrayList<>();
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if (args.length == 0) {
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/pets");
            slot = 0;
            openWardrobe = true;
        } else {
            if (isNumeric(args[0])) {
                Minecraft.getMinecraft().thePlayer.sendChatMessage("/pets");
                openWardrobe = true;
                slot = Integer.parseInt(args[0]);
            } else {
                Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("§cInvalid Arguments."));
                return;
            }
        }
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

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public int compareTo(@NotNull ICommand o) {
        return 0;
    }
}
