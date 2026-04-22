package com.senai.backend.controle_frequencia.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nome")
    private int id;

    @Column(name ="nome")
    private String nome;

    @Column(name = "data_nascimento")
    private int data_nascimento;

    @Column(name = "email")
    private String email;

    public Aluno() {
    }

    public Aluno(int id, String nome, int data_nascimento, String email){
       this.id = id;
       this.nome = nome;
       this.data_nascimento = data_nascimento;
       this.email = email;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getData_nascimento() {
        return data_nascimento;
    }

}

