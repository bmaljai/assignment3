package com.gamecodeschool.snake;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Credits extends HUDObject{
    Credits(Paint painter, String text, Canvas canvas, int xLoc, int yLoc){
        super(painter, text, canvas, xLoc, yLoc);
    }

    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text = text;
    }
    public void draw(){
        this.canvas.drawText("" + this.text, this.xLoc, this.yLoc, this.painter);
    }
}
