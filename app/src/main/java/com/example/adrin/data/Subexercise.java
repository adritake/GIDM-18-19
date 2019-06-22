package com.example.adrin.data;

import android.util.Pair;

public class Subexercise {


    private int cantidad;
    private double carga;


    public Subexercise(int cantidad, double carga) {
        this.cantidad = cantidad;
        this.carga = carga;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }



}
