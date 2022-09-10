package fr.neutronstars.aimcbot.api.listener;

import fr.neutronstars.aimcbot.api.AimCBot;
import net.dv8tion.jda.api.events.GenericEvent;

public abstract class Handler<T extends GenericEvent>
{
    protected final AimCBot aimCBot;
    private final Class<T> type;

    protected Handler(AimCBot aimCBot, Class<T> type)
    {
        this.aimCBot = aimCBot;
        this.type = type;
    }

    public final Class<T> type()
    {
        return this.type;
    }

    public abstract void on(T event);
}
