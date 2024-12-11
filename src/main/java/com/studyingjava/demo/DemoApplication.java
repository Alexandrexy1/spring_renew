package com.studyingjava.demo;

import com.studyingjava.demo.entities.Order;
import com.studyingjava.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Order code: ");
		int code = sc.nextInt();
		System.out.print("Order price: ");
		double price = sc.nextDouble();
		System.out.print("Order discount: ");
		double discount = sc.nextDouble();

		Order order = new Order(code, price, discount);

		System.out.println("Order code: " + order.getCode());
		System.out.println("Total price: R$ " + orderService.total(order));
		sc.close();
	}
}
