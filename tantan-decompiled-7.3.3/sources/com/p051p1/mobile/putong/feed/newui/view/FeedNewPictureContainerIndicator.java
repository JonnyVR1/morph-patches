package com.p051p1.mobile.putong.feed.newui.view;

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
import p153l.qa00;
import p153l.shc0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedNewPictureContainerIndicator extends View implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a */
    public int f44253a;

    /* JADX INFO: renamed from: b */
    public Context f44254b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f44255c;

    /* JADX INFO: renamed from: d */
    @ColorInt
    public int f44256d;

    /* JADX INFO: renamed from: e */
    public float f44257e;

    /* JADX INFO: renamed from: f */
    public int f44258f;

    /* JADX INFO: renamed from: g */
    public Paint f44259g;

    /* JADX INFO: renamed from: h */
    public Paint f44260h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f44261i;

    /* JADX INFO: renamed from: j */
    public float f44262j;

    /* JADX INFO: renamed from: k */
    public RectF f44263k;

    /* JADX INFO: renamed from: l */
    public RectF f44264l;

    public FeedNewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44262j = 0.0f;
        this.f44263k = new RectF();
        this.f44264l = new RectF();
        this.f44254b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168677s0);
        this.f44255c = typedArrayObtainStyledAttributes.getColor(shc0.f168679t0, Color.parseColor("#19000000"));
        this.f44256d = typedArrayObtainStyledAttributes.getColor(shc0.f168683v0, -1);
        this.f44257e = typedArrayObtainStyledAttributes.getDimension(shc0.f168681u0, m67540a(8));
        typedArrayObtainStyledAttributes.recycle();
        this.f44259g = new Paint(1);
        this.f44260h = new Paint(1);
        Paint paint = this.f44259g;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f44260h.setStyle(style);
        this.f44259g.setColor(this.f44255c);
        this.f44260h.setColor(this.f44256d);
    }

    /* JADX INFO: renamed from: a */
    private int m67540a(int i) {
        return isInEditMode() ? (int) (((double) i) * 2.5d) : qa00.m175859d(i);
    }

    /* JADX INFO: renamed from: b */
    private void m67541b(Canvas canvas, int i, float f) {
        this.f44263k = m67543d(i, f);
        float fM67544e = m67544e();
        if (i != this.f44253a) {
            float f2 = fM67544e / 2.0f;
            canvas.drawRoundRect(this.f44263k, f2, f2, this.f44259g);
            return;
        }
        RectF rectF = this.f44264l;
        RectF rectF2 = this.f44263k;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        ValueAnimator valueAnimator = this.f44261i;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f44263k.offset(this.f44262j, 0.0f);
        }
        float f3 = fM67544e / 2.0f;
        canvas.drawRoundRect(this.f44263k, f3, f3, this.f44260h);
    }

    /* JADX INFO: renamed from: c */
    private void m67542c(Canvas canvas) {
        float fM67545f = m67545f();
        for (int i = 0; i < this.f44258f; i++) {
            m67541b(canvas, i, fM67545f);
        }
        if (this.f44262j != 0.0f) {
            m67541b(canvas, this.f44253a, fM67545f);
        }
    }

    /* JADX INFO: renamed from: d */
    private RectF m67543d(int i, float f) {
        float f2 = (this.f44257e + f) * i;
        float measuredHeight = (getMeasuredHeight() - m67544e()) / 2.0f;
        this.f44263k.set(f2, measuredHeight, f + f2, m67544e() + measuredHeight);
        return this.f44263k;
    }

    /* JADX INFO: renamed from: e */
    private int m67544e() {
        return m67540a(3);
    }

    /* JADX INFO: renamed from: f */
    public float m67545f() {
        float measuredWidth = getMeasuredWidth() * 1.0f;
        float f = this.f44257e;
        int i = this.f44258f;
        return (measuredWidth - (f * (i - 1))) / i;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f44261i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f44258f > 0) {
            m67542c(canvas);
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
            size = (int) (m67540a(100) + 0.5f);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = (int) (m67544e() + 0.5f);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        setSelectedIndex(i);
    }

    public void setIndicatorCount(int i) {
        this.f44258f = i;
        invalidate();
    }

    public void setSelectedIndex(int i) {
        this.f44253a = i;
        invalidate();
    }

    public void setupWithPager(ViewPager viewPager) {
        viewPager.m4177P(this);
        viewPager.m4187d(this);
    }

    public FeedNewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedNewPictureContainerIndicator(Context context) {
        this(context, null);
    }
}
