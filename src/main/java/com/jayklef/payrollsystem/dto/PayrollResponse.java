package com.jayklef.payrollsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayrollResponse {

    private String responseCode;
    private String responseMessage;
    private SalaryInfo salaryInfo;
}
