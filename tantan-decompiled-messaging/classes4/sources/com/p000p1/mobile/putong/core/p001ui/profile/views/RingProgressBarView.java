package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.Nullable;
import l.c1c0;
import l.k9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RingProgressBarView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f2050a;

    /* JADX INFO: renamed from: b */
    public Paint f2051b;

    /* JADX INFO: renamed from: c */
    public Paint f2052c;

    /* JADX INFO: renamed from: d */
    public int f2053d;

    /* JADX INFO: renamed from: e */
    public int f2054e;

    /* JADX INFO: renamed from: f */
    public int f2055f;

    /* JADX INFO: renamed from: g */
    public float f2056g;

    /* JADX INFO: renamed from: h */
    public float f2057h;

    /* JADX INFO: renamed from: i */
    public float f2058i;

    /* JADX INFO: renamed from: j */
    public float f2059j;

    /* JADX INFO: renamed from: k */
    public final RectF f2060k;

    public RingProgressBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2059j = 0.0f;
        this.f2060k = new RectF();
        m3596e(context, attributeSet);
        m3597f();
    }

    /* JADX INFO: renamed from: b */
    public int m3593b(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: c */
    public final Paint m3594c(Paint.Style style, int i) {
        Paint paint = new Paint(1);
        paint.setStyle(style);
        paint.setColor(i);
        paint.setAntiAlias(true);
        return paint;
    }

    /* JADX INFO: renamed from: d */
    public final Paint m3595d(Paint.Style style, int i, float f) {
        Paint paintM3594c = m3594c(style, i);
        paintM3594c.setStrokeWidth(f);
        return paintM3594c;
    }

    /* JADX INFO: renamed from: e */
    public final void m3596e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k9c0.y, 0, 0);
        this.f2056g = typedArrayObtainStyledAttributes.getDimension(k9c0.A, m3593b(30));
        this.f2058i = typedArrayObtainStyledAttributes.getDimension(k9c0.D, m3593b(6));
        this.f2053d = typedArrayObtainStyledAttributes.getColor(k9c0.z, Color.parseColor("#08000000"));
        this.f2054e = typedArrayObtainStyledAttributes.getColor(k9c0.C, getResources().getColor(c1c0.f));
        this.f2055f = typedArrayObtainStyledAttributes.getColor(k9c0.B, Color.parseColor("#1AFE7E1D"));
        this.f2057h = this.f2056g + (this.f2058i / 2.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m3597f() {
        this.f2050a = m3594c(Paint.Style.FILL, this.f2053d);
        Paint.Style style = Paint.Style.STROKE;
        this.f2052c = m3595d(style, this.f2055f, this.f2058i);
        Paint paintM3595d = m3595d(style, this.f2054e, this.f2058i);
        this.f2051b = paintM3595d;
        paintM3595d.setStrokeCap(Paint.Cap.ROUND);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m3598g(ValueAnimator valueAnimator) {
        this.f2059j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.drawCircle(width, height, this.f2056g, this.f2050a);
        RectF rectF = this.f2060k;
        float f = this.f2057h;
        rectF.left = width - f;
        rectF.top = height - f;
        rectF.right = (f * 2.0f) + (width - f);
        rectF.bottom = (f * 2.0f) + (height - f);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f2052c);
        if (this.f2059j > 0.0f) {
            RectF rectF2 = new RectF();
            float f2 = this.f2057h;
            rectF2.left = width - f2;
            rectF2.top = height - f2;
            rectF2.right = (f2 * 2.0f) + (width - f2);
            rectF2.bottom = (2.0f * f2) + (height - f2);
            canvas.drawArc(rectF2, 90.0f, (this.f2059j / 100.0f) * 360.0f, false, this.f2051b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setProgress(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f2059j, f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.a5d0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f7408a.m3598g(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public void setRingColor(int i) {
        this.f2055f = i;
        this.f2051b.setColor(i);
    }
}
