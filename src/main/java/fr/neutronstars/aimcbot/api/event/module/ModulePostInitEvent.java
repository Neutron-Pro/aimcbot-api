package fr.neutronstars.aimcbot.api.event.module;

import fr.neutronstars.aimcbot.api.module.Module;

public class ModulePostInitEvent extends ModuleEvent
{
    public ModulePostInitEvent(Module module) {
        super(module);
    }
}
