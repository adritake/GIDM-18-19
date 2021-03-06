package com.example.adrin.gidm;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adrin.data.DBSim;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PerfilFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PerfilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerfilFragment extends android.app.Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public PerfilFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TestFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PerfilFragment newInstance(String param1, String param2) {
        PerfilFragment fragment = new PerfilFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View perfilView = inflater.inflate(R.layout.perfil, container, false);

        TextView nombreText = perfilView.findViewById(R.id.nombre);
        nombreText.setText(DBSim.getUSER().getNombre());

        final TextView pesoText = perfilView.findViewById(R.id.pesoVar);
        pesoText.setText(String.valueOf(DBSim.getUSER().getPeso()));

        final TextView alturaText = perfilView.findViewById(R.id.alturaVar);
        alturaText.setText(String.valueOf(DBSim.getUSER().getAltura()));

        final TextView textKG = perfilView.findViewById(R.id.textKG);
        final TextView textCM = perfilView.findViewById(R.id.textCM);
        final TextView editAltura = perfilView.findViewById(R.id.editAltura);
        editAltura.setText(String.valueOf(DBSim.getUSER().getAltura()));
        final TextView editPeso = perfilView.findViewById(R.id.editPeso);
        editPeso.setText(String.valueOf(DBSim.getUSER().getPeso()));
        final ImageButton doneEdit = perfilView.findViewById(R.id.doneEditButton);
        final ImageButton editPerfil = perfilView.findViewById(R.id.editButton);

        editPerfil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textKG.setVisibility(View.VISIBLE);
                textCM.setVisibility(View.VISIBLE);
                editAltura.setVisibility(View.VISIBLE);
                editPeso.setVisibility(View.VISIBLE);
                doneEdit.setVisibility(View.VISIBLE);

                pesoText.setVisibility(View.GONE);
                alturaText.setVisibility(View.GONE);
                editPerfil.setVisibility(View.GONE);


            }
        });

        doneEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(!editAltura.getText().toString().isEmpty() && !editPeso.getText().toString().isEmpty()) {
                    DBSim.getUSER().setAltura(Double.parseDouble(editAltura.getText().toString()));
                    DBSim.getUSER().setPeso(Double.parseDouble(editPeso.getText().toString()));
                    pesoText.setText(editPeso.getText());
                    alturaText.setText(editAltura.getText());
                }
                else{
                    Toast.makeText(getActivity(),"Error al introducir datos", Toast.LENGTH_SHORT).show();
                }

                textKG.setVisibility(View.GONE);
                textCM.setVisibility(View.GONE);
                editAltura.setVisibility(View.GONE);
                editPeso.setVisibility(View.GONE);
                doneEdit.setVisibility(View.GONE);

                pesoText.setVisibility(View.VISIBLE);
                alturaText.setVisibility(View.VISIBLE);
                editPerfil.setVisibility(View.VISIBLE);

            }
        });


        return perfilView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
