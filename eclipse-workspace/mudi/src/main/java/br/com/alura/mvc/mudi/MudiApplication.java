package br.com.alura.mvc.mudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan({"br.com.alura.mvc.mudi.controller"})
public class MudiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MudiApplication.class, args);
	}

}
