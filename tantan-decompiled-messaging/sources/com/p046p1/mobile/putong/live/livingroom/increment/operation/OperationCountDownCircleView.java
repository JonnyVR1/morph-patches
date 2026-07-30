package com.p046p1.mobile.putong.live.livingroom.increment.operation;

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
import p149l.bt0;
import p149l.dt0;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class OperationCountDownCircleView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final float f50815a;

    /* JADX INFO: renamed from: b */
    public final Paint f50816b;

    /* JADX INFO: renamed from: c */
    public float f50817c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f50818d;

    /* JADX INFO: renamed from: e */
    public RectF f50819e;

    /* JADX INFO: renamed from: f */
    public float f50820f;

    /* JADX INFO: renamed from: g */
    public float f50821g;

    /* JADX INFO: renamed from: h */
    public int f50822h;

    /* JADX INFO: renamed from: i */
    public Runnable f50823i;

    /* JADX INFO: renamed from: j */
    public Animator f50824j;

    /* JADX INFO: renamed from: k */
    public final int f50825k;

    public OperationCountDownCircleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50815a = t100.m186890d(1.0f);
        this.f50816b = new Paint();
        this.f50817c = 0.0f;
        this.f50825k = Color.parseColor("#80000000");
        m75019b();
    }

    /* JADX INFO: renamed from: b */
    public final void m75019b() {
        this.f50816b.setColor(this.f50825k);
        this.f50816b.setAntiAlias(true);
        this.f50816b.setStrokeWidth(t100.m186890d(1.0f));
        this.f50816b.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m75020c(ValueAnimator valueAnimator) {
        if (this.f50821g > this.f50820f) {
            this.f50817c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else {
            this.f50817c = -((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public void m75021d() {
        dt0.m113501A(this.f50824j);
        dt0.m113501A(this.f50818d);
    }

    /* JADX INFO: renamed from: e */
    public void m75022e(float f, float f2) {
        this.f50820f = f;
        this.f50821g = f2;
    }

    /* JADX INFO: renamed from: f */
    public void m75023f() {
        this.f50817c = this.f50820f;
        m75021d();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f50820f, this.f50821g);
        this.f50818d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f50822h);
        this.f50818d.setInterpolator(new LinearInterpolator());
        this.f50818d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fr50
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f98893a.m75020c(valueAnimator);
            }
        });
        this.f50824j = bt0.m103733f(this.f50818d, this.f50823i);
        this.f50818d.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f50819e == null) {
            float f = this.f50815a;
            this.f50819e = new RectF(f, f, getWidth() - this.f50815a, getHeight() - this.f50815a);
        }
        canvas.drawArc(this.f50819e, -90.0f, this.f50817c, true, this.f50816b);
    }

    public void setColor(@ColorInt int i) {
        this.f50816b.setColor(i);
    }

    public void setDuration(int i) {
        this.f50822h = i;
    }

    public void setOnEnd(Runnable runnable) {
        this.f50823i = runnable;
    }
}
