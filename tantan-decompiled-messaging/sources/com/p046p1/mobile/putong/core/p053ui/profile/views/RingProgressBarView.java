package com.p046p1.mobile.putong.core.p053ui.profile.views;

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
import p149l.c1c0;
import p149l.k9c0;

/* JADX INFO: loaded from: classes4.dex */
public class RingProgressBarView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f34228a;

    /* JADX INFO: renamed from: b */
    public Paint f34229b;

    /* JADX INFO: renamed from: c */
    public Paint f34230c;

    /* JADX INFO: renamed from: d */
    public int f34231d;

    /* JADX INFO: renamed from: e */
    public int f34232e;

    /* JADX INFO: renamed from: f */
    public int f34233f;

    /* JADX INFO: renamed from: g */
    public float f34234g;

    /* JADX INFO: renamed from: h */
    public float f34235h;

    /* JADX INFO: renamed from: i */
    public float f34236i;

    /* JADX INFO: renamed from: j */
    public float f34237j;

    /* JADX INFO: renamed from: k */
    public final RectF f34238k;

    public RingProgressBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34237j = 0.0f;
        this.f34238k = new RectF();
        m53038e(context, attributeSet);
        m53039f();
    }

    /* JADX INFO: renamed from: b */
    public int m53035b(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: c */
    public final Paint m53036c(Paint.Style style, int i) {
        Paint paint = new Paint(1);
        paint.setStyle(style);
        paint.setColor(i);
        paint.setAntiAlias(true);
        return paint;
    }

    /* JADX INFO: renamed from: d */
    public final Paint m53037d(Paint.Style style, int i, float f) {
        Paint paintM53036c = m53036c(style, i);
        paintM53036c.setStrokeWidth(f);
        return paintM53036c;
    }

    /* JADX INFO: renamed from: e */
    public final void m53038e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k9c0.f121992y, 0, 0);
        this.f34234g = typedArrayObtainStyledAttributes.getDimension(k9c0.f121933A, m53035b(30));
        this.f34236i = typedArrayObtainStyledAttributes.getDimension(k9c0.f121936D, m53035b(6));
        this.f34231d = typedArrayObtainStyledAttributes.getColor(k9c0.f121993z, Color.parseColor("#08000000"));
        this.f34232e = typedArrayObtainStyledAttributes.getColor(k9c0.f121935C, getResources().getColor(c1c0.f78249f));
        this.f34233f = typedArrayObtainStyledAttributes.getColor(k9c0.f121934B, Color.parseColor("#1AFE7E1D"));
        this.f34235h = this.f34234g + (this.f34236i / 2.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m53039f() {
        this.f34228a = m53036c(Paint.Style.FILL, this.f34231d);
        Paint.Style style = Paint.Style.STROKE;
        this.f34230c = m53037d(style, this.f34233f, this.f34236i);
        Paint paintM53037d = m53037d(style, this.f34232e, this.f34236i);
        this.f34229b = paintM53037d;
        paintM53037d.setStrokeCap(Paint.Cap.ROUND);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m53040g(ValueAnimator valueAnimator) {
        this.f34237j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.drawCircle(width, height, this.f34234g, this.f34228a);
        RectF rectF = this.f34238k;
        float f = this.f34235h;
        rectF.left = width - f;
        rectF.top = height - f;
        rectF.right = (f * 2.0f) + (width - f);
        rectF.bottom = (f * 2.0f) + (height - f);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f34230c);
        if (this.f34237j > 0.0f) {
            RectF rectF2 = new RectF();
            float f2 = this.f34235h;
            rectF2.left = width - f2;
            rectF2.top = height - f2;
            rectF2.right = (f2 * 2.0f) + (width - f2);
            rectF2.bottom = (2.0f * f2) + (height - f2);
            canvas.drawArc(rectF2, 90.0f, (this.f34237j / 100.0f) * 360.0f, false, this.f34229b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setProgress(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f34237j, f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.a5d0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f67704a.m53040g(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public void setRingColor(int i) {
        this.f34233f = i;
        this.f34229b.setColor(i);
    }
}
