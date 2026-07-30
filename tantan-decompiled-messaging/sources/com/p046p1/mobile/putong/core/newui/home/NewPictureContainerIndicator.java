package com.p046p1.mobile.putong.core.newui.home;

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
import p149l.r9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class NewPictureContainerIndicator extends View implements ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: a */
    public int f21812a;

    /* JADX INFO: renamed from: b */
    public Context f21813b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f21814c;

    /* JADX INFO: renamed from: d */
    @ColorInt
    public int f21815d;

    /* JADX INFO: renamed from: e */
    public float f21816e;

    /* JADX INFO: renamed from: f */
    public int f21817f;

    /* JADX INFO: renamed from: g */
    public Paint f21818g;

    /* JADX INFO: renamed from: h */
    public Paint f21819h;

    /* JADX INFO: renamed from: i */
    public Paint f21820i;

    /* JADX INFO: renamed from: j */
    public Paint f21821j;

    /* JADX INFO: renamed from: k */
    @ColorInt
    public int f21822k;

    /* JADX INFO: renamed from: l */
    @ColorInt
    public int f21823l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f21824m;

    /* JADX INFO: renamed from: n */
    public float f21825n;

    /* JADX INFO: renamed from: o */
    public RectF f21826o;

    /* JADX INFO: renamed from: p */
    public RectF f21827p;

    public NewPictureContainerIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21822k = 0;
        this.f21823l = 0;
        this.f21825n = 0.0f;
        this.f21826o = new RectF();
        this.f21827p = new RectF();
        this.f21813b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.f158348u);
        this.f21814c = typedArrayObtainStyledAttributes.getColor(r9c0.f158349v, Color.parseColor("#19000000"));
        this.f21815d = typedArrayObtainStyledAttributes.getColor(r9c0.f158351x, -1);
        this.f21816e = typedArrayObtainStyledAttributes.getDimension(r9c0.f158350w, m36956c(8));
        typedArrayObtainStyledAttributes.recycle();
        this.f21818g = new Paint(1);
        this.f21819h = new Paint(1);
        Paint paint = this.f21818g;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f21819h.setStyle(style);
        this.f21818g.setColor(this.f21814c);
        this.f21819h.setColor(this.f21815d);
        Paint paint2 = new Paint(1);
        this.f21820i = paint2;
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.f21820i.setStrokeWidth(0.5f);
        Paint paint3 = new Paint(1);
        this.f21821j = paint3;
        paint3.setStyle(style2);
        this.f21821j.setStrokeWidth(0.5f);
    }

    /* JADX INFO: renamed from: b */
    public void m36955b(int i) {
        this.f21812a = i;
        ValueAnimator valueAnimator = this.f21824m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        RectF rectFM36959f = m36959f(this.f21812a, m36961h());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f21827p.left - new RectF(rectFM36959f.left, rectFM36959f.top, rectFM36959f.right, rectFM36959f.bottom).left) + this.f21825n, 0.0f);
        this.f21824m = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        this.f21824m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.j140
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f115736a.m36962i(valueAnimator2);
            }
        });
        this.f21824m.start();
    }

    /* JADX INFO: renamed from: c */
    public final int m36956c(int i) {
        return isInEditMode() ? (int) (((double) i) * 2.5d) : t100.m186890d(i);
    }

    /* JADX INFO: renamed from: d */
    public final void m36957d(Canvas canvas, int i, float f) {
        this.f21826o = m36959f(i, f);
        float fM36960g = m36960g();
        if (i != this.f21812a) {
            float f2 = fM36960g / 2.0f;
            canvas.drawRoundRect(this.f21826o, f2, f2, this.f21818g);
            if (this.f21822k != 0) {
                canvas.drawRoundRect(this.f21826o, f2, f2, this.f21820i);
                return;
            }
            return;
        }
        RectF rectF = this.f21827p;
        RectF rectF2 = this.f21826o;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        ValueAnimator valueAnimator = this.f21824m;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f21826o.offset(this.f21825n, 0.0f);
        }
        float f3 = fM36960g / 2.0f;
        canvas.drawRoundRect(this.f21826o, f3, f3, this.f21819h);
        if (this.f21823l != 0) {
            canvas.drawRoundRect(this.f21826o, f3, f3, this.f21821j);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m36958e(Canvas canvas) {
        float fM36961h = m36961h();
        for (int i = 0; i < this.f21817f; i++) {
            m36957d(canvas, i, fM36961h);
        }
        if (this.f21825n != 0.0f) {
            m36957d(canvas, this.f21812a, fM36961h);
        }
    }

    /* JADX INFO: renamed from: f */
    public final RectF m36959f(int i, float f) {
        float f2 = (this.f21816e + f) * i;
        float measuredHeight = (getMeasuredHeight() - m36960g()) / 2.0f;
        this.f21826o.set(f2, measuredHeight, f + f2, m36960g() + measuredHeight);
        return this.f21826o;
    }

    /* JADX INFO: renamed from: g */
    public final int m36960g() {
        return m36956c(3);
    }

    /* JADX INFO: renamed from: h */
    public float m36961h() {
        float measuredWidth = getMeasuredWidth() * 1.0f;
        float f = this.f21816e;
        int i = this.f21817f;
        return (measuredWidth - (f * (i - 1))) / i;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m36962i(ValueAnimator valueAnimator) {
        this.f21825n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f21824m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f21817f > 0) {
            m36958e(canvas);
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
            size = (int) (m36956c(100) + 0.5f);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = (int) (m36960g() + 0.5f);
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

    public void setIndicatorBorderColor(int i) {
        this.f21822k = i;
        this.f21820i.setColor(i);
        invalidate();
    }

    public void setIndicatorBorderSelectedColor(int i) {
        this.f21823l = i;
        this.f21821j.setColor(i);
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f21814c = i;
        this.f21818g.setColor(i);
        invalidate();
    }

    public void setIndicatorCount(int i) {
        this.f21817f = i;
        invalidate();
    }

    public void setIndicatorMargin(float f) {
        this.f21816e = f;
        invalidate();
    }

    public void setIndicatorSelectedColor(int i) {
        this.f21815d = i;
        this.f21819h.setColor(i);
        invalidate();
    }

    public void setSelectedIndex(int i) {
        this.f21812a = i;
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
