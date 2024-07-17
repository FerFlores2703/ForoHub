package com.forohub.repository;

import com.forohub.Desafio3ForoAlura.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}