package com.mobile.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivityTest extends AppCompatActivity {
    private TextInputEditText etUsername, etPassword;
    private Button btnLogin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi komponen UI
        etUsername = findViewById(R.id.username);
        etPassword = findViewById(R.id.password);
        btnLogin = findViewById(R.id.login_button);

        btnLogin.setOnClickListener(v -> {
            if (etUsername.getText() != null && etPassword.getText() != null) {
                String userInput = etUsername.getText().toString().trim();
                String passInput = etPassword.getText().toString().trim();

                // Cek login sederhana
                if (userInput.equals("admin") && passInput.equals("admin")) {
                    Intent intent = new Intent(getApplicationContext(), Beranda.class);
                    startActivity(intent);
                } else {
                    btnLogin.setBackgroundColor(Color.RED);
                    Toast.makeText(MainActivityTest.this, "Login Gagal! Coba lagi.", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(MainActivityTest.this, "Form tidak boleh kosong!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
