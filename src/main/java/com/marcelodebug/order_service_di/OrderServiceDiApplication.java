package com.marcelodebug.order_service_di;

import com.marcelodebug.order_service_di.entities.Order;
import com.marcelodebug.order_service_di.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class OrderServiceDiApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceDiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you order information");
		System.out.print("Code: ");
		Integer code = sc.nextInt();
		System.out.print("Basic: ");
		Double basic = sc.nextDouble();
		System.out.print("Discount: ");
		Double discount = sc.nextDouble();
		Order order = new Order(code, basic, discount);

		System.out.println("Order code " + order.getCode());
		System.out.println("Total value: R$" + String.format("%.2f", orderService.total(order)));
	}
}
