package com.jayklef.payrollsystem.service.Impl;

import com.jayklef.payrollsystem.service.CategoryService;
import com.jayklef.payrollsystem.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;
}
