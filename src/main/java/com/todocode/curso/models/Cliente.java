package com.todocode.curso.models;
import lombok.Data;

@Data
public class Cliente {
    private int id;
    private String nombre;
    private String ap;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String ap) {
        this.id = id;
        this.nombre = nombre;
        this.ap = ap;
    }
}
