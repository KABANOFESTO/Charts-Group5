package com.commerce.sales;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.commerce.sales.models"})
@EnableJpaRepositories(basePackages = {"com.commerce.sales.repositories"})
class SalesApplicationTests {

	@Test
	void contextLoads() {
	}

}
