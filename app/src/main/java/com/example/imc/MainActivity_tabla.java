package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_tabla extends AppCompatActivity {
    public ImageView re;
    public TextView titu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tabla);
        re = (ImageView) findViewById(R.id.btnatras);
        titu = (TextView) findViewById(R.id.toolbar_title);
        titu.setText("Tabla IMC");

        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}