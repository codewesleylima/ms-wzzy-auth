package com.wzzy.library.msauth.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userIdEntity;

    @Column(nullable = false, unique = true)
    private String emailEntity;

    @Column(nullable = false)
    private String passwordHashEntity;

    @Column(nullable = false)
    private String roleEntity;

    @Column(nullable = false)
    private Boolean isActiveEntity = true;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAtEntity = LocalDateTime.now();
}
