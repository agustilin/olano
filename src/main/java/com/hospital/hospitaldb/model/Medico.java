package com.hospital.hospitaldb.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Medico {
    @Id@GeneratedValue
    private long id;

    private String rutMedico;
    private String nombreCompleto;
    private String Especialdad;
    //private char esTurno;

    @OneToMany(mappedBy = "medico")
    private List<Atencion> atenciones;
}
