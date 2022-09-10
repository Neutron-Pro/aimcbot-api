package fr.neutronstars.aimcbot.api.module;

import fr.neutronstars.aimcbot.api.AimCBot;
import org.slf4j.Logger;

public interface Module
{
    AimCBot aimcbot();

    String name();

    String version();

    Logger logger();
}
