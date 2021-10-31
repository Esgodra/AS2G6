package com.example.demo1servicioitem.service;

import com.example.demo1servicioitem.Cliente.ProductoClientRest;
import com.example.demo1servicioitem.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("ServiceFeign")
@Primary
public class ItemServiceFeing implements ItemService{
    @Autowired
    private ProductoClientRest clienteFeign;
    @Override
    public List<Item> findAll()
    {
        return clienteFeign.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
    }


    @Override
    public Item findById(Long id, Integer cantidad){
        return null;
    }
}
