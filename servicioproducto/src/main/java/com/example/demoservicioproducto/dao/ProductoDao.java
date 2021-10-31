package com.example.demoservicioproducto.dao;

import com.example.demoservicioproducto.entity.Producto;
import org.springframework.data.repository.CrudRepository;
//se injetc por defecto
public interface ProductoDao extends CrudRepository<Producto,Long > {
}
