package com.nashtech.techhub.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO used for creating or updating an Employee.
 * Includes validation constraints to ensure required fields are provided.
 */
@Getter
@Setter
public class EmployeeRequest {
    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Role is required")
    private String role;
}
