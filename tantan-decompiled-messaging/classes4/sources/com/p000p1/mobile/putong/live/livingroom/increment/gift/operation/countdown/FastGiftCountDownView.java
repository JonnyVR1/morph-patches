package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.countdown;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import l.t100;
import p002l.h1c0;
import p002l.p9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FastGiftCountDownView extends View {

    /* JADX INFO: renamed from: a */
    public int f5833a;

    /* JADX INFO: renamed from: b */
    public int f5834b;

    /* JADX INFO: renamed from: c */
    public float f5835c;

    /* JADX INFO: renamed from: d */
    public final Paint f5836d;

    /* JADX INFO: renamed from: e */
    public RectF f5837e;

    /* JADX INFO: renamed from: f */
    public RectF f5838f;

    /* JADX INFO: renamed from: g */
    public long f5839g;

    /* JADX INFO: renamed from: h */
    public float f5840h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0395b f5841i;

    /* JADX INFO: renamed from: j */
    public SweepGradient f5842j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f5843k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f5844l;

    /* JADX INFO: renamed from: m */
    public boolean f5845m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView$a */
    public class C0394a extends AnimatorListenerAdapter {
        public C0394a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FastGiftCountDownView.this.setVisibility(4);
            FastGiftCountDownView.this.f5845m = false;
            if (FastGiftCountDownView.this.f5841i != null) {
                FastGiftCountDownView.this.f5841i.m7329a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FastGiftCountDownView.this.f5845m = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView$b */
    public interface InterfaceC0395b {
        /* JADX INFO: renamed from: a */
        void m7329a();
    }

    public FastGiftCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5845m = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f17107T);
        this.f5833a = typedArrayObtainStyledAttributes.getColor(p9c0.f17110W, context.getResources().getColor(h1c0.f11771b));
        this.f5834b = typedArrayObtainStyledAttributes.getColor(p9c0.f17109V, context.getResources().getColor(h1c0.f11771b));
        this.f5835c = t100.d(typedArrayObtainStyledAttributes.getFloat(p9c0.f17111X, 4.0f));
        this.f5839g = typedArrayObtainStyledAttributes.getInteger(p9c0.f17108U, 60);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f5836d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        setWillNotDraw(false);
        this.f5843k = m7324e(this.f5839g);
        m7325f();
    }

    /* JADX INFO: renamed from: d */
    public final void m7323d(Canvas canvas) {
        int iCenterX = (int) this.f5837e.centerX();
        if (this.f5842j == null) {
            float f = iCenterX;
            this.f5842j = new SweepGradient(f, f, new int[]{this.f5833a, this.f5834b}, (float[]) null);
        }
        Matrix matrix = new Matrix();
        float f2 = iCenterX / 2;
        matrix.setRotate(-90.0f, f2, f2);
        this.f5842j.setLocalMatrix(matrix);
        this.f5836d.setShader(this.f5842j);
        this.f5836d.setStyle(Paint.Style.STROKE);
        this.f5836d.setStrokeWidth(this.f5835c);
        this.f5836d.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawArc(this.f5837e, -90.0f, 360.0f - (this.f5840h * 360.0f), false, this.f5836d);
    }

    /* JADX INFO: renamed from: e */
    public final ValueAnimator m7324e(long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(0);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: f */
    public final void m7325f() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<FastGiftCountDownView, Float>) View.SCALE_X, 1.0f, 0.9f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setRepeatCount(30);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<FastGiftCountDownView, Float>) View.SCALE_Y, 1.0f, 0.9f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setRepeatCount(30);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5844l = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m7326g(ValueAnimator valueAnimator) {
        this.f5840h = ((Float) valueAnimator.getAnimatedValue()).floatValue() / 100.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public void m7327h(int i, int i2) {
        this.f5833a = i;
        this.f5834b = i2;
    }

    /* JADX INFO: renamed from: i */
    public void m7328i() {
        setVisibility(0);
        this.f5843k.removeAllListeners();
        this.f5843k.removeAllUpdateListeners();
        this.f5843k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fig
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f10402a.m7326g(valueAnimator);
            }
        });
        this.f5843k.addListener(new C0394a());
        this.f5843k.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m7323d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f5837e == null) {
            float f = this.f5835c;
            this.f5837e = new RectF((f / 2.0f) + 0.0f, (f / 2.0f) + 0.0f, measuredWidth - (f / 2.0f), measuredHeight - (f / 2.0f));
        }
        if (this.f5838f == null) {
            float f2 = this.f5835c;
            this.f5838f = new RectF((f2 + 0.0f) - 1.0f, (0.0f + f2) - 1.0f, (measuredWidth - f2) + 1.0f, (measuredHeight - f2) + 1.0f);
        }
    }

    public void setBorderWidth(int i) {
        this.f5835c = t100.d(i);
    }

    public void setCountdownTime(long j) {
        this.f5839g = j;
        this.f5843k = m7324e(j);
    }

    public void setOnCountDownListener(InterfaceC0395b interfaceC0395b) {
        this.f5841i = interfaceC0395b;
    }

    public FastGiftCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastGiftCountDownView(Context context) {
        this(context, null);
    }
}
