package com.p046p1.mobile.putong.feed.newui.view;

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
public class FeedNewPictureContainerIndicator extends View implements ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: a */
    public int f43405a;

    /* JADX INFO: renamed from: b */
    public Context f43406b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f43407c;

    /* JADX INFO: renamed from: d */
    @ColorInt
    public int f43408d;

    /* JADX INFO: renamed from: e */
    public float f43409e;

    /* JADX INFO: renamed from: f */
    public int f43410f;

    /* JADX INFO: renamed from: g */
    public Paint f43411g;

    /* JADX INFO: renamed from: h */
    public Paint f43412h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f43413i;

    /* JADX INFO: renamed from: j */
    public float f43414j;

    /* JADX INFO: renamed from: k */
    public RectF f43415k;

    /* JADX INFO: renamed from: l */
    public RectF f43416l;

    public FeedNewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43414j = 0.0f;
        this.f43415k = new RectF();
        this.f43416l = new RectF();
        this.f43406b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132755s0);
        this.f43407c = typedArrayObtainStyledAttributes.getColor(m9c0.f132757t0, Color.parseColor("#19000000"));
        this.f43408d = typedArrayObtainStyledAttributes.getColor(m9c0.f132761v0, -1);
        this.f43409e = typedArrayObtainStyledAttributes.getDimension(m9c0.f132759u0, m66357a(8));
        typedArrayObtainStyledAttributes.recycle();
        this.f43411g = new Paint(1);
        this.f43412h = new Paint(1);
        Paint paint = this.f43411g;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f43412h.setStyle(style);
        this.f43411g.setColor(this.f43407c);
        this.f43412h.setColor(this.f43408d);
    }

    /* JADX INFO: renamed from: a */
    private int m66357a(int i) {
        return isInEditMode() ? (int) (((double) i) * 2.5d) : t100.m186890d(i);
    }

    /* JADX INFO: renamed from: b */
    private void m66358b(Canvas canvas, int i, float f) {
        this.f43415k = m66360d(i, f);
        float fM66361e = m66361e();
        if (i != this.f43405a) {
            float f2 = fM66361e / 2.0f;
            canvas.drawRoundRect(this.f43415k, f2, f2, this.f43411g);
            return;
        }
        RectF rectF = this.f43416l;
        RectF rectF2 = this.f43415k;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        ValueAnimator valueAnimator = this.f43413i;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f43415k.offset(this.f43414j, 0.0f);
        }
        float f3 = fM66361e / 2.0f;
        canvas.drawRoundRect(this.f43415k, f3, f3, this.f43412h);
    }

    /* JADX INFO: renamed from: c */
    private void m66359c(Canvas canvas) {
        float fM66362f = m66362f();
        for (int i = 0; i < this.f43410f; i++) {
            m66358b(canvas, i, fM66362f);
        }
        if (this.f43414j != 0.0f) {
            m66358b(canvas, this.f43405a, fM66362f);
        }
    }

    /* JADX INFO: renamed from: d */
    private RectF m66360d(int i, float f) {
        float f2 = (this.f43409e + f) * i;
        float measuredHeight = (getMeasuredHeight() - m66361e()) / 2.0f;
        this.f43415k.set(f2, measuredHeight, f + f2, m66361e() + measuredHeight);
        return this.f43415k;
    }

    /* JADX INFO: renamed from: e */
    private int m66361e() {
        return m66357a(3);
    }

    /* JADX INFO: renamed from: f */
    public float m66362f() {
        float measuredWidth = getMeasuredWidth() * 1.0f;
        float f = this.f43409e;
        int i = this.f43410f;
        return (measuredWidth - (f * (i - 1))) / i;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f43413i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f43410f > 0) {
            m66359c(canvas);
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
            size = (int) (m66357a(100) + 0.5f);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = (int) (m66361e() + 0.5f);
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
        this.f43410f = i;
        invalidate();
    }

    public void setSelectedIndex(int i) {
        this.f43405a = i;
        invalidate();
    }

    public void setupWithPager(ViewPager viewPager) {
        viewPager.m4175P(this);
        viewPager.m4185d(this);
    }

    public FeedNewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedNewPictureContainerIndicator(Context context) {
        this(context, null);
    }
}
