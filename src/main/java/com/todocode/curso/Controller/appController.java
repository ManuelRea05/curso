package com.todocode.curso.Controller;
import com.todocode.curso.models.Paciente;
import com.todocode.curso.models.Plato;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class appController {
    /*@PostMapping("/cliente")
    public void crearCliente(@RequestBody Cliente cliente){
        System.out.println("Cliente creado");
        System.out.println("Nombre: "+cliente.getNombre()+
                " Apellido: "+ cliente.getAp());
    }*/
    @GetMapping("/cliente/traer/{numPlato}")
    public List<Plato> traerPlatos(@PathVariable int numPlato) {
        List<Plato> menu = new ArrayList<Plato>();
        menu.add(new Plato(1, 2000, "Pizza", "asdasdasd"));
        menu.add(new Plato(2, 1200, "Hamburguesa", "asdasdasd"));
        menu.add(new Plato(3, 1000, "Fideos", "asdasdasd"));
        menu.add(new Plato(4, 2200, "Rizoto", "asdasdasd"));
        menu.add(new Plato(5, 1400, "Arroz con tuco", "asdasdasd"));

        if (numPlato >= 1 && numPlato <= menu.size()) {
            // Restamos 1 porque los índices de las listas comienzan desde 0
            return Collections.singletonList(menu.get(numPlato - 1));
        } else {
            // Manejo de errores si el número de plato está fuera del rango
            throw new IllegalArgumentException("Número de plato inválido");
        }
    }

    @GetMapping("/pacientes/traer")
    public List<Paciente> traerPacientes() {
        LocalDate fechaNacimiento = LocalDate.of(2001, Month.OCTOBER, 1);
        LocalDate fechaNacimiento2 = LocalDate.of(2007, Month.MARCH, 1);
        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        listaPacientes.add(new Paciente(1, 123123, "Manuel", "Rea", fechaNacimiento));
        listaPacientes.add(new Paciente(2, 123123, "Pedro", "Rea", fechaNacimiento2));
        listaPacientes.add(new Paciente(3, 412312, "Juan", "Rea", fechaNacimiento2));

        return listaPacientes;
    }

    @GetMapping("/pacientes/traerMenores")
    public List<Paciente> traerPacientesMenores() {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(2001, Month.OCTOBER, 1);
        LocalDate fechaNacimiento2 = LocalDate.of(2007, Month.MARCH, 1);
        LocalDate fechaNacimiento3 = LocalDate.of(2006, Month.MARCH, 1);
        List<Paciente> listaPacientes = new ArrayList<Paciente>();
        listaPacientes.add(new Paciente(1, 123123, "Manuel", "Rea", fechaNacimiento));
        listaPacientes.add(new Paciente(2, 123123, "Pedro", "Rea", fechaNacimiento2));
        listaPacientes.add(new Paciente(3, 412312, "Juan", "Rea", fechaNacimiento3));

        List<Paciente> menoresDeEdad = new ArrayList<>();
        for (Paciente paciente : listaPacientes) {
            if (calcularEdad(paciente.getFechaNac(), fechaHoy) < 18) {
                menoresDeEdad.add(paciente);
            }
        }
        return menoresDeEdad;
    }
    public static int calcularEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
        return Period.between(fechaNacimiento, fechaActual).getYears();

    }

}
