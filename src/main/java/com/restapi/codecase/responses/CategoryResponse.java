package com.restapi.codecase.responses;

import com.restapi.codecase.model.CategoryModel;
import lombok.Data;

@Data
public class CategoryResponse {

    Long id;
    String categoryName;

    public CategoryResponse(CategoryModel categoryModel) {
        this.id = categoryModel.getId();
        this.categoryName = categoryModel.getCategoryName();
    }

}
