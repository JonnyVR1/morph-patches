package com.p051p1.mobile.putong.camera.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class CircleProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f17982a;

    /* JADX INFO: renamed from: b */
    public Paint f17983b;

    /* JADX INFO: renamed from: c */
    public Paint f17984c;

    /* JADX INFO: renamed from: d */
    public RectF f17985d;

    /* JADX INFO: renamed from: e */
    public float f17986e;

    /* JADX INFO: renamed from: f */
    public int f17987f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f17988g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.widget.CircleProgressView$a */
    public class C4861a implements ValueAnimator.AnimatorUpdateListener {
        public C4861a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CircleProgressView.this.f17987f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            CircleProgressView.this.invalidate();
        }
    }

    public CircleProgressView(Context context) {
        super(context);
        this.f17985d = new RectF();
        this.f17986e = qa00.m175859d(6.0f);
        this.f17987f = 0;
        m30855c();
    }

    /* JADX INFO: renamed from: b */
    public void m30854b() {
        ValueAnimator valueAnimator = this.f17988g;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f17988g.cancel();
    }

    /* JADX INFO: renamed from: c */
    public final void m30855c() {
        Paint paint = new Paint();
        this.f17982a = paint;
        paint.setAntiAlias(true);
        this.f17982a.setDither(true);
        Paint paint2 = this.f17982a;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f17982a.setStrokeCap(Paint.Cap.ROUND);
        this.f17982a.setStrokeWidth(this.f17986e);
        this.f17982a.setColor(Color.parseColor("#80ffffff"));
        Paint paint3 = new Paint();
        this.f17983b = paint3;
        paint3.setAntiAlias(true);
        this.f17983b.setDither(true);
        this.f17983b.setStyle(style);
        this.f17983b.setStrokeCap(Paint.Cap.BUTT);
        this.f17983b.setStrokeWidth(this.f17986e);
        this.f17983b.setColor(Color.parseColor("#ff3a00"));
        Paint paint4 = new Paint();
        this.f17984c = paint4;
        paint4.setAntiAlias(true);
        this.f17984c.setDither(true);
        this.f17984c.setColor(-1);
        this.f17984c.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: d */
    public void m30856d(int i, long j) {
        m30854b();
        if (j <= 0) {
            setProgress(i);
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f17987f, i);
        this.f17988g = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new C4861a());
        this.f17988g.setInterpolator(new LinearInterpolator());
        this.f17988g.setDuration(j);
        this.f17988g.start();
    }

    public int getProgress() {
        return this.f17987f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f17985d;
        canvas.drawCircle((rectF.left + rectF.right) * 0.5f, (rectF.top + rectF.bottom) * 0.5f, (rectF.width() / 2.0f) - (this.f17986e / 2.0f), this.f17984c);
        canvas.drawArc(this.f17985d, 0.0f, 360.0f, false, this.f17982a);
        canvas.drawArc(this.f17985d, 270.0f, (this.f17987f * 360) / 100.0f, false, this.f17983b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingEnd();
        int measuredHeight = (getMeasuredHeight() - getPaddingBottom()) - getPaddingTop();
        this.f17985d.set(getPaddingLeft() + this.f17986e, getPaddingTop() + this.f17986e, (getPaddingLeft() + measuredWidth) - this.f17986e, (getPaddingTop() + measuredHeight) - this.f17986e);
    }

    public void setProgress(int i) {
        m30854b();
        this.f17987f = i;
        invalidate();
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17985d = new RectF();
        this.f17986e = qa00.m175859d(6.0f);
        this.f17987f = 0;
        m30855c();
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17985d = new RectF();
        this.f17986e = qa00.m175859d(6.0f);
        this.f17987f = 0;
        m30855c();
    }
}
