package com.senai.backend.controle_frequencia.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.controle_frequencia.models.Usuario;
import com.senai.backend.controle_frequencia.repositeres.usuarioRepository;

@Service
public class usuarioservice {
    @Autowired
    private usuarioRepository usuarioRepository;

    public Long contarUsuario() {
        return usuarioRepository.count();
    }

    public Usuario buscarUsuario(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public List<Usuario> listarusuarios() {
        return usuarioRepository.findAll();
    }

    public Boolean deletarusuario(Integer id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;

    }

    public Usuario cadastUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario(Integer id, Usuario usuario) {
        Usuario usuarioRecuperado = buscarUsuario(id);
        if (usuarioRecuperado != null) {
            usuarioRecuperado.setId(id);
            if (usuario.getNome() != null) {

                usuarioRecuperado.setNome(usuario.getNome());
            }
            if (usuario.getDataNascimento() != null) {
                usuarioRecuperado.setDataNascimento(usuario.getDataNascimento());
            }
            return usuarioRepository.save(usuario);
        }
        return null;
    }

}
