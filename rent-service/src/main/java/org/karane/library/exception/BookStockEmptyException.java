package org.karane.library.exception;

public class BookStockEmptyException extends RuntimeException {

    public BookStockEmptyException() {
        super();
    }

    public BookStockEmptyException(String message) {
        super(message);
    }

    public BookStockEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookStockEmptyException(Throwable cause) {
        super(cause);
    }
}
