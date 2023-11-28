package com.example.trabajo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText usuario, contrasenia;
    Button login;
    CheckBox recordar;
    private SharedPreferences sharedpref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.usuario);
        contrasenia = findViewById(R.id.contrasenia);
        login = findViewById(R.id.login);
        recordar = findViewById(R.id.recordar);

        // Configurar un OnClickListener para el botón "Login"
        login.setOnClickListener(this);
        sharedpref = getSharedPreferences("mi_fichero", Context.MODE_PRIVATE);
    }

        public void onButtonClick(View view) {
            switch (view.getId()) {
                case R.id.login:
                    String nombreIngresado = usuario.getText().toString();
                    String contraIngresada = contrasenia.getText().toString();

                    // Si "Pepito" solo marca el checkbox y previamente se guardó su acceso, entra directamente
                    if (nombreIngresado.equals("Pepito") && contraIngresada.isEmpty() && recordar.isChecked() && sharedpref.getBoolean("recordarPepito", false)) {
                        iniciarSesion();
                        return;
                    }

                    // Si ingresa las credenciales correctamente
                    if (nombreIngresado.equals("Pepito") && contraIngresada.equals("pepito69")) {
                        sharedpref.edit().putBoolean("recordarPepito", true).apply();
                        iniciarSesion();
                    } else {
                        Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
        }

        private void iniciarSesion() {
            Intent lista = new Intent(this, Registrar.class);
            startActivity(lista);
            finish();  // Cierro actividad de login.
        }
}
