package com.p046p1.mobile.putong.feed.newui.featured;

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
import p149l.m9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class NewPictureContainerIndicator extends View implements ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: a */
    public int f39943a;

    /* JADX INFO: renamed from: b */
    public Context f39944b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f39945c;

    /* JADX INFO: renamed from: d */
    @ColorInt
    public int f39946d;

    /* JADX INFO: renamed from: e */
    public float f39947e;

    /* JADX INFO: renamed from: f */
    public int f39948f;

    /* JADX INFO: renamed from: g */
    public Paint f39949g;

    /* JADX INFO: renamed from: h */
    public Paint f39950h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f39951i;

    /* JADX INFO: renamed from: j */
    public float f39952j;

    /* JADX INFO: renamed from: k */
    public RectF f39953k;

    /* JADX INFO: renamed from: l */
    public RectF f39954l;

    public NewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39952j = 0.0f;
        this.f39953k = new RectF();
        this.f39954l = new RectF();
        this.f39944b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132755s0);
        this.f39945c = typedArrayObtainStyledAttributes.getColor(m9c0.f132757t0, Color.parseColor("#19000000"));
        this.f39946d = typedArrayObtainStyledAttributes.getColor(m9c0.f132761v0, -1);
        this.f39947e = typedArrayObtainStyledAttributes.getDimension(m9c0.f132759u0, m61876a(8));
        typedArrayObtainStyledAttributes.recycle();
        this.f39949g = new Paint(1);
        this.f39950h = new Paint(1);
        Paint paint = this.f39949g;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f39950h.setStyle(style);
        this.f39949g.setColor(this.f39945c);
        this.f39950h.setColor(this.f39946d);
    }

    /* JADX INFO: renamed from: a */
    private int m61876a(int i) {
        return isInEditMode() ? (int) (((double) i) * 2.5d) : t100.m186890d(i);
    }

    /* JADX INFO: renamed from: b */
    private void m61877b(Canvas canvas, int i, float f) {
        this.f39953k = m61879d(i, f);
        float fM61880e = m61880e();
        if (i != this.f39943a) {
            float f2 = fM61880e / 2.0f;
            canvas.drawRoundRect(this.f39953k, f2, f2, this.f39949g);
            return;
        }
        RectF rectF = this.f39954l;
        RectF rectF2 = this.f39953k;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        ValueAnimator valueAnimator = this.f39951i;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f39953k.offset(this.f39952j, 0.0f);
        }
        float f3 = fM61880e / 2.0f;
        canvas.drawRoundRect(this.f39953k, f3, f3, this.f39950h);
    }

    /* JADX INFO: renamed from: c */
    private void m61878c(Canvas canvas) {
        float fM61881f = m61881f();
        for (int i = 0; i < this.f39948f; i++) {
            m61877b(canvas, i, fM61881f);
        }
        if (this.f39952j != 0.0f) {
            m61877b(canvas, this.f39943a, fM61881f);
        }
    }

    /* JADX INFO: renamed from: d */
    private RectF m61879d(int i, float f) {
        float f2 = (this.f39947e + f) * i;
        float measuredHeight = (getMeasuredHeight() - m61880e()) / 2.0f;
        this.f39953k.set(f2, measuredHeight, f + f2, m61880e() + measuredHeight);
        return this.f39953k;
    }

    /* JADX INFO: renamed from: e */
    private int m61880e() {
        return m61876a(3);
    }

    /* JADX INFO: renamed from: f */
    public float m61881f() {
        float measuredWidth = getMeasuredWidth() * 1.0f;
        float f = this.f39947e;
        int i = this.f39948f;
        return (measuredWidth - (f * (i - 1))) / i;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f39951i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f39948f > 0) {
            m61878c(canvas);
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
            size = (int) (m61876a(100) + 0.5f);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = (int) (m61880e() + 0.5f);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        setSelectedIndex(i);
    }

    public void setIndicatorCount(int i) {
        this.f39948f = i;
        invalidate();
    }

    public void setSelectedIndex(int i) {
        this.f39943a = i;
        invalidate();
    }

    public void setupWithPager(ViewPager viewPager) {
        viewPager.m4175P(this);
        viewPager.m4185d(this);
    }

    public NewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewPictureContainerIndicator(Context context) {
        this(context, null);
    }
}
