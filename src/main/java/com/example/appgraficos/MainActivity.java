package com.example.appgraficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.github.mikephil.charting.charts.PieChart;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private String value ="";
    TextInputEditText inputEditText = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //LinearLayout linearLayout= (LinearLayout) findViewById(R.id.lineaLayoutGraficos);
        inputEditText = (TextInputEditText) findViewById(R.id.inputText);

    }


    //Metodo de los botones SIGUIENTE
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, Graficos.class);
        //Intent siguiente = new Intent(this, Reportes.class);


        value = inputEditText.getText().toString();
        siguiente.putExtra("valText",value); //Aqui mandamos los elementos que querramos
        //siguiente.putExtra("nombreVar",Objeto); //Aqui mandamos los elementos que querramos
        startActivity(siguiente);
    }



}