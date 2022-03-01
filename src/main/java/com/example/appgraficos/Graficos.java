package com.example.appgraficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

import datos.EvaluaTexto;

/**
 *
 * */
public class Graficos extends AppCompatActivity {
    String datos ="";
    TextView textView;
    ScrollView scrollView;
    LinearLayout linearLayout;





    //Esto es al momento de que se crea
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficos);


        linearLayout= (LinearLayout) findViewById(R.id.lineaLayoutGraficos);
        scrollView = (ScrollView)findViewById(R.id.scrollGraph);

        recibeDatos();
        //muestraTexto();


        for(int i=0; i<5;i++){
            Pie pieG = new Pie(this);
            Barras barrasG = new Barras(this);
            linearLayout.addView(pieG.generaPie(),new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 500));
            linearLayout.addView(barrasG.createBarras(),new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 500));
        }

        Button boton_principal = new Button(this);
        boton_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(Graficos.this, MainActivity.class);
                startActivity(siguiente);
            }
        });
        boton_principal.setText("Editar");
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(linearLayout2);
        linearLayout2.addView(boton_principal);


    }

    //Metodo que sirve para llevar a la ventana principal
    public void ingresoTexto(View view){
        Intent ingresoTexto = new Intent(this, MainActivity.class);
        startActivity(ingresoTexto);



    }


    //Metodo encargado de recibir datos
    private void recibeDatos(){
        //Aqui podemos recibir las variables que viene al momento de crar o dentro del override
        //textView = (TextView)findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();  //crea el elemento que ayuda a jalar los extras
        datos = extras.getString("valText"); //Aqui recibimos los objetos

        /*Aqui se crea el analizador para las palabras*/
        EvaluaTexto evaluaTexto = new EvaluaTexto(datos);
        //datos2 = extras.getSerializable("nombreVAr");
    }


    private void muestraTexto(){
        textView.setText(datos);
    }




}