package com.controlStock.controlStock.model;

import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "marca")
    private String marca;
    @Column(name = "Tipo")
    private String Tipo;
    @Column(name = "Cepa")
    private String Cepa;
    @Column(name = "Reserva")
    private int Reserva;
    @Column(name = "Stock_minimo")
    private int Stock_minimo;
    @Column(name = "Stock_maximo")
    private int Stock_maximo;
    @Column(name = "Stock")
    private int Stock;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name ="id_tipovolumen")
    private tipoVolumen tipovolumen;

    public tipoVolumen getIdTipovolumen() {
        return tipovolumen;
    }

    public void setIdTipovolumen(tipoVolumen idTipovolumen) {
        this.tipovolumen = idTipovolumen;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        marca = marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getCepa() {
        return Cepa;
    }

    public void setCepa(String cepa) {
        Cepa = cepa;
    }

    public int getReserva() {
        return Reserva;
    }

    public void setReserva(int reserva) {
        Reserva = reserva;
    }

    public int getStock_minimo() {
        return Stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        Stock_minimo = stock_minimo;
    }

    public int getStock_maximo() {
        return Stock_maximo;
    }

    public void setStock_maximo(int stock_maximo) {
        Stock_maximo = stock_maximo;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public String getFormato(){
        return this.tipovolumen.getFormato();
    }
}
