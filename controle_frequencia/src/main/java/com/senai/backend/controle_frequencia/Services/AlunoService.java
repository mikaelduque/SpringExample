package com.senai.backend.controle_frequencia.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.controle_frequencia.models.Aluno;
import com.senai.backend.controle_frequencia.repositeres.alunoRepository;

@Service
public class AlunoService {

    @Autowired
    private alunoRepository alunoRepository;

    public Long contarAluno() {
        return alunoRepository.count();
    }

     public Aluno buscarAluno(Integer id){
        return alunoRepository.findById(id).get();
    } 

    public List<Aluno> listaraluno(){
        return alunoRepository.findAll();
    }

    public Boolean deletaraAluno(Integer id){
        if (alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public  Aluno cadastrarAluno(Aluno aluno ){
        return alunoRepository.save(aluno);
    }

    public Aluno atualizarAluno(Integer id, Aluno aluno){
       Aluno alunoRecuperada = buscarAluno(id);
        if (alunoRepository != null) {
            alunoRecuperada.setId(id);
            if(aluno.getNome()!=null){
                alunoRecuperada.setNome(aluno.getNome());
            }
            return alunoRepository.save(alunoRecuperada);
        }
        return null;
    }


   
}
