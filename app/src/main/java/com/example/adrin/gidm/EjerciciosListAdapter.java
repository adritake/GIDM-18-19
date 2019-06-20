package com.example.adrin.gidm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
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

        LayoutInflater inflater=context.getLayoutInflater();

        final View rowView=inflater.inflate(R.layout.ejercicio, null,true);

        TextView titleText = rowView.findViewById(R.id.nombreEjercicio);
        ImageButton doneButton = rowView.findViewById(R.id.doneButton);
        final int p = position;
        doneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context,"Pulsado: " + ejercicios.get(p).getNombreEjercicio(), Toast.LENGTH_SHORT).show();

            }
        });
        titleText.setText(ejercicios.get(p).getNombreEjercicio());

        return rowView;

    }
}