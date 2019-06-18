package com.example.adrin.gidm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class DiasListAdapter extends ArrayAdapter<String> {


    private String[] nombresDias;
    private Activity context;

    public DiasListAdapter(Activity context, String[] nombres) {
        super(context, R.layout.dia, nombres);
        this.context = context;
        this.nombresDias = nombres;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();

        final View rowView=inflater.inflate(R.layout.dia, null,true);

        TextView titleText = rowView.findViewById(R.id.NombreDia);
        ImageButton startButton = rowView.findViewById(R.id.StartButton);
        final int p = position;
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context,"Pulsado: " + nombresDias[p], Toast.LENGTH_SHORT).show();

            }
        });
        titleText.setText(nombresDias[position]);

        return rowView;

    };
}
