package com.todocode.curso.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/conv/{galones}")
    public String convertir(@PathVariable double galones) {
        double litros = galones * 3.78541;
        return "La cantidad de galones equivale a "+litros+ " litros";
    }

    @GetMapping("/bye")
    public String imc(@RequestParam float imc){
        if (imc <= 18.5){
            return "Pesos insuficiente";
        } else if (imc > 18.5 && imc <= 24.9){
            return "Peso normal";
        } else if (imc > 24.9 && imc <= 29.9){
            return "Sobrepeso";
        } else return "Obesidad";
    }



}
