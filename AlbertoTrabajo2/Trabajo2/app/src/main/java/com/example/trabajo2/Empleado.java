package com.example.trabajo2;

public class Empleado {
    private String nombre;
    private String cargo;
    private String compañia;

    public Empleado(String nombre, String cargo, String compañia) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.compañia = compañia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
}
