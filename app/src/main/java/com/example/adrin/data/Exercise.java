package com.example.adrin.data;

import java.util.Vector;

public class Exercise {

    private String tipo;
    private int n_maquina;
    private String nombreEjercicio;
    private String descripcion;
    private Vector<Set> series;



    public Exercise(String tipo, int n_maquina, String nombreEjercicio, String descripcion, Vector<Set> series) {
        this.tipo = tipo;
        this.n_maquina = n_maquina;
        this.nombreEjercicio = nombreEjercicio;
        this.descripcion = descripcion;
        this.series = series;

    }
    public Exercise(String tipo, int n_maquina, String nombreEjercicio, String descripcion, Vector<Set> series, Vector<Vector<Integer>> trabajo) {
        this.tipo = tipo;
        this.n_maquina = n_maquina;
        this.nombreEjercicio = nombreEjercicio;
        this.descripcion = descripcion;
        this.series = series;

    }

    public Exercise() {
        this.tipo = "";
        this.n_maquina = -1;
        this.descripcion = "";
        this.series = new Vector<>();

    }

    public String getTipo() {
        return tipo;
    }

    public int getN_maquina() {
        return n_maquina;
    }

    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Vector<Set> getSeries() {
        return series;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setN_maquina(int n_maquina) {
        this.n_maquina = n_maquina;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSeries(Vector<Set> series) {
        this.series = series;
    }





}
