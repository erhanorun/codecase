package com.restapi.codecase.responses;

import com.restapi.codecase.model.ProductModel;
import lombok.Data;

import java.util.List;

@Data
public class ProductResponse {

    Long id;
    Long categoryId;
    String productName;
    String productMark;
    double productPrice;

    public ProductResponse(ProductModel productModel) {
        this.id = productModel.getId();
        this.categoryId = productModel.getCategoryModel().getId();
        this.productName = productModel.getCategoryModel().getCategoryName();
        this.productMark = productModel.getProductMark();
        this.productPrice = productModel.getProductPrice();
    }

}
