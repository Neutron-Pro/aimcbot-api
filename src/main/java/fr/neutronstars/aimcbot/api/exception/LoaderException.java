package fr.neutronstars.aimcbot.api.exception;

public class LoaderException extends Exception
{
    public LoaderException()
    {
        super();
    }

    public LoaderException(String message)
    {
        super(message);
    }

    public LoaderException(Throwable throwable)
    {
        super(throwable);
    }

    public LoaderException(String message, Throwable throwable)
    {
        super(message, throwable);
    }

    public LoaderException(
        String message,
        Throwable throwable,
        boolean fillStackTrace,
        boolean keepSuppressedException
    ) {
        super(message, throwable, fillStackTrace, keepSuppressedException);
    }
}
