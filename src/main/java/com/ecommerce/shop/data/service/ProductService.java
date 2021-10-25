package com.ecommerce.shop.data.service;

import com.ecommerce.shop.data.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> findAll();

    Product getProduct(Long id);
    Product findById(Long id);
    void deleteById(Long id);

}
