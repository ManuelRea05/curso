package com.todocode.curso.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello/{nombre}")
    public String sayHello(@PathVariable String nombre){
        nombre = "MANUEL";
        return "HOLA MUNDO " + nombre;
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "CHAU MUNDO";
    }

}
