package com.bizimkiler.ems.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
//@Getter
//@Setter
@NoArgsConstructor
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name", length = 30, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 30, nullable = false)
    private String lastName;


    private String email;

    // constructor overloading

    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}


//Employee emp1 = new Employee("Bora", "Yüret", "bora@abc.com");
//
//Employee emp2 = new Employee();
//emp2.setFirstName("Bora");
//emp2.setLastName("Yüret");
//emp2.setEmail("bora@abc.com");
//
//Employee emp3 = new Employee("Bora", "Yüret");