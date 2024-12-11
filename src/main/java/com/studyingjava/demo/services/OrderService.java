package com.studyingjava.demo.services;

import com.studyingjava.demo.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double total = order.getPrice() -
                (order.getPrice() * (order.getDiscount() / 100)) + shippingService.freight(order);
        return total;
    }
}
