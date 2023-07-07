package com.restapi.codecase.service;

import com.restapi.codecase.model.ProductModel;
import com.restapi.codecase.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductModel createProduct(ProductModel product) {
        return productRepository.save(product);
    }

    public List<ProductModel> getProduct() {
        return productRepository.findAll();
    }

    public ProductModel updateProduct(Long productId, ProductModel productDetails) {
        ProductModel product = productRepository.findById(productId).get();
        product.setProductName(productDetails.getProductName());
        product.setProductMark(productDetails.getProductMark());
        product.setProductPrice(productDetails.getProductPrice());

        return productRepository.save(product);
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

}
