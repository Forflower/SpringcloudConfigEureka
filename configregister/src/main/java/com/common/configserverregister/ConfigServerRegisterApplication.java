package com.common.configserverregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ConfigServerRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerRegisterApplication.class, args);
	}
}
