package com.biniyam.dataactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PersonActivity extends AppCompatActivity {


    ArrayList<Person> personArrayList = new ArrayList<>();
    ListView personListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personListView = findViewById(R.id.activities_listView);
        //petListView = findViewById(R.id.pet_lv);



        personArrayList.add(new Person("Abby", 22, "Abby Street"));
        personArrayList.add(new Person("Billy", 34, "Bill Street"));
        personArrayList.add(new Person("Caesar", 55, "Caesar Street"));




        ArrayAdapter<Person> personArrayAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                        personArrayList);
        personListView.setAdapter(personArrayAdapter);
        personListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // code here
                //Intent intent = new Intent(MainActivity.this, )
            }
        });

    }
}