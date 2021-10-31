package com.example.demo1servicioitem.service;

import com.example.demo1servicioitem.models.Item;

import java.util.List;

public interface ItemService {
    public List<Item> findAll();

    public Item findById(Long id, Integer cantidad);
}
