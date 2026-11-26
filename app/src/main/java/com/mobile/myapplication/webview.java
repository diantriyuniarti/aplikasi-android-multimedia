package com.mobile.myapplication;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class webview extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView = findViewById(R.id.webView);

        // Pengaturan WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Aktifkan JavaScript

        // Tampilkan halaman di dalam aplikasi, bukan browser
        webView.setWebViewClient(new WebViewClient());

        // URL yang ditampilkan
        webView.loadUrl("https://www.ismynr.xyz/2020/01/program-aplikasi-queue-fifo-java-flowchart.html");
    }

    // Untuk handle tombol back agar tidak langsung keluar dari WebView
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack(); // Kembali ke halaman sebelumnya
        } else {
            super.onBackPressed(); // Keluar aplikasi
        }
    }
}
