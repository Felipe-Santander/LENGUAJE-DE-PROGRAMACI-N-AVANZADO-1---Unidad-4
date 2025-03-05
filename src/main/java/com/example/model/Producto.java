package com.example.model;

public class Producto {
    private String id;
    private String nombre;
    private double precio;

    // Constructor con argumentos
    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Constructor sin argumentos (necesario para algunos frameworks)
    public Producto() {
    }

    // Getters y Setters (si no estás usando Lombok)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}