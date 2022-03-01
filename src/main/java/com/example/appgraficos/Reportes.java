package com.example.appgraficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import datos.EvaluaTexto;

public class Reportes extends AppCompatActivity {
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        textView = (TextView) findViewById(R.id.textView_R);
        recibeDatos();
    }


    //Metodo de los botones SIGUIENTE
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, MainActivity.class);
        startActivity(siguiente);
    }

    private void recibeDatos(){
        //Aqui podemos recibir las variables que viene al momento de crar o dentro del override
        //textView = (TextView)findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();  //crea el elemento que ayuda a jalar los extras
        boolean fallo = extras.getBoolean("analisis"); //Aqui recibimos los objetos
        System.out.println("Sigo vivo en reportes");
        if(fallo==false){
            System.out.println("Sigo vivo en reportes y ahora en texview");
            textView.setText("Error encontrado, por favor revise su gramatica");

        }
        textView.setText("Error encontrado, por favor revise su gramatica");
        /*Aqui se crea el analizador para las palabras*/
        //datos2 = extras.getSerializable("nombreVAr");
    }




}