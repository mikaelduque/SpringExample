package com.senai.backend.controle_frequencia.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.controle_frequencia.repositeres.TurmaRepository;
import




@Service
public class TurmaServices {
    @Autowired
    
    private TurmaRepository turmaRepository;
    public Long contarTurma() {
        return TurmaRepository.count();
    }
    public Turma buscarTurma(Integer id) {
        return TurmaRepository.finById(id).get();
    }
    public List<Turma>listaTurma(){
        return TurmaRepository.findAII();
    }
    public Boolean deletarTurma(Integer id){
        if (TurmaRepository.existsById(id)){
            turmaRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public Turma cadastrarTurma(Turma turma){
        return turmaRepository.save(turma);

    public Turma atualizarTurma(Integer id, Turma turma){
        Turma TurmaRecuperado = buscarTurma(id);
            if (turmaRecuperada !=null){
            turmaRecuperado.setId(id);
            if (turma.getNome()!= null)}{
                turmaRecuperado.setNome(turma.getNome());
            }
            return TurmaRepository.save(turmaRecuperada);
        }
         return null;
    
    }
            

}

            
        


    

