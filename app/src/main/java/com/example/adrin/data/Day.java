package com.example.adrin.data;

import java.util.ArrayList;

public class Day {


    private String nombreDia;
    private ArrayList<Exercise> ejercicios;


    public Day(String nombreDia, ArrayList<Exercise> ejercicios) {
        this.nombreDia = nombreDia;
        this.ejercicios = ejercicios;
    }
    public Day() {
        this.nombreDia = "";
        this.ejercicios = null;
    }

    public Day (Day dia){
        this.nombreDia = dia.getNombreDia();
        this.ejercicios = new ArrayList<>();
        for(Exercise e: dia.getEjercicios()){
            ejercicios.add(new Exercise(e));
        }
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public ArrayList<Exercise> getEjercicios() {
        return ejercicios;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public void setEjercicios(ArrayList<Exercise> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public void modificaEjercicio(int index, Exercise ejercicio){
        ejercicios.set(index,ejercicio);
    }
    public void EliminaEjercicio(int index){
        ejercicios.remove(index);
    }
}
