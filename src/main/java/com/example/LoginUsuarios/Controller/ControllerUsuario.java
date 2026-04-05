package com.example.LoginUsuarios.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LoginUsuarios.Model.Usuario;
import com.example.LoginUsuarios.Service.ServiceUsuario;

@RestController
@RequestMapping("/api/v1/usuarios")
public class ControllerUsuario {
    @Autowired
    private ServiceUsuario serv;

    @GetMapping
    public List<Usuario> mostrar(){
        return serv.mostrar();
    }

    @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable int id, @RequestBody Usuario usu){
        return serv.actualizar(usu);
    }

    @PostMapping
    public Usuario guardar(@RequestBody Usuario usu){
        return serv.guardar(usu);
    }

    @GetMapping("/{id}")
    public Usuario buscarId(@PathVariable int id){
        return serv.buscarId(id);
    }

    //comnuna
    @GetMapping("/comuna/{comuna}")
    public List<Usuario> filtrarComuna(@PathVariable String comuna){
        return serv.buscarComuna(comuna);
    }
    //edad
    @GetMapping("/edad/{edad}")
    public String filtrarEdad(@PathVariable int edad){
        return serv.buscarEdad(edad);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable int id){
        return serv.eliminar(id);
    }
}
