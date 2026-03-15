package com.shopSmart.inventario.controller;

import com.shopSmart.inventario.model.Producto;
import com.shopSmart.inventario.repository.ProductoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoRepository repository;

    @GetMapping
    public List<Producto> listar(){
        return repository.findAll();
    }
    @PostMapping
    public Producto guardar(@RequestBody Producto nuevoProducto) {
        return repository.save(nuevoProducto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
    @DeleteMapping("/all")
    public void borrarElInventario(){
        repository.deleteAll();
    }
}
