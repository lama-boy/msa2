package msa.prj.msa2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class Msa2Application {

	public static void main(String[] args) {
		SpringApplication.run(Msa2Application.class, args);
	}

}
U