package fr.neutronstars.aimcbot.api.event;

import fr.neutronstars.aimcbot.api.module.Module;

public interface Events
{
    void register(Module module, Object... listeners);

    <T extends Event> T call(T event);
}
