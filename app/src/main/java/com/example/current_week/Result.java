package com.example.current_week;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class Result extends AppCompatActivity {

    private final String extra = "VALOR";
    private int dia;
    private TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        validar();


    }

    public void regresar(View vista){
        Intent cambiar = new Intent(this, MainActivity.class);
        startActivity(cambiar);

    }

    public void validar(){

        mensaje = (TextView)findViewById(R.id.mensajeResultado);

        int extras = getIntent().getIntExtra("VALOR",0);
        Calendar calendarioDia = Calendar.getInstance();
        dia = calendarioDia.get(Calendar.DAY_OF_MONTH);
        System.out.println(extras);

        if (extras == dia){
            mensaje.setText("Correcto");
            mensaje.setTextColor(Color.GREEN);


        }else {
            mensaje.setText("Incorrecto");
            mensaje.setTextColor(Color.RED);

        }
    }
}
