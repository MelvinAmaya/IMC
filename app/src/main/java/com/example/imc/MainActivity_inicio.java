package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_inicio extends AppCompatActivity {
    public Button ca;
    public Button tab;
    public ImageView btback;
    public TextView titulo;
    int cont;

    @Override
    public void onBackPressed() {
        if(cont==0)
        {
            Toast.makeText(getApplicationContext(),"Presione de Nuevo Para salir.",Toast.LENGTH_LONG).show();
            cont++;
        }
        else
        {
            super.onBackPressed();
        }

        new CountDownTimer(5000,1000){

            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                cont=0;
            }
        }.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio);
        ca = (Button) findViewById(R.id.btncal);
        tab = (Button) findViewById(R.id.btnTabla);
        btback = (ImageView) findViewById(R.id.btnatras);
        titulo = (TextView) findViewById(R.id.toolbar_title);
        titulo.setVisibility(View.INVISIBLE);
        btback.setVisibility(View.INVISIBLE);


        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity_tabla.class);
                startActivity(i);
            }
        });

    }
}