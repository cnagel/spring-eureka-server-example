package cnagel.spring_eureka_server_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@EnableAutoConfiguration
@EnableEurekaServer
public class EurekaServerApp {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp.class, args);
	}

}