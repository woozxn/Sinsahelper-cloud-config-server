package com.ujm.scc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SccApplication {

	public static void main(String[] args) {
		SpringApplication.run(SccApplication.class, args);
	}

}
