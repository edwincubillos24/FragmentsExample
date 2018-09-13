package com.edwinacubillos.comunicfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReceptorFragment extends Fragment {

    private TextView tNombre, tCorreo;

    public ReceptorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_receptor, container, false);

        tNombre = view.findViewById(R.id.tNombre);
        tCorreo = view.findViewById(R.id.tCorreo);

        Bundle data = getArguments();
        tNombre.setText(data.getString("nombre"));
        tCorreo.setText(data.getString("correo"));


        return view;
    }

}
