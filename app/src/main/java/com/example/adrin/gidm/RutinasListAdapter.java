package com.example.adrin.gidm;

import android.app.Activity;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

public class RutinasListAdapter extends ArrayAdapter<String> {


    private String[] nombresRutinas;
    private Activity context;

    public RutinasListAdapter(Activity context, String[] nombres) {
        super(context, R.layout.rutina, nombres);
        this.context = context;
        this.nombresRutinas = nombres;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();

        final View rowView=inflater.inflate(R.layout.rutina, null,true);

        TextView titleText = rowView.findViewById(R.id.NombreRutina);
        ImageButton startButton = rowView.findViewById(R.id.StartButton);
        final int p = position;
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = context.getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, new DiasFragment())
                        .addToBackStack( "tag" )
                        .commit();

            }
        });
        titleText.setText(nombresRutinas[position]);

        return rowView;

    };
}
