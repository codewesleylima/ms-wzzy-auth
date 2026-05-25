package com.wzzy.library.msauth.exception;

import com.wzzy.library.bfflibrary.exception.BaseServiceException;

public class TokenExpiredException extends BaseServiceException {
    public TokenExpiredException() {
        super("Token has expired", "TOKEN_EXPIRED", 401);
    }

    public TokenExpiredException(String message) {
        super(message, "TOKEN_EXPIRED", 401);
    }
}
