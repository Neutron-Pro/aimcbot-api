package fr.neutronstars.aimcbot.api.module;

import fr.neutronstars.aimcbot.api.AimCBot;
import org.slf4j.Logger;

public class AbstractModule implements Module
{
    private final AimCBot aimCBot;
    private final String version;
    private final Logger logger;
    private final String name;

    protected AbstractModule(AimCBot aimCBot, Logger logger, String name, String version)
    {
        this.aimCBot = aimCBot;
        this.version = version;
        this.logger = logger;
        this.name = name;
    }

    @Override
    public AimCBot aimcbot()
    {
        return this.aimCBot;
    }

    @Override
    public String name()
    {
        return this.name;
    }

    @Override
    public String version()
    {
        return this.version;
    }

    @Override
    public Logger logger()
    {
        return this.logger;
    }
}
