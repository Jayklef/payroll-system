package com.jayklef.payrollsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private String address;
    private BigDecimal salary;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
