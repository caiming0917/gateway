package org.caijuan.orderservice.controller;

import org.caijuan.orderservice.model.Order;
import org.caijuan.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class OrderController {

    @Resource
    private OrderService orderService;


    @GetMapping("/get-order")
    public Order getOrder() {
        return orderService.getOrder();
    }


}
