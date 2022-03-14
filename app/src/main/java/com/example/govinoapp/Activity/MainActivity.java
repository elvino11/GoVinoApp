package com.example.govinoapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.govinoapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_meu);
    }

    public void clickRS(View view) {
        //gambar RS di click
        Intent intent = new Intent(this,RS.class);
        startActivity(intent);
    }

    public void clickPolice(View view) {
        //gambar Police di click
        Intent intent = new Intent(this, Police.class);
        startActivity(intent);
    }

    public void clickSupermarket(View view) {
        //gambar Supermarket di click
        Intent intent = new Intent(this, Supermarket.class);
        startActivity(intent);
    }

    public void clickSekolah(View view) {
        //gambar Sekolah di click
        Intent intent = new Intent(this, Sekolah.class);
        startActivity(intent);
    }
}