package com.example.demoservicioproducto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
/*@ComponentScan(basePackages = {"com.example.demoservicioproducto"})*/
public class DemoServicioProductoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServicioProductoApplication.class, args);
    }

}
