package com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.countdown;

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
import p149l.h1c0;
import p149l.p9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class FastGiftCountDownView extends View {

    /* JADX INFO: renamed from: a */
    public int f49791a;

    /* JADX INFO: renamed from: b */
    public int f49792b;

    /* JADX INFO: renamed from: c */
    public float f49793c;

    /* JADX INFO: renamed from: d */
    public final Paint f49794d;

    /* JADX INFO: renamed from: e */
    public RectF f49795e;

    /* JADX INFO: renamed from: f */
    public RectF f49796f;

    /* JADX INFO: renamed from: g */
    public long f49797g;

    /* JADX INFO: renamed from: h */
    public float f49798h;

    /* JADX INFO: renamed from: i */
    public InterfaceC12806b f49799i;

    /* JADX INFO: renamed from: j */
    public SweepGradient f49800j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f49801k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f49802l;

    /* JADX INFO: renamed from: m */
    public boolean f49803m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView$a */
    public class C12805a extends AnimatorListenerAdapter {
        public C12805a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FastGiftCountDownView.this.setVisibility(4);
            FastGiftCountDownView.this.f49803m = false;
            if (FastGiftCountDownView.this.f49799i != null) {
                FastGiftCountDownView.this.f49799i.mo73775a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FastGiftCountDownView.this.f49803m = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.countdown.FastGiftCountDownView$b */
    public interface InterfaceC12806b {
        /* JADX INFO: renamed from: a */
        void mo73775a();
    }

    public FastGiftCountDownView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49803m = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147710T);
        this.f49791a = typedArrayObtainStyledAttributes.getColor(p9c0.f147713W, context.getResources().getColor(h1c0.f105351b));
        this.f49792b = typedArrayObtainStyledAttributes.getColor(p9c0.f147712V, context.getResources().getColor(h1c0.f105351b));
        this.f49793c = t100.m186890d(typedArrayObtainStyledAttributes.getFloat(p9c0.f147714X, 4.0f));
        this.f49797g = typedArrayObtainStyledAttributes.getInteger(p9c0.f147711U, 60);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f49794d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        setWillNotDraw(false);
        this.f49801k = m73770e(this.f49797g);
        m73771f();
    }

    /* JADX INFO: renamed from: d */
    public final void m73769d(Canvas canvas) {
        int iCenterX = (int) this.f49795e.centerX();
        if (this.f49800j == null) {
            float f = iCenterX;
            this.f49800j = new SweepGradient(f, f, new int[]{this.f49791a, this.f49792b}, (float[]) null);
        }
        Matrix matrix = new Matrix();
        float f2 = iCenterX / 2;
        matrix.setRotate(-90.0f, f2, f2);
        this.f49800j.setLocalMatrix(matrix);
        this.f49794d.setShader(this.f49800j);
        this.f49794d.setStyle(Paint.Style.STROKE);
        this.f49794d.setStrokeWidth(this.f49793c);
        this.f49794d.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawArc(this.f49795e, -90.0f, 360.0f - (this.f49798h * 360.0f), false, this.f49794d);
    }

    /* JADX INFO: renamed from: e */
    public final ValueAnimator m73770e(long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(0);
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: f */
    public final void m73771f() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<FastGiftCountDownView, Float>) View.SCALE_X, 1.0f, 0.9f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setRepeatCount(30);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<FastGiftCountDownView, Float>) View.SCALE_Y, 1.0f, 0.9f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setRepeatCount(30);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f49802l = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m73772g(ValueAnimator valueAnimator) {
        this.f49798h = ((Float) valueAnimator.getAnimatedValue()).floatValue() / 100.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public void m73773h(int i, int i2) {
        this.f49791a = i;
        this.f49792b = i2;
    }

    /* JADX INFO: renamed from: i */
    public void m73774i() {
        setVisibility(0);
        this.f49801k.removeAllListeners();
        this.f49801k.removeAllUpdateListeners();
        this.f49801k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fig
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f97659a.m73772g(valueAnimator);
            }
        });
        this.f49801k.addListener(new C12805a());
        this.f49801k.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m73769d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f49795e == null) {
            float f = this.f49793c;
            this.f49795e = new RectF((f / 2.0f) + 0.0f, (f / 2.0f) + 0.0f, measuredWidth - (f / 2.0f), measuredHeight - (f / 2.0f));
        }
        if (this.f49796f == null) {
            float f2 = this.f49793c;
            this.f49796f = new RectF((f2 + 0.0f) - 1.0f, (0.0f + f2) - 1.0f, (measuredWidth - f2) + 1.0f, (measuredHeight - f2) + 1.0f);
        }
    }

    public void setBorderWidth(int i) {
        this.f49793c = t100.m186890d(i);
    }

    public void setCountdownTime(long j) {
        this.f49797g = j;
        this.f49801k = m73770e(j);
    }

    public void setOnCountDownListener(InterfaceC12806b interfaceC12806b) {
        this.f49799i = interfaceC12806b;
    }

    public FastGiftCountDownView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastGiftCountDownView(Context context) {
        this(context, null);
    }
}
