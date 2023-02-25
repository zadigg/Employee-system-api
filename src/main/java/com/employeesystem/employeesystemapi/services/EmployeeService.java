package com.employeesystem.employeesystemapi.services;

import com.employeesystem.employeesystemapi.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
