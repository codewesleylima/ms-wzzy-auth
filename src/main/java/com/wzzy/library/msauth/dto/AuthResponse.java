package com.wzzy.library.msauth.dto;

import com.wzzy.library.bfflibrary.security.dto.TokenDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String userId;
    private String email;
    private String username;
    private TokenDTO accessToken;
    private TokenDTO refreshToken;
    private String message;
}
