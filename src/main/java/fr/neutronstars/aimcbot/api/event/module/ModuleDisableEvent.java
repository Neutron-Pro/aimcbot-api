package fr.neutronstars.aimcbot.api.event.module;

import fr.neutronstars.aimcbot.api.module.Module;

public class ModuleDisableEvent extends ModuleEvent
{
    public ModuleDisableEvent(Module module)
    {
        super(module);
    }
}
