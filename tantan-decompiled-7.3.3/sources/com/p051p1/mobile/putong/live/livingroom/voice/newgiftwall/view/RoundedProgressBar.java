package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes10.dex */
public class RoundedProgressBar extends View {

    /* JADX INFO: renamed from: k */
    public static final int f54613k = Color.parseColor("#2196F3");

    /* JADX INFO: renamed from: l */
    public static final int f54614l = Color.parseColor("#E0E0E0");

    /* JADX INFO: renamed from: a */
    public int f54615a;

    /* JADX INFO: renamed from: b */
    public int f54616b;

    /* JADX INFO: renamed from: c */
    public int f54617c;

    /* JADX INFO: renamed from: d */
    public int f54618d;

    /* JADX INFO: renamed from: e */
    public int f54619e;

    /* JADX INFO: renamed from: f */
    public int f54620f;

    /* JADX INFO: renamed from: g */
    public Paint f54621g;

    /* JADX INFO: renamed from: h */
    public Paint f54622h;

    /* JADX INFO: renamed from: i */
    public RectF f54623i;

    /* JADX INFO: renamed from: j */
    public RectF f54624j;

    public RoundedProgressBar(Context context) {
        super(context);
        this.f54619e = qa00.m175859d(4.0f);
        this.f54620f = qa00.m175859d(14.0f);
        m79866a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m79866a(Context context, AttributeSet attributeSet) {
        this.f54615a = f54613k;
        this.f54616b = f54614l;
        this.f54617c = 100;
        this.f54618d = 0;
        m79867b();
        this.f54623i = new RectF();
        this.f54624j = new RectF();
    }

    /* JADX INFO: renamed from: b */
    public final void m79867b() {
        Paint paint = new Paint();
        this.f54621g = paint;
        paint.setColor(this.f54616b);
        Paint paint2 = this.f54621g;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f54621g.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f54622h = paint3;
        paint3.setColor(this.f54615a);
        this.f54622h.setStyle(style);
        this.f54622h.setAntiAlias(true);
    }

    public int getBackgroundColor() {
        return this.f54616b;
    }

    public int getMaxProgress() {
        return this.f54617c;
    }

    public int getProgress() {
        return this.f54618d;
    }

    public int getProgressColor() {
        return this.f54615a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int i2 = this.f54620f;
        float f = paddingTop + ((height - i2) / 2.0f);
        float f2 = width;
        float f3 = i2 + f;
        this.f54623i.set(paddingLeft, f, paddingLeft + f2, f3);
        RectF rectF = this.f54623i;
        int i3 = this.f54619e;
        canvas.drawRoundRect(rectF, i3, i3, this.f54621g);
        int i4 = this.f54618d;
        if (i4 <= 0 || (i = this.f54617c) <= 0) {
            return;
        }
        this.f54624j.set(paddingLeft, f, Math.min(Math.max(this.f54619e * 2, (width * i4) / i), f2) + paddingLeft, f3);
        RectF rectF2 = this.f54624j;
        int i5 = this.f54619e;
        canvas.drawRoundRect(rectF2, i5, i5, this.f54622h);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = this.f54620f + getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824) {
            size2 = mode == Integer.MIN_VALUE ? Math.min(paddingTop, size2) : paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f54616b = i;
        this.f54621g.setColor(i);
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.f54619e = (int) (i * getResources().getDisplayMetrics().density);
        invalidate();
    }

    public void setMaxProgress(int i) {
        int iMax = Math.max(1, i);
        this.f54617c = iMax;
        if (this.f54618d > iMax) {
            this.f54618d = iMax;
        }
    }

    public void setProgress(int i) {
        this.f54618d = Math.max(0, Math.min(i, this.f54617c));
        invalidate();
    }

    public void setProgressColor(int i) {
        this.f54615a = i;
        this.f54622h.setColor(i);
    }

    public RoundedProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54619e = qa00.m175859d(4.0f);
        this.f54620f = qa00.m175859d(14.0f);
        m79866a(context, attributeSet);
    }

    public RoundedProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54619e = qa00.m175859d(4.0f);
        this.f54620f = qa00.m175859d(14.0f);
        m79866a(context, attributeSet);
    }
}
