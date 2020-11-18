package me.tobyhere123.Listeners;


import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class readyEvent extends ListenerAdapter {

    private final Logger LOGGER = LoggerFactory.getLogger(readyEvent.class);

    @Override
    public void onReady(@NotNull ReadyEvent event) {

        LOGGER.info("{} is online ", event.getJDA().getSelfUser().getAsTag());
    }
}
