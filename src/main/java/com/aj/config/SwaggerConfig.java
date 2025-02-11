package com.aj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket apiDoc() {
		return new Docket(DocumentationType.SWAGGER_12)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.aj.rest"))
				.paths(PathSelectors.any())//for all methods documentaion wiill generated
				.build();
		
	}
}
