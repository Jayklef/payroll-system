package com.jayklef.payrollsystem.repository;

import com.jayklef.payrollsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
