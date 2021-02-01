package com.example.dell.juicy;

import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button bt_enter, bt_registrar, bt_invitado;
    EditText campoNombre, campoClave, campoUsuario;
    ViewFlipper v_flipper;


    ArrayList<usuario> listausuario;

    ConexionSQLiteHelper conn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if(isConnectingToInternet(MainActivity.this))
        {
            Toast.makeText(getApplicationContext(),"internet is available",Toast.LENGTH_LONG).show();
            setContentView(R.layout.activity_main);
            //agregar el icono accion bar

                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setIcon(R.mipmap.ic_launcher);





            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        else {

            setContentView(R.layout.activity_main);

            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Compruebe la conexion !!");
            builder1.setCancelable(true);

            builder1.setNegativeButton(
                    "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            System.exit(0);
                            dialog.cancel();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();

        }

        conn= new ConexionSQLiteHelper(this, "bd_usuario", null, 1);

        bt_enter=findViewById(R.id.btn_login);
        bt_registrar=findViewById(R.id.btn_registrar);
        bt_invitado=findViewById(R.id.btn_invitado);

        campoNombre=findViewById(R.id.campo_nombre);
        campoClave=findViewById(R.id.campo_clave);
        campoUsuario=findViewById(R.id.campo_usuario);

        bt_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String verify_campo_usuario=campoUsuario.getText().toString();
                String verify_campo_clave=campoClave.getText().toString();

                if (!verify_campo_usuario.equals("") && !verify_campo_clave.equals("")){


                  if(verificarExistencia(verify_campo_usuario, verify_campo_clave)>=1){
                      Toast.makeText(getApplicationContext(),"Login succes !",Toast.LENGTH_LONG).show();
                      String a="1";
                      VerificacionUsers VR= new VerificacionUsers();
                      VR.setVerificacion(a);
                      Intent paginaPaises= new Intent(MainActivity.this, PaginaPaises.class);
                      startActivity(paginaPaises);

                      campoUsuario.setText("");
                      campoClave.setText("");
                  }else{
                      Toast.makeText(getApplicationContext(),"Usuario no existe !!",Toast.LENGTH_LONG).show();
                  }

                }else{
                    Toast.makeText(getApplicationContext(),"Campos vacios !",Toast.LENGTH_LONG).show();
                }

            }
        });

        bt_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registro= new Intent(MainActivity.this, registro.class);
                startActivity(registro);
            }
        });

        bt_invitado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent invitado= new Intent(MainActivity.this, PaginaPaises.class);
                String a="2";
                Toast.makeText(getApplicationContext(),"Haz iniciado como invitado !",Toast.LENGTH_LONG).show();
               VerificacionUsers VR= new VerificacionUsers();
               VR.setVerificacion(a);
                startActivity(invitado);
            }
        });

        int images[] = {R.drawable.comida1,R.drawable.comida2,R.drawable.comida3,R.drawable.comida4,R.drawable.comida5,R.drawable.comida6};
        v_flipper = findViewById(R.id.v_flipper);

        for (int image: images){
            flipperImages(image);
        }

    }


    public static boolean isConnectingToInternet(Context context)
    {
        ConnectivityManager connectivity =
                (ConnectivityManager) context.getSystemService(
                        Context.CONNECTIVITY_SERVICE);
        if (connectivity != null)
        {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED)
                    {
                        return true;
                    }
        }
        return false;
    }


    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000);
        v_flipper.setAutoStart(true);

        //animacion
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }

    private int verificarExistencia(String verify_campo_usuario, String verify_campo_clave) {
        String vcu=verify_campo_usuario;
        String vcc=verify_campo_clave;

        SQLiteDatabase db=conn.getReadableDatabase();
        Cursor cursor=db.rawQuery("SELECT Nombre FROM usuario WHERE NombreUsuario = ? AND Clave = ?", new String[]{vcu, vcc});
        int si=cursor.getCount();
        return si;

    }

}
