package com.p051p1.mobile.putong.core.p058ui.profile.views;

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
import p153l.j9c0;
import p153l.rhc0;

/* JADX INFO: loaded from: classes4.dex */
public class RingProgressBarView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f35076a;

    /* JADX INFO: renamed from: b */
    public Paint f35077b;

    /* JADX INFO: renamed from: c */
    public Paint f35078c;

    /* JADX INFO: renamed from: d */
    public int f35079d;

    /* JADX INFO: renamed from: e */
    public int f35080e;

    /* JADX INFO: renamed from: f */
    public int f35081f;

    /* JADX INFO: renamed from: g */
    public float f35082g;

    /* JADX INFO: renamed from: h */
    public float f35083h;

    /* JADX INFO: renamed from: i */
    public float f35084i;

    /* JADX INFO: renamed from: j */
    public float f35085j;

    /* JADX INFO: renamed from: k */
    public final RectF f35086k;

    public RingProgressBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35085j = 0.0f;
        this.f35086k = new RectF();
        m54221e(context, attributeSet);
        m54222f();
    }

    /* JADX INFO: renamed from: b */
    public int m54218b(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: c */
    public final Paint m54219c(Paint.Style style, int i) {
        Paint paint = new Paint(1);
        paint.setStyle(style);
        paint.setColor(i);
        paint.setAntiAlias(true);
        return paint;
    }

    /* JADX INFO: renamed from: d */
    public final Paint m54220d(Paint.Style style, int i, float f) {
        Paint paintM54219c = m54219c(style, i);
        paintM54219c.setStrokeWidth(f);
        return paintM54219c;
    }

    /* JADX INFO: renamed from: e */
    public final void m54221e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rhc0.f163153y, 0, 0);
        this.f35082g = typedArrayObtainStyledAttributes.getDimension(rhc0.f163094A, m54218b(30));
        this.f35084i = typedArrayObtainStyledAttributes.getDimension(rhc0.f163097D, m54218b(6));
        this.f35079d = typedArrayObtainStyledAttributes.getColor(rhc0.f163154z, Color.parseColor("#08000000"));
        this.f35080e = typedArrayObtainStyledAttributes.getColor(rhc0.f163096C, getResources().getColor(j9c0.f118869f));
        this.f35081f = typedArrayObtainStyledAttributes.getColor(rhc0.f163095B, Color.parseColor("#1AFE7E1D"));
        this.f35083h = this.f35082g + (this.f35084i / 2.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m54222f() {
        this.f35076a = m54219c(Paint.Style.FILL, this.f35079d);
        Paint.Style style = Paint.Style.STROKE;
        this.f35078c = m54220d(style, this.f35081f, this.f35084i);
        Paint paintM54220d = m54220d(style, this.f35080e, this.f35084i);
        this.f35077b = paintM54220d;
        paintM54220d.setStrokeCap(Paint.Cap.ROUND);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m54223g(ValueAnimator valueAnimator) {
        this.f35085j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.drawCircle(width, height, this.f35082g, this.f35076a);
        RectF rectF = this.f35086k;
        float f = this.f35083h;
        rectF.left = width - f;
        rectF.top = height - f;
        rectF.right = (f * 2.0f) + (width - f);
        rectF.bottom = (f * 2.0f) + (height - f);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f35078c);
        if (this.f35085j > 0.0f) {
            RectF rectF2 = new RectF();
            float f2 = this.f35083h;
            rectF2.left = width - f2;
            rectF2.top = height - f2;
            rectF2.right = (f2 * 2.0f) + (width - f2);
            rectF2.bottom = (2.0f * f2) + (height - f2);
            canvas.drawArc(rectF2, 90.0f, (this.f35085j / 100.0f) * 360.0f, false, this.f35077b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setProgress(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f35085j, f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ddd0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f87922a.m54223g(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public void setRingColor(int i) {
        this.f35081f = i;
        this.f35077b.setColor(i);
    }
}
