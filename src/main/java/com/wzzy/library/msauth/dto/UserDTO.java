package com.wzzy.library.msauth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long userIdDTO;
    private String emailDTO;
    private String roleDTO;
    private Boolean isActiveDTO;
    private LocalDateTime createdAtDTO;
    private LocalDateTime updatedAtDTO;
}
