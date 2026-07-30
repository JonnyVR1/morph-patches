package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class RoundedProgressBar extends View {

    /* JADX INFO: renamed from: k */
    public static final int f7371k = Color.parseColor("#2196F3");

    /* JADX INFO: renamed from: l */
    public static final int f7372l = Color.parseColor("#E0E0E0");

    /* JADX INFO: renamed from: a */
    public int f7373a;

    /* JADX INFO: renamed from: b */
    public int f7374b;

    /* JADX INFO: renamed from: c */
    public int f7375c;

    /* JADX INFO: renamed from: d */
    public int f7376d;

    /* JADX INFO: renamed from: e */
    public int f7377e;

    /* JADX INFO: renamed from: f */
    public int f7378f;

    /* JADX INFO: renamed from: g */
    public Paint f7379g;

    /* JADX INFO: renamed from: h */
    public Paint f7380h;

    /* JADX INFO: renamed from: i */
    public RectF f7381i;

    /* JADX INFO: renamed from: j */
    public RectF f7382j;

    public RoundedProgressBar(Context context) {
        super(context);
        this.f7377e = t100.d(4.0f);
        this.f7378f = t100.d(14.0f);
        m8899a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m8899a(Context context, AttributeSet attributeSet) {
        this.f7373a = f7371k;
        this.f7374b = f7372l;
        this.f7375c = 100;
        this.f7376d = 0;
        m8900b();
        this.f7381i = new RectF();
        this.f7382j = new RectF();
    }

    /* JADX INFO: renamed from: b */
    public final void m8900b() {
        Paint paint = new Paint();
        this.f7379g = paint;
        paint.setColor(this.f7374b);
        Paint paint2 = this.f7379g;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f7379g.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f7380h = paint3;
        paint3.setColor(this.f7373a);
        this.f7380h.setStyle(style);
        this.f7380h.setAntiAlias(true);
    }

    public int getBackgroundColor() {
        return this.f7374b;
    }

    public int getMaxProgress() {
        return this.f7375c;
    }

    public int getProgress() {
        return this.f7376d;
    }

    public int getProgressColor() {
        return this.f7373a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int i2 = this.f7378f;
        float f = paddingTop + ((height - i2) / 2.0f);
        float f2 = width;
        float f3 = i2 + f;
        this.f7381i.set(paddingLeft, f, paddingLeft + f2, f3);
        RectF rectF = this.f7381i;
        int i3 = this.f7377e;
        canvas.drawRoundRect(rectF, i3, i3, this.f7379g);
        int i4 = this.f7376d;
        if (i4 <= 0 || (i = this.f7375c) <= 0) {
            return;
        }
        this.f7382j.set(paddingLeft, f, Math.min(Math.max(this.f7377e * 2, (width * i4) / i), f2) + paddingLeft, f3);
        RectF rectF2 = this.f7382j;
        int i5 = this.f7377e;
        canvas.drawRoundRect(rectF2, i5, i5, this.f7380h);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = this.f7378f + getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824) {
            size2 = mode == Integer.MIN_VALUE ? Math.min(paddingTop, size2) : paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f7374b = i;
        this.f7379g.setColor(i);
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.f7377e = (int) (i * getResources().getDisplayMetrics().density);
        invalidate();
    }

    public void setMaxProgress(int i) {
        int iMax = Math.max(1, i);
        this.f7375c = iMax;
        if (this.f7376d > iMax) {
            this.f7376d = iMax;
        }
    }

    public void setProgress(int i) {
        this.f7376d = Math.max(0, Math.min(i, this.f7375c));
        invalidate();
    }

    public void setProgressColor(int i) {
        this.f7373a = i;
        this.f7380h.setColor(i);
    }

    public RoundedProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7377e = t100.d(4.0f);
        this.f7378f = t100.d(14.0f);
        m8899a(context, attributeSet);
    }

    public RoundedProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7377e = t100.d(4.0f);
        this.f7378f = t100.d(14.0f);
        m8899a(context, attributeSet);
    }
}
