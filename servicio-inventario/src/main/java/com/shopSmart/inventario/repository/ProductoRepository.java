package com.shopSmart.inventario.repository;

import com.shopSmart.inventario.model.Producto;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends JpaRepository <Producto, Long>{
}
