package com.example.demo1servicioitem.Cliente;

import com.example.demo1servicioitem.models.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//url="localhost:8001"
@FeignClient(name="servicio-producto")

public interface ProductoClientRest {
@GetMapping("/lista")
List<Producto> listar();
}
