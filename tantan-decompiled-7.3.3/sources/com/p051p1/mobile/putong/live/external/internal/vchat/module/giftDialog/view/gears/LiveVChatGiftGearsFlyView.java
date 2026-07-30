package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears;

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
import p151v.VDraweeView;
import p153l.amu;
import p153l.bnl0;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.jjs;
import p153l.lsj;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftGearsFlyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f46133a;

    /* JADX INFO: renamed from: b */
    public boolean f46134b;

    /* JADX INFO: renamed from: c */
    public boolean f46135c;

    /* JADX INFO: renamed from: d */
    public ViewGroup.MarginLayoutParams f46136d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f46137e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f46138f;

    /* JADX INFO: renamed from: g */
    public Animator f46139g;

    /* JADX INFO: renamed from: h */
    public Animator f46140h;

    /* JADX INFO: renamed from: i */
    public Animator f46141i;

    public LiveVChatGiftGearsFlyView(@NonNull Context context) {
        super(context);
        this.f46134b = false;
        this.f46135c = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m70791e(View view) {
        amu.m98858a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m70792f() {
        if (this.f46139g == null) {
            Animator animatorM132168n = gt0.m132168n(this, gt0.f106354i, 1.0f, 2.0f);
            this.f46139g = animatorM132168n;
            animatorM132168n.setDuration(1000L);
            this.f46139g.setInterpolator(null);
        }
        if (this.f46140h == null) {
            Animator animatorM132168n2 = gt0.m132168n(this, View.ROTATION, 0.0f, 35.0f);
            this.f46140h = animatorM132168n2;
            animatorM132168n2.setDuration(1000L);
            this.f46140h.setInterpolator(null);
        }
        if (this.f46141i == null) {
            Animator animatorM132168n3 = gt0.m132168n(this, View.ALPHA, 1.0f, 0.0f);
            this.f46141i = animatorM132168n3;
            animatorM132168n3.setDuration(600L);
            this.f46141i.setStartDelay(400L);
            this.f46140h.setInterpolator(null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m70793g(x20 x20Var, ValueAnimator valueAnimator) {
        this.f46136d.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(this.f46136d);
        if (this.f46134b) {
            return;
        }
        x20Var.call();
        this.f46134b = true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m70794h(ValueAnimator valueAnimator) {
        this.f46136d.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(this.f46136d);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m70795i() {
        this.f46135c = true;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m70796j() {
        bnl0.m105525M0(this, false);
        this.f46135c = false;
        this.f46134b = false;
        lsj.m155698b().m155700c(this);
    }

    /* JADX INFO: renamed from: k */
    public void m70797k(int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f46136d;
        marginLayoutParams.leftMargin = iArr[0];
        marginLayoutParams.topMargin = iArr[1];
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: l */
    public void m70798l() {
        this.f46135c = true;
    }

    /* JADX INFO: renamed from: m */
    public final void m70799m() {
        it0.m142009C(this.f46137e);
        it0.m142009C(this.f46138f);
        it0.m142009C(this.f46139g);
        it0.m142009C(this.f46140h);
    }

    /* JADX INFO: renamed from: n */
    public void m70800n() {
        this.f46135c = false;
        this.f46134b = false;
    }

    /* JADX INFO: renamed from: o */
    public void m70801o(jjs jjsVar) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f46136d = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (this.f46135c) {
            return;
        }
        izs.m142868s("context_livingAct", this.f46133a, jjsVar.m145122h().url);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70791e(this);
        m70792f();
    }

    /* JADX INFO: renamed from: p */
    public void m70802p(int[] iArr, final x20 x20Var) {
        bnl0.m105525M0(this, true);
        int i = iArr[0];
        int i2 = iArr[1];
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f46136d;
        int i3 = marginLayoutParams.leftMargin;
        int i4 = marginLayoutParams.topMargin;
        m70799m();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i3, i);
        this.f46137e = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1000L);
        this.f46137e.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f46137e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wlu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f189733a.m70793g(x20Var, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i4, i2);
        this.f46138f = valueAnimatorOfInt2;
        valueAnimatorOfInt2.setDuration(1000L);
        this.f46138f.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f46138f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xlu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f195017a.m70794h(valueAnimator);
            }
        });
        gt0.m132177w(this.f46137e, new Runnable() { // from class: l.ylu
            @Override // java.lang.Runnable
            public final void run() {
                this.f200584a.m70795i();
            }
        }, new Runnable() { // from class: l.zlu
            @Override // java.lang.Runnable
            public final void run() {
                this.f205008a.m70796j();
            }
        });
        this.f46137e.start();
        this.f46138f.start();
        this.f46139g.start();
        this.f46140h.start();
        this.f46141i.start();
        setAlpha(1.0f);
    }

    public LiveVChatGiftGearsFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46134b = false;
        this.f46135c = false;
    }

    public LiveVChatGiftGearsFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46134b = false;
        this.f46135c = false;
    }
}
