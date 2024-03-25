package com.gamecodeschool.snake133;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawView extends View {
    Paint paint = new Paint();
    // Potentially place holder class for drawing
    public DrawView(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        //Placeholder code to write "Pause"
        paint.setColor(Color.WHITE);
        paint.setTextSize(52f);
        canvas.drawText("Pause",200, 800, paint);
        //Placeholder code to draw the pause button
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);
        canvas.drawRect(200,300,300,400,paint);

        /* Code no currently being used/has  no use I  can  think of
        canvas.drawRect(30, 30, 80, 80, paint);
        paint.setStrokeWidth(0);
        paint.setColor(Color.CYAN);
        canvas.drawRect(33, 60, 77, 77, paint );
        paint.setColor(Color.YELLOW);
        canvas.drawRect(33, 33, 77, 60, paint );
*/

    }

}