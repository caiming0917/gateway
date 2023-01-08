package org.caijuan.productservice.controller;

import org.caijuan.productservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductController {

    @GetMapping("/get-product")
    public Product getProduct() {
        return new Product(10001L, "火锅底料", 20);
    }
}
