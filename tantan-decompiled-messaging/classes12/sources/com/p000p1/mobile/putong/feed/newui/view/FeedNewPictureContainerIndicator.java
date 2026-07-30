package com.p000p1.mobile.putong.feed.newui.view;

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
public class FeedNewPictureContainerIndicator extends View implements ViewPager.j {

    /* JADX INFO: renamed from: a */
    public int f4866a;

    /* JADX INFO: renamed from: b */
    public Context f4867b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f4868c;

    /* JADX INFO: renamed from: d */
    @ColorInt
    public int f4869d;

    /* JADX INFO: renamed from: e */
    public float f4870e;

    /* JADX INFO: renamed from: f */
    public int f4871f;

    /* JADX INFO: renamed from: g */
    public Paint f4872g;

    /* JADX INFO: renamed from: h */
    public Paint f4873h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f4874i;

    /* JADX INFO: renamed from: j */
    public float f4875j;

    /* JADX INFO: renamed from: k */
    public RectF f4876k;

    /* JADX INFO: renamed from: l */
    public RectF f4877l;

    public FeedNewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4875j = 0.0f;
        this.f4876k = new RectF();
        this.f4877l = new RectF();
        this.f4867b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10346s0);
        this.f4868c = typedArrayObtainStyledAttributes.getColor(m9c0.f10348t0, Color.parseColor("#19000000"));
        this.f4869d = typedArrayObtainStyledAttributes.getColor(m9c0.f10352v0, -1);
        this.f4870e = typedArrayObtainStyledAttributes.getDimension(m9c0.f10350u0, m7522a(8));
        typedArrayObtainStyledAttributes.recycle();
        this.f4872g = new Paint(1);
        this.f4873h = new Paint(1);
        Paint paint = this.f4872g;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f4873h.setStyle(style);
        this.f4872g.setColor(this.f4868c);
        this.f4873h.setColor(this.f4869d);
    }

    /* JADX INFO: renamed from: a */
    private int m7522a(int i) {
        return isInEditMode() ? (int) (((double) i) * 2.5d) : t100.d(i);
    }

    /* JADX INFO: renamed from: b */
    private void m7523b(Canvas canvas, int i, float f) {
        this.f4876k = m7525d(i, f);
        float fM7526e = m7526e();
        if (i != this.f4866a) {
            float f2 = fM7526e / 2.0f;
            canvas.drawRoundRect(this.f4876k, f2, f2, this.f4872g);
            return;
        }
        RectF rectF = this.f4877l;
        RectF rectF2 = this.f4876k;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        ValueAnimator valueAnimator = this.f4874i;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f4876k.offset(this.f4875j, 0.0f);
        }
        float f3 = fM7526e / 2.0f;
        canvas.drawRoundRect(this.f4876k, f3, f3, this.f4873h);
    }

    /* JADX INFO: renamed from: c */
    private void m7524c(Canvas canvas) {
        float fM7527f = m7527f();
        for (int i = 0; i < this.f4871f; i++) {
            m7523b(canvas, i, fM7527f);
        }
        if (this.f4875j != 0.0f) {
            m7523b(canvas, this.f4866a, fM7527f);
        }
    }

    /* JADX INFO: renamed from: d */
    private RectF m7525d(int i, float f) {
        float f2 = (this.f4870e + f) * i;
        float measuredHeight = (getMeasuredHeight() - m7526e()) / 2.0f;
        this.f4876k.set(f2, measuredHeight, f + f2, m7526e() + measuredHeight);
        return this.f4876k;
    }

    /* JADX INFO: renamed from: e */
    private int m7526e() {
        return m7522a(3);
    }

    /* JADX INFO: renamed from: f */
    public float m7527f() {
        float measuredWidth = getMeasuredWidth() * 1.0f;
        float f = this.f4870e;
        int i = this.f4871f;
        return (measuredWidth - (f * (i - 1))) / i;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f4874i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4871f > 0) {
            m7524c(canvas);
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
            size = (int) (m7522a(100) + 0.5f);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = (int) (m7526e() + 0.5f);
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
        this.f4871f = i;
        invalidate();
    }

    public void setSelectedIndex(int i) {
        this.f4866a = i;
        invalidate();
    }

    public void setupWithPager(ViewPager viewPager) {
        viewPager.P(this);
        viewPager.d(this);
    }

    public FeedNewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedNewPictureContainerIndicator(Context context) {
        this(context, null);
    }
}
