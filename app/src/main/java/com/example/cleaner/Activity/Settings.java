package com.example.cleaner.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.cleaner.R;

public class Settings extends AppCompatActivity {

    private ImageView img_back;
    private LinearLayout layout_hide_cleanmemory;
    private LinearLayout layout_hide_speedup;
    private LinearLayout layout_hide_deepclean;
    private LinearLayout layout_hide_scanvirus;
    private LinearLayout layout_hide_hardware;
    private LinearLayout layout_hide_photoandvideo;
    private ImageView img_hide1;
    private ImageView img_hide2;
    private ImageView img_hide3;
    private ImageView img_hide4;
    private ImageView img_hide5;
    private ImageView img_hide6;

    private boolean ishide_cleanmemory;
    private boolean ishide_deepclean;
    private boolean ishide_speedup;
    private boolean ishide_scanvirus;
    private boolean ishide_hardware;
    private boolean ishide_photoandvideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        initView();
        Back();
        Hide();
    }

    private void Hide() {
        img_hide1.setOnClickListener(view -> {
            if (ishide_cleanmemory) {
                ishide_cleanmemory = false;
                layout_hide_cleanmemory.setVisibility(View.GONE);
                img_hide1.setImageDrawable(getDrawable(R.drawable.ic_baseline_keyboard_arrow_down_24));
            }else {
                ishide_cleanmemory = true;
                layout_hide_cleanmemory.setVisibility(View.VISIBLE);
                img_hide1.setImageDrawable(getDrawable(R.drawable.ic_baseline_keyboard_arrow_up_24));
            }
        });

        img_hide2.setOnClickListener(view -> {
            if (ishide_deepclean) {
                ishide_deepclean = false;
                layout_hide_deepclean.setVisibility(View.GONE);
                img_hide2.setImageDrawable(getDrawable(R.drawable.ic_baseline_keyboard_arrow_down_24));
            }else {
                ishide_deepclean = true;
                layout_hide_deepclean.setVisibility(View.VISIBLE);
                img_hide2.setImageDrawable(getDrawable(R.drawable.ic_baseline_keyboard_arrow_up_24));
            }
        });

        img_hide3.setOnClickListener(view -> {
            if (ishide_speedup) {
                ishide_speedup = false;
                layout_hide_speedup.setVisibility(View.GONE);
                img_hide3.setImageDrawable(getDrawable(R.drawable.ic_baseline_keyboard_arrow_down_24));
            }else {
                ishide_speedup = true;
                layout_hide_speedup.setVisibility(View.VISIBLE);
                img_hide3.setImageDrawable(getDrawable(R.drawable.ic_baseline_keyboard_arrow_up_24));
            }
        });

        img_hide4.setOnClickListener(view -> {
            if (ishide_scanvirus) {
                ishide_scanvirus = false;
                layout_hide_scanvirus.setVisibility(View.GONE);
                img_hide4.setImageDrawable(getDrawable(R.drawable.ic_baseline_keyboard_arrow_down_24));
            }else {
                ishide_scanvirus = true;
                layout_hide_scanvirus.setVisibility(View.VISIBLE);
                img_hide4.setImageDrawable(getDrawable(R.drawable.ic_baseline_keyboard_arrow_up_24));
            }
        });

        img_hide5.setOnClickListener(view -> {
            if (ishide_hardware) {
                ishide_hardware = false;
                layout_hide_hardware.setVisibility(View.GONE);
                img_hide5.setImageDrawable(getDrawable(R.drawable.ic_baseline_keyboard_arrow_down_24));
            }else {
                ishide_hardware = true;
                layout_hide_hardware.setVisibility(View.VISIBLE);
                img_hide5.setImageDrawable(getDrawable(R.drawable.ic_baseline_keyboard_arrow_up_24));
            }
        });

        img_hide6.setOnClickListener(view -> {
            if (ishide_photoandvideo) {
                ishide_photoandvideo = false;
                layout_hide_photoandvideo.setVisibility(View.GONE);
                img_hide6.setImageDrawable(getDrawable(R.drawable.ic_baseline_keyboard_arrow_down_24));
            }else {
                ishide_photoandvideo = true;
                layout_hide_photoandvideo.setVisibility(View.VISIBLE);
                img_hide6.setImageDrawable(getDrawable(R.drawable.ic_baseline_keyboard_arrow_up_24));
            }
        });
    }

    private void Back() {
        img_back.setOnClickListener(view -> {
            finish();
        });
    }

    private void initView() {

        img_back = findViewById(R.id.img_back);
        img_hide1 = findViewById(R.id.img_hide1);
        img_hide2 = findViewById(R.id.img_hide2);
        img_hide3 = findViewById(R.id.img_hide3);
        img_hide4 = findViewById(R.id.img_hide4);
        img_hide5 = findViewById(R.id.img_hide5);
        img_hide6 = findViewById(R.id.img_hide6);
        layout_hide_cleanmemory = findViewById(R.id.layout_hide_cleanmemory);
        layout_hide_deepclean = findViewById(R.id.layout_hide_deepclean);
        layout_hide_speedup = findViewById(R.id.layout_hide_speedup);
        layout_hide_scanvirus = findViewById(R.id.layout_hide_scanvirus);
        layout_hide_hardware = findViewById(R.id.layout_hide_hardware);
        layout_hide_photoandvideo = findViewById(R.id.layout_hide_photoandvideo);

    }
}