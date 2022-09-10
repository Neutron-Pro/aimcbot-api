package fr.neutronstars.aimcbot.api.listener;

import net.dv8tion.jda.api.events.GenericEvent;

import java.util.Set;

public interface Handlers
{
    Set<Handler<GenericEvent>> of(Class<? extends GenericEvent> clazz);

    void register(Handler<GenericEvent> abstractListener);
}
