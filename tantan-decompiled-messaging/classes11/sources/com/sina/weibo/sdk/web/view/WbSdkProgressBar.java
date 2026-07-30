package com.sina.weibo.sdk.web.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WbSdkProgressBar extends View {
    private boolean addStart;
    private double growTime;
    private double growTimeMax;
    private Handler handler;
    private long lastTime;
    private float length;
    private final int maxLength;
    private final int minLength;
    private int miniSize;
    private int padding;
    private Paint paint;
    private int paintWidth;
    private float progress;
    private RectF rect;
    private boolean showView;
    private float speed;
    private long stopGrowTime;
    private long stopGrowTimeMax;
    int stopNum;

    public WbSdkProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.minLength = 20;
        this.maxLength = 300;
        this.lastTime = 0L;
        this.speed = 200.0f;
        this.stopGrowTimeMax = 180L;
        this.stopGrowTime = 0L;
        this.growTimeMax = 490.0d;
        this.addStart = false;
        this.showView = true;
        this.stopNum = 0;
        this.handler = new Handler() { // from class: com.sina.weibo.sdk.web.view.WbSdkProgressBar.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 0) {
                    return;
                }
                WbSdkProgressBar.this.showView = false;
            }
        };
        this.miniSize = dip2px(context, 50);
        this.paintWidth = dip2px(context, 5);
        this.padding = dip2px(context, 3);
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setColor(-48861);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.paintWidth);
        int i2 = this.padding;
        int i3 = this.miniSize;
        this.rect = new RectF(i2, i2, i3 - i2, i3 - i2);
    }

    private void calculateProgress(long j) {
        long j2 = this.stopGrowTime;
        if (j2 < this.stopGrowTimeMax) {
            this.stopGrowTime = j2 + j;
            return;
        }
        double d = this.growTime + j;
        this.growTime = d;
        double d2 = this.growTimeMax;
        if (d >= d2) {
            this.growTime = d - d2;
            this.stopGrowTime = 0L;
            this.addStart = !this.addStart;
        }
        float fCos = (((float) Math.cos(((this.growTime / d2) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
        if (!this.addStart) {
            this.length = fCos * 280.0f;
            return;
        }
        float f = 280.0f * (1.0f - fCos);
        this.progress += this.length - f;
        this.length = f;
    }

    private int dip2px(Context context, int i) {
        return (int) (context.getResources().getDisplayMetrics().density * i);
    }

    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        try {
            long jAbs = Math.abs(SystemClock.uptimeMillis() - this.lastTime) % 360;
            float f = (this.speed * jAbs) / 1000.0f;
            calculateProgress(jAbs);
            this.lastTime = SystemClock.uptimeMillis();
            float f2 = this.progress + f;
            this.progress = f2;
            if (f2 >= 360.0f) {
                this.progress = f2 - 360.0f;
            }
            canvas.drawArc(this.rect, this.progress - 90.0f, 20.0f + this.length, false, this.paint);
            if (this.showView) {
                postInvalidate();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.miniSize;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 8) {
            this.handler.sendEmptyMessageDelayed(0, 1000L);
        } else if (i == 0 && getVisibility() == 0) {
            this.handler.removeMessages(0);
            this.showView = true;
            invalidate();
        }
    }

    public void setProgressColor(int i) {
        this.paint.setColor(i);
    }

    public WbSdkProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WbSdkProgressBar(Context context) {
        this(context, null);
    }
}
