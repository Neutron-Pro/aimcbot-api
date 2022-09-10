package fr.neutronstars.aimcbot.api.util;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Promise<T>
{
    public static <T> Promise<T> of(T type)
    {
        return new Promise<>(type);
    }

    public static <T> Promise<T> empty()
    {
        return new Promise<>(null);
    }

    private final T type;

    private Consumer<Throwable> throwable;

    private Promise(T type)
    {
        this.type = type;
    }

    public T get()
    {
        return this.type;
    }

    public boolean isPresent()
    {
        return this.type != null;
    }

    public Promise<T> withCatch(Consumer<Throwable> throwable)
    {
        this.throwable = throwable;
        return this;
    }

    public Promise<T> filter(Predicate<T> predicate)
    {
        if (this.type != null && predicate.test(this.type)) {
            return this;
        }
        return Promise.empty();
    }

    public <E> Promise<E> map(Function<T, E> function)
    {
        if (this.type != null) {
            return Promise.of(function.apply(this.type));
        }
        return Promise.empty();
    }

    public Promise<T> then(Consumer<T> consumer)
    {
        try {
            if (this.type != null) {
                consumer.accept(this.type);
            }
        } catch (Throwable throwable) {
            this.throwable.accept(throwable);
        }
        return this;
    }

    public void nullable(Runnable runnable)
    {
        if (this.type == null) {
            runnable.run();
        }
    }
}
