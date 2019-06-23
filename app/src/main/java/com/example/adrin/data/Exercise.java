package com.example.adrin.data;

import java.util.Vector;

public class Exercise {

    private String tipo;
    private int n_maquina;
    private String nombreEjercicio;
    private String descripcion;
    private Vector<Set> series;
    private boolean activo;
    private int serieActual;



    public Exercise(String tipo, int n_maquina, String nombreEjercicio, String descripcion, Vector<Set> series) {
        this.tipo = tipo;
        this.n_maquina = n_maquina;
        this.nombreEjercicio = nombreEjercicio;
        this.descripcion = descripcion;
        this.series = series;
        this.activo = false;
        this.serieActual = 0;
    }
    public Exercise(String tipo, int n_maquina, String nombreEjercicio, String descripcion, Vector<Set> series, Vector<Vector<Integer>> trabajo) {
        this.tipo = tipo;
        this.n_maquina = n_maquina;
        this.nombreEjercicio = nombreEjercicio;
        this.descripcion = descripcion;
        this.series = series;
        this.activo = false;
        this.serieActual = 0;

    }

    public Exercise() {
        this.tipo = "";
        this.n_maquina = -1;
        this.nombreEjercicio = "";
        this.descripcion = "";
        this.series = new Vector<>();
        this.activo = false;
        this.serieActual = 0;

    }
    public Exercise( Exercise ejercicio) {
        this.tipo = ejercicio.getTipo();
        this.n_maquina = ejercicio.getN_maquina();
        this.nombreEjercicio = ejercicio.getNombreEjercicio();
        this.descripcion = ejercicio.getDescripcion();
        this.series = new Vector<>();
        for(Set s: ejercicio.getSeries()){
            series.add(new Set(s));
        }
        this.activo = ejercicio.isActivo();
        this.serieActual = ejercicio.getSerieActual();

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


    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getNSeries(){
        return series.size();
    }


    public int getSerieActual() {
        return serieActual;
    }

    public void incrementaSerie(){
        serieActual++;
    }

}
