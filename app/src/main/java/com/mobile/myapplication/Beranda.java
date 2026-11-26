package com.mobile.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Beranda extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        // Tombol TabLayout
        Button btntablayout = findViewById(R.id.btntablayout);
        btntablayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tablayoutIntent = new Intent(getApplicationContext(), tablayout.class);
                startActivity(tablayoutIntent);
            }
        });

        // Tombol Camera
        Button btncamera = findViewById(R.id.btncamera);
        btncamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(getApplicationContext(), com.mobile.myapplication.camera.class);
                startActivity(cameraIntent);
            }
        });

        // Tombol WebView
        Button btnwebView = findViewById(R.id.btnwebView); // Pastikan ID ini ada di XML
        btnwebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webviewIntent = new Intent(getApplicationContext(), com.mobile.myapplication.webview.class);
                startActivity(webviewIntent);
            }
        });
    }
}
