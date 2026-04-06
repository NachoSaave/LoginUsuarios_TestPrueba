package com.example.LoginUsuarios.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LoginUsuarios.Model.Usuario;
import com.example.LoginUsuarios.Repository.RepositoryUsuario;

@Service
public class ServiceUsuario {

    @Autowired
    private RepositoryUsuario repo;

    public List<Usuario> mostrar(){
        return repo.mostrar();
    }

    public Usuario guardar(Usuario usu){
        return repo.guardar(usu);
    } 

    public Usuario actualizar(Usuario usu){
        return repo.actualizar(usu);
    }

    public String eliminar(int id){
        repo.eliminar(id);
        return "Usuario eliminado";
    }

    public Usuario buscarId(int id){
        return repo.buscarId(id);
    }

    public List<Usuario> buscarEdad(int edad){
        return repo.filtrarEdad(edad);
    }

    public List<Usuario> buscarComuna(String comuna){
        return repo.filtrarComuna(comuna);
    }
}