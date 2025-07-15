package com.data.session4_api.controller;

import com.data.session4_api.model.entity.Product;
import com.data.session4_api.model.entity.Products;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

public class ProductsController {
    private final List<Product> products = Arrays.asList(
            new Product(1l,"Laptop1","mo ta may tinh 1", 1500.0),
            new Product(2l,"Laptop2","mo ta may tinh 2", 1500.0),
            new Product(3l,"Laptop3","mo ta may tinh 3", 1500.0)
    );
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductsJson() {
        return products;
    }

    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Products getProductsXml() {
        return new Products(products);
    }
}
