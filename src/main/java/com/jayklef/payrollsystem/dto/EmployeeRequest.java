package com.jayklef.payrollsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class EmployeeRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private String address;
    private BigDecimal salary;
}
