package me.tobyhere123.command;

import net.dv8tion.jda.api.JDA;

public class testCommand implements ICommand {

    @Override
    public void handle(CommandContext ctx) {
        ctx.getChannel().sendMessage("Test123123");
    }

    @Override
    public String getName() {
        return "test";
    }
}
