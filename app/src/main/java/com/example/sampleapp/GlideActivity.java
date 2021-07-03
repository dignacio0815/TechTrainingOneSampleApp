package com.example.sampleapp;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class GlideActivity extends AppCompatActivity {
    public static final String URL = "https://picsum.photos/200";

    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);

        ivImage = findViewById(R.id.ivImg);

        Glide.with(this)
                .load(URL)
                .into(ivImage);
    }
}