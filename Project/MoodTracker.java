package com.example.aikyam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MoodTracker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_tracker);

        Button btnRetrieve, btnInsert, btnDelete, btnUpdate;
        ListView listView;
        EditText edtDate, edtMood, edtDesc;

        btnInsert = findViewById(R.id.btnInsert);
        btnRetrieve = findViewById(R.id.btnRetrieve);
        btnDelete = findViewById(R.id.btnDelete);
        btnUpdate = findViewById(R.id.btnUpdate);

        edtDate = findViewById(R.id.edtDate);
        edtMood = findViewById(R.id.edtMood);
        edtDesc = findViewById(R.id.edtDesc);

        listView = findViewById(R.id.listView);

        DatabaseHelper dbHelper = new DatabaseHelper(this);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String date = edtDate.getText().toString();
                String mood = edtMood.getText().toString();
                String desc = edtDesc.getText().toString();

                dbHelper.addEntry(date,mood,desc);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String date = edtDate.getText().toString();

                dbHelper.deleteEntry(date);
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MoodModel mm = new MoodModel();
                String date = edtDate.getText().toString();
                String mood = edtMood.getText().toString();
                String desc = edtDesc.getText().toString();
                mm.date = date;
                mm.mood = mood;
                mm.description = desc;
                dbHelper.updateEntry(mm);
            }
        });

        btnRetrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<MoodModel> arrModel = dbHelper.retrieveEntry();
                ArrayList<String> arrMoods = new ArrayList<>();

                for (int i=0; i<arrModel.size(); i++){
                    //Log.d("Date:"+arrMoods.get(i).date,", Mood: "+arrMoods.get(i).description);
                    arrMoods.add(arrModel.get(i).date+"  "+arrModel.get(i).mood+"  "+arrModel.get(i).description);
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrMoods);
                listView.setAdapter(adapter);

            }
        });

    }
}



