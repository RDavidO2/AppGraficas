package com.example.appgraficos;

import android.content.Context;
import android.util.AttributeSet;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class Pie extends PieChart {
    public Pie(Context context) {
        super(context);
    }


    public Pie generaPie(){
        String titulo="";

        //definimos descripcion
        Description description = new Description();
        //Aqui va la descripcion
        description.setText("Graficopie");


        //Modificaciones al pieChart
        this.setDescription(description);

        //si es int = false  float = true
        this.setUsePercentValues(true);
        this.setCenterText(titulo);
        this.setDrawHoleEnabled(true);




        //datos de cada porcion
        ArrayList<PieEntry> strings = new ArrayList<>();
        String[]labels = {"P1","P2"};
        int[]valores = {1,2};

        //                         flotante/int - string
        strings.add(new PieEntry((float)valores[0],labels[0]));
        strings.add(new PieEntry((float)valores[1],labels[1]));
        strings.add(new PieEntry(0.10f,"col3"));
        strings.add(new PieEntry(0.25f,"col4"));
        strings.add(new PieEntry(0.16f,"col5"));
        strings.add(new PieEntry(0.23f,"col6"));


        //Descripcion de los datos de cada porcion mas que todo disque el nombre del grafico
        PieDataSet dataSet = new PieDataSet(strings,"nombre_labels");


        //definimos los colores a usar
        ArrayList<Integer> colors = new ArrayList<>();
        for(int color: ColorTemplate.COLORFUL_COLORS){
            colors.add(color);
        }
        dataSet.setColors(colors);

    /*
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(Color.BLUE);
        colors.add(Color.BLUE);
        colors.add(getResources().getColor(R.color.blue));
        dataSet.setColors(colors);
*/



        //creamos un pie data
        PieData pieData = new PieData(dataSet);
        pieData.setDrawValues(true);
        //pieData.setDrawValues(true);



        //agregamos los datos al piechart
        this.setData(pieData);
        this.invalidate();
        //scrollView.addView(pieChart);
        //pieChart.invalidate();
        //return pieChart;
        return this;
    }

}
