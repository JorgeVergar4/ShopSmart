package com.shopsmart.servicio_pedidos.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Pedidos") // Cambiado de Usuarios a Pedidos
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String producto;
    private Integer cantidad;
    private Double precioTotal;
}
