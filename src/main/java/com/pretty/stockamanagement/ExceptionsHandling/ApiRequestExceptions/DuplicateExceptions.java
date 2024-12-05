package com.pretty.stockamanagement.ExceptionsHandling.ApiRequestExceptions;

public class DuplicateExceptions extends RuntimeException{
    public DuplicateExceptions(){}
    public DuplicateExceptions(String message){
        super(message);
    }
}
