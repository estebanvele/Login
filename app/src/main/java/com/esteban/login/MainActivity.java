package com.esteban.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String Tag = "Prueba";
    EditText user;
    EditText clave;
    Button btn1;
    Button btn2;
    Button btnAcercaDe;

    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        clave = findViewById(R.id.clave);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        titulo = findViewById(R.id.titulo);
        btnAcercaDe = findViewById(R.id.btnAcercaDe);


        btn1.setOnClickListener(view -> {
            String Usuario = user.getText().toString();
            String Contrasena = clave.getText().toString();

            if (Usuario.isEmpty() || Contrasena.isEmpty()) {
                Toast.makeText(MainActivity.this, "user o clave vacíos", Toast.LENGTH_SHORT).show();
            } else {
                    Intent intent = new Intent(MainActivity.this, PantallaDos.class);
                    intent.putExtra("user", Usuario);
                    startActivity(intent);

            }
        }
        );

    }



    @Override
    protected void onResume() {
        super.onResume();


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titulo.setText("BOTON DE REGISTREARSE");
            }
        });
        btnAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titulo.setText("Inicie sesion para continuar");
            }
        });

        // Mostrar un mensaje al reanudar la aplicación
        Toast.makeText(this, "HOLA, BIENVENIDO", Toast.LENGTH_SHORT).show();


    }
}

