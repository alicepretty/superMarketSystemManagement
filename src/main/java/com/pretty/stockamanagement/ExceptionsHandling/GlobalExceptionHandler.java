package com.pretty.stockamanagement.ExceptionsHandling;

import com.pretty.stockamanagement.ExceptionsHandling.ApiRequestExceptions.DuplicateExceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice

public class GlobalExceptionHandler {
    @ExceptionHandler(DuplicateExceptions.class)
    public ResponseEntity<ErrorResponse> DuplicateExceptionsHandler(DuplicateExceptions dexp , WebRequest WebRequest){

        ErrorResponse errorResponse = new ErrorResponse(
                dexp.getMessage(),
                WebRequest.getDescription(false)
        );


        return new ResponseEntity<>(errorResponse , HttpStatus.CONFLICT);
    }

}
