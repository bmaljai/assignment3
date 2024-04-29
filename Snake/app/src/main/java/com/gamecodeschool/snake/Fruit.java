package com.gamecodeschool.snakegame;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public interface Fruit {
    void spawn();
    void draw(Canvas canvas, Paint paint);
    Point getLocation();
}
