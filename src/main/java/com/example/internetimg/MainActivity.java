package com.example.internetimg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "https://web2.mcu.edu.tw/wp-content/uploads/2023/02/download_0.png";
        imageView = findViewById(R.id.imageView);
        Glide.with(this).load(url).into(imageView);


    }
}

