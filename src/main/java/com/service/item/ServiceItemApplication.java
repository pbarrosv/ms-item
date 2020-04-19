package com.service.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "servicio-producto")
@EnableFeignClients
@SpringBootApplication
public class ServiceItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceItemApplication.class, args);
	}

}
