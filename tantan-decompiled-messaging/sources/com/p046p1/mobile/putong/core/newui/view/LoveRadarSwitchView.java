package com.p046p1.mobile.putong.core.newui.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class LoveRadarSwitchView extends View {

    /* JADX INFO: renamed from: m */
    public static String f26940m = "close";

    /* JADX INFO: renamed from: a */
    public Paint f26941a;

    /* JADX INFO: renamed from: b */
    public Paint f26942b;

    /* JADX INFO: renamed from: c */
    public Paint f26943c;

    /* JADX INFO: renamed from: d */
    public Paint f26944d;

    /* JADX INFO: renamed from: e */
    public int f26945e;

    /* JADX INFO: renamed from: f */
    public int f26946f;

    /* JADX INFO: renamed from: g */
    public int f26947g;

    /* JADX INFO: renamed from: h */
    public int f26948h;

    /* JADX INFO: renamed from: i */
    public RectF f26949i;

    /* JADX INFO: renamed from: j */
    public float f26950j;

    /* JADX INFO: renamed from: k */
    public boolean f26951k;

    /* JADX INFO: renamed from: l */
    public boolean f26952l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LoveRadarSwitchView$a */
    public class C8248a implements ValueAnimator.AnimatorUpdateListener {
        public C8248a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            LoveRadarSwitchView.this.f26950j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LoveRadarSwitchView$b */
    public class C8249b implements ValueAnimator.AnimatorUpdateListener {
        public C8249b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            LoveRadarSwitchView.this.f26943c.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            LoveRadarSwitchView.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LoveRadarSwitchView$c */
    public class C8250c implements Animator.AnimatorListener {
        public C8250c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            LoveRadarSwitchView.this.f26951k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            LoveRadarSwitchView.this.f26951k = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LoveRadarSwitchView$d */
    public class C8251d implements ValueAnimator.AnimatorUpdateListener {
        public C8251d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            LoveRadarSwitchView.this.f26950j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LoveRadarSwitchView$e */
    public class C8252e implements ValueAnimator.AnimatorUpdateListener {
        public C8252e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            LoveRadarSwitchView.this.f26943c.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            LoveRadarSwitchView.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LoveRadarSwitchView$f */
    public class C8253f implements Animator.AnimatorListener {
        public C8253f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            LoveRadarSwitchView.this.f26952l = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            LoveRadarSwitchView.this.f26952l = true;
        }
    }

    public LoveRadarSwitchView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26945e = Color.parseColor("#FE7E1D");
        this.f26946f = Color.parseColor("#D7DAE5");
        this.f26947g = t100.m186890d(46.0f);
        this.f26948h = t100.m186890d(30.0f);
        this.f26951k = false;
        this.f26952l = false;
        Paint paint = new Paint();
        this.f26943c = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f26943c;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f26941a = paint3;
        paint3.setAntiAlias(true);
        this.f26941a.setColor(this.f26945e);
        this.f26941a.setStyle(style);
        Paint paint4 = new Paint();
        this.f26942b = paint4;
        paint4.setAntiAlias(true);
        this.f26942b.setColor(this.f26946f);
        this.f26942b.setStyle(style);
        Paint paint5 = new Paint();
        this.f26944d = paint5;
        paint5.setAntiAlias(true);
        this.f26944d.setColor(Color.parseColor("#FFFFFF"));
        this.f26944d.setStyle(style);
        RectF rectF = new RectF();
        this.f26949i = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = this.f26947g;
        rectF.bottom = this.f26948h;
    }

    public static String getCurState() {
        return f26940m;
    }

    /* JADX INFO: renamed from: c */
    public void m43730c() {
        if (this.f26952l) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(100.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C8251d());
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.f26945e, this.f26946f);
        valueAnimatorOfArgb.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfArgb.addUpdateListener(new C8252e());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfArgb);
        animatorSet.setDuration(800L);
        animatorSet.start();
        animatorSet.addListener(new C8253f());
    }

    /* JADX INFO: renamed from: d */
    public void m43731d() {
        if (this.f26951k) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(100.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C8248a());
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.f26945e, this.f26946f);
        valueAnimatorOfArgb.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfArgb.addUpdateListener(new C8249b());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfArgb);
        animatorSet.setDuration(800L);
        animatorSet.start();
        animatorSet.addListener(new C8250c());
    }

    /* JADX INFO: renamed from: e */
    public void m43732e(String str) {
        if (TextUtils.equals(f26940m, str) || this.f26951k || this.f26952l) {
            return;
        }
        if (TextUtils.equals(str, "open")) {
            f26940m = str;
            m43730c();
        } else if (TextUtils.equals(str, "close")) {
            f26940m = str;
            m43731d();
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(f26940m, "open")) {
            canvas.drawRoundRect(this.f26949i, t100.m186890d(15.0f), t100.m186890d(15.0f), this.f26941a);
            canvas.drawCircle(t100.m186890d(31.0f), t100.m186890d(15.0f), t100.m186890d(11.0f), this.f26944d);
            return;
        }
        boolean zEquals = TextUtils.equals(f26940m, "close");
        RectF rectF = this.f26949i;
        if (zEquals) {
            canvas.drawRoundRect(rectF, t100.m186890d(15.0f), t100.m186890d(15.0f), this.f26942b);
            canvas.drawCircle(t100.m186890d(15.0f), t100.m186890d(15.0f), t100.m186890d(11.0f), this.f26944d);
        } else {
            canvas.drawRoundRect(rectF, t100.m186890d(15.0f), t100.m186890d(15.0f), this.f26943c);
            canvas.drawCircle((t100.m186890d(16.0f) * this.f26950j) + t100.m186890d(15.0f), t100.m186890d(15.0f), t100.m186890d(15.0f), this.f26944d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f26947g, this.f26948h);
    }

    public LoveRadarSwitchView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoveRadarSwitchView(Context context) {
        this(context, null);
    }
}
