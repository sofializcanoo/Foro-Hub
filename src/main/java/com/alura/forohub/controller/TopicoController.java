package com.alura.forohub.controller;

import com.alura.forohub.modelo.Topico;
import com.alura.forohub.repository.TopicoRepository;
import com.alura.forohub.dto.DatosRegistroTopico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    public void registrar(@RequestBody @Valid DatosRegistroTopico datos) {
        repository.save(new Topico(datos));
    }

    @GetMapping
    public List<Topico> listar() {
        return repository.findAll();
    }
}

