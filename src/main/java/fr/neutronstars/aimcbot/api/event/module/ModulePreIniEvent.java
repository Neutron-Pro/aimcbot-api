package fr.neutronstars.aimcbot.api.event.module;

import fr.neutronstars.aimcbot.api.module.Module;

public class ModulePreIniEvent extends ModuleEvent
{
    public ModulePreIniEvent(Module module) {
        super(module);
    }
}
