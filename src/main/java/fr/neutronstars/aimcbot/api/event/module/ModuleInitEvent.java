package fr.neutronstars.aimcbot.api.event.module;

import fr.neutronstars.aimcbot.api.module.Module;

public class ModuleInitEvent extends ModuleEvent
{
    public ModuleInitEvent(Module module)
    {
        super(module);
    }
}
