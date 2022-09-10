package fr.neutronstars.aimcbot.api.event;

import fr.neutronstars.aimcbot.api.module.Module;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Listener {
    Class<? extends Module> module() default Module.class;
}
