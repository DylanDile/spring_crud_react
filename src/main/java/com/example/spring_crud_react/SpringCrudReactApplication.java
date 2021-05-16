package com.example.spring_crud_react;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringCrudReactApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCrudReactApplication.class, args);
    }

}
