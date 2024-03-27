package com.gamecodeschool.snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;

class PauseButton {

    private Bitmap mBitmapPauseButton;
    private Point location;
    PauseButton(Context context, Point mr, int s ){

       mBitmapPauseButton=BitmapFactory.decodeResource(context.getResources(),R.drawable.pause);

        int heightScaling = 6;
        int widthScaling = 16;
        mBitmapPauseButton=Bitmap.createScaledBitmap(mBitmapPauseButton,s* widthScaling,s* heightScaling,false);


    }
    void PauseCreate(int w, int h){
        location=new Point(w/2, h/2);
        int positionScaling = 5;
        location.x*= positionScaling;
        location.y*= positionScaling;
    }
    void draw(Canvas canvas,Paint paint){
        canvas.drawBitmap(mBitmapPauseButton,location.x,location.y,paint);
    }
    boolean onTouchEvent(MotionEvent event){
        float xDifference=Math.abs((float)location.x-event.getX());
        float yDifference=Math.abs((float)location.y-event.getY());

        switch (event.getAction()){
            case MotionEvent.ACTION_UP:
                if (xDifference<200 && yDifference<200) {
                    return true;
                }

        }
        return false;
    }
}
