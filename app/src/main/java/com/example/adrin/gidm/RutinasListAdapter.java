package com.example.adrin.gidm;

import android.app.Activity;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.adrin.data.DBSim;
import com.example.adrin.data.Rutina;

import java.util.ArrayList;

public class RutinasListAdapter extends ArrayAdapter<Rutina> {


    private ArrayList<Rutina> rutinas;
    private Activity context;

    public RutinasListAdapter(Activity context, ArrayList<Rutina> rutinas) {
        super(context, R.layout.rutina, rutinas);
        this.context = context;
        this.rutinas = rutinas;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();

        final View rowView=inflater.inflate(R.layout.rutina, null,true);

        TextView titleText = rowView.findViewById(R.id.NombreRutina);
        ImageButton startButton = rowView.findViewById(R.id.StartButton);
        final int p = position;
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                DBSim.setRUTINAACTIVA(DBSim.getMISRUTINAS().get(p));

                FragmentManager fragmentManager = context.getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new DiasFragment())
                        .addToBackStack( "tag" )
                        .commit();

            }
        });
        titleText.setText(rutinas.get(position).getNombreRutina());

        return rowView;

    };
}
