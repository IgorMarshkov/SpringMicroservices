package com.shop.microservices.store.service;

import com.shop.microservices.store.exceptions.ProductNotFoundException;
import com.shop.microservices.store.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private List<Product> productList;

    public StoreService() {
        productList = new ArrayList<>();
        productList.add(new Product(1, "Chocolate", 3));
        productList.add(new Product(2, "Cookies", 23));
        productList.add(new Product(3, "Milk", 7));
        productList.add(new Product(4, "Ice cream", 8));
        productList.add(new Product(5, "Fish", 33));
        productList.add(new Product(6, "Meat", 67));
        productList.add(new Product(7, "Apple", 1));
    }

    public List<Product> findAll() {
        return productList;
    }

    public Product getById(int id) {
        return productList.stream().filter(item -> item.getId() == id).findFirst()
                .orElseThrow(() -> new ProductNotFoundException(id));
    }


    public List<Product> findByName(String name) {
        return productList.stream().filter(item -> item.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}
