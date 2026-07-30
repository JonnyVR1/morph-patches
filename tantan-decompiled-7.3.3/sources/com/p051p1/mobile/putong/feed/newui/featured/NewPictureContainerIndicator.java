package com.p051p1.mobile.putong.feed.newui.featured;

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
public class NewPictureContainerIndicator extends View implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a */
    public int f40791a;

    /* JADX INFO: renamed from: b */
    public Context f40792b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f40793c;

    /* JADX INFO: renamed from: d */
    @ColorInt
    public int f40794d;

    /* JADX INFO: renamed from: e */
    public float f40795e;

    /* JADX INFO: renamed from: f */
    public int f40796f;

    /* JADX INFO: renamed from: g */
    public Paint f40797g;

    /* JADX INFO: renamed from: h */
    public Paint f40798h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f40799i;

    /* JADX INFO: renamed from: j */
    public float f40800j;

    /* JADX INFO: renamed from: k */
    public RectF f40801k;

    /* JADX INFO: renamed from: l */
    public RectF f40802l;

    public NewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40800j = 0.0f;
        this.f40801k = new RectF();
        this.f40802l = new RectF();
        this.f40792b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168677s0);
        this.f40793c = typedArrayObtainStyledAttributes.getColor(shc0.f168679t0, Color.parseColor("#19000000"));
        this.f40794d = typedArrayObtainStyledAttributes.getColor(shc0.f168683v0, -1);
        this.f40795e = typedArrayObtainStyledAttributes.getDimension(shc0.f168681u0, m63059a(8));
        typedArrayObtainStyledAttributes.recycle();
        this.f40797g = new Paint(1);
        this.f40798h = new Paint(1);
        Paint paint = this.f40797g;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f40798h.setStyle(style);
        this.f40797g.setColor(this.f40793c);
        this.f40798h.setColor(this.f40794d);
    }

    /* JADX INFO: renamed from: a */
    private int m63059a(int i) {
        return isInEditMode() ? (int) (((double) i) * 2.5d) : qa00.m175859d(i);
    }

    /* JADX INFO: renamed from: b */
    private void m63060b(Canvas canvas, int i, float f) {
        this.f40801k = m63062d(i, f);
        float fM63063e = m63063e();
        if (i != this.f40791a) {
            float f2 = fM63063e / 2.0f;
            canvas.drawRoundRect(this.f40801k, f2, f2, this.f40797g);
            return;
        }
        RectF rectF = this.f40802l;
        RectF rectF2 = this.f40801k;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        ValueAnimator valueAnimator = this.f40799i;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f40801k.offset(this.f40800j, 0.0f);
        }
        float f3 = fM63063e / 2.0f;
        canvas.drawRoundRect(this.f40801k, f3, f3, this.f40798h);
    }

    /* JADX INFO: renamed from: c */
    private void m63061c(Canvas canvas) {
        float fM63064f = m63064f();
        for (int i = 0; i < this.f40796f; i++) {
            m63060b(canvas, i, fM63064f);
        }
        if (this.f40800j != 0.0f) {
            m63060b(canvas, this.f40791a, fM63064f);
        }
    }

    /* JADX INFO: renamed from: d */
    private RectF m63062d(int i, float f) {
        float f2 = (this.f40795e + f) * i;
        float measuredHeight = (getMeasuredHeight() - m63063e()) / 2.0f;
        this.f40801k.set(f2, measuredHeight, f + f2, m63063e() + measuredHeight);
        return this.f40801k;
    }

    /* JADX INFO: renamed from: e */
    private int m63063e() {
        return m63059a(3);
    }

    /* JADX INFO: renamed from: f */
    public float m63064f() {
        float measuredWidth = getMeasuredWidth() * 1.0f;
        float f = this.f40795e;
        int i = this.f40796f;
        return (measuredWidth - (f * (i - 1))) / i;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f40799i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f40796f > 0) {
            m63061c(canvas);
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
            size = (int) (m63059a(100) + 0.5f);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = (int) (m63063e() + 0.5f);
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
        this.f40796f = i;
        invalidate();
    }

    public void setSelectedIndex(int i) {
        this.f40791a = i;
        invalidate();
    }

    public void setupWithPager(ViewPager viewPager) {
        viewPager.m4177P(this);
        viewPager.m4187d(this);
    }

    public NewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewPictureContainerIndicator(Context context) {
        this(context, null);
    }
}
