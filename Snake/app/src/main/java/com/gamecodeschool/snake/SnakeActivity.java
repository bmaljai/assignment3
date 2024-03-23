package com.gamecodeschool.snake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;

public class SnakeActivity extends Activity {
    // Declare an instance of SnakeGame
    SnakeGame mSnakeGame;

    // Set the game up
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    // Get the pixel dimensions of the screen
        Display display = getWindowManager()
                .getDefaultDisplay();

    // Initialize the result into a Point object
        Point size = new Point();
        display.getSize(size);

    // Create a new instance of the SnakeGame class
        mSnakeGame = new SnakeGame(this, size);

    // Make snakeGame the view of the Activity
        setContentView(mSnakeGame);
    }

    // Start the thread in snakeGame
    @Override
    protected void onResume() {
        super.onResume();
        mSnakeGame.resume();
    }

    // Stop the thread in snakeGame
    @Override
    protected void onPause() {
        super.onPause();
        mSnakeGame.pause();
    }

    //Are we planning on using this one or the one in mainActivity?
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
}