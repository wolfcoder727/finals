package com.example.micha_000.ustapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.micha_000.ustapp.R;

public class courseList extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
        String[] colleges={"AMV College of Accountancy", "College of Architecture", "College of Commerce and Business Administration",
                "College of Education", "College of Fine Arts and Design", "College of Nursing", "College of Rehabilitation Sciences",
                "College of Science", "College of Tourism and Hospitality Management", "Conservatory of Music",
                "Faculty of Arts and Letters", "Faculty of Engineering", "Faculty of Pharmacy" };
        ListAdapter collegeLists = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colleges);
        ListView displayView = (ListView) findViewById(R.id.collegeView);
        displayView.setAdapter(collegeLists);
        displayView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String choice=String.valueOf(parent.getItemAtPosition(position));
                if (choice=="Faculty of Engineering") {
                    Intent intent = new Intent(getApplicationContext(), engineeringChoices.class);
                    startActivity(intent);
                }
                else if (choice=="College of Science") {
                    Intent intent = new Intent(getApplicationContext(), scienceChoices.class);
                    startActivity(intent);
                }
                else if (choice=="College of Architecture") {
                    Intent intent = new Intent(getApplicationContext(), architecture.class);
                    startActivity(intent);
                }

                else if (choice=="College of Education") {
                    Intent intent = new Intent(getApplicationContext(), educationChoices.class);
                    startActivity(intent);
                }

                else if (choice=="College of Nursing") {
                    Intent intent = new Intent(getApplicationContext(), nursing.class);
                    startActivity(intent);
                }

                else if (choice=="Conservatory of Music") {
                    Intent intent = new Intent(getApplicationContext(), music.class);
                    startActivity(intent);
                }

                else if (choice=="AMV College of Accountancy") {
                    Intent intent = new Intent(getApplicationContext(), accountingChoices.class);
                    startActivity(intent);
                }

                else if (choice=="College of Commerce and Business Administration") {
                    Intent intent = new Intent(getApplicationContext(), commerceChoices.class);
                    startActivity(intent);
                }

                else if (choice=="College of Fine Arts and Design") {
                    Intent intent = new Intent(getApplicationContext(), cfadChoices.class);
                    startActivity(intent);
                }

                else if (choice=="College of Rehabilitation Sciences") {
                    Intent intent = new Intent(getApplicationContext(), crsChoices.class);
                    startActivity(intent);
                }

                else if (choice=="College of Tourism and Hospitality Management") {
                    Intent intent = new Intent(getApplicationContext(), cthmChoices.class);
                    startActivity(intent);
                }

                else if (choice=="Faculty of Arts and Letters") {
                    Intent intent = new Intent(getApplicationContext(), abCourses.class);
                    startActivity(intent);
                }

                else if (choice=="Faculty of Pharmacy") {
                    Intent intent = new Intent(getApplicationContext(), pharmacyChoices.class);
                    startActivity(intent);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.course_list, menu);
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
