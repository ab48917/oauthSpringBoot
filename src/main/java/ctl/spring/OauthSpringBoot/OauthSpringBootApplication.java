package ctl.spring.OauthSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ctl.spring")
public class OauthSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthSpringBootApplication.class, args);
	}
}
