package com.pasantias.proyectoredrilsa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.pasantias.proyectoredrilsa.activities.DashboardActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IrFormulario(View view) {
        Intent intent = new Intent(MainActivity.this, OTActivity.class);
        startActivity(intent);
    }

    public void IrPagina(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.redrilsa.com.pe/"));
        startActivity(browserIntent);
    }


    public void irProyectos(View view) {
        Intent projectintent = new Intent(MainActivity.this, DashboardActivity.class);
        startActivity(projectintent);
    }
}
