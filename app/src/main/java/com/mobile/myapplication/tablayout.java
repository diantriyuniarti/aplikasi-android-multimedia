package com.mobile.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class tablayout extends AppCompatActivity {

    Button tabl, tab2;
    LinearLayout view1;
    ScrollView view2; // ✅ tipe diperbaiki

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);

        tabl = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        view1 = findViewById(R.id.view1);
        view2 = findViewById(R.id.view2); // ✅ sesuai dengan tipe ScrollView di XML

        tabl.setOnClickListener(v -> {
            view1.setVisibility(View.VISIBLE);
            view2.setVisibility(View.GONE);
        });

        tab2.setOnClickListener(v -> {
            view1.setVisibility(View.GONE);
            view2.setVisibility(View.VISIBLE);
        });
    }
}
