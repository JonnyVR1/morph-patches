package com.p000p1.mobile.putong.feed.newui.featured;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import l.t100;
import p007l.m9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewPictureContainerIndicator extends View implements ViewPager.j {

    /* JADX INFO: renamed from: a */
    public int f1404a;

    /* JADX INFO: renamed from: b */
    public Context f1405b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f1406c;

    /* JADX INFO: renamed from: d */
    @ColorInt
    public int f1407d;

    /* JADX INFO: renamed from: e */
    public float f1408e;

    /* JADX INFO: renamed from: f */
    public int f1409f;

    /* JADX INFO: renamed from: g */
    public Paint f1410g;

    /* JADX INFO: renamed from: h */
    public Paint f1411h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f1412i;

    /* JADX INFO: renamed from: j */
    public float f1413j;

    /* JADX INFO: renamed from: k */
    public RectF f1414k;

    /* JADX INFO: renamed from: l */
    public RectF f1415l;

    public NewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1413j = 0.0f;
        this.f1414k = new RectF();
        this.f1415l = new RectF();
        this.f1405b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10346s0);
        this.f1406c = typedArrayObtainStyledAttributes.getColor(m9c0.f10348t0, Color.parseColor("#19000000"));
        this.f1407d = typedArrayObtainStyledAttributes.getColor(m9c0.f10352v0, -1);
        this.f1408e = typedArrayObtainStyledAttributes.getDimension(m9c0.f10350u0, m2843a(8));
        typedArrayObtainStyledAttributes.recycle();
        this.f1410g = new Paint(1);
        this.f1411h = new Paint(1);
        Paint paint = this.f1410g;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f1411h.setStyle(style);
        this.f1410g.setColor(this.f1406c);
        this.f1411h.setColor(this.f1407d);
    }

    /* JADX INFO: renamed from: a */
    private int m2843a(int i) {
        return isInEditMode() ? (int) (((double) i) * 2.5d) : t100.d(i);
    }

    /* JADX INFO: renamed from: b */
    private void m2844b(Canvas canvas, int i, float f) {
        this.f1414k = m2846d(i, f);
        float fM2847e = m2847e();
        if (i != this.f1404a) {
            float f2 = fM2847e / 2.0f;
            canvas.drawRoundRect(this.f1414k, f2, f2, this.f1410g);
            return;
        }
        RectF rectF = this.f1415l;
        RectF rectF2 = this.f1414k;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        ValueAnimator valueAnimator = this.f1412i;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f1414k.offset(this.f1413j, 0.0f);
        }
        float f3 = fM2847e / 2.0f;
        canvas.drawRoundRect(this.f1414k, f3, f3, this.f1411h);
    }

    /* JADX INFO: renamed from: c */
    private void m2845c(Canvas canvas) {
        float fM2848f = m2848f();
        for (int i = 0; i < this.f1409f; i++) {
            m2844b(canvas, i, fM2848f);
        }
        if (this.f1413j != 0.0f) {
            m2844b(canvas, this.f1404a, fM2848f);
        }
    }

    /* JADX INFO: renamed from: d */
    private RectF m2846d(int i, float f) {
        float f2 = (this.f1408e + f) * i;
        float measuredHeight = (getMeasuredHeight() - m2847e()) / 2.0f;
        this.f1414k.set(f2, measuredHeight, f + f2, m2847e() + measuredHeight);
        return this.f1414k;
    }

    /* JADX INFO: renamed from: e */
    private int m2847e() {
        return m2843a(3);
    }

    /* JADX INFO: renamed from: f */
    public float m2848f() {
        float measuredWidth = getMeasuredWidth() * 1.0f;
        float f = this.f1408e;
        int i = this.f1409f;
        return (measuredWidth - (f * (i - 1))) / i;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f1412i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1409f > 0) {
            m2845c(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            size = (int) (m2843a(100) + 0.5f);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = (int) (m2847e() + 0.5f);
        }
        setMeasuredDimension(size, size2);
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        setSelectedIndex(i);
    }

    public void setIndicatorCount(int i) {
        this.f1409f = i;
        invalidate();
    }

    public void setSelectedIndex(int i) {
        this.f1404a = i;
        invalidate();
    }

    public void setupWithPager(ViewPager viewPager) {
        viewPager.P(this);
        viewPager.d(this);
    }

    public NewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewPictureContainerIndicator(Context context) {
        this(context, null);
    }
}
