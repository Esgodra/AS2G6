package com.example.demoservicioproducto.Service;

import com.example.demoservicioproducto.dao.ProductoDao;
import com.example.demoservicioproducto.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{
@Autowired
    private ProductoDao productoDao;
    @Override
    @Transactional
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
            }
   @Override
    @Transactional
    public Producto findById(Long id) {
      return productoDao.findById(id).orElse(null);
    }
}
