package com.example.ex084;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner countries;
    TextView info;

    String[] countriesNames = {"", "Japan", "Italy", "Austria", "Ukraine", "Spain", "Greece", "France"};
    int[] countriesFlag = {android.R.color.transparent, R.drawable.japan, R.drawable.italy, R.drawable.austria, R.drawable.ukraine, R.drawable.spain, R.drawable.greece, R.drawable.france};
    String[] countriesCapital = {"", "Tokyo", "Roma", "vienna", "Kiev", "Madrid", "Athens", "Paris"};

    String[][] countriesInfo = {{"kimigayo", "126.2 million", "Japanese"},
                                {"Il Canto degli Italiani", "59.55 million", "Italian"},
                                {"Land der Berge, Land am Strome", "8.9 million", "German"},
                                {"Shche ne vmerla Ukrainy i slava, i volia", "44.13 million", "Ukrainian"},
                                {"Marcha Real", "47.35 million", "Spanish"},
                                {"Hymn to Liberty", "10.72 million", "Greek"},
                                {"La Marseillaise", "67.39 million", "French"}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countries = (Spinner) findViewById(R.id.countries);
        info = (TextView) findViewById(R.id.info);

        countries.setOnItemSelectedListener(this);

        CustomAdapter customAdp = new CustomAdapter(getApplicationContext(),
                countriesNames, countriesFlag, countriesCapital);
        countries.setAdapter(customAdp);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0)
        {
            info.setText("");
        }
        else
        {
            info.setText("Country:\n" + countriesNames[position] + "\n\nCapital:\n" + countriesCapital[position] + "\n\nAnthem:\n" + countriesInfo[position - 1][0] + "\n\nPopulation:\n" + countriesInfo[position - 1][1] + "\n\nLanguages:\n" + countriesInfo[position - 1][2]);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}