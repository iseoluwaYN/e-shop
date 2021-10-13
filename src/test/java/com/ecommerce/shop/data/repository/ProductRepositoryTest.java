package com.ecommerce.shop.data.repository;

import com.ecommerce.shop.data.model.Currency;
import com.ecommerce.shop.data.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Slf4j()
@Sql(scripts= {"/db/insert.sql"})
class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepositoryImpl;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void creatProductTest(){
        Product product = new Product();
        product.setName("Luxury Sofa");
        product.setPrice(4000D);
        product.setCurrency(Currency.NGN);
        product.setDetails("Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                " Ut enim ad minim veniam," +
                " quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
                " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
                " Excepteur sint occaecat cupidatat non proident, " +
                "sunt in culpa qui officia deserunt mollit anim id est laborum.");
        assertThat(product).isNotNull();
        assertThat(product.getId()).isNull();
        log.info("Product before saying ->{}", product);
        productRepositoryImpl.save(product);
        assertThat(product.getId()).isNotNull();
        log.info("Product after saying ->{}", product);
    }

    @Test
    @Transactional
    public void whenFindAllProductIsCalledTheProductListIsReturnedTest(){
        List<Product> product = productRepositoryImpl.findAll();
        assertThat(product).hasSize(4);
       log.info("Product returned from database ->{}", product);
    }
}