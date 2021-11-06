package com.example.ex084;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;

    String[] countriesNames;
    int[] countriesFlag;
    String[] countriesCapital;

    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] countriesNames, int[] countriesFlag, String[] countriesCapital) {
        this.context = context;
        this.countriesNames = countriesNames;
        this.countriesFlag = countriesFlag;
        this.countriesCapital = countriesCapital;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countriesNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_layout, null);
        ImageView flag = (ImageView) view.findViewById(R.id.flagIV);
        TextView name = (TextView) view.findViewById(R.id.nameTV);
        TextView capital = (TextView) view.findViewById(R.id.capitalTV);
        name.setText(countriesNames[i]);
        capital.setText(countriesCapital[i]);
        flag.setImageResource(countriesFlag[i]);
        return view;
    }
}