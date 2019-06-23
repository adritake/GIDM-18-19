package com.example.adrin.data;

import android.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/**
 * Clase DBSim, simula la base de datos donde se guardan todos los datos del usuario
 */
public class DBSim {

    private static User USER = new User("adritake", "Adrián de la Torre Rodríguez",74, 174);
    private static Rutina RUTINAACTIVA;
    private static ArrayList<Rutina> MISRUTINAS;

    static {
        // Creación de rutina 1
        ArrayList<Exercise> ejerciciosDia1 = new ArrayList<>();
        Vector<Set> series1;
        ArrayList<Subexercise> subejercicios1;

        series1 = new Vector<>();
        subejercicios1 = new ArrayList<>();
        subejercicios1.add(new Subexercise(12,22.5));
        series1.add(new Set(subejercicios1));

        subejercicios1 = new ArrayList<>();
        subejercicios1.add(new Subexercise(10,25));
        series1.add(new Set(subejercicios1));

        subejercicios1 = new ArrayList<>();
        subejercicios1.add(new Subexercise(8,27.5));
        series1.add(new Set(subejercicios1));

        ejerciciosDia1.add(new Exercise("Carga", 0, "Press banca", "Press banca", series1));
        //////////////////
        series1 = new Vector<>();
        subejercicios1 = new ArrayList<>();
        subejercicios1.add(new Subexercise(12,20));
        series1.add(new Set(subejercicios1));

        subejercicios1 = new ArrayList<>();
        subejercicios1.add(new Subexercise(10,22.5));
        series1.add(new Set(subejercicios1));

        subejercicios1 = new ArrayList<>();
        subejercicios1.add(new Subexercise(8,25));
        series1.add(new Set(subejercicios1));

        ejerciciosDia1.add(new Exercise("Carga", 0, "Press inclinado", "Press inclinado", series1));
        ////////////////////
        series1 = new Vector<>();
        subejercicios1 = new ArrayList<>();
        subejercicios1.add(new Subexercise(12,8));
        series1.add(new Set(subejercicios1));

        subejercicios1 = new ArrayList<>();
        subejercicios1.add(new Subexercise(10,9));
        series1.add(new Set(subejercicios1));

        subejercicios1 = new ArrayList<>();
        subejercicios1.add(new Subexercise(8,10));
        series1.add(new Set(subejercicios1));

        ejerciciosDia1.add(new Exercise("Carga", 0, "Apertura máquina", "Apertura máquina", series1));
        ////////////////////
        series1 = new Vector<>();
        subejercicios1 = new ArrayList<>();
        subejercicios1.add(new Subexercise(1,60));
        subejercicios1.add(new Subexercise(2,45));
        series1.add(new Set(subejercicios1));

        subejercicios1 = new ArrayList<>();
        subejercicios1.add(new Subexercise(1,60));
        subejercicios1.add(new Subexercise(2,45));
        series1.add(new Set(subejercicios1));

        subejercicios1 = new ArrayList<>();
        subejercicios1.add(new Subexercise(1,60));
        subejercicios1.add(new Subexercise(2,45));
        series1.add(new Set(subejercicios1));

        ejerciciosDia1.add(new Exercise("Tiempo", 0, "Plancha y oblicuos", "Plancha y oblicuos", series1));
        ////////////////////

        Day dia1 = new Day("Día 1: Pecho y tríceps",  ejerciciosDia1);



        ArrayList<Exercise> ejerciciosDia2 = new ArrayList<>();
        Vector<Set> series2;
        ArrayList<Subexercise> subejercicios2;

        series2 = new Vector<>();
        subejercicios2 = new ArrayList<>();
        subejercicios2.add(new Subexercise(10,55));
        series2.add(new Set(subejercicios2));

        subejercicios2 = new ArrayList<>();
        subejercicios2.add(new Subexercise(8,57.7));
        series2.add(new Set(subejercicios2));

        subejercicios2 = new ArrayList<>();
        subejercicios2.add(new Subexercise(6,60));
        series2.add(new Set(subejercicios2));

        ejerciciosDia2.add(new Exercise("Carga", 0, "Jalones", "Jalones", series2));
        //////////////////
        series2 = new Vector<>();
        subejercicios2 = new ArrayList<>();
        subejercicios2.add(new Subexercise(10,45));
        series2.add(new Set(subejercicios2));

        subejercicios2 = new ArrayList<>();
        subejercicios2.add(new Subexercise(8,50));
        series2.add(new Set(subejercicios2));

        subejercicios2 = new ArrayList<>();
        subejercicios2.add(new Subexercise(6,55));
        series2.add(new Set(subejercicios2));

        ejerciciosDia2.add(new Exercise("Carga", 0, "Remo polea", "Remo polea", series2));
        ////////////////////
        series2 = new Vector<>();
        subejercicios2 = new ArrayList<>();
        subejercicios2.add(new Subexercise(8,30));
        series2.add(new Set(subejercicios2));

        subejercicios2 = new ArrayList<>();
        subejercicios2.add(new Subexercise(8,30));
        series2.add(new Set(subejercicios2));

        subejercicios2 = new ArrayList<>();
        subejercicios2.add(new Subexercise(8,30));
        series2.add(new Set(subejercicios2));

        ejerciciosDia2.add(new Exercise("Carga", 0, "Peso muerto", "Peso muerto", series2));
        ////////////////////
        series2 = new Vector<>();
        subejercicios2 = new ArrayList<>();
        subejercicios2.add(new Subexercise(1,60));
        subejercicios2.add(new Subexercise(2,45));
        series2.add(new Set(subejercicios2));

        subejercicios2 = new ArrayList<>();
        subejercicios2.add(new Subexercise(1,60));
        subejercicios2.add(new Subexercise(2,45));
        series2.add(new Set(subejercicios2));

        subejercicios2 = new ArrayList<>();
        subejercicios2.add(new Subexercise(1,60));
        subejercicios2.add(new Subexercise(2,45));
        series2.add(new Set(subejercicios2));

        ejerciciosDia2.add(new Exercise("Tiempo", 0, "Plancha y oblicuos", "Plancha y oblicuos", series2));
        ////////////////////

        Day dia2 = new Day("Día 2: Espalda y bíceps",  ejerciciosDia2);

        ArrayList<Exercise> ejerciciosDia3 = new ArrayList<>();
        Vector<Set> series3;
        ArrayList<Subexercise> subejercicios3;

        series3 = new Vector<>();
        subejercicios3 = new ArrayList<>();
        subejercicios3.add(new Subexercise(12,10));
        series3.add(new Set(subejercicios3));

        subejercicios3 = new ArrayList<>();
        subejercicios3.add(new Subexercise(10,12.5));
        series3.add(new Set(subejercicios3));

        subejercicios3 = new ArrayList<>();
        subejercicios3.add(new Subexercise(8,15));
        series3.add(new Set(subejercicios3));

        ejerciciosDia3.add(new Exercise("Carga", 0, "Elevaciones laterales", "Elevaciones laterales", series3));
        //////////////////
        series3 = new Vector<>();
        subejercicios3 = new ArrayList<>();
        subejercicios3.add(new Subexercise(10,10));
        series3.add(new Set(subejercicios3));

        subejercicios3 = new ArrayList<>();
        subejercicios3.add(new Subexercise(8,10));
        series3.add(new Set(subejercicios3));

        subejercicios3 = new ArrayList<>();
        subejercicios3.add(new Subexercise(6,10));
        series3.add(new Set(subejercicios3));

        ejerciciosDia3.add(new Exercise("Carga", 0, "Press militar", "Press militar", series3));
        ////////////////////
        series3 = new Vector<>();
        subejercicios3 = new ArrayList<>();
        subejercicios3.add(new Subexercise(12,12.5));
        series3.add(new Set(subejercicios3));

        subejercicios3 = new ArrayList<>();
        subejercicios3.add(new Subexercise(10,15));
        series3.add(new Set(subejercicios3));

        subejercicios3 = new ArrayList<>();
        subejercicios3.add(new Subexercise(8,17.5));
        series3.add(new Set(subejercicios3));

        ejerciciosDia3.add(new Exercise("Carga", 0, "Elevaciones frontales", "Elevaciones frontales", series3));
        ////////////////////
        series3 = new Vector<>();
        subejercicios3 = new ArrayList<>();
        subejercicios3.add(new Subexercise(1,60));
        subejercicios3.add(new Subexercise(2,45));
        series3.add(new Set(subejercicios3));

        subejercicios3 = new ArrayList<>();
        subejercicios3.add(new Subexercise(1,60));
        subejercicios3.add(new Subexercise(2,45));
        series3.add(new Set(subejercicios3));

        subejercicios3 = new ArrayList<>();
        subejercicios3.add(new Subexercise(1,60));
        subejercicios3.add(new Subexercise(2,45));
        series3.add(new Set(subejercicios3));

        ejerciciosDia3.add(new Exercise("Tiempo", 0, "Plancha y oblicuos", "Plancha y oblicuos", series3));
        ////////////////////

        Day dia3 = new Day("Día 3: Hombros",  ejerciciosDia3);

        ArrayList<Day> diasActiva = new ArrayList<>();
        diasActiva.add(dia1);
        diasActiva.add(dia2);
        diasActiva.add(dia3);
        RUTINAACTIVA = new Rutina(diasActiva,"Rutina hipertrofia de 3 días", "Rutina de hipertrofia de 3 días");


        //Creacion de rutinas
        ArrayList<Day> diasGuardada = new ArrayList<>();
        diasGuardada.add(new Day(dia1));
        diasGuardada.add(new Day(dia2));



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

    public static User getUSER(){
        return USER;
    }

    public static Rutina getRUTINAACTIVA(){
        return new Rutina(RUTINAACTIVA);
    }

    public static void setRUTINAACTIVA(Rutina rutina){
        RUTINAACTIVA = new Rutina(rutina);
    }

    public static ArrayList<Rutina> getMISRUTINAS(){
        ArrayList<Rutina> mr = new ArrayList<>();
        for(Rutina r: MISRUTINAS){
            mr.add(new Rutina(r));
        }
        return mr;
    }

}
