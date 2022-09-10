package fr.neutronstars.aimcbot.api.event.module;


import fr.neutronstars.aimcbot.api.event.Event;
import fr.neutronstars.aimcbot.api.module.Module;

public abstract class ModuleEvent implements Event
{
    private final Module module;

    protected ModuleEvent(Module module)
    {
        this.module = module;
    }

    public Module module()
    {
        return this.module;
    }
}
