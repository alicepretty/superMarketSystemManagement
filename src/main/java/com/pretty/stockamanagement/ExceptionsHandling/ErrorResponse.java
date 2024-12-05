package com.pretty.stockamanagement.ExceptionsHandling;

import java.time.LocalDateTime;

public class ErrorResponse {
    private String message;
     LocalDateTime timestamp;
    private String errorCode;
    private String errorDetails;

    public ErrorResponse(String message, String errorCode) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.errorCode = errorCode;
        this.errorDetails = errorDetails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }
}

