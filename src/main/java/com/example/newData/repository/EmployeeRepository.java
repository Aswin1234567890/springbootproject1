package com.example.newData.repository;

import com.example.newData.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // No custom methods needed here, as JpaRepository provides basic CRUD operations
}
