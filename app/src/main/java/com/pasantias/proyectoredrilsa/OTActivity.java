package com.pasantias.proyectoredrilsa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OTActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private CardView cvMSuperficie;
    private CardView cvMInterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ot);

        cvMSuperficie=findViewById(R.id.cvMSuperficie);
        cvMSuperficie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMaquinaSuperficie();
            }
        });
        cvMInterior=findViewById(R.id.cvMInterior);
        cvMInterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMaquinaInterior();
            }
        });
    }

    private void irMaquinaInterior() {
        Intent intent = new Intent(OTActivity.this, MInteriorActivity.class);
        startActivity(intent);
    }

    private void irMaquinaSuperficie() {
            Intent intent = new Intent(OTActivity.this, MaquinasActivity.class);
            startActivity(intent);

    }

    public void IrPagina(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://intranet.redrilsa.com.pe/inicio.asp"));
        startActivity(browserIntent);
    }




}
