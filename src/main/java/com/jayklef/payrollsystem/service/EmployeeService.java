package com.jayklef.payrollsystem.service;

import com.jayklef.payrollsystem.dto.EmployeeRequest;
import com.jayklef.payrollsystem.dto.PayrollResponse;

public interface EmployeeService {

    PayrollResponse createEmployee(EmployeeRequest employeeRequest);
}
