package com.posco.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mission03Activity extends AppCompatActivity {
    BitmapDrawable bitmap;
    ImageView imageViewUp;
    ImageView imageViewDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission03);

        imageViewUp = findViewById(R.id.imageView7);
        imageViewDown = findViewById(R.id.imageView8);

        imageViewDown.setVisibility(View.INVISIBLE);
    }

    public void onButtonDown(View v){

        imageViewDown.setVisibility(View.VISIBLE);
        imageViewUp.setVisibility(View.INVISIBLE);
    }

    public void onButtonUp(View v){

        imageViewUp.setVisibility(View.VISIBLE);
        imageViewDown.setVisibility(View.INVISIBLE);
    }
}