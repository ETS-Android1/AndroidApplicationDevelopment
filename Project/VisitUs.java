package com.example.aikyam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VisitUs extends AppCompatActivity {

    WebView webView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit_us);

        webView = findViewById(R.id.webView);

        webView.loadUrl("https://nhm.gov.in/index1.php?lang=1&level=2&sublinkid=1043&lid=359");
        webView.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
