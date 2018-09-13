package com.edwinacubillos.fragmentsexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        BatmanFragment batmanFragment = new BatmanFragment();
        fragmentTransaction.add(android.R.id.content,batmanFragment).commit();
    }

    public void cambiarClicked(View view) {
        fragmentTransaction = fragmentManager.beginTransaction();

        SupermanFragment supermanFragment = new SupermanFragment();
        fragmentTransaction.replace(android.R.id.content,supermanFragment).commit();
    }
}
