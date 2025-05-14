package com.hospital.hospitaldb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospitaldb.repository.PacienteRepository;

import lombok.Data;


@Data
@Service
public class PacienteService {
    @Autowired
    private PacienteRepository repo;


}
