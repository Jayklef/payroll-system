package com.jayklef.payrollsystem.repository;

import com.jayklef.payrollsystem.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
