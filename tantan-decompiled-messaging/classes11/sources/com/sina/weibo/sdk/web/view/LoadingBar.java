package com.sina.weibo.sdk.web.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoadingBar extends TextView {
    private static final int MAX_PROGRESS = 100;
    private Handler mHander;
    private Paint mPaint;
    private int mProgress;
    private int mProgressColor;
    private Runnable mRunnable;

    public LoadingBar(Context context) {
        super(context);
        this.mRunnable = new Runnable() { // from class: com.sina.weibo.sdk.web.view.LoadingBar.1
            @Override // java.lang.Runnable
            public void run() {
                LoadingBar.access$008(LoadingBar.this);
                LoadingBar loadingBar = LoadingBar.this;
                loadingBar.drawProgress(loadingBar.mProgress);
            }
        };
        init(context);
    }

    public static /* synthetic */ int access$008(LoadingBar loadingBar) {
        int i = loadingBar.mProgress;
        loadingBar.mProgress = i + 1;
        return i;
    }

    private Rect getRect() {
        int left = getLeft();
        int top = getTop();
        return new Rect(0, 0, (getLeft() + (((getRight() - getLeft()) * this.mProgress) / MAX_PROGRESS)) - left, getBottom() - top);
    }

    private void init(Context context) {
        this.mHander = new Handler();
        this.mPaint = new Paint();
        initSkin();
    }

    public void drawProgress(int i) {
        Handler handler = this.mHander;
        if (i < 7) {
            handler.postDelayed(this.mRunnable, 70L);
        } else {
            handler.removeCallbacks(this.mRunnable);
            this.mProgress = i;
        }
        invalidate();
    }

    public void initSkin() {
        this.mProgressColor = -11693826;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mPaint.setColor(this.mProgressColor);
        canvas.drawRect(getRect(), this.mPaint);
    }

    public LoadingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRunnable = new Runnable() { // from class: com.sina.weibo.sdk.web.view.LoadingBar.1
            @Override // java.lang.Runnable
            public void run() {
                LoadingBar.access$008(LoadingBar.this);
                LoadingBar loadingBar = LoadingBar.this;
                loadingBar.drawProgress(loadingBar.mProgress);
            }
        };
        init(context);
    }

    public LoadingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRunnable = new Runnable() { // from class: com.sina.weibo.sdk.web.view.LoadingBar.1
            @Override // java.lang.Runnable
            public void run() {
                LoadingBar.access$008(LoadingBar.this);
                LoadingBar loadingBar = LoadingBar.this;
                loadingBar.drawProgress(loadingBar.mProgress);
            }
        };
        init(context);
    }
}
