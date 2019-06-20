package com.example.adrin.data;

import java.util.Vector;

public class Exercise {

    private String tipo;
    private int n_maquina;
    private String nombreEjercicio;
    private String descripcion;
    private Vector<Vector<Integer>> series;
    private Vector<Vector<Integer>> cargas;
    private Vector<Vector<Integer>> tiempos;


    public Exercise(String tipo, int n_maquina, String nombreEjercicio, String descripcion, Vector<Vector<Integer>> series, Vector<Vector<Integer>> cargas, Vector<Vector<Integer>> tiempos) {
        this.tipo = tipo;
        this.n_maquina = n_maquina;
        this.nombreEjercicio = nombreEjercicio;
        this.descripcion = descripcion;
        this.series = series;
        this.cargas = cargas;
        this.tiempos = tiempos;
    }
    public Exercise(String tipo, int n_maquina, String nombreEjercicio, String descripcion, Vector<Vector<Integer>> series, Vector<Vector<Integer>> trabajo) {
        this.tipo = tipo;
        this.n_maquina = n_maquina;
        this.nombreEjercicio = nombreEjercicio;
        this.descripcion = descripcion;
        this.series = series;
        if(tipo.equals("carga")) {
            this.cargas = trabajo;
            this.tiempos = null;
        }
        else if(tipo.equals("tiempo")) {
            this.cargas = null;
            this.tiempos = trabajo;
        }
    }

    public Exercise() {
        this.tipo = "";
        this.n_maquina = -1;
        this.descripcion = "";
        this.series = null;
        this.cargas = null;
        this.tiempos = null;
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

    public Vector<Vector<Integer>> getSeries() {
        return series;
    }

    public Vector<Vector<Integer>> getCargas() {
        return cargas;
    }

    public Vector<Vector<Integer>> getTiempos() {
        return tiempos;
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

    public void setSeries(Vector<Vector<Integer>> series) {
        this.series = series;
    }

    public void setCargas(Vector<Vector<Integer>> cargas) {
        this.cargas = cargas;
    }

    public void setTiempos(Vector<Vector<Integer>> tiempos) {
        this.tiempos = tiempos;
    }
    public void modificaCarga(int i, int j, int carga){
        cargas.get(i).set(j,carga);
    }
    public void modificaTiempo(int i, int j, int tiempo){
        tiempos.get(i).set(j,tiempo);
    }
    public void modificaSerie(int i, int j, int serie){
        tiempos.get(i).set(j,serie);
    }



}
