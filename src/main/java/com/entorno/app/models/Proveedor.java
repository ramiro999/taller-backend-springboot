package com.entorno.app.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = Proveedor.TABLE_NAME)
public class Proveedor {
    public static final String TABLE_NAME = "Proveedor";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ciudad;
    private String direccion;
    private String nombre;
    private String telefono;
    private String nit;

    public Proveedor() {
    }

    public Proveedor(int id, String ciudad, String direccion, String nombre, String telefono, String nit) {
        this.id = id;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.nit = nit;

    }

    public int getId() {
        return id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }   

    public void setNit(String nit) {
        this.nit = nit;
    }   

    @Override   


    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", ciudad='" + ciudad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nit='" + nit + '\'' +
                '}';
    }
    
    
}
