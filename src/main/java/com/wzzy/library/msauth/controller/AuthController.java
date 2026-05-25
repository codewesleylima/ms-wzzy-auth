package com.wzzy.library.msauth.controller;

import com.wzzy.library.bfflibrary.dto.ApiResponse;
import com.wzzy.library.msauth.dto.AuthResponse;
import com.wzzy.library.msauth.dto.LoginRequest;
import com.wzzy.library.msauth.dto.RefreshTokenRequest;
import com.wzzy.library.msauth.dto.RegisterRequest;
import com.wzzy.library.msauth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<AuthResponse>> register(@Valid @RequestBody RegisterRequest request) {
        // Implementation will be done by developer
        return null;
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<AuthResponse>> login(@Valid @RequestBody LoginRequest request) {
        // Implementation will be done by developer
        return null;
    }

    @PostMapping("/refresh-token")
    public ResponseEntity<ApiResponse<AuthResponse>> refreshToken(@Valid @RequestBody RefreshTokenRequest request) {
        // Implementation will be done by developer
        return null;
    }

    @PostMapping("/logout")
    public ResponseEntity<ApiResponse<Void>> logout(@RequestHeader("Authorization") String token) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/validate")
    public ResponseEntity<ApiResponse<Boolean>> validateToken(@RequestHeader("Authorization") String token) {
        // Implementation will be done by developer
        return null;
    }
}
