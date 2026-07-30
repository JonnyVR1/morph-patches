package com.p046p1.mobile.putong.camera.widget;

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
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class CircleProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f17263a;

    /* JADX INFO: renamed from: b */
    public Paint f17264b;

    /* JADX INFO: renamed from: c */
    public Paint f17265c;

    /* JADX INFO: renamed from: d */
    public RectF f17266d;

    /* JADX INFO: renamed from: e */
    public float f17267e;

    /* JADX INFO: renamed from: f */
    public int f17268f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f17269g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.widget.CircleProgressView$a */
    public class C4710a implements ValueAnimator.AnimatorUpdateListener {
        public C4710a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CircleProgressView.this.f17268f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            CircleProgressView.this.invalidate();
        }
    }

    public CircleProgressView(Context context) {
        super(context);
        this.f17266d = new RectF();
        this.f17267e = t100.m186890d(6.0f);
        this.f17268f = 0;
        m29857c();
    }

    /* JADX INFO: renamed from: b */
    public void m29856b() {
        ValueAnimator valueAnimator = this.f17269g;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f17269g.cancel();
    }

    /* JADX INFO: renamed from: c */
    public final void m29857c() {
        Paint paint = new Paint();
        this.f17263a = paint;
        paint.setAntiAlias(true);
        this.f17263a.setDither(true);
        Paint paint2 = this.f17263a;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f17263a.setStrokeCap(Paint.Cap.ROUND);
        this.f17263a.setStrokeWidth(this.f17267e);
        this.f17263a.setColor(Color.parseColor("#80ffffff"));
        Paint paint3 = new Paint();
        this.f17264b = paint3;
        paint3.setAntiAlias(true);
        this.f17264b.setDither(true);
        this.f17264b.setStyle(style);
        this.f17264b.setStrokeCap(Paint.Cap.BUTT);
        this.f17264b.setStrokeWidth(this.f17267e);
        this.f17264b.setColor(Color.parseColor("#ff3a00"));
        Paint paint4 = new Paint();
        this.f17265c = paint4;
        paint4.setAntiAlias(true);
        this.f17265c.setDither(true);
        this.f17265c.setColor(-1);
        this.f17265c.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: d */
    public void m29858d(int i, long j) {
        m29856b();
        if (j <= 0) {
            setProgress(i);
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f17268f, i);
        this.f17269g = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new C4710a());
        this.f17269g.setInterpolator(new LinearInterpolator());
        this.f17269g.setDuration(j);
        this.f17269g.start();
    }

    public int getProgress() {
        return this.f17268f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f17266d;
        canvas.drawCircle((rectF.left + rectF.right) * 0.5f, (rectF.top + rectF.bottom) * 0.5f, (rectF.width() / 2.0f) - (this.f17267e / 2.0f), this.f17265c);
        canvas.drawArc(this.f17266d, 0.0f, 360.0f, false, this.f17263a);
        canvas.drawArc(this.f17266d, 270.0f, (this.f17268f * 360) / 100.0f, false, this.f17264b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingEnd();
        int measuredHeight = (getMeasuredHeight() - getPaddingBottom()) - getPaddingTop();
        this.f17266d.set(getPaddingLeft() + this.f17267e, getPaddingTop() + this.f17267e, (getPaddingLeft() + measuredWidth) - this.f17267e, (getPaddingTop() + measuredHeight) - this.f17267e);
    }

    public void setProgress(int i) {
        m29856b();
        this.f17268f = i;
        invalidate();
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17266d = new RectF();
        this.f17267e = t100.m186890d(6.0f);
        this.f17268f = 0;
        m29857c();
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17266d = new RectF();
        this.f17267e = t100.m186890d(6.0f);
        this.f17268f = 0;
        m29857c();
    }
}
