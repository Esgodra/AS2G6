package com.example.demoservicioproducto.Service;

import com.example.demoservicioproducto.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
    public Producto findById(Long id);
}
