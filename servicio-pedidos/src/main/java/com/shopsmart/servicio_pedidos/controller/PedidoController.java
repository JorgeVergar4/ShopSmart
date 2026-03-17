package com.shopsmart.servicio_pedidos.controller;

import com.shopsmart.servicio_pedidos.model.Pedido;
import com.shopsmart.servicio_pedidos.repository.PedidoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Se crean metodos de pedido

@Data
@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    // se obtiene la lista de todos los pedidos
    @GetMapping
    public List<Pedido> listar() {
        return repository.findAll();
    }

    // se crear o guardar un nuevo pedido
    @PostMapping
    public Pedido guardar(@RequestBody Pedido nuevoPedido) {
        return repository.save(nuevoPedido);
    }

    // se eliminar un pedido por su ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }

    // se borrar toda la tabla de pedidos
    @DeleteMapping("/all")
    public void borrarTodosLosPedidos() {
        repository.deleteAll();
    }
}