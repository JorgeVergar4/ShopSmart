package com.ShopSmart.Servicio_Usuario.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Usuarios")
public class Usuario {
    // Se crean atributos de usuario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String Run;
    private Integer age;
}