package com.edwinacubillos.fragmentsexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class BottonNavActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            fragmentTransaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.mBatman:
                    BatmanFragment batmanFragment = new BatmanFragment();
                    fragmentTransaction.replace(R.id.framelayout, batmanFragment).commit();
                    return true;
                case R.id.mSuperman:
                    SupermanFragment supermanFragment = new SupermanFragment();
                    fragmentTransaction.replace(R.id.framelayout, supermanFragment).commit();
                    return true;
                case R.id.mFlash:
                    FlashFragment flashFragment = new FlashFragment();
                    fragmentTransaction.replace(R.id.framelayout, flashFragment).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botton_nav);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        SupermanFragment supermanFragment = new SupermanFragment();
        fragmentTransaction.add(R.id.framelayout, supermanFragment).commit();
    }

}
