package fr.neutronstars.aimcbot.api.module;

import java.util.List;

public interface Modules
{
    List<Module> all();

    Module of(String name);
}
