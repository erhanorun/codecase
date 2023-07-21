package com.restapi.codecase.requests;

import lombok.Data;

@Data
public class ProductCreateRequest {
    Long id;
    String productName;
    String productMark;
    double productPrice;
    Long categoryId;
}
