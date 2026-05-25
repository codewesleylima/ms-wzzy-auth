package com.wzzy.library.msauth.service;

import com.wzzy.library.bfflibrary.security.dto.TokenDTO;

public interface TokenService {
    TokenDTO generateAccessToken(String userId, String email);
    TokenDTO generateRefreshToken(String userId);
    boolean validateAccessToken(String token);
    boolean validateRefreshToken(String token);
    String extractUserIdFromToken(String token);
    String extractEmailFromToken(String token);
    long getTokenExpirationTime(String token);
}
