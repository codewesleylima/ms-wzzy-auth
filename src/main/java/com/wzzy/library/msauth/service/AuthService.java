package com.wzzy.library.msauth.service;

import com.wzzy.library.msauth.dto.AuthResponse;
import com.wzzy.library.msauth.dto.LoginRequest;
import com.wzzy.library.msauth.dto.RefreshTokenRequest;
import com.wzzy.library.msauth.dto.RegisterRequest;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
    AuthResponse refreshToken(RefreshTokenRequest request);
    void logout(String userId);
    boolean validateToken(String token);
}
