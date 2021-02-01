package com.example.dell.juicy;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Category extends AppCompatActivity {

    ImageView ivSALUDABLE, ivRAPIDA, ivTIPICA,ivBEBIDA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ivSALUDABLE=findViewById(R.id.categorySaludable);
        ivRAPIDA=findViewById(R.id.categoryRapida);
        ivTIPICA=findViewById(R.id.categoryTipica);
        ivBEBIDA=findViewById(R.id.categoryBebida);

        ivSALUDABLE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toastsiguiente=Toast.makeText(getApplicationContext(), "Categoria: Comida Saludable", Toast.LENGTH_SHORT);
                toastsiguiente.show();
                Intent paginacomida= new Intent (Category.this, Main2Activity.class);

                //Aqui guardamos el valor del pais seleccionado y se carga en una variable para mandarlo a la siguiente activity
                Intent intent = getIntent();
                String paisSeleccionado = intent.getExtras().getString("PAIS");
                paginacomida.putExtra("PAISSELECT", paisSeleccionado);
                paginacomida.putExtra("CATEGORIASELECT", "SALUDABLE");


                startActivity(paginacomida);
            }
        });

        ivRAPIDA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toastsiguiente=Toast.makeText(getApplicationContext(), "Categoria: Comida Rapida", Toast.LENGTH_SHORT);
                toastsiguiente.show();
                Intent paginacomida= new Intent (Category.this, Main2Activity.class);

                //Aqui guardamos el valor del pais seleccionado y se carga en una variable para mandarlo a la siguiente activity
                Intent intent = getIntent();
                String paisSeleccionado = intent.getExtras().getString("PAIS");
                paginacomida.putExtra("PAISSELECT", paisSeleccionado);
                paginacomida.putExtra("CATEGORIASELECT", "RAPIDA");


                startActivity(paginacomida);
            }
        });

        ivTIPICA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toastsiguiente=Toast.makeText(getApplicationContext(), "Categoria: Comida Tipica", Toast.LENGTH_SHORT);
                toastsiguiente.show();
                Intent paginacomida= new Intent (Category.this, Main2Activity.class);

                //Aqui guardamos el valor del pais seleccionado y se carga en una variable para mandarlo a la siguiente activity
                Intent intent = getIntent();
                String paisSeleccionado = intent.getExtras().getString("PAIS");
                paginacomida.putExtra("PAISSELECT", paisSeleccionado);
                paginacomida.putExtra("CATEGORIASELECT", "TIPICA");


                startActivity(paginacomida);
            }
        });

        ivBEBIDA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toastsiguiente=Toast.makeText(getApplicationContext(), "Categoria: Bebidas", Toast.LENGTH_SHORT);
                toastsiguiente.show();
                Intent paginacomida= new Intent (Category.this, Main2Activity.class);

                //Aqui guardamos el valor del pais seleccionado y se carga en una variable para mandarlo a la siguiente activity
                Intent intent = getIntent();
                String paisSeleccionado = intent.getExtras().getString("PAIS");
                paginacomida.putExtra("PAISSELECT", paisSeleccionado);
                paginacomida.putExtra("CATEGORIASELECT", "BEBIDA");


                startActivity(paginacomida);
            }
        });




    }



}
