package org.karane.library.exception;

public class BookDoesNotExistException extends RuntimeException {

    public BookDoesNotExistException() {
        super();
    }

    public BookDoesNotExistException(String message) {
        super(message);
    }

    public BookDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookDoesNotExistException(Throwable cause) {
        super(cause);
    }

}
