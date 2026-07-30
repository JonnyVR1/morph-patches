package com.p051p1.mobile.putong.core.newui.home;

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
import p153l.xhc0;

/* JADX INFO: loaded from: classes11.dex */
public class NewPictureContainerIndicator extends View implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a */
    public int f22554a;

    /* JADX INFO: renamed from: b */
    public Context f22555b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f22556c;

    /* JADX INFO: renamed from: d */
    @ColorInt
    public int f22557d;

    /* JADX INFO: renamed from: e */
    public float f22558e;

    /* JADX INFO: renamed from: f */
    public int f22559f;

    /* JADX INFO: renamed from: g */
    public Paint f22560g;

    /* JADX INFO: renamed from: h */
    public Paint f22561h;

    /* JADX INFO: renamed from: i */
    public Paint f22562i;

    /* JADX INFO: renamed from: j */
    public Paint f22563j;

    /* JADX INFO: renamed from: k */
    @ColorInt
    public int f22564k;

    /* JADX INFO: renamed from: l */
    @ColorInt
    public int f22565l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f22566m;

    /* JADX INFO: renamed from: n */
    public float f22567n;

    /* JADX INFO: renamed from: o */
    public RectF f22568o;

    /* JADX INFO: renamed from: p */
    public RectF f22569p;

    public NewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22564k = 0;
        this.f22565l = 0;
        this.f22567n = 0.0f;
        this.f22568o = new RectF();
        this.f22569p = new RectF();
        this.f22555b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xhc0.f194348u);
        this.f22556c = typedArrayObtainStyledAttributes.getColor(xhc0.f194349v, Color.parseColor("#19000000"));
        this.f22557d = typedArrayObtainStyledAttributes.getColor(xhc0.f194351x, -1);
        this.f22558e = typedArrayObtainStyledAttributes.getDimension(xhc0.f194350w, m37959c(8));
        typedArrayObtainStyledAttributes.recycle();
        this.f22560g = new Paint(1);
        this.f22561h = new Paint(1);
        Paint paint = this.f22560g;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f22561h.setStyle(style);
        this.f22560g.setColor(this.f22556c);
        this.f22561h.setColor(this.f22557d);
        Paint paint2 = new Paint(1);
        this.f22562i = paint2;
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.f22562i.setStrokeWidth(0.5f);
        Paint paint3 = new Paint(1);
        this.f22563j = paint3;
        paint3.setStyle(style2);
        this.f22563j.setStrokeWidth(0.5f);
    }

    /* JADX INFO: renamed from: b */
    public void m37958b(int i) {
        this.f22554a = i;
        ValueAnimator valueAnimator = this.f22566m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        RectF rectFM37962f = m37962f(this.f22554a, m37964h());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f22569p.left - new RectF(rectFM37962f.left, rectFM37962f.top, rectFM37962f.right, rectFM37962f.bottom).left) + this.f22567n, 0.0f);
        this.f22566m = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        this.f22566m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.x940
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f192913a.m37965i(valueAnimator2);
            }
        });
        this.f22566m.start();
    }

    /* JADX INFO: renamed from: c */
    public final int m37959c(int i) {
        return isInEditMode() ? (int) (((double) i) * 2.5d) : qa00.m175859d(i);
    }

    /* JADX INFO: renamed from: d */
    public final void m37960d(Canvas canvas, int i, float f) {
        this.f22568o = m37962f(i, f);
        float fM37963g = m37963g();
        if (i != this.f22554a) {
            float f2 = fM37963g / 2.0f;
            canvas.drawRoundRect(this.f22568o, f2, f2, this.f22560g);
            if (this.f22564k != 0) {
                canvas.drawRoundRect(this.f22568o, f2, f2, this.f22562i);
                return;
            }
            return;
        }
        RectF rectF = this.f22569p;
        RectF rectF2 = this.f22568o;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        ValueAnimator valueAnimator = this.f22566m;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f22568o.offset(this.f22567n, 0.0f);
        }
        float f3 = fM37963g / 2.0f;
        canvas.drawRoundRect(this.f22568o, f3, f3, this.f22561h);
        if (this.f22565l != 0) {
            canvas.drawRoundRect(this.f22568o, f3, f3, this.f22563j);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m37961e(Canvas canvas) {
        float fM37964h = m37964h();
        for (int i = 0; i < this.f22559f; i++) {
            m37960d(canvas, i, fM37964h);
        }
        if (this.f22567n != 0.0f) {
            m37960d(canvas, this.f22554a, fM37964h);
        }
    }

    /* JADX INFO: renamed from: f */
    public final RectF m37962f(int i, float f) {
        float f2 = (this.f22558e + f) * i;
        float measuredHeight = (getMeasuredHeight() - m37963g()) / 2.0f;
        this.f22568o.set(f2, measuredHeight, f + f2, m37963g() + measuredHeight);
        return this.f22568o;
    }

    /* JADX INFO: renamed from: g */
    public final int m37963g() {
        return m37959c(3);
    }

    /* JADX INFO: renamed from: h */
    public float m37964h() {
        float measuredWidth = getMeasuredWidth() * 1.0f;
        float f = this.f22558e;
        int i = this.f22559f;
        return (measuredWidth - (f * (i - 1))) / i;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m37965i(ValueAnimator valueAnimator) {
        this.f22567n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f22566m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f22559f > 0) {
            m37961e(canvas);
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
            size = (int) (m37959c(100) + 0.5f);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = (int) (m37963g() + 0.5f);
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

    public void setIndicatorBorderColor(int i) {
        this.f22564k = i;
        this.f22562i.setColor(i);
        invalidate();
    }

    public void setIndicatorBorderSelectedColor(int i) {
        this.f22565l = i;
        this.f22563j.setColor(i);
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f22556c = i;
        this.f22560g.setColor(i);
        invalidate();
    }

    public void setIndicatorCount(int i) {
        this.f22559f = i;
        invalidate();
    }

    public void setIndicatorMargin(float f) {
        this.f22558e = f;
        invalidate();
    }

    public void setIndicatorSelectedColor(int i) {
        this.f22557d = i;
        this.f22561h.setColor(i);
        invalidate();
    }

    public void setSelectedIndex(int i) {
        this.f22554a = i;
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
