package com.biniyam.dataactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity<btnApply> extends AppCompatActivity {

    ArrayList<String>  activitiesArrayList = new ArrayList<>();
    ListView activitiesListView;     // =  ListView petListView;  position index 1 

    ArrayList<Pet> petsArrayList = new ArrayList<>();

    Button btnApply;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

        btnApply = findViewById(R.id.btn_apply);
        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,PetActivity.class);
                startActivity(intent);
            }
        });

         */

        activitiesListView = findViewById(R.id.activities_listView);

        activitiesArrayList.add("Person Activity");
        activitiesArrayList.add("Pet Activity");
        activitiesArrayList.add("Car Activity");


        ArrayAdapter<String> activitiesArrayAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,activitiesArrayList);

        activitiesListView.setAdapter(activitiesArrayAdapter);


        activitiesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // code here
                if(position == 0){
                    // person activity clicked
                    startActivity(new Intent(MainActivity.this,PersonActivity.class));

                } else if (position ==1){
                    //pet
                   Pet.type = "cat";  Pet.setName("cat");
                    startActivity(new Intent(MainActivity.this,PetActivity.class));





                } else if(position ==2){
                    // car
                    startActivity(new Intent(MainActivity.this,CarActivity.class));

                }

            }
        });

    }


}