package com.nashtech.techhub.services;

import com.nashtech.techhub.dto.EmployeeRequest;
import com.nashtech.techhub.dto.EmployeeResponse;

import java.util.List;

/*
* EmployeeService provides interfaces for managing the methods
*/
public interface EmployeeService {

    List<EmployeeResponse> getAllActiveEmployees();
    EmployeeResponse createEmployee(EmployeeRequest request);
    EmployeeResponse updateEmployee(Long id, EmployeeRequest request);
    void softDelete(Long id);
}
