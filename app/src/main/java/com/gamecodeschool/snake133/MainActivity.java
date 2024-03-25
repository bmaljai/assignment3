package com.gamecodeschool.snake133;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    DrawView drawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //Some place holder code to make some basic draw calls
        drawView = new DrawView(this);
        drawView.setBackgroundColor(Color.CYAN);
        setContentView(drawView);

    }

}