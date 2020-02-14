package com.example.photo;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class memories extends AppCompatActivity {
    ImageView img;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    ImageView img10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memoryphoto);
        img = findViewById(R.id.imageView);
        img2 = findViewById(R.id.imageView2);
        img3 = findViewById(R.id.imageView3);
        img4 = findViewById(R.id.imageView4);
        img5 = findViewById(R.id.imageView5);
        img6 = findViewById(R.id.imageView6);
        img7 = findViewById(R.id.imageView7);
        img8 = findViewById(R.id.imageView8);
        img9 = findViewById(R.id.imageView9);
        img10 = findViewById(R.id.imageView10);
    }
}
