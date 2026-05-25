package com.wzzy.library.msauth.exception;

import com.wzzy.library.bfflibrary.exception.BaseServiceException;

public class UserAlreadyExistsException extends BaseServiceException {
    public UserAlreadyExistsException(String field, String value) {
        super("User with " + field + " '" + value + "' already exists", "USER_ALREADY_EXISTS", 409);
    }
}
