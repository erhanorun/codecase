package com.restapi.codecase.controller;

import com.restapi.codecase.model.CategoryModel;
import com.restapi.codecase.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    public CategoryModel createCategory(@RequestBody CategoryModel category) {
        return categoryService.createCategory(category);
    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<CategoryModel> readCategory() {
        return categoryService.getCategory();
    }

    @RequestMapping(value = "/categories/{categoryId}", method = RequestMethod.PUT)
    public CategoryModel updateCategory(@PathVariable(value = "categoryId") Long categoryId, @RequestBody CategoryModel categoryDetails) {
        return categoryService.updateCategory(categoryId, categoryDetails);
    }

    @RequestMapping(value = "/categories/{categoryId}", method = RequestMethod.DELETE)
    public void deleteCategory(@PathVariable(value = "categoryId") Long categoryId) {
        categoryService.deleteCategory(categoryId);
    }

}
