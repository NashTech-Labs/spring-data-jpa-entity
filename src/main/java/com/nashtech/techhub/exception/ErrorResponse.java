package com.nashtech.techhub.exception;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

/**
 * A standard structure for error responses sent to clients.
 * Contains detailed information about the exception and request context.
 */

@Getter
@Setter
public class ErrorResponse {

    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;

    public ErrorResponse(LocalDateTime timestamp, int status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }
}
