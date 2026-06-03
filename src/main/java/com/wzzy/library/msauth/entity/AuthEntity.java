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
    private UUID authenticationIdEntity;
    private String emailEntity;
    private String passwordHashEntity;
    private String roleEntity;
    private String createdAtEntity;
    private String updatedAtEntity;
    private String isActiveEntity;
}
