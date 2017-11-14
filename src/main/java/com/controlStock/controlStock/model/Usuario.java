package com.controlStock.controlStock.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @NotNull
    @Column(name = "correo")
    private String correo;
    @NotNull
    @Column(name = "contrasena")
    private String contrasena;
    @NotNull
    @Column(name = "nombre_Persona")
    private String nombre_Persona;
    @NotNull
    @Column(name = "nombre_Empresa")
    private String nombre_Empresa;
    @NotNull
    @Column(name = "rango")
    private int rango;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre_Persona() {
        return nombre_Persona;
    }

    public void setNombre_Persona(String nombre_Persona) {
        this.nombre_Persona = nombre_Persona;
    }

    public String getNombre_Empresa() {
        return nombre_Empresa;
    }

    public void setNombre_Empresa(String nombre_Empresa) {
        this.nombre_Empresa = nombre_Empresa;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }
}
