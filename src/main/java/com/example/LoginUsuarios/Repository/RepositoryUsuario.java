package com.example.LoginUsuarios.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.LoginUsuarios.Model.Usuario;

@Repository
public class RepositoryUsuario {
    public List<Usuario> ListaUsuario = new ArrayList<>();

    public RepositoryUsuario(){
        ListaUsuario.add(new Usuario(1,"Juan","Calle 123","Santiago",12345678,"12345678-9",30));
        ListaUsuario.add(new Usuario(2,"Maria","Calle 456","Providencia",87654321,"98765432-1",25));
        ListaUsuario.add(new Usuario(3,"Pedro","Calle 789","Las Condes",11111111,"11111111-1",40));
        ListaUsuario.add(new Usuario(4,"Ana","Calle 321","Santiago",22222222,"22222222-2",35));
        ListaUsuario.add(new Usuario(5,"Luis","Calle 654","Providencia",33333333,"33333333-3",28));
        ListaUsuario.add(new Usuario(6,"Sofia","Calle 987","Las Condes",44444444,"44444444-4",22));
        ListaUsuario.add(new Usuario(7,"Carlos","Calle 111","Santiago",55555555,"55555555-5",45));
        ListaUsuario.add(new Usuario(8,"Laura","Calle 222","Providencia",66666666,"66666666-6",32));
        ListaUsuario.add(new Usuario(9,"Diego","Calle 333","Las Condes",77777777,"77777777-7",27));
        ListaUsuario.add(new Usuario(10,"Marta","Calle 444","Santiago",88888888,"88888888-8",38));
    }

    public List<Usuario> mostrar(){
        return ListaUsuario;
    }

    public Usuario guardar(Usuario usa){
        ListaUsuario.add(usa);
        return usa;
    }

    public Usuario buscarId(int id){
        for(Usuario usa : ListaUsuario){
            if(usa.getId()==id){
                return usa;
            }
        }
        return null;
    }

    public void eliminar(int id){
        Usuario usa = buscarId(id);
        if(usa!=null){
            ListaUsuario.remove(usa);
        }
    }

    public Usuario actualizar(Usuario usa){
        for(Usuario usu : ListaUsuario){
            if(usa.getId()==usu.getId()){
                usu.setNombre(usa.getNombre());
                usu.setDireccion(usa.getDireccion());
                usu.setComuna(usa.getComuna());
                usu.setTelefono(usa.getTelefono());
                usu.setRut(usa.getRut());
                usu.setEdad(usa.getEdad());
            }
        }
        return null;
    }

    public List<Usuario> filtrarComuna(String comuna){
        List<Usuario> listacomuna = new ArrayList<>();
        for(Usuario usu : ListaUsuario){
            if(usu.getComuna().equals(comuna)){
                listacomuna.add(usu);
            }
        }
        return listacomuna;
    }

    public String filtrarEdad(int edad){
        List<Usuario> listaedad = new ArrayList<>();
        for(Usuario usu : ListaUsuario){
            if(usu.getEdad()==edad){
                listaedad.add(usu);
            }
        }
        return listaedad.toString();
    }
}
