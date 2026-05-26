package com.wzzy.library.msauth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthEntity {

    @Id
    private UUID authenticationId;
    private String email;
    private String passwordHash;
    private String role;
    private String createdAt;
    private String updatedAt;
    private String isActive;
}
