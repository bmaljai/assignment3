package com.gamecodeschool.snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import java.util.Random;
class PauseButton {

    private Bitmap mBitmapPauseButton;
    private Point location = new Point();
    PauseButton(Context context, Point mr, int s ){

       mBitmapPauseButton=BitmapFactory.decodeResource(context.getResources(),R.drawable.Pause);

       mBitmapPauseButton=Bitmap.createScaledBitmap(mBitmapPauseButton,s,s,false);
    }
    // create an on touch event
}
