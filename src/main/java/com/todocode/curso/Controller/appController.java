package com.todocode.curso.Controller;
import com.todocode.curso.models.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class appController {
    /*@PostMapping("/cliente")
    public void crearCliente(@RequestBody Cliente cliente){
        System.out.println("Cliente creado");
        System.out.println("Nombre: "+cliente.getNombre()+
                " Apellido: "+ cliente.getAp());
    }*/
    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes() {
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1, "Zlatan", "Ibrahimovic"));
        listaClientes.add(new Cliente(2, "Cristiano", "Ronaldo"));
        listaClientes.add(new Cliente(3, "Liones", "Pessi"));
        return listaClientes;
    }

    @GetMapping("/pruebaresponsive")
    ResponseEntity<String> traerRespuesta(){

        return new ResponseEntity<>("Esta es una prueba");
    }

}
