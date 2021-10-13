package com.ecommerce.shop.data.service;

import com.ecommerce.shop.data.model.Product;
import com.ecommerce.shop.data.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceImplTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductService productServicesImpl;

    @BeforeEach
    void setUp() {
        productServicesImpl = new ProductServiceImpl();
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void saveProductMockTest(){

        Product product = new  Product();
        when(productServicesImpl.save(product)).thenReturn(product);
        productServicesImpl.save(product);
        verify(productRepository ,times(1)).save(product);
    }

}