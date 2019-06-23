package com.example.adrin.gidm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adrin.data.Exercise;

import java.util.ArrayList;

public class EjerciciosListAdapter extends ArrayAdapter<Exercise> {


    private ArrayList<Exercise> ejercicios;
    private Activity context;


    public EjerciciosListAdapter(Activity context, ArrayList<Exercise> ejercicios) {
        super(context, R.layout.dia, ejercicios);
        this.context = context;
        this.ejercicios = ejercicios;

    }

    public View getView(int position, View view, ViewGroup parent) {

        final int p = position;
        final Exercise ejercicio = ejercicios.get(p);



        LayoutInflater inflater = context.getLayoutInflater();

        View rowView=inflater.inflate(R.layout.ejercicio, null,true);

        final TextView nombreEjercicio = rowView.findViewById(R.id.nombreEjercicio);
        final ImageButton doneButton = rowView.findViewById(R.id.doneButton);



        final TextView contador = rowView.findViewById(R.id.Text_contador_series);
        contador.setText("Serie " + (ejercicio.getSerieActual()+1) + " /" + ejercicio.getNSeries());

        final ListView listaSeries = rowView.findViewById(R.id.list_serie);

        final ImageView imagenHecho = rowView.findViewById(R.id.image_hecho);

        doneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(ejercicio.getSerieActual() < ejercicio.getNSeries()-1){
                    ejercicio.incrementaSerie();
                    listaSeries.setAdapter(new SubexerciseListAdapter(context, ejercicio.getSeries().get(ejercicio.getSerieActual()).getSerie()));
                    contador.setText("Serie " + (ejercicio.getSerieActual()+1) + " /" + ejercicio.getNSeries());
                }
                else{
                    nombreEjercicio.setVisibility(View.GONE);
                    doneButton.setVisibility(View.GONE);
                    contador.setVisibility(View.GONE);
                    listaSeries.setVisibility(View.GONE);
                    imagenHecho.setVisibility(View.VISIBLE);
                }
            }
        });

        if(ejercicio.getSerieActual() < ejercicio.getNSeries()-1){
            listaSeries.setAdapter(new SubexerciseListAdapter(context, ejercicio.getSeries().get(ejercicio.getSerieActual()).getSerie()));
        }
        else{
            nombreEjercicio.setVisibility(View.GONE);
            doneButton.setVisibility(View.GONE);
            contador.setVisibility(View.GONE);
            listaSeries.setVisibility(View.GONE);
            imagenHecho.setVisibility(View.VISIBLE);
        }
        nombreEjercicio.setText(ejercicio.getNombreEjercicio());



        return rowView;

    }
}