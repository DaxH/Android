package com.example.current_week;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txt_entrada;
    private Button btn_check;
    private final String extra = "VALOR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_entrada=(EditText)findViewById(R.id.txt_entrada);
        btn_check = (Button)findViewById(R.id.btn_check);

        btn_check.setOnClickListener(startAClickListener);
    }

    private  View.OnClickListener startAClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strNumero;
            strNumero = txt_entrada.getText().toString();

            if (strNumero.isEmpty()) {

                txt_entrada.setError("El campo no puede quedar vacio");

            }else {
                int numero = Integer.parseInt(strNumero);

                Intent cambiar = new Intent(MainActivity.this, Result.class);
                cambiar.putExtra(extra,numero);
                startActivity(cambiar);
            }
        }
    };
}