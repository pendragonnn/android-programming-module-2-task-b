package com.dev.modul2b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent home = new Intent(MainActivity.this, Activity_home.class);
                startActivity(home);
                finish();
            }
        }, waktu_loading);
    }
}