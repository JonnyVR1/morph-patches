package com.p000p1.mobile.putong.live.livingroom.increment.operation;

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
import l.bt0;
import l.dt0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OperationCountDownCircleView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final float f6857a;

    /* JADX INFO: renamed from: b */
    public final Paint f6858b;

    /* JADX INFO: renamed from: c */
    public float f6859c;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f6860d;

    /* JADX INFO: renamed from: e */
    public RectF f6861e;

    /* JADX INFO: renamed from: f */
    public float f6862f;

    /* JADX INFO: renamed from: g */
    public float f6863g;

    /* JADX INFO: renamed from: h */
    public int f6864h;

    /* JADX INFO: renamed from: i */
    public Runnable f6865i;

    /* JADX INFO: renamed from: j */
    public Animator f6866j;

    /* JADX INFO: renamed from: k */
    public final int f6867k;

    public OperationCountDownCircleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6857a = t100.d(1.0f);
        this.f6858b = new Paint();
        this.f6859c = 0.0f;
        this.f6867k = Color.parseColor("#80000000");
        m8629b();
    }

    /* JADX INFO: renamed from: b */
    public final void m8629b() {
        this.f6858b.setColor(this.f6867k);
        this.f6858b.setAntiAlias(true);
        this.f6858b.setStrokeWidth(t100.d(1.0f));
        this.f6858b.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m8630c(ValueAnimator valueAnimator) {
        if (this.f6863g > this.f6862f) {
            this.f6859c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else {
            this.f6859c = -((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public void m8631d() {
        dt0.A(this.f6866j);
        dt0.A(this.f6860d);
    }

    /* JADX INFO: renamed from: e */
    public void m8632e(float f, float f2) {
        this.f6862f = f;
        this.f6863g = f2;
    }

    /* JADX INFO: renamed from: f */
    public void m8633f() {
        this.f6859c = this.f6862f;
        m8631d();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f6862f, this.f6863g);
        this.f6860d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f6864h);
        this.f6860d.setInterpolator(new LinearInterpolator());
        this.f6860d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fr50
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f10603a.m8630c(valueAnimator);
            }
        });
        this.f6866j = bt0.f(this.f6860d, this.f6865i);
        this.f6860d.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6861e == null) {
            float f = this.f6857a;
            this.f6861e = new RectF(f, f, getWidth() - this.f6857a, getHeight() - this.f6857a);
        }
        canvas.drawArc(this.f6861e, -90.0f, this.f6859c, true, this.f6858b);
    }

    public void setColor(@ColorInt int i) {
        this.f6858b.setColor(i);
    }

    public void setDuration(int i) {
        this.f6864h = i;
    }

    public void setOnEnd(Runnable runnable) {
        this.f6865i = runnable;
    }
}
