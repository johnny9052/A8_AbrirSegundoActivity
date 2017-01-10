package com.example.johnny.a8_abrirsegundoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
    }


    public void validar(View view) {
        String usuario = txtUsuario.getText().toString();
        String password = txtPassword.getText().toString();

        if (!usuario.equals("") && !password.equals("")) {
            Intent intent = new Intent(this, MenuActivity.class);
            intent.putExtra("usuario", usuario);
            intent.putExtra("password", password);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(),
                    "Ingrese los datos solicitados", Toast.LENGTH_SHORT).show();
        }
    }
}
