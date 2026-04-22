package com.senai.backend.controle_frequencia.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.controle_frequencia.models.Turma;
import com.senai.backend.controle_frequencia.repositeres.TurmaRepository;





@Service
public class TurmaService {
    
    @Autowired
    private TurmaRepository turmaRepository;

    public Long contarTurma() {
        return turmaRepository.count();
    }
    public Turma buscarTurma(Integer id) {
        return turmaRepository.findById(id).get();
    }
    public List<Turma>listaTurma(){
        return turmaRepository.findAll();
    }
    public Boolean deletarTurma(Integer id){
        if (turmaRepository.existsById(id)){
            turmaRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public Turma cadastrarTurma(Turma turma){
        return turmaRepository.save(turma);
    }
    public Turma atualizarTurma(Integer id, Turma turma){
        Turma TurmaRecuperado = buscarTurma(id);
            if (TurmaRecuperado !=null){
                TurmaRecuperado.setId(id);
            if (turma.getTurma()!= null) {
                TurmaRecuperado.setTurma(turma.getTurma());
            }
            if (turma.getTurma() != null) {
                TurmaRecuperado.setTurma(turma.getTurma());
            }
            return turmaRepository.save(TurmaRecuperado);
        }
         return null;
    
    }
            

}
