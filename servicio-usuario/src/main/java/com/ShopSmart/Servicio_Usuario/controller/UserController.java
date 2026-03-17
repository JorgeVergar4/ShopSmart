package com.ShopSmart.Servicio_Usuario.controller;

import com.ShopSmart.Servicio_Usuario.model.Usuario;
import com.ShopSmart.Servicio_Usuario.repository.UsuarioRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Se crean metodos de usuario

@Data
@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UsuarioRepository repository;

    // se obtiene la lista de todos los usuarios
    @GetMapping
    public List<Usuario> listar() {
        return repository.findAll();
    }

    // se crear o guardar un nuevo usuario
    @PostMapping
    public Usuario guardar(@RequestBody Usuario nuevoUsuario) {
        return repository.save(nuevoUsuario);
    }

    // se eliminar un usuario por su ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }

    // se borrar toda la tabla de usuarios
    @DeleteMapping("/all")
    public void borrarTodosLosUsuarios() {
        repository.deleteAll();
    }
}