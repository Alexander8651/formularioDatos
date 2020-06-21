package com.andromotica.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarActivity extends AppCompatActivity {

    Button edit;
    TextView nombre;
    TextView fechanacimiento;
    String dia;
    String mes;
    String ano;
    TextView tel;
    TextView email;
    TextView descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);

        edit = findViewById(R.id.btnEdit);
        nombre = findViewById(R.id.nombreConfirmar);
        tel = findViewById(R.id.telConfirmar);
        email = findViewById(R.id.emailConfirmar);
        descripcion = findViewById(R.id.descripcionConfirmar);
        fechanacimiento = findViewById(R.id.fechaConfirmar);
        dia = getIntent().getExtras().getString("dia");
        mes = getIntent().getExtras().getString("mes");
        ano = getIntent().getExtras().getString("ano");


        nombre.setText(getIntent().getExtras().getString("nombre"));
        tel.setText(getIntent().getExtras().getString("numero"));
        email.setText(getIntent().getExtras().getString("email"));
        descripcion.setText(getIntent().getExtras().getString("descripcion"));
        fechanacimiento.setText(String.format("%s/%s/%s", dia, mes, ano));

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}