package com.senai.backend.controle_frequencia.repositeres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.controle_frequencia.models.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> {

}
