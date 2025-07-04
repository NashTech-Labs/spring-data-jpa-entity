package com.nashtech.techhub.repository;

import com.nashtech.techhub.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for Employee entity.
 * Extends JpaRepository to provide basic CRUD operations.
 * Includes custom queries for retrieving non-deleted (active) employees.
 */

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e WHERE e.isDeleted = false")
    List<Employee> findAllActive();

    @Query("SELECT e FROM Employee e WHERE e.id = :id AND e.isDeleted = false")
    Optional<Employee> findActiveById(Long id);
}
