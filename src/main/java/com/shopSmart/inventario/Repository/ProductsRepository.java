package com.shopSmart.inventario.Repository;

import com.shopSmart.inventario.Model.ProductsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsModel, Integer> {
    // Aquí puedes añadir consultas personalizadas si las necesitas en el futuro
}
