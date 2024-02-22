package com.esteban.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class PantallaDos extends AppCompatActivity {

    TextView tvSaludo;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_dos);

        tvSaludo = findViewById(R.id.tvSaludo);

        String user = getIntent().getStringExtra("user");

        tvSaludo.setText("¡Bienvenido de nuevo " + user + "!");
    }


}
