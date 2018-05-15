package com.shop.microservices.store.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Product {
    private final int id;
    private final String name;
    private final int count;
}
