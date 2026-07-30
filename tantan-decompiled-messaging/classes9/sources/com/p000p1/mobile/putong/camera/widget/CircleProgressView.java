package com.p000p1.mobile.putong.camera.widget;

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
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CircleProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f1252a;

    /* JADX INFO: renamed from: b */
    public Paint f1253b;

    /* JADX INFO: renamed from: c */
    public Paint f1254c;

    /* JADX INFO: renamed from: d */
    public RectF f1255d;

    /* JADX INFO: renamed from: e */
    public float f1256e;

    /* JADX INFO: renamed from: f */
    public int f1257f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f1258g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.widget.CircleProgressView$a */
    public class C0136a implements ValueAnimator.AnimatorUpdateListener {
        public C0136a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CircleProgressView.this.f1257f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            CircleProgressView.this.invalidate();
        }
    }

    public CircleProgressView(Context context) {
        super(context);
        this.f1255d = new RectF();
        this.f1256e = t100.d(6.0f);
        this.f1257f = 0;
        m1769c();
    }

    /* JADX INFO: renamed from: b */
    public void m1768b() {
        ValueAnimator valueAnimator = this.f1258g;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f1258g.cancel();
    }

    /* JADX INFO: renamed from: c */
    public final void m1769c() {
        Paint paint = new Paint();
        this.f1252a = paint;
        paint.setAntiAlias(true);
        this.f1252a.setDither(true);
        Paint paint2 = this.f1252a;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f1252a.setStrokeCap(Paint.Cap.ROUND);
        this.f1252a.setStrokeWidth(this.f1256e);
        this.f1252a.setColor(Color.parseColor("#80ffffff"));
        Paint paint3 = new Paint();
        this.f1253b = paint3;
        paint3.setAntiAlias(true);
        this.f1253b.setDither(true);
        this.f1253b.setStyle(style);
        this.f1253b.setStrokeCap(Paint.Cap.BUTT);
        this.f1253b.setStrokeWidth(this.f1256e);
        this.f1253b.setColor(Color.parseColor("#ff3a00"));
        Paint paint4 = new Paint();
        this.f1254c = paint4;
        paint4.setAntiAlias(true);
        this.f1254c.setDither(true);
        this.f1254c.setColor(-1);
        this.f1254c.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: d */
    public void m1770d(int i, long j) {
        m1768b();
        if (j <= 0) {
            setProgress(i);
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f1257f, i);
        this.f1258g = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new C0136a());
        this.f1258g.setInterpolator(new LinearInterpolator());
        this.f1258g.setDuration(j);
        this.f1258g.start();
    }

    public int getProgress() {
        return this.f1257f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f1255d;
        canvas.drawCircle((rectF.left + rectF.right) * 0.5f, (rectF.top + rectF.bottom) * 0.5f, (rectF.width() / 2.0f) - (this.f1256e / 2.0f), this.f1254c);
        canvas.drawArc(this.f1255d, 0.0f, 360.0f, false, this.f1252a);
        canvas.drawArc(this.f1255d, 270.0f, (this.f1257f * 360) / 100.0f, false, this.f1253b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingEnd();
        int measuredHeight = (getMeasuredHeight() - getPaddingBottom()) - getPaddingTop();
        this.f1255d.set(getPaddingLeft() + this.f1256e, getPaddingTop() + this.f1256e, (getPaddingLeft() + measuredWidth) - this.f1256e, (getPaddingTop() + measuredHeight) - this.f1256e);
    }

    public void setProgress(int i) {
        m1768b();
        this.f1257f = i;
        invalidate();
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1255d = new RectF();
        this.f1256e = t100.d(6.0f);
        this.f1257f = 0;
        m1769c();
    }

    public CircleProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1255d = new RectF();
        this.f1256e = t100.d(6.0f);
        this.f1257f = 0;
        m1769c();
    }
}
