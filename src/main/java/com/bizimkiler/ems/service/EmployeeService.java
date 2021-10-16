package com.bizimkiler.ems.service;

import com.bizimkiler.ems.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    List<Employee> findByFirstName(String firstName);
    List<Employee> findByLastName(String lastName);
    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

}
