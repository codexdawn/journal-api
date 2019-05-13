package io.nestlet.journalapi.category.service.impl;

import io.nestlet.journalapi.category.domain.Category;
import io.nestlet.journalapi.category.repository.CategoryRepository;
import io.nestlet.journalapi.category.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}
