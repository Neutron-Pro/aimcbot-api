package fr.neutronstars.aimcbot.api.loader;

import fr.neutronstars.aimcbot.api.exception.LoaderException;
import fr.neutronstars.aimcbot.api.module.Module;

public interface Loaders
{
    Loaders withModule(Module module);
    Loader from(String packageName) throws LoaderException;
}