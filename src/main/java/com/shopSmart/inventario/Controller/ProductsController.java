package com.shopSmart.inventario.Controller;

import com.shopSmart.inventario.Model.ProductsModel;
import com.shopSmart.inventario.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products") // Ruta base para este controlador
public class ProductsController {

    @Autowired
    private ProductsService service;

    @GetMapping
    public List<ProductsModel> list() {
        return service.getAllProducts();
    }

    @PostMapping
    public ProductsModel create(@RequestBody ProductsModel product) {
        return service.saveProduct(product);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductsModel> get(@PathVariable Integer id) {
        ProductsModel product = service.getProductById(id);
        return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteProduct(id);
    }
}