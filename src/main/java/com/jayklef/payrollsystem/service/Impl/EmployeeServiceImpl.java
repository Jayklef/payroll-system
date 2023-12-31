package com.jayklef.payrollsystem.service.Impl;

import com.jayklef.payrollsystem.dto.EmailDetails;
import com.jayklef.payrollsystem.dto.EmployeeRequest;
import com.jayklef.payrollsystem.dto.PayrollResponse;
import com.jayklef.payrollsystem.dto.SalaryInfo;
import com.jayklef.payrollsystem.model.Employee;
import com.jayklef.payrollsystem.repository.CategoryRepository;
import com.jayklef.payrollsystem.repository.EmployeeRepository;
import com.jayklef.payrollsystem.service.EmailService;
import com.jayklef.payrollsystem.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private EmailService emailService;
    @Override
    public PayrollResponse createEmployee(EmployeeRequest employeeRequest) {

        Employee employee = Employee.builder()
                .firstname(employeeRequest.getFirstname())
                .lastname(employeeRequest.getLastname())
                .email(employeeRequest.getEmail())
                .address(employeeRequest.getAddress())
                .phoneNumber(employeeRequest.getPhoneNumber())
                .salary(employeeRequest.getSalary())
                .build();

        Employee newEmployee = employeeRepository.save(employee);

        EmailDetails emailDetails = EmailDetails.builder()
                .recipient(employee.getEmail())
                .subject("Account Opened Successfully")
                .message("You have been successfully created as an employee of XYZ")
                .build();
        emailService.sendEmail(emailDetails);

        return PayrollResponse.builder()
                .responseCode("")
                .responseMessage("")
                .salaryInfo(SalaryInfo.builder()
                        .employeeName(newEmployee.getFirstname()+ " "+ newEmployee.getLastname())
                        .salary(newEmployee.getSalary())
                        .build())
                .build();
    }
}
