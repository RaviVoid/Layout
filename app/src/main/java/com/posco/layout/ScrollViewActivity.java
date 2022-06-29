package com.posco.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class ScrollViewActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView;
    ImageView imageView2;
    BitmapDrawable bitmap;
    int imageIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        scrollView = findViewById(R.id.scrollView);
        imageView = findViewById(R.id.imageView3);
        imageView2 = findViewById(R.id.imageView4);

        //scrollView.setHorizontalScrollBarEnabled(true);

        changeImage(imageView, R.drawable.image01);
    }

    public void onButton1Clicked(View v){
        if(imageIndex == 0) {
            changeImage(imageView, R.drawable.image01);
            imageIndex = 1;
        } else {
            changeImage(imageView, R.drawable.image02);
            imageIndex = 0;
        }
    }

    public void onButton2Clicked(View v){
        if(imageIndex == 0) {
            changeImage(imageView2, R.drawable.image01);
            imageIndex = 1;
        } else {
            changeImage(imageView2, R.drawable.image02);
            imageIndex = 0;
        }
    }


    private void changeImage(ImageView imageView, int image) {
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(image);

        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;

    }
}