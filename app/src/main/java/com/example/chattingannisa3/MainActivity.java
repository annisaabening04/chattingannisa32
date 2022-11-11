package com.example.chattingannisa3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView penerima;
    public static final String KONTAK = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        penerima = (TextView) findViewById(R.id.penerima);
    }
    public void pageKevin(View view) {
        Intent page1 = new Intent(MainActivity.this, com.example.chattingannisa3.halaman2.class);
        page1.putExtra(KONTAK, "ABAI");
        startActivity(page1);
    }
    public void pageJamal(View view) {
        Intent page1 = new Intent(MainActivity.this, com.example.chattingannisa3.halaman2.class);
        page1.putExtra(KONTAK, "JAMAL");
        startActivity(page1);
    }
    public void pageTina(View view) {
        Intent page1 = new Intent(MainActivity.this, com.example.chattingannisa3.halaman2.class);
        page1.putExtra(KONTAK, "SANTI");
        startActivity(page1);
    }
    public void pageJason(View view) {
        Intent page1 = new Intent(MainActivity.this, com.example.chattingannisa3.halaman2.class);
        page1.putExtra(KONTAK, "JOKO");
        startActivity(page1);
    }
}
