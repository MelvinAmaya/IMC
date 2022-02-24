package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_about extends AppCompatActivity {
    public ImageView atras;
    public TextView titu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_about);

        atras = (ImageView) findViewById(R.id.btnatras);
        titu = (TextView) findViewById(R.id.toolbar_title);

        titu.setText("About");

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}