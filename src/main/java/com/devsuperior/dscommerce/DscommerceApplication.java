package com.devsuperior.dscommerce;

import com.devsuperior.dscommerce.entities.Category;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DscommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DscommerceApplication.class, args);
		Category category1 = new Category();
		Category category2 = new Category();
		System.out.println(category1.equals(category2));
	}

}
