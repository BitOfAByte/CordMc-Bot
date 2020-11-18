package me.tobyhere123;

import me.tobyhere123.Listeners.readyEvent;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

public class Bot {

    public Bot() throws LoginException {
        JDABuilder builder = JDABuilder.createDefault(Config.get("token"));
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        builder.setBulkDeleteSplittingEnabled(false);
        builder.setActivity(Activity.watching("You"));
        builder.addEventListeners(new readyEvent());
        builder.build();
    }

    public static void main(String[] args) throws LoginException {
        new Bot();
    }
}
