package com.todocode.curso.models;

import lombok.Data;

@Data
public class Plato {
    private int numPlato;
    private float precio;
    private String nombre;
    private String desc;

    public Plato() {
    }

    public Plato(int numPlato, float precio, String nombre, String desc) {
        this.numPlato = numPlato;
        this.precio = precio;
        this.nombre = nombre;
        this.desc = desc;
    }
}


