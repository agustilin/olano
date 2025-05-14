package com.hospital.hospitaldb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospitaldb.service.PacienteService;

import lombok.Data;


@Data
@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService servicio;

  
    
}
