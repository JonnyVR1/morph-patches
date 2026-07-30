package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.gears;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.bt0;
import l.d30;
import l.dt0;
import l.hxs;
import l.xdl0;
import p002l.ihs;
import p002l.ypj;
import p002l.zpj;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftGearsFlyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5881a;

    /* JADX INFO: renamed from: b */
    public boolean f5882b;

    /* JADX INFO: renamed from: c */
    public boolean f5883c;

    /* JADX INFO: renamed from: d */
    public ViewGroup.MarginLayoutParams f5884d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f5885e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f5886f;

    /* JADX INFO: renamed from: g */
    public Animator f5887g;

    /* JADX INFO: renamed from: h */
    public Animator f5888h;

    /* JADX INFO: renamed from: i */
    public Animator f5889i;

    public GiftGearsFlyView(@NonNull Context context) {
        super(context);
        this.f5882b = false;
        this.f5883c = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m7377e(View view) {
        zpj.m27499a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m7378f() {
        if (this.f5887g == null) {
            Animator animatorN = bt0.n(this, bt0.i, new float[]{1.0f, 2.0f});
            this.f5887g = animatorN;
            animatorN.setDuration(1000L);
            this.f5887g.setInterpolator(null);
        }
        if (this.f5888h == null) {
            Animator animatorN2 = bt0.n(this, View.ROTATION, new float[]{0.0f, 35.0f});
            this.f5888h = animatorN2;
            animatorN2.setDuration(1000L);
            this.f5888h.setInterpolator(null);
        }
        if (this.f5889i == null) {
            Animator animatorN3 = bt0.n(this, View.ALPHA, new float[]{1.0f, 0.0f});
            this.f5889i = animatorN3;
            animatorN3.setDuration(600L);
            this.f5889i.setStartDelay(400L);
            this.f5888h.setInterpolator(null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m7379g(d30 d30Var, ValueAnimator valueAnimator) {
        this.f5884d.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(this.f5884d);
        if (this.f5882b) {
            return;
        }
        d30Var.call();
        this.f5882b = true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m7380h(ValueAnimator valueAnimator) {
        this.f5884d.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(this.f5884d);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m7381i() {
        this.f5883c = true;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m7382j() {
        xdl0.M0(this, false);
        this.f5883c = false;
        this.f5882b = false;
        ypj.m26870c().m26873d(this);
    }

    /* JADX INFO: renamed from: k */
    public void m7383k(int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f5884d;
        marginLayoutParams.leftMargin = iArr[0];
        marginLayoutParams.topMargin = iArr[1];
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: l */
    public void m7384l() {
        this.f5883c = true;
    }

    /* JADX INFO: renamed from: m */
    public final void m7385m() {
        dt0.C(this.f5885e);
        dt0.C(this.f5886f);
        dt0.C(this.f5887g);
        dt0.C(this.f5888h);
    }

    /* JADX INFO: renamed from: n */
    public void m7386n() {
        this.f5883c = false;
        this.f5882b = false;
    }

    /* JADX INFO: renamed from: o */
    public void m7387o(ihs ihsVar) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f5884d = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (this.f5883c) {
            return;
        }
        hxs.s("context_livingAct", this.f5881a, ihsVar.m15160h().url);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7377e(this);
        m7378f();
    }

    /* JADX INFO: renamed from: p */
    public void m7388p(int[] iArr, final d30 d30Var) {
        xdl0.M0(this, true);
        int i = iArr[0];
        int i2 = iArr[1];
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f5884d;
        int i3 = marginLayoutParams.leftMargin;
        int i4 = marginLayoutParams.topMargin;
        m7385m();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i3, i);
        this.f5885e = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1000L);
        this.f5885e.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f5885e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rpj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f18636a.m7379g(d30Var, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i4, i2);
        this.f5886f = valueAnimatorOfInt2;
        valueAnimatorOfInt2.setDuration(1000L);
        this.f5886f.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f5886f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.spj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f19237a.m7380h(valueAnimator);
            }
        });
        bt0.w(this.f5885e, new Runnable() { // from class: l.tpj
            @Override // java.lang.Runnable
            public final void run() {
                this.f20332a.m7381i();
            }
        }, new Runnable() { // from class: l.upj
            @Override // java.lang.Runnable
            public final void run() {
                this.f20747a.m7382j();
            }
        });
        this.f5885e.start();
        this.f5886f.start();
        this.f5887g.start();
        this.f5888h.start();
        this.f5889i.start();
        setAlpha(1.0f);
    }

    public GiftGearsFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5882b = false;
        this.f5883c = false;
    }

    public GiftGearsFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5882b = false;
        this.f5883c = false;
    }
}
