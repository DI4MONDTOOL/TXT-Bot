package me.nivyox.discord.Commands;

import me.nivyox.discord.Command;
import me.nivyox.discord.Main;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by Borre on 27/01/2017.
 */
public class HelpCommand implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if(event.isFromType(ChannelType.TEXT)){
            event.getChannel().sendMessage("All possible commands are: " + Main.commands.keySet()).queue();
        }else if (event.isFromType(ChannelType.PRIVATE)){
            event.getAuthor().getPrivateChannel().sendMessage("All possible commands are: " + Main.commands).queue();
        }
    }

    @Override
    public String help() {
        return null;
    }

    @Override
    public void executed(boolean succes, MessageReceivedEvent event) {
        return;
    }
}
