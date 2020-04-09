package com.example.letschatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView imageView;
    private String abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imageView=(ImageView)findViewById(R.id.image_viewer);
        abc=getIntent().getStringExtra("url");
        Picasso.with(ImageViewActivity.this).load(abc).into(imageView);
    }
}
