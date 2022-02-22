package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText altura;
    public EditText peso;
    public Button calcular;
    public Button limpiar;
    float pesokg,alturamt;
    public ImageView bak;
    String pe,al;
    double imc;
    public TextView mensja,title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        altura = (EditText) findViewById(R.id.txtAltura);
        peso = (EditText) findViewById(R.id.txtPeso);
        calcular = (Button) findViewById(R.id.btnCalcular);
        limpiar = (Button) findViewById(R.id.btnLimpiar);
        mensja= (TextView) findViewById(R.id.txtmensaje);
        bak = (ImageView) findViewById(R.id.btnatras);
        title = (TextView) findViewById(R.id.toolbar_title);
        title.setText("IMC");

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CalcularImc();
            }
        });



        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altura.setText("");
                peso.setText("");
                mensja.setVisibility(View.INVISIBLE);
                mensja.setText("");
            }
        });

        bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void CalcularImc(){


        if( peso.getText().toString().equals("") | altura.getText().toString().equals("")){
            Toast.makeText(this,"Por favor rellene todos los campos...",Toast.LENGTH_LONG).show();
        }
        else
        {
            pesokg = Float.parseFloat(peso.getText().toString());
            alturamt = Float.parseFloat(altura.getText().toString());
            imc = Math.round((pesokg/(alturamt*alturamt))*100.0)/100.0;
            if(imc <18.5)
            {
                mensja.setText("Tu Indice de Masa es: "+imc+", Estas Por deajo del peso normal");
            }
            else if(imc >=18.5 && imc <=24.9)
            {
                mensja.setText("Tu Indice de Masa es: "+imc+", Tienes un peso Normal");
            }
            else if (imc>=25.0 && imc <=29.9)
            {
                mensja.setText("Tu Indice de Masa es: "+imc+", Tienes Sobrepeso");
            }
            else if (imc>=30.0 && imc <=34.9)
            {
                mensja.setText("Tu Indice de Masa es: "+imc+", Tienes Obecidad grado 1");

            }
            else if (imc>=35.0 && imc <=39.9)
            {
                mensja.setText("Tu Indice de Masa es: "+imc+", Tienes Obecidad grado 2");
            }
            else if (imc>=40.0 )
            {
                mensja.setText("Tu Indice de Masa es: "+imc+", Tienes Obecidad grado 3 (Extrema) ");
            }
            mensja.setVisibility(View.VISIBLE);
        }


    }
}