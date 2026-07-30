package com.p051p1.mobile.putong.core.newui.view;

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
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class LoveRadarSwitchView extends View {

    /* JADX INFO: renamed from: m */
    public static String f27788m = "close";

    /* JADX INFO: renamed from: a */
    public Paint f27789a;

    /* JADX INFO: renamed from: b */
    public Paint f27790b;

    /* JADX INFO: renamed from: c */
    public Paint f27791c;

    /* JADX INFO: renamed from: d */
    public Paint f27792d;

    /* JADX INFO: renamed from: e */
    public int f27793e;

    /* JADX INFO: renamed from: f */
    public int f27794f;

    /* JADX INFO: renamed from: g */
    public int f27795g;

    /* JADX INFO: renamed from: h */
    public int f27796h;

    /* JADX INFO: renamed from: i */
    public RectF f27797i;

    /* JADX INFO: renamed from: j */
    public float f27798j;

    /* JADX INFO: renamed from: k */
    public boolean f27799k;

    /* JADX INFO: renamed from: l */
    public boolean f27800l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LoveRadarSwitchView$a */
    public class C8411a implements ValueAnimator.AnimatorUpdateListener {
        public C8411a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            LoveRadarSwitchView.this.f27798j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LoveRadarSwitchView$b */
    public class C8412b implements ValueAnimator.AnimatorUpdateListener {
        public C8412b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            LoveRadarSwitchView.this.f27791c.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            LoveRadarSwitchView.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LoveRadarSwitchView$c */
    public class C8413c implements Animator.AnimatorListener {
        public C8413c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            LoveRadarSwitchView.this.f27799k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            LoveRadarSwitchView.this.f27799k = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LoveRadarSwitchView$d */
    public class C8414d implements ValueAnimator.AnimatorUpdateListener {
        public C8414d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            LoveRadarSwitchView.this.f27798j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LoveRadarSwitchView$e */
    public class C8415e implements ValueAnimator.AnimatorUpdateListener {
        public C8415e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            LoveRadarSwitchView.this.f27791c.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            LoveRadarSwitchView.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.LoveRadarSwitchView$f */
    public class C8416f implements Animator.AnimatorListener {
        public C8416f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            LoveRadarSwitchView.this.f27800l = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
            LoveRadarSwitchView.this.f27800l = true;
        }
    }

    public LoveRadarSwitchView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27793e = Color.parseColor("#FE7E1D");
        this.f27794f = Color.parseColor("#D7DAE5");
        this.f27795g = qa00.m175859d(46.0f);
        this.f27796h = qa00.m175859d(30.0f);
        this.f27799k = false;
        this.f27800l = false;
        Paint paint = new Paint();
        this.f27791c = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f27791c;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f27789a = paint3;
        paint3.setAntiAlias(true);
        this.f27789a.setColor(this.f27793e);
        this.f27789a.setStyle(style);
        Paint paint4 = new Paint();
        this.f27790b = paint4;
        paint4.setAntiAlias(true);
        this.f27790b.setColor(this.f27794f);
        this.f27790b.setStyle(style);
        Paint paint5 = new Paint();
        this.f27792d = paint5;
        paint5.setAntiAlias(true);
        this.f27792d.setColor(Color.parseColor("#FFFFFF"));
        this.f27792d.setStyle(style);
        RectF rectF = new RectF();
        this.f27797i = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = this.f27795g;
        rectF.bottom = this.f27796h;
    }

    public static String getCurState() {
        return f27788m;
    }

    /* JADX INFO: renamed from: c */
    public void m44916c() {
        if (this.f27800l) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(100.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C8414d());
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.f27793e, this.f27794f);
        valueAnimatorOfArgb.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfArgb.addUpdateListener(new C8415e());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfArgb);
        animatorSet.setDuration(800L);
        animatorSet.start();
        animatorSet.addListener(new C8416f());
    }

    /* JADX INFO: renamed from: d */
    public void m44917d() {
        if (this.f27799k) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(100.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C8411a());
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.f27793e, this.f27794f);
        valueAnimatorOfArgb.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfArgb.addUpdateListener(new C8412b());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfArgb);
        animatorSet.setDuration(800L);
        animatorSet.start();
        animatorSet.addListener(new C8413c());
    }

    /* JADX INFO: renamed from: e */
    public void m44918e(String str) {
        if (TextUtils.equals(f27788m, str) || this.f27799k || this.f27800l) {
            return;
        }
        if (TextUtils.equals(str, "open")) {
            f27788m = str;
            m44916c();
        } else if (TextUtils.equals(str, "close")) {
            f27788m = str;
            m44917d();
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(f27788m, "open")) {
            canvas.drawRoundRect(this.f27797i, qa00.m175859d(15.0f), qa00.m175859d(15.0f), this.f27789a);
            canvas.drawCircle(qa00.m175859d(31.0f), qa00.m175859d(15.0f), qa00.m175859d(11.0f), this.f27792d);
            return;
        }
        boolean zEquals = TextUtils.equals(f27788m, "close");
        RectF rectF = this.f27797i;
        if (zEquals) {
            canvas.drawRoundRect(rectF, qa00.m175859d(15.0f), qa00.m175859d(15.0f), this.f27790b);
            canvas.drawCircle(qa00.m175859d(15.0f), qa00.m175859d(15.0f), qa00.m175859d(11.0f), this.f27792d);
        } else {
            canvas.drawRoundRect(rectF, qa00.m175859d(15.0f), qa00.m175859d(15.0f), this.f27791c);
            canvas.drawCircle((qa00.m175859d(16.0f) * this.f27798j) + qa00.m175859d(15.0f), qa00.m175859d(15.0f), qa00.m175859d(15.0f), this.f27792d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f27795g, this.f27796h);
    }

    public LoveRadarSwitchView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoveRadarSwitchView(Context context) {
        this(context, null);
    }
}
