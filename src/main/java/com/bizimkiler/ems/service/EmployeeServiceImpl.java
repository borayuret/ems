package com.bizimkiler.ems.service;

import com.bizimkiler.ems.entity.Employee;
import com.bizimkiler.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> findByFirstName(String firstName) {
        return employeeRepository.findByFirstName(firstName);
    }

    @Override
    public List<Employee> findByLastName(String lastName) {
        return employeeRepository.findByLastName(lastName);
    }

    @Override
    public List<Employee> findByFirstNameAndLastName(String firstName, String lastName) {
        return employeeRepository.findByFirstNameAndLastName(firstName, lastName);
    }
}
