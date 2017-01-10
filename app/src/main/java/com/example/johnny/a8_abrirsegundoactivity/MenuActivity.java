package com.example.johnny.a8_abrirsegundoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView txtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        txtMensaje = (TextView) findViewById(R.id.txtMensaje);

        Bundle bundle = getIntent().getExtras();

        String usuario = bundle.getString("usuario");
        String password = bundle.getString("password");

        txtMensaje.setText("Hola " + usuario
                + " la contraseña que ingresaste fue " + password);
    }
}
