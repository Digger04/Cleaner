package com.example.cleaner.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.cleaner.R;
import com.example.cleaner.Service.CreatNoti;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
        start();
    }

    private void start() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Home.class));
            }
        },3000);
    }

    private void initview() {

        CreatNoti.NotiApp(getApplicationContext());
    }
}