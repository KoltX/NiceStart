package com.ramiro.ernesto.nicestart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.AnyChartView;
import com.anychart.AnyChart;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;

public class AnyChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_any_chart);
        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);        
        Pie pie = AnyChart.pie();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("John", 10000));
        data.add(new ValueDataEntry("Jake", 12000));
        data.add(new ValueDataEntry("Peter", 18000));

        pie.data(data);
        
        anyChartView.setChart(pie);

    }

}
