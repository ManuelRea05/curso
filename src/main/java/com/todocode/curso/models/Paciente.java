package com.todocode.curso.models;

import lombok.Data;
import java.sql.Date;
import java.time.LocalDate;

@Data
public class Paciente {
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;

    public Paciente(int id, int dni, String nombre, String apellido, LocalDate fechaNac) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }
}

