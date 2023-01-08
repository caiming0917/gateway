package org.caijuan.orderservice.service;

import org.caijuan.orderservice.model.Order;
import org.caijuan.orderservice.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class OrderService {

    @Resource
    private RestTemplate restTemplate;

    public Order getOrder() {
        String url = "http://localhost:7070/product/get-product";
        Product product = restTemplate.getForObject(url, Product.class);
        assert product != null;
        return new Order(1100L, 5, 5 * product.getPrice(), product);
    }
}