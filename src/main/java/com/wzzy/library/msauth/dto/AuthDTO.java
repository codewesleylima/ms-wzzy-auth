package com.wzzy.library.msauth.dto;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AuthDTO {

    @Id
    private UUID authenticationId;
    private String email;
    private String passwordHash;
    private String role;
    private String createdAt;
    private String updatedAt;
    private String isActive;
}