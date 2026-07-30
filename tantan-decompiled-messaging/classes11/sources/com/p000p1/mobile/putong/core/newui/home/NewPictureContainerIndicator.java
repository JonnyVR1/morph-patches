package com.p000p1.mobile.putong.core.newui.home;

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
import l.r9c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewPictureContainerIndicator extends View implements ViewPager.j {

    /* JADX INFO: renamed from: a */
    public int f590a;

    /* JADX INFO: renamed from: b */
    public Context f591b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f592c;

    /* JADX INFO: renamed from: d */
    @ColorInt
    public int f593d;

    /* JADX INFO: renamed from: e */
    public float f594e;

    /* JADX INFO: renamed from: f */
    public int f595f;

    /* JADX INFO: renamed from: g */
    public Paint f596g;

    /* JADX INFO: renamed from: h */
    public Paint f597h;

    /* JADX INFO: renamed from: i */
    public Paint f598i;

    /* JADX INFO: renamed from: j */
    public Paint f599j;

    /* JADX INFO: renamed from: k */
    @ColorInt
    public int f600k;

    /* JADX INFO: renamed from: l */
    @ColorInt
    public int f601l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f602m;

    /* JADX INFO: renamed from: n */
    public float f603n;

    /* JADX INFO: renamed from: o */
    public RectF f604o;

    /* JADX INFO: renamed from: p */
    public RectF f605p;

    public NewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f600k = 0;
        this.f601l = 0;
        this.f603n = 0.0f;
        this.f604o = new RectF();
        this.f605p = new RectF();
        this.f591b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.u);
        this.f592c = typedArrayObtainStyledAttributes.getColor(r9c0.v, Color.parseColor("#19000000"));
        this.f593d = typedArrayObtainStyledAttributes.getColor(r9c0.x, -1);
        this.f594e = typedArrayObtainStyledAttributes.getDimension(r9c0.w, m923c(8));
        typedArrayObtainStyledAttributes.recycle();
        this.f596g = new Paint(1);
        this.f597h = new Paint(1);
        Paint paint = this.f596g;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f597h.setStyle(style);
        this.f596g.setColor(this.f592c);
        this.f597h.setColor(this.f593d);
        Paint paint2 = new Paint(1);
        this.f598i = paint2;
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.f598i.setStrokeWidth(0.5f);
        Paint paint3 = new Paint(1);
        this.f599j = paint3;
        paint3.setStyle(style2);
        this.f599j.setStrokeWidth(0.5f);
    }

    /* JADX INFO: renamed from: b */
    public void m922b(int i) {
        this.f590a = i;
        ValueAnimator valueAnimator = this.f602m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        RectF rectFM926f = m926f(this.f590a, m928h());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f605p.left - new RectF(rectFM926f.left, rectFM926f.top, rectFM926f.right, rectFM926f.bottom).left) + this.f603n, 0.0f);
        this.f602m = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        this.f602m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.j140
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f14894a.m929i(valueAnimator2);
            }
        });
        this.f602m.start();
    }

    /* JADX INFO: renamed from: c */
    public final int m923c(int i) {
        return isInEditMode() ? (int) (((double) i) * 2.5d) : t100.d(i);
    }

    /* JADX INFO: renamed from: d */
    public final void m924d(Canvas canvas, int i, float f) {
        this.f604o = m926f(i, f);
        float fM927g = m927g();
        if (i != this.f590a) {
            float f2 = fM927g / 2.0f;
            canvas.drawRoundRect(this.f604o, f2, f2, this.f596g);
            if (this.f600k != 0) {
                canvas.drawRoundRect(this.f604o, f2, f2, this.f598i);
                return;
            }
            return;
        }
        RectF rectF = this.f605p;
        RectF rectF2 = this.f604o;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        ValueAnimator valueAnimator = this.f602m;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f604o.offset(this.f603n, 0.0f);
        }
        float f3 = fM927g / 2.0f;
        canvas.drawRoundRect(this.f604o, f3, f3, this.f597h);
        if (this.f601l != 0) {
            canvas.drawRoundRect(this.f604o, f3, f3, this.f599j);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m925e(Canvas canvas) {
        float fM928h = m928h();
        for (int i = 0; i < this.f595f; i++) {
            m924d(canvas, i, fM928h);
        }
        if (this.f603n != 0.0f) {
            m924d(canvas, this.f590a, fM928h);
        }
    }

    /* JADX INFO: renamed from: f */
    public final RectF m926f(int i, float f) {
        float f2 = (this.f594e + f) * i;
        float measuredHeight = (getMeasuredHeight() - m927g()) / 2.0f;
        this.f604o.set(f2, measuredHeight, f + f2, m927g() + measuredHeight);
        return this.f604o;
    }

    /* JADX INFO: renamed from: g */
    public final int m927g() {
        return m923c(3);
    }

    /* JADX INFO: renamed from: h */
    public float m928h() {
        float measuredWidth = getMeasuredWidth() * 1.0f;
        float f = this.f594e;
        int i = this.f595f;
        return (measuredWidth - (f * (i - 1))) / i;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m929i(ValueAnimator valueAnimator) {
        this.f603n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f602m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f595f > 0) {
            m925e(canvas);
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
            size = (int) (m923c(100) + 0.5f);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = (int) (m927g() + 0.5f);
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

    public void setIndicatorBorderColor(int i) {
        this.f600k = i;
        this.f598i.setColor(i);
        invalidate();
    }

    public void setIndicatorBorderSelectedColor(int i) {
        this.f601l = i;
        this.f599j.setColor(i);
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f592c = i;
        this.f596g.setColor(i);
        invalidate();
    }

    public void setIndicatorCount(int i) {
        this.f595f = i;
        invalidate();
    }

    public void setIndicatorMargin(float f) {
        this.f594e = f;
        invalidate();
    }

    public void setIndicatorSelectedColor(int i) {
        this.f593d = i;
        this.f597h.setColor(i);
        invalidate();
    }

    public void setSelectedIndex(int i) {
        this.f590a = i;
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
