package com.rpfb.portal.Reform.Portal;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ReformPortalApplication {
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(ReformPortalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ReformPortalApplication.class, args);
	}

}
