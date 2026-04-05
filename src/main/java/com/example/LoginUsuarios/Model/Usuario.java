package com.example.LoginUsuarios.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    private int id;
    private String nombre,direccion,comuna;
    private int telefono;
    private String rut;
    private int edad;   
}
