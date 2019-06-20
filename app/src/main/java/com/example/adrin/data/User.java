package com.example.adrin.data;

public class User {

    private String userName;
    private String nombre;
    private double peso;
    private double altura;

    public User(String userName, String nombre, double peso, double altura) {
        this.userName = userName;
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public User() {
        this.userName = "";
        this.nombre = "";
        this.peso = 0;
        this.altura = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
