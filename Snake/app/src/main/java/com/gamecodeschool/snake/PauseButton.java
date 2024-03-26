package com.gamecodeschool.snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
class PauseButton {

    private final int widthScaling=16;
    private final int heightScaling=6;
    private final int positionScaling=5;
    private Bitmap mBitmapPauseButton;
    private Point location;
    PauseButton(Context context, Point mr, int s ){

       mBitmapPauseButton=BitmapFactory.decodeResource(context.getResources(),R.drawable.pause);

       mBitmapPauseButton=Bitmap.createScaledBitmap(mBitmapPauseButton,s*widthScaling,s*heightScaling,false);


    }
    void PauseCreate(int w, int h){
        location=new Point(w/2, h/2);
        location.x*=positionScaling;
        location.y*=positionScaling;
    }
    void draw(Canvas canvas,Paint paint){
        canvas.drawBitmap(mBitmapPauseButton,location.x,location.y,paint);
    }
    // create an on touch event
}
