package com.studyingjava.demo.services;

import com.studyingjava.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double freight(Order order) {
        if (order.getPrice() < 100)  return 20;
        else if (order.getPrice() >= 100 && order.getPrice() <= 199) return 12;
        else return 0;
    }
}
