package com.senai.backend.controle_frequencia.controllers;

import java.util.List;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.controle_frequencia.Services.usuarioservice;
import com.senai.backend.controle_frequencia.models.Usuario;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/usuario")
public class usuariocontroller {

    @Autowired
    private usuarioservice usuarioService;

    @GetMapping("/contar-usuarios")
    public long contarUsuarios() {
        return usuarioService.contarUsuario();
    }

    @GetMapping("/buscar-usuario/{id}")
    public Usuario buscarUsuario(@PathVariable Integer id) {
        return usuarioService.buscarUsuario(id);
    }

    @GetMapping("/listar-usuarios")
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarusuarios();
    }

    @DeleteMapping("/deletar-usuario/{id}")
    public String deletarUsuario(@PathVariable Integer id) {
        if (usuarioService.deletarusuario(id)) {
            return "Usuario deletado com sucesso";
            
        }
        return "Falha ao deletar o usuario";
    }

    @PostMapping("/salvar-usuario")
    public Usuario cadartrarUsuario(@RequestBody Usuario usuario){
        return usuarioService.cadastUsuario(usuario);
    }

    @PutMapping("/atualizar-usuario/{id}")
    public String atualizaUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
        if (usuarioService.atualizarUsuario(id, usuario) != null) {
            return"Usuario atualizado com sucesso";
        }

        return "Falha ao atualizar o usuario";
    }
}