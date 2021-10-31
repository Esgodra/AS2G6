package com.example.demo1servicioitem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@RibbonClient(name = "servicio-producto")
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Demo1ServicioItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo1ServicioItemApplication.class, args);
    }

}
