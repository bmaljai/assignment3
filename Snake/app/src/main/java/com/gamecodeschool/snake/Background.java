package com.gamecodeschool.snake;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;

public class Background implements Drawable{
    private Paint painter;
    private Shader shader;
    private Canvas canvas;
    Background(int colorA, int colorB, Canvas canvas){
        this.canvas = canvas;
        this.shader = new LinearGradient(
                0, 0, // Start point (x, y)
                canvas.getWidth(), canvas.getHeight(), // End point (x, y)
                colorA, // Gradient start color
                colorB, // Gradient end color
                Shader.TileMode.CLAMP // Tiling mode
        );
        painter = new Paint();
        painter.setShader(shader);
    }
    public void draw(){
        canvas.drawRect(0, 0, canvas.getWidth(), canvas.getHeight(), this.painter);
    }
}
