package com.jayklef.payrollsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SalaryInfo {

    private String employeeName;
    private String employeeCategory;
    private BigDecimal salary;
}
