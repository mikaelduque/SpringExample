package com.senai.backend.controle_frequencia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.controle_frequencia.Services.usuarioservice;

@RestController
@RequestMapping("/usuario")
public class usuariocontroller {

    @Autowired
    private usuarioservice usuarioService;

}


