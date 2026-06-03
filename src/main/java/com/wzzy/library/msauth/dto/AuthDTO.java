package com.wzzy.library.msauth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthDTO {

    private UUID authenticationIdDTO;
    private String emailDTO;
    private String passwordHashDTO;
    private String roleDTO;
    private String createdAtDTO;
    private String updatedAtDTO;
    private String isActiveDTO;
}