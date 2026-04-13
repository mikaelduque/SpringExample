package com.senai.backend.controle_frequencia.repositeres;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.backend.controle_frequencia.models.Usuario;

public interface usuarioRepository extends JpaRepository <Usuario, Integer> {


    

}
