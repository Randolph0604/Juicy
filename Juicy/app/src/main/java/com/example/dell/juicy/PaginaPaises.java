package com.example.dell.juicy;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PaginaPaises extends AppCompatActivity {
    ImageView ivRD, ivUSA, ivEPN,ivCHINA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_paises);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ivRD=findViewById(R.id.paisRD);
        ivUSA=findViewById(R.id.paisUSA);
        ivEPN=findViewById(R.id.paisESPANA);
        ivCHINA=findViewById(R.id.paisCHINA);

        ivRD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toastsiguiente=Toast.makeText(getApplicationContext(), "Haz seleccionado Republica Dominicana", Toast.LENGTH_SHORT);
                toastsiguiente.show();
                Intent siguiente= new Intent(PaginaPaises.this, Category.class);

                siguiente.putExtra("PAIS", "RD");
                startActivity(siguiente);
            }
        });

        ivUSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toastsiguiente=Toast.makeText(getApplicationContext(), "Haz seleccionado Estados Unidos", Toast.LENGTH_SHORT);
                toastsiguiente.show();
                Intent siguiente= new Intent(PaginaPaises.this, Category.class);
                siguiente.putExtra("PAIS", "USA");
                startActivity(siguiente);
            }
        });

        ivEPN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toastsiguiente=Toast.makeText(getApplicationContext(), "Haz seleccionado España", Toast.LENGTH_SHORT);
                toastsiguiente.show();
                Intent siguiente= new Intent(PaginaPaises.this, Category.class);
                siguiente.putExtra("PAIS", "ESPANA");
                startActivity(siguiente);

            }
        });

        ivCHINA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toastsiguiente=Toast.makeText(getApplicationContext(), "Haz seleccionado China", Toast.LENGTH_SHORT);
                toastsiguiente.show();
                Intent siguiente= new Intent(PaginaPaises.this, Category.class);
                siguiente.putExtra("PAIS", "CHINA");
                startActivity(siguiente);
            }
        });
    }
}
