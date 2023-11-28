package com.example.trabajo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Registrar extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<Empleado> empleado = new ArrayList<>();
    TextView nombre, cargo, compania;
    Button btnRegistrar, btnVerEmpleado;
    public SharedPreferences sharedpref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        nombre = findViewById(R.id.editTextNombre);
        cargo = findViewById(R.id.editTextCargo);
        compania = findViewById(R.id.editTextCompania);

        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnVerEmpleado = findViewById(R.id.btnVerEmpleado);

        btnRegistrar.setOnClickListener(this);
        btnVerEmpleado.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRegistrar:

                String nombreGuardar = nombre.getText().toString();
                String cargoGuardar = cargo.getText().toString();
                String companiaGuardar = compania.getText().toString();

                //creo el objeto nuevo empleado cuando el usuario registre sus datos.
                Empleado nuevoEmpleado = new Empleado(nombreGuardar, cargoGuardar, companiaGuardar);
                empleado.add(nuevoEmpleado);
                // Obtén una referencia al contexto
                Context context = this.getApplicationContext();

                // Instancia el objeto SharedPreferences y crea el archivo
                SharedPreferences sharedPref = context.getSharedPreferences("", Context.MODE_PRIVATE);

                // Edita el archivo SharedPreferences
                SharedPreferences.Editor editor = sharedPref.edit();

                // Guarda los valores en el archivo
                editor.putString("usuario", nombreGuardar);
                editor.putString("Contraseña", cargoGuardar);
                editor.putString("Compañia", companiaGuardar);

                // Aplica los cambios y guarda el archivo
                editor.apply();

                // Indica al usuario que los datos se han guardado
                Toast.makeText(this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnVerEmpleado:
                // Abro la actividad para ver los empleados y paso la lista como un extra
                Intent intent = new Intent(this, VerEmpleadosActivity.class);
                intent.putParcelableArrayListExtra("empleados", empleado);
                startActivity(intent);
                break;




        }


    }
}