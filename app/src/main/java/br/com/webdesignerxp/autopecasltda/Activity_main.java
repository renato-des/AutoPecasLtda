package br.com.webdesignerxp.autopecasltda;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Renato on 11/21/2015.
 */
public class Activity_main extends AppCompatActivity {

    String[] fabricantes = {"TOYOTA", "FORD", "GM", "FIAT", "VW", "AUDI", "BMW"};

    int arr_images[] = {R.drawable.toyota, R.drawable.ford, R.drawable.gm,
            R.drawable.fiat, R.drawable.vw, R.drawable.audi, R.drawable.bmw};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner = (Spinner) findViewById(R.id.fab_spinner);
        mySpinner.setPrompt("Selecione uma Montadora");
        ArrayAdapter<String> adapter = new MyAdapter(Activity_main.this, R.layout.row, fabricantes);
        mySpinner.setAdapter(adapter);

//comentatio git use
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_menu);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        return true;
    }

    public class MyAdapter extends ArrayAdapter {
        public MyAdapter(Context context, int textViewResourceId, String[] objects) {
            super(context, textViewResourceId, objects);
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.row, parent, false);
            TextView label = (TextView) row.findViewById(R.id.company);
            label.setText(fabricantes[position]);
            ImageView icon = (ImageView) row.findViewById(R.id.image);
            icon.setImageResource(arr_images[position]);
            return row;
        }
    }
}
