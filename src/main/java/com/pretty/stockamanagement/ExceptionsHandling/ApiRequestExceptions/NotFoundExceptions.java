package com.pretty.stockamanagement.ExceptionsHandling.ApiRequestExceptions;

public class NotFoundExceptions extends RuntimeException{
    public NotFoundExceptions() {
    }
    public NotFoundExceptions(String message){
        super(message);
    }
}
