package com.hospital.hospitaldb.model;

import java.sql.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
public class Atencion {
    @Id@GeneratedValue
    private long id;

    @Temporal(TemporalType.DATE)
    private Date Fecha;

    private double costo;
    
    @ManyToOne
    private Medico medico;

    @ManyToOne
    private Paciente paciente;
}
