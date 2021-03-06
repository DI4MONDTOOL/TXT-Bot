package com.DI4MONDTOOL.Commands;

import com.DI4MONDTOOL.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Borre on 29/01/2017.
 */
public class MemeCommand implements Command {
    public static String HELP ="USAGE: /meme";
    public Random r = new Random();

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        int maximum = (r.nextInt(3) + 1);

        try {
            event.getChannel().sendFile(new File("Assets/Meme" + maximum + ".jpg"), null).queue();
        } catch (IOException e1) {
            System.out.println("probably could not be found");
            e1.printStackTrace();

        }

    }

    @Override
    public String help() {

        final String help = "The " + "**/meme**" + " command shows a random meme!";
        return help;
    }

    @Override
    public void executed(boolean succes, MessageReceivedEvent event) {
        return;
    }
}
