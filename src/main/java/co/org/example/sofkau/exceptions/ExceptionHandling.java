package co.org.example.sofkau.exceptions;

public class ExceptionHandling extends AssertionError {


    public ExceptionHandling(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionHandling(String message) {
        super(message);
    }
}
