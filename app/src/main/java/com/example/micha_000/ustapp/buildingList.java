package com.example.micha_000.ustapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.micha_000.ustapp.R;

public class buildingList extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_list);
        String[] buildings={"Albertus Magnus", "Alfredo M. Velayo", "Beato Angelico", "Central Seminary", "Martin de Porres", "Benavides", "Buenaventura Garcia Paredes", "Miguel de Benavides Library", "Quadricentennial Pavillion", "Raymund de Peñafort", "Roque Ruaño", "Thomas Aquinas Research Complex", "UST Hospital", "UST Main Building", "UST Tan Yan Kee Student Center" };
        ListAdapter buildingLists = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, buildings);
        ListView displayView = (ListView) findViewById(R.id.buildingView);
        displayView.setAdapter(buildingLists);
        displayView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String choice=String.valueOf(parent.getItemAtPosition(position));
                if (choice=="Roque Ruaño") {
                    Intent intent = new Intent(getApplicationContext(), roqueBuilding.class);
                    startActivity(intent);
                }

                else if (choice=="UST Main Building") {
                    Intent intent = new Intent(getApplicationContext(), mainBuilding.class);
                    startActivity(intent);
                }

                else if (choice=="Beato Angelico") {
                    Intent intent = new Intent(getApplication(), beatoAngelico.class);
                    startActivity(intent);
                }

                else if (choice=="Martin de Porres") {
                    Intent intent = new Intent(getApplication(), martinPorres.class);
                    startActivity(intent);
                }

                else if (choice=="Albertus Magnus") {
                    Intent intent = new Intent(getApplication(), Albertus.class);
                    startActivity(intent);
                }

                else if (choice=="Alfredo M. Velayo") {
                    Intent intent = new Intent(getApplication(), alfredoVelayo.class);
                    startActivity(intent);
                }

                else if (choice=="Benavides") {
                    Intent intent = new Intent(getApplication(), benavides.class);
                    startActivity(intent);
                }
                else if (choice=="Buenaventura Garcia Paredes") {
                    Intent intent = new Intent(getApplication(), raymund.class);
                    startActivity(intent);
                }

                else if (choice=="Raymund de Peñafort") {
                    Intent intent = new Intent(getApplication(), paredes.class);
                    startActivity(intent);
                }

                else if (choice=="UST Tan Yan Kee Student Center") {
                    Intent intent = new Intent(getApplication(), tanYanKee.class);
                    startActivity(intent);
                }

                else if (choice=="Miguel de Benavides Library") {
                    Intent intent = new Intent(getApplication(), library.class);
                    startActivity(intent);
                }

                else if (choice=="Thomas Aquinas Research Complex") {
                    Intent intent = new Intent(getApplication(), tarc.class);
                    startActivity(intent);
                }

                else if (choice=="Quadricentennial Pavillion") {
                    Intent intent = new Intent(getApplication(), quadPav.class);
                    startActivity(intent);
                }
                else if (choice=="Central Seminary") {
                    Intent intent = new Intent(getApplication(), seminary.class);
                    startActivity(intent);
                }

                else if (choice=="UST Hospital") {
                    Intent intent = new Intent(getApplication(), hospital.class);
                    startActivity(intent);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.building_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
