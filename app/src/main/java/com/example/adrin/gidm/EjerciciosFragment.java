package com.example.adrin.gidm;

import android.annotation.SuppressLint;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.adrin.data.User;

public class EjerciciosFragment extends ListFragment implements AdapterView.OnItemClickListener {

    private int dia;

    @SuppressLint("ValidFragment")
    public EjerciciosFragment(int dia){
        this.dia = dia;
    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ejercicios, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        EjerciciosListAdapter adapter = new EjerciciosListAdapter(getActivity(), User.RUTINAACTIVA.getDias().get(dia).getEjercicios());
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
        Toast.makeText(getActivity(), "Item: " + position, Toast.LENGTH_SHORT).show();
    }
}