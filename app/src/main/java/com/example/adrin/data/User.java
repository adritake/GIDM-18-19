package com.example.adrin.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/**
 * Clase User, simula la base de datos donde se guardan todos los datos del usuario
 */
public class User {

    public static String USERNAME = "Moha";
    public static Rutina RUTINAACTIVA;
    public static ArrayList<Rutina> MISRUTINAS;

    static {
        // Creación de rutina activa
        ArrayList<Exercise> ejerciciosTest = new ArrayList<>();

        Vector<Vector<Integer>> series = new Vector<>();
        Integer[] reps = {10,12};
        series.add(new Vector<>(Arrays.asList(reps)));
        series.add(new Vector<>(Arrays.asList(reps)));

        Vector<Vector<Integer>> trabajo = new Vector<>();
        Integer[] tra = {5,7};
        trabajo.add(new Vector<>(Arrays.asList(tra)));
        trabajo.add(new Vector<>(Arrays.asList(tra)));

        Exercise ejercicioCarga = new Exercise("carga", 1,"Ejercicio de carga 1", "Descripción de ejercicio de carga", series,trabajo);
        Exercise ejercicioTiempo = new Exercise("tiempo", 1, "Ejercicio de tiempo 1", "Descripción de ejercicio de carga", series,trabajo);
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

        ArrayList<Day> diasGuardada = new ArrayList<>();
        diasGuardada.add(new Day("DIA 1", ejerciciosTest));
        diasGuardada.add(new Day("DIA 2", ejerciciosTest));
        diasGuardada.add(new Day("DIA 3", ejerciciosTest));

        //Creacion de rutinas
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
