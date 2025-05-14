package com.hospital.hospitaldb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Temporal;
import lombok.Data;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;;
@Data
@Entity
public class Paciente {
    @Id@GeneratedValue
    private long id;

    private String rut;
    private String nombres;
    private String apellidos;

    @Temporal(TemporalType.DATE)
    private Date fechaNacmiento;

    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
    private FichaPaciente fichaPaciente;

    @ManyToOne
    private TipoUsuario tipoUsuario;

    @OneToMany(mappedBy = "paciente")
    private List<Atencion> atenciones;



    
}
