package com.example.android.glideexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image);

        Glide.with(this)
                .load("https://lh3.googleusercontent.com/-qD0R9Z0K1XA/W7xZokJZeOI/AAAAAAAAAFM/kaV5A2ujZFgqwyIlCyEAsboWgK5vBuAlACHMYBhgL/I/20141021_133408.jpg")
                .into(imageView);
    }
}
