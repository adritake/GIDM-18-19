package com.example.adrin.data;

import android.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/**
 * Clase DBSim, simula la base de datos donde se guardan todos los datos del usuario
 */
public class DBSim {

    public static User USER = new User("adritake", "Adrián de la Torre Rodríguez",74, 174);
    public static Rutina RUTINAACTIVA;
    public static ArrayList<Rutina> MISRUTINAS;

    static {
        // Creación de rutina activa
        ArrayList<Exercise> ejerciciosTest = new ArrayList<>();

        ArrayList<Subexercise> vector_serie = new ArrayList<>();
        Subexercise e1 = new Subexercise(12,20.0);
        Subexercise e2 = new Subexercise(10,25.0);
        Subexercise e3 = new Subexercise(8,30.0);
        vector_serie.add(e1);
        vector_serie.add(e2);
        vector_serie.add(e3);


        Set serie1 = new Set(vector_serie);
        Set serie2 = new Set(vector_serie);
        Set serie3 = new Set(vector_serie);


        Vector<Set> series = new Vector<>();
        series.add(serie1);
        series.add(serie2);
        series.add(serie3);


        Exercise ejercicioCarga = new Exercise("carga", 1,"Ejercicio de carga 1", "Descripción de ejercicio de carga", series);
        Exercise ejercicioTiempo = new Exercise("tiempo", 1, "Ejercicio de tiempo 1", "Descripción de ejercicio de carga", series);

        ejerciciosTest.add(ejercicioCarga);
        ejerciciosTest.add(ejercicioTiempo);
        ejerciciosTest.add(ejercicioCarga);
        ejerciciosTest.add(ejercicioTiempo);
        ejerciciosTest.add(ejercicioCarga);
        ejerciciosTest.add(ejercicioTiempo);
        ejerciciosTest.add(ejercicioCarga);
        ejerciciosTest.add(ejercicioTiempo);

        ArrayList<Day> diasActiva = new ArrayList<>();
        diasActiva.add(new Day("DIA 1", ejerciciosTest));
        diasActiva.add(new Day("DIA 2", ejerciciosTest));

        RUTINAACTIVA = new Rutina(diasActiva,"Rutina de prueba", "Esta es la descripción de la rutina de prueba");


        //Creacion de rutinas
        ArrayList<Day> diasGuardada = new ArrayList<>();
        diasGuardada.add(new Day("DIA 1", ejerciciosTest));
        diasGuardada.add(new Day("DIA 2", ejerciciosTest));
        diasGuardada.add(new Day("DIA 3", ejerciciosTest));


        MISRUTINAS = new ArrayList<>();
        MISRUTINAS.add(new Rutina(diasGuardada,"Rutina guardada 1", "Esta es la descripción de la rutina de prueba"));
        MISRUTINAS.add(new Rutina(diasGuardada,"Rutina guardada 2", "Esta es la descripción de la rutina de prueba"));
        MISRUTINAS.add(new Rutina(diasGuardada,"Rutina guardada 3", "Esta es la descripción de la rutina de prueba"));
        MISRUTINAS.add(new Rutina(diasGuardada,"Rutina guardada 4", "Esta es la descripción de la rutina de prueba"));
        MISRUTINAS.add(new Rutina(diasGuardada,"Rutina guardada 5", "Esta es la descripción de la rutina de prueba"));
        MISRUTINAS.add(new Rutina(diasGuardada,"Rutina guardada 6", "Esta es la descripción de la rutina de prueba"));
        MISRUTINAS.add(new Rutina(diasGuardada,"Rutina guardada 7", "Esta es la descripción de la rutina de prueba"));
        MISRUTINAS.add(new Rutina(diasGuardada,"Rutina guardada 8", "Esta es la descripción de la rutina de prueba"));
        MISRUTINAS.add(new Rutina(diasGuardada,"Rutina guardada 9", "Esta es la descripción de la rutina de prueba"));
        MISRUTINAS.add(new Rutina(diasGuardada,"Rutina guardada 10", "Esta es la descripción de la rutina de prueba"));

    }


}
