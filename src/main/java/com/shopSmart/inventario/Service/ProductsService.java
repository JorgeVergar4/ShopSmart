package com.shopSmart.inventario.Service;

import com.shopSmart.inventario.Model.ProductsModel;
import com.shopSmart.inventario.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository repository;

    public List<ProductsModel> getAllProducts() {
        return repository.findAll();
    }

    public ProductsModel saveProduct(ProductsModel product) {
        return repository.save(product);
    }

    public ProductsModel getProductById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteProduct(Integer id) {
        repository.deleteById(id);
    }
}