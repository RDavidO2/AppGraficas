package com.example.appgraficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Reportes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
    }


    //Metodo de los botones SIGUIENTE
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, MainActivity.class);
        startActivity(siguiente);
    }
}