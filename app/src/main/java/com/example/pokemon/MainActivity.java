package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean cek = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void press(View view) {
        Log.i("info", "ImageView ditekan !!");
        ImageView pikachu = findViewById(R.id.imageView);
        ImageView raichu = findViewById(R.id.imageView2);
        if (cek) {
            pikachu.animate().alpha(0).setDuration(2000);
            raichu.animate().alpha(1).setDuration(2000);
            cek = false;
        } else {
            pikachu.animate().alpha(1).setDuration(2000);
            raichu.animate().alpha(0).setDuration(2000);
            cek = true;
        }
    }
}