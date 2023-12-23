package com.todocode.curso.Controller;
import com.todocode.curso.models.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {
    @PostMapping("/cliente/")
    public void crearCliente(@RequestBody Cliente cliente){
        System.out.println("Cliente creado");
        System.out.println("Nombre: "+cliente.getNombre()+
                "Apellido: "+ cliente.getAp());
    }

}
