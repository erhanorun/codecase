package com.restapi.codecase.requests;

import lombok.Data;

@Data
public class ProductUpdateRequest {

    String productName;
    String productMark;
    double productPrice;

}
