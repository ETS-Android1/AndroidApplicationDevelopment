package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        ListView listCourses ;
        ArrayList<String> arrCourses = new ArrayList<>() ;
        listCourses = findViewById(R.id.listCourses) ;

        arrCourses.add("Pastry Creams and Ganache");
        arrCourses.add("Tempering Chocolate");
        arrCourses.add("Moulding and Shaping Confections");
        arrCourses.add("Truffles and Bonbons");
        arrCourses.add("Production Efficiency");
        arrCourses.add("Airbrushing and Food Photography");
        arrCourses.add("Chocolate Figurines");
        arrCourses.add("Working with fruits, syrups and liquors");
        arrCourses.add("Complex Desserts");
        arrCourses.add("Fundamentals of Panning");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.textcolor, arrCourses);
        listCourses.setAdapter(adapter);

    }
}
