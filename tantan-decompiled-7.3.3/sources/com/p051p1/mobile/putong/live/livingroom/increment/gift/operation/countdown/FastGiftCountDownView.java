package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.countdown;

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
import p153l.n9c0;
import p153l.qa00;
import p153l.vhc0;

/* JADX INFO: loaded from: classes4.dex */
public class FastGiftCountDownView extends View {

    /* JADX INFO: renamed from: a */
    public int f50639a;

    /* JADX INFO: renamed from: b */
    public int f50640b;

    /* JADX INFO: renamed from: c */
    public float f50641c;

    /* JADX INFO: renamed from: d */
    public final Paint f50642d;

    /* JADX INFO: renamed from: e */
    public RectF f50643e;

    /* JADX INFO: renamed from: f */
    public RectF f50644f;

    /* JADX INFO: renamed from: g */
    public long f50645g;

    /* JADX INFO: renamed from: h */
    public float f50646h;

    /* JADX INFO: renamed from: i */
    public InterfaceC12969b f50647i;

    /* JADX INFO: renamed from: j */
    public SweepGradient f50648j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f50649k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f50650l;

    /* JADX INFO: renamed from: m */
    public boolean f50651m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView$a */
    public class C12968a extends AnimatorListenerAdapter {
        public C12968a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FastGiftCountDownView.this.setVisibility(4);
            FastGiftCountDownView.this.f50651m = false;
            if (FastGiftCountDownView.this.f50647i != null) {
                FastGiftCountDownView.this.f50647i.mo74958a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FastGiftCountDownView.this.f50651m = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView$b */
    public interface InterfaceC12969b {
        /* JADX INFO: renamed from: a */
        void mo74958a();
    }

    public FastGiftCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50651m = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184109T);
        this.f50639a = typedArrayObtainStyledAttributes.getColor(vhc0.f184112W, context.getResources().getColor(n9c0.f140812b));
        this.f50640b = typedArrayObtainStyledAttributes.getColor(vhc0.f184111V, context.getResources().getColor(n9c0.f140812b));
        this.f50641c = qa00.m175859d(typedArrayObtainStyledAttributes.getFloat(vhc0.f184113X, 4.0f));
        this.f50645g = typedArrayObtainStyledAttributes.getInteger(vhc0.f184110U, 60);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f50642d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        setWillNotDraw(false);
        this.f50649k = m74953e(this.f50645g);
        m74954f();
    }

    /* JADX INFO: renamed from: d */
    public final void m74952d(Canvas canvas) {
        int iCenterX = (int) this.f50643e.centerX();
        if (this.f50648j == null) {
            float f = iCenterX;
            this.f50648j = new SweepGradient(f, f, new int[]{this.f50639a, this.f50640b}, (float[]) null);
        }
        Matrix matrix = new Matrix();
        float f2 = iCenterX / 2;
        matrix.setRotate(-90.0f, f2, f2);
        this.f50648j.setLocalMatrix(matrix);
        this.f50642d.setShader(this.f50648j);
        this.f50642d.setStyle(Paint.Style.STROKE);
        this.f50642d.setStrokeWidth(this.f50641c);
        this.f50642d.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawArc(this.f50643e, -90.0f, 360.0f - (this.f50646h * 360.0f), false, this.f50642d);
    }

    /* JADX INFO: renamed from: e */
    public final ValueAnimator m74953e(long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(0);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: f */
    public final void m74954f() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<FastGiftCountDownView, Float>) View.SCALE_X, 1.0f, 0.9f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setRepeatCount(30);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<FastGiftCountDownView, Float>) View.SCALE_Y, 1.0f, 0.9f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setRepeatCount(30);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50650l = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m74955g(ValueAnimator valueAnimator) {
        this.f50646h = ((Float) valueAnimator.getAnimatedValue()).floatValue() / 100.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public void m74956h(int i, int i2) {
        this.f50639a = i;
        this.f50640b = i2;
    }

    /* JADX INFO: renamed from: i */
    public void m74957i() {
        setVisibility(0);
        this.f50649k.removeAllListeners();
        this.f50649k.removeAllUpdateListeners();
        this.f50649k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tjg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f174586a.m74955g(valueAnimator);
            }
        });
        this.f50649k.addListener(new C12968a());
        this.f50649k.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m74952d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f50643e == null) {
            float f = this.f50641c;
            this.f50643e = new RectF((f / 2.0f) + 0.0f, (f / 2.0f) + 0.0f, measuredWidth - (f / 2.0f), measuredHeight - (f / 2.0f));
        }
        if (this.f50644f == null) {
            float f2 = this.f50641c;
            this.f50644f = new RectF((f2 + 0.0f) - 1.0f, (0.0f + f2) - 1.0f, (measuredWidth - f2) + 1.0f, (measuredHeight - f2) + 1.0f);
        }
    }

    public void setBorderWidth(int i) {
        this.f50641c = qa00.m175859d(i);
    }

    public void setCountdownTime(long j) {
        this.f50645g = j;
        this.f50649k = m74953e(j);
    }

    public void setOnCountDownListener(InterfaceC12969b interfaceC12969b) {
        this.f50647i = interfaceC12969b;
    }

    public FastGiftCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastGiftCountDownView(Context context) {
        this(context, null);
    }
}
