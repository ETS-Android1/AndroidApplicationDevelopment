package com.example.aikyam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMood ;
        btnMood = findViewById(R.id.btnMood) ;
        Intent iMood ;
        iMood = new Intent(MainActivity.this,MoodTracker.class);

        btnMood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iMood);
            }
        });

        Button btnVisit ;
        btnVisit = findViewById(R.id.btnVisit) ;
        Intent iVisit ;
        iVisit = new Intent(MainActivity.this,VisitUs.class);

        btnVisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iVisit);
            }
        });

        Button btnDial;
        btnDial = findViewById(R.id.btnDial);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iDial = new Intent(Intent.ACTION_DIAL);
                iDial.setData(Uri.parse("tel:18005990019"));
                startActivity(iDial);
            }
        });

        Button btnVideo;
        btnVideo = findViewById(R.id.btnVideo);

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iVideo = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=inpok4MKVLM"));
                startActivity(iVideo);
                Log.i("Video", "Video Playing...");
            }
        });
    }
}
