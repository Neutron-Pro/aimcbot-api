package fr.neutronstars.aimcbot.api.command;

import fr.neutronstars.aimcbot.api.util.Promise;
import net.dv8tion.jda.api.entities.Guild;

import java.util.List;

public interface Commands
{
    List<Command> all();

    Promise<Command> of(String name);

    void register(Command command);

    void reload(Guild guild);
}
