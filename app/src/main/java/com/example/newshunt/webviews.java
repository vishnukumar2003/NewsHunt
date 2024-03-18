package com.example.newshunt;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class webviews extends AppCompatActivity {
Toolbar toolbar;
   WebView webviews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_webviews);
        toolbar=findViewById(R.id.toolbar);
        webviews=findViewById(R.id.webview);
        setSupportActionBar(toolbar);



        Intent intent=getIntent();
        String url=intent.getStringExtra("url");
        webviews.setWebViewClient(new WebViewClient());
        webviews.loadUrl(url);

    }
}