package com.gamecodeschool.snake;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.IOException;
class SnakeGame extends SurfaceView implements Runnable{
    // Objects for the game loop/thread
    private Thread mThread = null;
    // Control pausing between updates
    private long mNextFrameTime;
    // Is the game currently playing and or paused?
    private volatile boolean mPlaying = false;
    private volatile boolean mPaused = true;
    // for playing sound effects
    private SoundPool mSP;
    private int mEat_ID = -1;
    private int mCrashID = -1;
    // The size in segments of the playable area
    private final int NUM_BLOCKS_WIDE = 40;
    private int mNumBlocksHigh;
    // How many points does the player have
    private int mScore;
    // Objects for drawing
    private Canvas mCanvas;
    private SurfaceHolder mSurfaceHolder;
    private Paint mPaint;
    // A snake ssss
    private Snake mSnake;
    // And an apple
    private Apple mApple;
}
