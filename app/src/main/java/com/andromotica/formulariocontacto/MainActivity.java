package com.andromotica.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnNext;
    EditText fullName;
    DatePicker picker;
    EditText phoneNumber;
    EditText email;
    EditText descriptionUser;

    String fullNameText;
    String diaText;
    String mesText;
    String anoText;
    String phoneNumberN;
    String emailText;
    String userDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext = findViewById(R.id.btnNext);
        fullName = findViewById(R.id.fullname);
        picker = findViewById(R.id.date);
        phoneNumber = findViewById(R.id.phoneNumber);
        email = findViewById(R.id.email);
        descriptionUser = findViewById(R.id.desciption);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });
    }

    public void nextActivity(){


        fullNameText = fullName.getText().toString();
        phoneNumberN = phoneNumber.getText().toString() ;
        emailText = email.getText().toString();
        userDescription = descriptionUser.getText().toString();
        diaText = String.valueOf(picker.getDayOfMonth()) ;
        mesText = String.valueOf(picker.getMonth());
        anoText = String.valueOf(picker.getYear());

        Intent intent = new Intent(getApplicationContext(), ConfirmarActivity.class);

        intent.putExtra("nombre", fullNameText);
        intent.putExtra("numero", phoneNumberN);
        intent.putExtra("email", emailText);
        intent.putExtra("descripcion", userDescription);
        intent.putExtra("dia", diaText);
        intent.putExtra("mes", mesText);
        intent.putExtra("ano", anoText);
        startActivity(intent);
    }
}