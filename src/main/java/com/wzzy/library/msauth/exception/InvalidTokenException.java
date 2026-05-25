package com.wzzy.library.msauth.exception;

import com.wzzy.library.bfflibrary.exception.BaseServiceException;

public class InvalidTokenException extends BaseServiceException {
    public InvalidTokenException() {
        super("Invalid token", "INVALID_TOKEN", 401);
    }

    public InvalidTokenException(String message) {
        super(message, "INVALID_TOKEN", 401);
    }
}
