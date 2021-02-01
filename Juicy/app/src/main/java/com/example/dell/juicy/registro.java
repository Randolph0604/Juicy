package com.example.dell.juicy;

import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class registro extends AppCompatActivity {

    Button  bt_registrar;
    EditText campoNombre, campoClave, campoUsuario;

    ArrayList<usuario> listausuario;

    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        conn= new ConexionSQLiteHelper(this, "bd_usuario", null, 1);


        bt_registrar = findViewById(R.id.btn_registrar);


        campoNombre=findViewById(R.id.campo_nombre);
        campoClave=findViewById(R.id.campo_clave);
        campoUsuario=findViewById(R.id.campo_usuario);

        bt_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String verify_campo_nombre=campoNombre.getText().toString();
                String verify_campo_clave=campoClave.getText().toString();
                String verify_campo_usuario=campoUsuario.getText().toString();

                if (!verify_campo_nombre.equals("") && !verify_campo_clave.equals("") && !verify_campo_usuario.equals("")){
                    registrar(verify_campo_nombre, verify_campo_clave, verify_campo_usuario);

                }else{
                    Toast.makeText(getApplicationContext(),"Campos vacios !",Toast.LENGTH_LONG).show();
                }
                campoNombre.setText("");
                campoUsuario.setText("");
                campoClave.setText("");
            }
        });

    }

    private void registrar(String verify_campo_nombre, String verify_campo_clave, String verify_campo_usuario) {
        String vcu=verify_campo_usuario;
        String vcc=verify_campo_clave;
        String vcn=verify_campo_nombre;
        //Verifica si en la BBD existe un usuario con ese nombre
        SQLiteDatabase dbveri=conn.getReadableDatabase();

        Cursor cursor=dbveri.rawQuery("SELECT Nombre FROM usuario WHERE NombreUsuario = ?", new String[]{vcu});
        int si=cursor.getCount();
        if(si>=1){
            Toast.makeText(getApplicationContext(), "Error nombre de usuario ya existe !!", Toast.LENGTH_SHORT).show();
        }else{
            //Se cargan los datos y se envian a la BBD en una query

            ContentValues values = new ContentValues();
            values.put("Nombre", vcn);
            values.put("NombreUsuario", vcu);
            values.put("Clave", vcc);
            SQLiteDatabase db=conn.getWritableDatabase();
            db.insert("usuario",null,values);

            Toast.makeText(getApplicationContext(), "Exito al registrar !!", Toast.LENGTH_LONG).show();
            Intent paginaPaises= new Intent(registro.this, MainActivity.class);
            startActivity(paginaPaises);
        }




    }

}
