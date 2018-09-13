package com.edwinacubillos.comunicfragments;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements comunicador{

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        TransmisorFragment transmisorFragment = new TransmisorFragment();
        fragmentTransaction.add(android.R.id.content, transmisorFragment).commit();
    }

    @Override
    public void enviarDatos(String nombre, String correo) {
        Bundle data = new Bundle();
        data.putString("nombre", nombre);
        data.putString("correo",correo);

        fragmentTransaction = fragmentManager.beginTransaction();

        ReceptorFragment receptorFragment = new ReceptorFragment();
        receptorFragment.setArguments(data);

        fragmentTransaction.replace(android.R.id.content, receptorFragment).commit();
    }

}
