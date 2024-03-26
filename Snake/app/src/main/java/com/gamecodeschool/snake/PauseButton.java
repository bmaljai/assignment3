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
    private Point location;
    PauseButton(Context context, Point mr, int s ){

       mBitmapPauseButton=BitmapFactory.decodeResource(context.getResources(),R.drawable.pause);

       mBitmapPauseButton=Bitmap.createScaledBitmap(mBitmapPauseButton,s*4,s*4,false);


    }
    void PauseCreate(int w, int h){
        location=new Point(w/2, h/2);
    }
    void draw(Canvas canvas,Paint paint){
        canvas.drawBitmap(mBitmapPauseButton,location.x,location.y,paint);
    }
    // create an on touch event
}
