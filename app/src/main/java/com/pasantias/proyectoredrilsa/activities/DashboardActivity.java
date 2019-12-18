package com.pasantias.proyectoredrilsa.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.pasantias.proyectoredrilsa.R;
import com.pasantias.proyectoredrilsa.fragments.PanelControlFragment;
import com.pasantias.proyectoredrilsa.fragments.SecondFragment;
import com.pasantias.proyectoredrilsa.fragments.ThirdFragment;

import java.util.Calendar;

public class DashboardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }
    public void showFirstFragment(View view){
        // Get FragmentManager

        FragmentManager fragmentManager = getSupportFragmentManager();

        // Create FirstFragment
        Fragment fragment = new PanelControlFragment();
        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();

    }

    public void showSecondFragment(View view){
        // Get FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Create FirstFragment
        Fragment fragment = new SecondFragment();

        // Send 'param1' argument to Fragment
        Bundle args = new Bundle();
        args.putString("param1", "Hello Fragment!");
        fragment.setArguments(args);

        // Replace content
        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
    }

    public void showThirdFragment(View view){
        // Get FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Create FirstFragment with factory
        Fragment fragment = ThirdFragment.newInstance("Hello Again!");

        // Replace content
        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
    }


}


