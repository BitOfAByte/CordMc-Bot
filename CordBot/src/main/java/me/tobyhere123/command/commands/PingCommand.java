package me.tobyhere123.command.commands;

import me.tobyhere123.command.CommandContext;
import me.tobyhere123.command.ICommand;
import net.dv8tion.jda.api.JDA;

public class PingCommand implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        ctx.getChannel().sendMessage("test").queue();
    }

    @Override
    public String getName() {
        return "ping";
    }
}