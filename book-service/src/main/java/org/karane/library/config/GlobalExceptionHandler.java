package org.karane.library.config;


import org.karane.library.exception.BookDoesNotExistException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BookDoesNotExistException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public Error handleBookDoesNotExist(BookDoesNotExistException exception){
        return new Error(exception.getMessage());
    }
}
