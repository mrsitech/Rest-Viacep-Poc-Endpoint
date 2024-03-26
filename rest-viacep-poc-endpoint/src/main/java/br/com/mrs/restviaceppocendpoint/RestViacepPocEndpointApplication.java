package br.com.mrs.restviaceppocendpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestViacepPocEndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestViacepPocEndpointApplication.class, args);
	}

}
