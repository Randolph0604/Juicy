package com.example.dell.juicy;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Screen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login = new Intent(Splash_Screen.this,MainActivity.class);
                startActivity(login);
                finish();
            }
        },1000);

    }
}
