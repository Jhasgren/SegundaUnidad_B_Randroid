package com.unlimitedappworks.randroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ListView lstv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstv = (ListView) findViewById(R.id.lstv);
        lstv.setAdapter(new Colores(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.datos)));
    }

    public void onClick(View v){
        startActivity(new Intent(this, ImagenesActivity.class));
    }

    public class Colores extends ArrayAdapter {
        private ArrayList<Integer> colores;

        public Colores(Context context, int resource, Object[] objects) {
            super(context, resource, objects);
            colores = new ArrayList<>();
            colores.add(getResources().getColor(R.color.uno));
            colores.add(getResources().getColor(R.color.dos));
            colores.add(getResources().getColor(R.color.tres));
            colores.add(getResources().getColor(R.color.cuatro));
            colores.add(getResources().getColor(R.color.cinco));
            colores.add(getResources().getColor(R.color.seis));
            colores.add(getResources().getColor(R.color.siete));
            colores.add(getResources().getColor(R.color.ocho));
            colores.add(getResources().getColor(R.color.nueve));
            colores.add(getResources().getColor(R.color.diez));
            colores.add(getResources().getColor(R.color.once));
            colores.add(getResources().getColor(R.color.doce));
            colores.add(getResources().getColor(R.color.trece));
            colores.add(getResources().getColor(R.color.catorce));
            colores.add(getResources().getColor(R.color.quince));
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = super.getView(position, convertView, parent);
            view.setBackgroundColor(colores.get(position));
            return view;
        }
    }
}
