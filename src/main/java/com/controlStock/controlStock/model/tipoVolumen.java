package com.controlStock.controlStock.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Tipo_volumen")
public class tipoVolumen {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @NotNull
    @Column(name = "Formato")
    private String formato;
    @NotNull
    @Column(name = "cantidadxlitro")
    private int cantidadxlitro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getCantidadxlitro() {
        return cantidadxlitro;
    }

    public void setCantidadxlitro(int cantidadxlitro) {
        this.cantidadxlitro = cantidadxlitro;
    }
}
