package com.restapi.codecase.controller;

import com.restapi.codecase.model.ProductModel;
import com.restapi.codecase.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    ProductService productService;

    public CategoryController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    public ProductModel createProduct(@RequestBody ProductModel product) {
        return productService.createProduct(product);
    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<ProductModel> readProduct() {
        return productService.getProduct();
    }

    @RequestMapping(value = "/categories/{categoryId}", method = RequestMethod.PUT)
    public ProductModel updateProduct(@PathVariable(value = "categoryId") Long productId, @RequestBody ProductModel productDetails) {
        return productService.updateProduct(productId, productDetails);
    }

    @RequestMapping(value = "/categories/{categoryId}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable(value = "categoryId") Long productId) {
        productService.deleteProduct(productId);
    }

}
