package fr.neutronstars.aimcbot.api.loader;

import fr.neutronstars.aimcbot.api.exception.LoaderException;

import java.lang.annotation.Annotation;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public interface Loader extends AutoCloseable
{
    Loader withInjectorObjects(Object... objects);

    Loader withDepth(int depth);

    <T> Loader load(String subPackage, Class<T> subType, Consumer<T> consumer) throws LoaderException;

    <T extends Annotation, E> Loader load(
        String subPackage,
        Class<T> annotationClazz,
        Class<E> subType,
        BiConsumer<T, Class<E>> consumer
    ) throws LoaderException;
}
