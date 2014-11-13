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

public class abCourses extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab_courses);
        String[] engineeringCourses={"Bachelor of Arts in Asian Studies", "Bachelor of Arts in Behavioral Science",
                "Bachelor of Arts in Communication Arts", "Bachelor of Arts in Economics",
                "Bachelor of Arts in English Language Studies", "Bachelor of Arts in History", "Bachelor of Arts in Journalism",
                "Bachelor of Arts in Legal Management", "Bachelor of Arts in Literature", "Bachelor of Arts in Philosophy",
                "Bachelor of Arts in Political Science", "Bachelor of Arts in Sociology"};
        ListAdapter coursesLists = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, engineeringCourses);
        ListView displayView = (ListView) findViewById(R.id.abCourseList);
        displayView.setAdapter(coursesLists);
        displayView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String choice=String.valueOf(parent.getItemAtPosition(position));
                if (choice=="Bachelor of Arts in Asian Studies") {
                    Intent intent = new Intent(getApplicationContext(), computerScience.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Arts in Behavioral Science") {
                    Intent intent = new Intent(getApplicationContext(), informationTechnology.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Arts in Communication Arts") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Arts in Economics") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Arts in English Language Studies") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Arts in History") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Arts in Journalism") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Arts in Legal Management") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Arts in Literature") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Arts in Philosophy") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Arts in Political Science") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Arts in Sociology") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ab_courses, menu);
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
