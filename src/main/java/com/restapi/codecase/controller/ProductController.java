package com.restapi.codecase.controller;

import com.restapi.codecase.model.ProductModel;
import com.restapi.codecase.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ProductModel createProduct(@RequestBody ProductModel product) {
        return productService.createProduct(product);
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<ProductModel> readProduct() {
        return productService.getProduct();
    }

    @RequestMapping(value = "/products/{productId}", method = RequestMethod.PUT)
    public ProductModel updateProduct(@PathVariable(value = "productId") Long productId, @RequestBody ProductModel productDetails) {
        return productService.updateProduct(productId, productDetails);
    }

    @RequestMapping(value = "/products/{productId}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable(value = "productId") Long productId) {
        productService.deleteProduct(productId);
    }

}
