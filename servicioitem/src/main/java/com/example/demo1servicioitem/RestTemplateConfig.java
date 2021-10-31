package com.example.demo1servicioitem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean("clienteRest")
    RestTemplate registrarRestTemplate() {
        return new RestTemplate();
    }
}
