# Aplikasi Android Multimedia dan Navigasi

Mata Kuliah: Pemrograman Mobile  
Program Studi S1 Teknik Informatika, Universitas Pamulang  
Pengembang: Dian Tri Yuniarti

---

## Deskripsi Aplikasi

Aplikasi mobile Android native yang mengimplementasikan integrasi perangkat keras kamera smartphone, navigasi halaman multi-tab dengan TabLayout dan ViewPager, serta penampil konten web langsung di dalam aplikasi menggunakan WebView.

Paket instalasi Android (release APK) yang telah ditandatangani (signed APK) disertakan dalam repositori ini pada direktori `apk/DianTriYuniarti.apk`.

---

## Fitur Utama

1. Integrasi Kamera Hardware (camera.java)
   * Membuka kamera bawaan perangkat melalui Android Intent dan menangkap hasil gambar ke dalam aplikasi.

2. Navigasi Tab Layout (tablayout.java)
   * Implementasi komponen TabLayout dan ViewPager untuk navigasi konten bertingkat.

3. In-App Web Browser (webview.java)
   * Merender tautan web langsung di dalam antarmuka aplikasi Android.

4. File Instalasi Rilis (Release APK)
   * File instalasi biner rilis mandiri siap pasang: `apk/DianTriYuniarti.apk`.

---

## Arsitektur Teknologi

* Platform: Android OS
* Bahasa Pemrograman: Java
* IDE: Android Studio
* Build System: Gradle
* Komponen Android: Activity, Intent, Camera API, WebView, TabLayout, ViewPager

---

## Panduan Menjalankan

1. Memasang File APK Langsung ke Perangkat:
   * Unduh file `apk/DianTriYuniarti.apk` dari repositori ini.
   * Pasang pada perangkat Android dengan mengaktifkan izin instalasi dari sumber tidak dikenal jika diperlukan.

2. Membuka Source Code di Android Studio:
   * Clone repositori:
     ```bash
     git clone git@github.com:diantriyuniarti/aplikasi-android-multimedia.git
     ```
   * Buka proyek melalui Android Studio dan jalankan proses build atau Run pada perangkat pengujian.
