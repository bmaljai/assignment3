package com.gamecodeschool.snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public abstract class HUDObject implements Drawable {
    protected Paint painter;
    protected Canvas canvas;
    protected int xLoc;
    protected int yLoc;
    protected String text;
    protected int value;

    HUDObject(Paint painter, int value, Canvas canvas, int xLoc, int yLoc){
        this.painter = painter;
        this.value = value;
        this.canvas = canvas;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }
    HUDObject(Paint painter, String text, Canvas canvas, int xLoc, int yLoc){
        this.painter = painter;
        this.text = text;
        this.canvas = canvas;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }



}
