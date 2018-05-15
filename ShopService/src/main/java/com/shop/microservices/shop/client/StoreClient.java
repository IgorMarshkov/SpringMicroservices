package com.shop.microservices.shop.client;

import com.shop.microservices.shop.model.Product;
import com.shop.microservices.shop.model.ProductSearchRequest;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("store-service")
public interface StoreClient {

    @RequestMapping(method = RequestMethod.POST, value = "/v1/product")
    List<Product> findByName(@RequestBody ProductSearchRequest request);
}
