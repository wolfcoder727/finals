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

public class educationChoices extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_choices);
        String[] engineeringCourses={"Bachelor in Elementary Education Major in Pre-School Education",
                "Bachelor in Elementary Education Major in Special Education",
                "Bachelor of Science in Food Technology", "Bachelor in Library and Information Science",
                "Bachelor of Science in Nutrition and Dietetics", "Bachelor in Secondary Education"};
        ListAdapter coursesLists = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, engineeringCourses);
        ListView displayView = (ListView) findViewById(R.id.educationCourseList);
        displayView.setAdapter(coursesLists);
        displayView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String choice=String.valueOf(parent.getItemAtPosition(position));
                if (choice=="Bachelor in Elementary Education Major in Pre-School Education") {
                    Intent intent = new Intent(getApplicationContext(), bsElemEdInPreSchool.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor in Elementary Education Major in Special Education") {
                    Intent intent = new Intent(getApplicationContext(), bsElemEdInSped.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Science in Food Technology") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor in Library and Information Science") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Science in Nutrition and Dietetics") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor in Secondary Education") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.education_choices, menu);
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
