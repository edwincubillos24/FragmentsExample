package com.edwinacubillos.comunicfragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class TransmisorFragment extends Fragment {

    private EditText eNombre, eCorreo;
    private Button bEnviar;
    comunicador interfaz;

    public TransmisorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_transmisor, container, false);

        eNombre = view.findViewById(R.id.eNombre);
        eCorreo = view.findViewById(R.id.eCorreo);
        bEnviar = view.findViewById(R.id.bEnviar);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaz.enviarDatos(eNombre.getText().toString(),eCorreo.getText().toString());
            }
        });

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        interfaz = (comunicador) activity;
    }
}
