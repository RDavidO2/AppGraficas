package com.example.appgraficos;

import android.content.Context;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Barras extends BarChart {
    public Barras(Context context) {
        super(context);
    }

    public Barras createBarras(){

        ArrayList<BarEntry> datos = new ArrayList<>();

        String[]nameX={"item1","item2"};
        int[]valoresY={1,2};
        int[]valoresX={5,0};
        datos.add(new BarEntry(valoresX[0], valoresY[0]));
        datos.add(new BarEntry(valoresX[1], valoresY[1]));
        datos.add(new BarEntry(11f, 2));
        datos.add(new BarEntry(12f, 3));
        datos.add(new BarEntry(13f, 4));
        datos.add(new BarEntry(14f, 5));
        datos.add(new BarEntry(15f, 6));
        datos.add(new BarEntry(16f, 7));



        String titulo_descripcion = "descripcion_label";
        //Modfificamos las graficas
        this.animateY(3000);
        Description description = new Description();
        description.setText(titulo_descripcion);
        this.setDescription(description);

        //Agregamos los datos
        BarDataSet bardataset = new BarDataSet(datos, "label_nombre");
        BarData data = new BarData(bardataset);
        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        this.setData(data);
        this.invalidate();
        return this;
    }
}
