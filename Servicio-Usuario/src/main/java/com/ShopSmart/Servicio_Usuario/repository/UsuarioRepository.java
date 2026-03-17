package com.ShopSmart.Servicio_Usuario.repository;

import com.ShopSmart.Servicio_Usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // 1. Buscar por Run (Devuelve un Optional porque el Run debe ser único)
    Optional<Usuario> findByRun(String run);

    // 2. Buscar usuarios que contengan una cadena en su nombre (Ignora mayúsculas/minúsculas)
    List<Usuario> findByNombreContainingIgnoreCase(String nombre);

    // 3. Buscar usuarios por una edad específica
    List<Usuario> findByAge(Integer age);

    // 4. Buscar usuarios mayores a cierta edad
    List<Usuario> findByAgeGreaterThan(Integer age);
}