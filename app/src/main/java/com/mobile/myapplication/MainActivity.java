package com.mobile.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etUsername, etPassword;
    private Button btnLogin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi variable
        etUsername = findViewById(R.id.username);
        etPassword = findViewById(R.id.password);
        btnLogin = findViewById(R.id.login_button);

        // Event listener tombol login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = etUsername.getText().toString().trim();
                String passInput = etPassword.getText().toString().trim();

                // Cek login sederhana
                if (userInput.equals("admin") && passInput.equals("admin")) {
                    // Warna tombol jadi hijau
                    btnLogin.setBackgroundColor(Color.parseColor("#4CAF50")); // hijau
                    Toast.makeText(MainActivity.this, "Login Berhasil!", Toast.LENGTH_SHORT).show();

                    // Navigasi ke halaman beranda
                    Intent hubkankedashboard = new Intent(getApplicationContext(), Beranda.class);
                    startActivity(hubkankedashboard);
                } else {
                    // Warna tombol jadi merah
                    btnLogin.setBackgroundColor(Color.RED);
                    Toast.makeText(MainActivity.this, "Login Gagal! Coba lagi.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
