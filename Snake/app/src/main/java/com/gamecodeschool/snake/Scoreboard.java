package com.gamecodeschool.snake;

import android.graphics.Paint;
import android.graphics.Canvas;

public class Scoreboard extends HUDObject{

    Scoreboard(Paint painter, int score, Canvas canvas, int xLoc, int yLoc){
        super(painter, score, canvas, xLoc, yLoc);
    }

    public int getScore(){
        return this.value;
    }
    public void setScore(int score){
        this.value = score;
    }
    public void draw(){
        this.canvas.drawText("" + this.value, this.xLoc, this.yLoc, this.painter);
    }
}