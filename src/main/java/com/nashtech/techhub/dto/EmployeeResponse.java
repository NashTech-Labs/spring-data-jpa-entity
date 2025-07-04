package com.nashtech.techhub.dto;


import lombok.Data;

import java.time.LocalDateTime;

/**
 * DTO used to return employee information in API responses.
 * Includes basic details along with audit timestamps.
 */
@Data
public class EmployeeResponse {
    private Long id;
    private String name;
    private String role;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
}
