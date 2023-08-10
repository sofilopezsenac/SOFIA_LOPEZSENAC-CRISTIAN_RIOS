package com.backend.integrador.entity;

public class Odontologo {
    private int id;
    private int matricula;
    private String nombre;
    private String apellido;



    public Odontologo(int matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo(int id, int matricula, String nombre, String apellido) {
        this.id = id;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Odontologo " +
                "id: " + id +
                ", matricula: " + matricula +
                ", nombre: " + nombre +
                ", apellido: " + apellido;
    }
}
