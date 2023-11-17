package com.example.contacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_contacto);

        // Obtener datos de la actividad anterior
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String fechaNacimiento = intent.getStringExtra("fechaNacimiento");
        String telefono = intent.getStringExtra("telefono");
        String email = intent.getStringExtra("email");
        String descripcion = intent.getStringExtra("descripcion");

        // Mostrar datos en la actividad de confirmación
        TextView tvDatos = findViewById(R.id.tvDatos);
        String datos = "Nombre: " + nombre + "\nFecha de Nacimiento: " + fechaNacimiento
                + "\nTeléfono: " + telefono + "\nEmail: " + email + "\nDescripción: " + descripcion;
        tvDatos.setText(datos);

        Button btnEditarDatos = findViewById(R.id.btnEditarDatos);
        btnEditarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Regresar a la actividad anterior
                finish();
            }
        });
    }
}