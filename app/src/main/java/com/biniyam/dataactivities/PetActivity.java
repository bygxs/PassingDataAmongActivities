package com.biniyam.dataactivities;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class PetActivity extends AppCompatActivity {

   // ArrayList<Pet> petsArrayList = new ArrayList<>();
    //ListView petListView;
    TextView petTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet);

        petTextView = findViewById(R.id.pet_textView);
        //petTextView.getText();

      //  String pet = Pet.getType();

       // Toast.makeText(this, ""+pet, Toast.LENGTH_SHORT).show();


    /*


        activitiesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // code here
                if(position == 0){
                    // person activity clicked
                    startActivity(new Intent(MainActivity.this,PersonActivity.class));

                } else if (position ==1){
                    //pet
                    petsArrayList = activitiesArrayList.getAdapter().getItem(position).toSting();
                    Intent petIntent =   new Intent(MainActivity.this, PetActivity.class);
                    petIntent.putExtra("name", petsArrayList);

                    startActivity(new Intent(MainActivity.this,PetActivity.class));


         Pet pet1 = new Pet("cat","dolly",2);
         Pet pet2 = new Pet("cat","dolly",2);
         Pet pet3 = new Pet("cat","dolly",2);

         petsArrayList.add(new Pet("Dog", "Vove", 7));
         petsArrayList.add(new Pet("Cat", "Dolly", 2));
            petsArrayList.add(new Pet("Hamster", "ulf", 1));

        petListView = findViewById(R.id.pet_lv);

        ArrayAdapter<Person> personArrayAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                        personArrayList);
        activitiesListView.setAdapter(personArrayAdapter);

     */
    }
}