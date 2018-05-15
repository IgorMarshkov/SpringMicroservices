package com.shop.microservices.shop.controller;

import com.shop.microservices.shop.client.StoreClient;
import com.shop.microservices.shop.model.Product;
import com.shop.microservices.shop.model.ProductSearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController(value = "shop")
public class ShopController {

    @Autowired
    private StoreClient storeClient;

    @PostMapping("/v1/product")
    public List<Product> findByName(@Valid @RequestBody ProductSearchRequest request) {
        return storeClient.findByName(request);
    }
}
