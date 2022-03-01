package com.example.appgraficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.LinearLayout;

import com.github.mikephil.charting.charts.PieChart;
import com.google.android.material.textfield.TextInputEditText;

import datos.EvaluaTexto;

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

        Intent siguiente;

        value = inputEditText.getText().toString();
        boolean analisis = new EvaluaTexto(value).init();
        if(analisis){
            siguiente =  new Intent(this, Graficos.class);
        }else{
            System.out.println("boolean: "+analisis);
            siguiente = new Intent(this, Reportes.class);
        }


        siguiente.putExtra("valText",value); //Aqui mandamos los elementos que querramos
        siguiente.putExtra("analisis",true); //Aqui mandamos los elementos que querramos
        startActivity(siguiente);
    }



}