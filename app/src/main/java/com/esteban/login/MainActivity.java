package com.esteban.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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


    TextView titulo;

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "ESTOY EN onResume");
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        clave = findViewById(R.id.clave);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        titulo = findViewById(R.id.titulo);


        btn1.setOnClickListener(view -> {
            String Usuario = user.getText().toString();
            String Contrasena = clave.getText().toString();

            if (Usuario.isEmpty() || Contrasena.isEmpty()) {
                Toast.makeText(MainActivity.this, "user o clave vacíos", Toast.LENGTH_SHORT).show();
            } else {
                if (Usuario.equals("Admin") && Contrasena.equals("123")) {
                    Intent intent = new Intent(MainActivity.this, PantallaDos.class);
                    intent.putExtra("user", Usuario);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "user o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        }
        );
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titulo.setText("BIENVENIDO AL LOGIN");
            }
        });

    }

}

