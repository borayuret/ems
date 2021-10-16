package com.bizimkiler.ems.repository;

import com.bizimkiler.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository {

    List<Employee> findByFirstName(String firstName);
    List<Employee> findByLastName(String lastName);
    List<Employee> findByFirstNameAndLastName(String firstName, String lastName);
}
