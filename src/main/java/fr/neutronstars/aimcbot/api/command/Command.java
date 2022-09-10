package fr.neutronstars.aimcbot.api.command;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.internal.interactions.CommandDataImpl;

public interface Command
{
    String name();

    String description();

    default CommandData data()
    {
        return new CommandDataImpl(this.name(), this.description());
    }

    void execute(SlashCommandInteractionEvent event);
}
