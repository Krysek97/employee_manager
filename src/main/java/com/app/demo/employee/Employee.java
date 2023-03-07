package com.app.demo.employee;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "EMPLOYEE")
@Entity
@NoArgsConstructor
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private Long id;
    private String name;
    private String lastname;
    private boolean vacation;
    private LocalDate vacationDate;

}
