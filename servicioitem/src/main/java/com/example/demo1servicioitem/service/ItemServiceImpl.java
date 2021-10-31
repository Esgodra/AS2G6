package com.example.demo1servicioitem.service;

import com.example.demo1servicioitem.models.Item;
import com.example.demo1servicioitem.models.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service("serviceRestTemplate")

public class ItemServiceImpl implements ItemService {

    //se trae de la clase del proyecto principal
    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item> findAll() {
        List<Producto> productos = Arrays.asList(clienteRest.getForObject("http://localhost:9002/lista", Producto[].class));
        //convertir el objeto producto a item stream con lamda
        return productos.stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        return null;

    }

}
