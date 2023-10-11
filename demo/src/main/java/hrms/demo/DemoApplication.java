package hrms.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@RestControllerAdvice
@EnableSwagger2
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.setProperty("org.apache.commons.logging.LogFactory","org.apache.commons.logging.impl.LogFactoryImpl");
		SpringApplication.run(DemoApplication.class, args);
	}
	 @Bean 
	 public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("hrms.demo;"))                                
	          .build();                                      
	    }
}
