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

public class engineeringChoices extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering_choices);
        String[] engineeringCourses={"Bachelor of Science in Chemical Engineering", "Bachelor of Science in Civil Engineering",
                "Bachelor of Science in Computer Science", "Bachelor of Science in Electrical Engineering",
                "Bachelor of Science in Electronics Engineering", "Bachelor of Science in Industrial Engineering",
                "Bachelor of Science in Information Studies", "Bachelor of Science in Information Technology",
                "Bachelor of Science in Mechanical Engineering"
                };
        ListAdapter coursesLists = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, engineeringCourses);
        ListView displayView = (ListView) findViewById(R.id.engineeringCourseList);
        displayView.setAdapter(coursesLists);
        displayView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String choice=String.valueOf(parent.getItemAtPosition(position));
                if (choice=="Bachelor of Science in Computer Science") {
                    Intent intent = new Intent(getApplicationContext(), computerScience.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Science in Information Technology") {
                    Intent intent = new Intent(getApplicationContext(), informationTechnology.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Science in Information Studies") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Science in Chemical Engineering") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Science in Civil Engineering") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Science in Electrical Engineering") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Science in Electronics Engineering") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Science in Industrial Engineering") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
                else if (choice=="Bachelor of Science in Mechanical Engineering") {
                    Intent intent = new Intent(getApplicationContext(), informationStudies.class);
                    startActivity(intent);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.engineering_choices, menu);
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
