package com.example.cleaner.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cleaner.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class Home extends AppCompatActivity {

    private CircleImageView img_circle;
    private TextView txt_persent;
    private ImageView img_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initView();
        Animation();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                persent();
            }
        },50);
        Setting();
    }

    private void Setting() {
        img_setting.setOnClickListener(view -> {
            startActivity(new Intent(this, Settings.class));
        });
    }

    private void persent() {
        new getData().execute();
    }

    public class getData extends AsyncTask<Void, String , String> {

        @Override
        protected String doInBackground(Void... voids) {

            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                publishProgress(i+"");
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(String... values) {

            txt_persent.setText(values[0]+"");

            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }

    private void Animation() {

        img_circle.setAnimation(AnimationUtils.loadAnimation(this, R.anim.zoomin));
    }

    private void initView() {

        img_circle = findViewById(R.id.img_circle);
        img_setting = findViewById(R.id.img_setting);
        txt_persent = findViewById(R.id.txt_persent);
    }
}