package fr.neutronstars.aimcbot.api;

import fr.neutronstars.aimcbot.api.command.Commands;
import fr.neutronstars.aimcbot.api.event.Events;
import fr.neutronstars.aimcbot.api.listener.Handlers;
import fr.neutronstars.aimcbot.api.loader.Loaders;
import fr.neutronstars.aimcbot.api.module.Modules;
import net.dv8tion.jda.api.JDA;
import org.slf4j.Logger;

public interface AimCBot
{
    Logger logger();

    JDA jda();

    String version();

    Handlers handlers();

    Commands commands();

    Loaders loaders();

    Modules modules();

    Events events();
}
