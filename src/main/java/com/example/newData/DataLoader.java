package com.example.newData;

import com.example.newData.entity.Employee;
import com.example.newData.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public DataLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Load data into the employee table
        Employee employee1 = new Employee("John Doe");
        Employee employee2 = new Employee("Jane Smith");

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
    }
}
