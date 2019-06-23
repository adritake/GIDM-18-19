package com.example.adrin.data;

import java.util.ArrayList;

public class Rutina {


    private ArrayList<Day> dias;
    private String nombreRutina;
    private String descripcion;

    public Rutina() {
        this.dias = null;
        this.nombreRutina = "";
        this.descripcion = "";
    }
    public Rutina(ArrayList<Day> dias, String nombreRutina, String descripcion) {
        this.dias = dias;
        this.nombreRutina = nombreRutina;
        this.descripcion = descripcion;
    }

    public Rutina(Rutina rutina){
        this.dias = new ArrayList<>();
        for(Day d: rutina.getDias()){
            dias.add(new Day(d));
        }
        this.nombreRutina = rutina.getNombreRutina();
        this.descripcion = rutina.getDescripcion();
    }

    public ArrayList<Day> getDias() {
        return dias;
    }

    public String getNombreRutina() {
        return nombreRutina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDias(ArrayList<Day> dias) {
        this.dias = dias;
    }

    public void setNombreRutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void aniadeDia(int n_dia, Day dia){
        this.dias.add(n_dia, dia);
    }

    public void modificaDia(int n_dia, Day dia){
        this.dias.set(n_dia, dia);
    }

    public void eliminaDia(int n_dia){
        this.dias.remove(n_dia);
    }


}
