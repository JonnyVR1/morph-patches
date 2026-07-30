package com.p051p1.mobile.putong.live.livingroom.increment.operation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.gt0;
import p153l.it0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class OperationCountDownCircleView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final float f51663a;

    /* JADX INFO: renamed from: b */
    public final Paint f51664b;

    /* JADX INFO: renamed from: c */
    public float f51665c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f51666d;

    /* JADX INFO: renamed from: e */
    public RectF f51667e;

    /* JADX INFO: renamed from: f */
    public float f51668f;

    /* JADX INFO: renamed from: g */
    public float f51669g;

    /* JADX INFO: renamed from: h */
    public int f51670h;

    /* JADX INFO: renamed from: i */
    public Runnable f51671i;

    /* JADX INFO: renamed from: j */
    public Animator f51672j;

    /* JADX INFO: renamed from: k */
    public final int f51673k;

    public OperationCountDownCircleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51663a = qa00.m175859d(1.0f);
        this.f51664b = new Paint();
        this.f51665c = 0.0f;
        this.f51673k = Color.parseColor("#80000000");
        m76202b();
    }

    /* JADX INFO: renamed from: b */
    public final void m76202b() {
        this.f51664b.setColor(this.f51673k);
        this.f51664b.setAntiAlias(true);
        this.f51664b.setStrokeWidth(qa00.m175859d(1.0f));
        this.f51664b.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m76203c(ValueAnimator valueAnimator) {
        if (this.f51669g > this.f51668f) {
            this.f51665c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else {
            this.f51665c = -((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public void m76204d() {
        it0.m142007A(this.f51672j);
        it0.m142007A(this.f51666d);
    }

    /* JADX INFO: renamed from: e */
    public void m76205e(float f, float f2) {
        this.f51668f = f;
        this.f51669g = f2;
    }

    /* JADX INFO: renamed from: f */
    public void m76206f() {
        this.f51665c = this.f51668f;
        m76204d();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f51668f, this.f51669g);
        this.f51666d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f51670h);
        this.f51666d.setInterpolator(new LinearInterpolator());
        this.f51666d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lz50
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f134157a.m76203c(valueAnimator);
            }
        });
        this.f51672j = gt0.m132160f(this.f51666d, this.f51671i);
        this.f51666d.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f51667e == null) {
            float f = this.f51663a;
            this.f51667e = new RectF(f, f, getWidth() - this.f51663a, getHeight() - this.f51663a);
        }
        canvas.drawArc(this.f51667e, -90.0f, this.f51665c, true, this.f51664b);
    }

    public void setColor(@ColorInt int i) {
        this.f51664b.setColor(i);
    }

    public void setDuration(int i) {
        this.f51670h = i;
    }

    public void setOnEnd(Runnable runnable) {
        this.f51671i = runnable;
    }
}
