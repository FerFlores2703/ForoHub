package com.forohub.Desafio3ForoAlura.service;

import com.forohub.Desafio3ForoAlura.model.Topico;
import com.forohub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository repository;

    public Topico crear(Topico topico) {
        return repository.save(topico);
    }

    public List<Topico> listarTodos() {
        return repository.findAll();
    }

    public Optional<Topico> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Topico actualizar(Topico topico) {
        return repository.save(topico);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}