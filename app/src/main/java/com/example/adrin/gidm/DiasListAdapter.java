package com.example.adrin.gidm;

import android.app.Activity;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import com.example.adrin.data.Day;

import java.util.ArrayList;

public class DiasListAdapter extends ArrayAdapter<Day> {


    private ArrayList<Day> dias;
    private Activity context;

    public DiasListAdapter(Activity context, ArrayList<Day> dias) {
        super(context, R.layout.dia, dias);
        this.context = context;
        this.dias = dias;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();

        final View rowView=inflater.inflate(R.layout.dia, null,true);

        TextView titleText = rowView.findViewById(R.id.NombreDia);
        ImageButton startButton = rowView.findViewById(R.id.StartButton);
        final int p = position;
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = context.getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new EjerciciosFragment(p))
                        .addToBackStack( "tag" )
                        .commit();

            }
        });
        titleText.setText(dias.get(position).getNombreDia());

        return rowView;

    }
}
