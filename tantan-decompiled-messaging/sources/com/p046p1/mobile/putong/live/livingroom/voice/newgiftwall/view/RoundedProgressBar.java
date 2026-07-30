package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class RoundedProgressBar extends View {

    /* JADX INFO: renamed from: k */
    public static final int f53765k = Color.parseColor("#2196F3");

    /* JADX INFO: renamed from: l */
    public static final int f53766l = Color.parseColor("#E0E0E0");

    /* JADX INFO: renamed from: a */
    public int f53767a;

    /* JADX INFO: renamed from: b */
    public int f53768b;

    /* JADX INFO: renamed from: c */
    public int f53769c;

    /* JADX INFO: renamed from: d */
    public int f53770d;

    /* JADX INFO: renamed from: e */
    public int f53771e;

    /* JADX INFO: renamed from: f */
    public int f53772f;

    /* JADX INFO: renamed from: g */
    public Paint f53773g;

    /* JADX INFO: renamed from: h */
    public Paint f53774h;

    /* JADX INFO: renamed from: i */
    public RectF f53775i;

    /* JADX INFO: renamed from: j */
    public RectF f53776j;

    public RoundedProgressBar(Context context) {
        super(context);
        this.f53771e = t100.m186890d(4.0f);
        this.f53772f = t100.m186890d(14.0f);
        m78683a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m78683a(Context context, AttributeSet attributeSet) {
        this.f53767a = f53765k;
        this.f53768b = f53766l;
        this.f53769c = 100;
        this.f53770d = 0;
        m78684b();
        this.f53775i = new RectF();
        this.f53776j = new RectF();
    }

    /* JADX INFO: renamed from: b */
    public final void m78684b() {
        Paint paint = new Paint();
        this.f53773g = paint;
        paint.setColor(this.f53768b);
        Paint paint2 = this.f53773g;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f53773g.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f53774h = paint3;
        paint3.setColor(this.f53767a);
        this.f53774h.setStyle(style);
        this.f53774h.setAntiAlias(true);
    }

    public int getBackgroundColor() {
        return this.f53768b;
    }

    public int getMaxProgress() {
        return this.f53769c;
    }

    public int getProgress() {
        return this.f53770d;
    }

    public int getProgressColor() {
        return this.f53767a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int i2 = this.f53772f;
        float f = paddingTop + ((height - i2) / 2.0f);
        float f2 = width;
        float f3 = i2 + f;
        this.f53775i.set(paddingLeft, f, paddingLeft + f2, f3);
        RectF rectF = this.f53775i;
        int i3 = this.f53771e;
        canvas.drawRoundRect(rectF, i3, i3, this.f53773g);
        int i4 = this.f53770d;
        if (i4 <= 0 || (i = this.f53769c) <= 0) {
            return;
        }
        this.f53776j.set(paddingLeft, f, Math.min(Math.max(this.f53771e * 2, (width * i4) / i), f2) + paddingLeft, f3);
        RectF rectF2 = this.f53776j;
        int i5 = this.f53771e;
        canvas.drawRoundRect(rectF2, i5, i5, this.f53774h);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = this.f53772f + getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824) {
            size2 = mode == Integer.MIN_VALUE ? Math.min(paddingTop, size2) : paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f53768b = i;
        this.f53773g.setColor(i);
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.f53771e = (int) (i * getResources().getDisplayMetrics().density);
        invalidate();
    }

    public void setMaxProgress(int i) {
        int iMax = Math.max(1, i);
        this.f53769c = iMax;
        if (this.f53770d > iMax) {
            this.f53770d = iMax;
        }
    }

    public void setProgress(int i) {
        this.f53770d = Math.max(0, Math.min(i, this.f53769c));
        invalidate();
    }

    public void setProgressColor(int i) {
        this.f53767a = i;
        this.f53774h.setColor(i);
    }

    public RoundedProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53771e = t100.m186890d(4.0f);
        this.f53772f = t100.m186890d(14.0f);
        m78683a(context, attributeSet);
    }

    public RoundedProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53771e = t100.m186890d(4.0f);
        this.f53772f = t100.m186890d(14.0f);
        m78683a(context, attributeSet);
    }
}
