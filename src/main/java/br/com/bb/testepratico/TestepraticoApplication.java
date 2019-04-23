package br.com.bb.testepratico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"br.com.bb.testepratico"})
public class TestepraticoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestepraticoApplication.class, args);
	}

}
