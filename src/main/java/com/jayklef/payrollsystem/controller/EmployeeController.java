package com.jayklef.payrollsystem.controller;

import com.jayklef.payrollsystem.dto.EmployeeRequest;
import com.jayklef.payrollsystem.dto.PayrollResponse;
import com.jayklef.payrollsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employees/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;

    }

    @PostMapping("employee")
    public PayrollResponse createEmployee(@RequestBody EmployeeRequest employeeRequest){
        return employeeService.createEmployee(employeeRequest);
    }


}
