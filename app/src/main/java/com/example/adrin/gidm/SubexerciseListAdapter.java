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
import com.example.adrin.data.Set;
import com.example.adrin.data.Subexercise;

import java.util.ArrayList;

public class SubexerciseListAdapter extends ArrayAdapter<Subexercise> {


    private ArrayList<Subexercise> subejercicios;
    private Activity context;

    public SubexerciseListAdapter(Activity context, ArrayList<Subexercise> subejercicios) {
        super(context, R.layout.dia, subejercicios);
        this.context = context;
        this.subejercicios = subejercicios;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();

        final View rowView=inflater.inflate(R.layout.subejercicio, null,true);

        TextView textoCantidad = rowView.findViewById(R.id.Text_cantidad);
        TextView textoCarga = rowView.findViewById(R.id.Text_carga);


        final int p = position;

        textoCantidad.setText(Integer.toString(subejercicios.get(p).getCantidad()));
        textoCarga.setText(Double.toString(subejercicios.get(p).getCarga()));


        return rowView;

    }
}