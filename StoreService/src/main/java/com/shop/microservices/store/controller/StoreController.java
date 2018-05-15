package com.shop.microservices.store.controller;

import com.shop.microservices.store.model.Product;
import com.shop.microservices.store.model.ProductSearchRequest;
import com.shop.microservices.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/v1/products")
    public List<Product> findAll() {
        return storeService.findAll();
    }

    @GetMapping("/v1/product/{id}")
    public Product getById(@PathVariable int id) {
        return storeService.getById(id);
    }

    @PostMapping("/v1/product")
    public List<Product> findByName(@Valid @RequestBody ProductSearchRequest request) {
        return storeService.findByName(request.getText());
    }
}
