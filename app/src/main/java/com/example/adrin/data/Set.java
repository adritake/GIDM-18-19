package com.example.adrin.data;

import android.util.Pair;

import java.util.ArrayList;
import java.util.Vector;

public class Set {


    private ArrayList<Subexercise> serie;

    public Set(){
        serie = new ArrayList<>();
    }
    public Set(Set newSerie){
        serie = new ArrayList<>();
        for(Subexercise s: newSerie.getSerie()){
            serie.add(new Subexercise(s));
        }
    }

    public Set (ArrayList<Subexercise> serie){
        this.serie = serie;
    }

    public ArrayList<Subexercise> getSerie(){
        return serie;
    }

    public void setSerie(ArrayList<Subexercise> serie) {
        this.serie = serie;
    }

    public void addEjercicio(Subexercise ejercicio){
        serie.add(ejercicio);
    }
    public void deleteEjercicio(int i){
        serie.remove(i);
    }
    public void setEjercicio(int i, Subexercise ejercicio){
        serie.set(i, ejercicio);
    }

}
