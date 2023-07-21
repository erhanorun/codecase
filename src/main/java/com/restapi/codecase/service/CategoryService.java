package com.restapi.codecase.service;

import com.restapi.codecase.model.CategoryModel;
import com.restapi.codecase.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryModel createCategory(CategoryModel category) {
        return categoryRepository.save(category);
    }

    public List<CategoryModel> getCategory() {
        return categoryRepository.findAll();
    }

    public CategoryModel updateCategory(Long categoryId, CategoryModel categoryDetails) {
        CategoryModel category = categoryRepository.findById(categoryId).get();
        category.setCategoryName(categoryDetails.getCategoryName());

        return categoryRepository.save(category);
    }

    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }

}
