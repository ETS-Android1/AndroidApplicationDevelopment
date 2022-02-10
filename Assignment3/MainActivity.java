package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button home, about, courses ;

        home = findViewById(R.id.home) ;
        about = findViewById(R.id.about) ;
        courses = findViewById(R.id.courses) ;

        Intent iHome, iAbout, iCourses ;

        iHome = new Intent(MainActivity.this,Home.class) ;
        iAbout = new Intent(MainActivity.this,AboutUs.class) ;
        iCourses = new Intent(MainActivity.this,Courses.class) ;

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iHome);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iAbout);
            }
        });

        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iCourses);
            }
        });

    }
}
