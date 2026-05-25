package com.wzzy.library.msauth.exception;

import com.wzzy.library.bfflibrary.exception.BaseServiceException;

public class InvalidCredentialsException extends BaseServiceException {
    public InvalidCredentialsException() {
        super("Invalid email or password", "INVALID_CREDENTIALS", 401);
    }

    public InvalidCredentialsException(String message) {
        super(message, "INVALID_CREDENTIALS", 401);
    }
}
