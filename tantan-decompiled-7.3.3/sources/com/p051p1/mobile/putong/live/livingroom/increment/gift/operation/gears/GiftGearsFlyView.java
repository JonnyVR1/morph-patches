package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.gears;

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
import p153l.bnl0;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.jjs;
import p153l.osj;
import p153l.psj;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class GiftGearsFlyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50687a;

    /* JADX INFO: renamed from: b */
    public boolean f50688b;

    /* JADX INFO: renamed from: c */
    public boolean f50689c;

    /* JADX INFO: renamed from: d */
    public ViewGroup.MarginLayoutParams f50690d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f50691e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f50692f;

    /* JADX INFO: renamed from: g */
    public Animator f50693g;

    /* JADX INFO: renamed from: h */
    public Animator f50694h;

    /* JADX INFO: renamed from: i */
    public Animator f50695i;

    public GiftGearsFlyView(@NonNull Context context) {
        super(context);
        this.f50688b = false;
        this.f50689c = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m75004e(View view) {
        psj.m173657a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m75005f() {
        if (this.f50693g == null) {
            Animator animatorM132168n = gt0.m132168n(this, gt0.f106354i, 1.0f, 2.0f);
            this.f50693g = animatorM132168n;
            animatorM132168n.setDuration(1000L);
            this.f50693g.setInterpolator(null);
        }
        if (this.f50694h == null) {
            Animator animatorM132168n2 = gt0.m132168n(this, View.ROTATION, 0.0f, 35.0f);
            this.f50694h = animatorM132168n2;
            animatorM132168n2.setDuration(1000L);
            this.f50694h.setInterpolator(null);
        }
        if (this.f50695i == null) {
            Animator animatorM132168n3 = gt0.m132168n(this, View.ALPHA, 1.0f, 0.0f);
            this.f50695i = animatorM132168n3;
            animatorM132168n3.setDuration(600L);
            this.f50695i.setStartDelay(400L);
            this.f50694h.setInterpolator(null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m75006g(x20 x20Var, ValueAnimator valueAnimator) {
        this.f50690d.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(this.f50690d);
        if (this.f50688b) {
            return;
        }
        x20Var.call();
        this.f50688b = true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m75007h(ValueAnimator valueAnimator) {
        this.f50690d.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(this.f50690d);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m75008i() {
        this.f50689c = true;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m75009j() {
        bnl0.m105525M0(this, false);
        this.f50689c = false;
        this.f50688b = false;
        osj.m169050c().m169053d(this);
    }

    /* JADX INFO: renamed from: k */
    public void m75010k(int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f50690d;
        marginLayoutParams.leftMargin = iArr[0];
        marginLayoutParams.topMargin = iArr[1];
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: l */
    public void m75011l() {
        this.f50689c = true;
    }

    /* JADX INFO: renamed from: m */
    public final void m75012m() {
        it0.m142009C(this.f50691e);
        it0.m142009C(this.f50692f);
        it0.m142009C(this.f50693g);
        it0.m142009C(this.f50694h);
    }

    /* JADX INFO: renamed from: n */
    public void m75013n() {
        this.f50689c = false;
        this.f50688b = false;
    }

    /* JADX INFO: renamed from: o */
    public void m75014o(jjs jjsVar) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f50690d = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (this.f50689c) {
            return;
        }
        izs.m142868s("context_livingAct", this.f50687a, jjsVar.m145122h().url);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75004e(this);
        m75005f();
    }

    /* JADX INFO: renamed from: p */
    public void m75015p(int[] iArr, final x20 x20Var) {
        bnl0.m105525M0(this, true);
        int i = iArr[0];
        int i2 = iArr[1];
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f50690d;
        int i3 = marginLayoutParams.leftMargin;
        int i4 = marginLayoutParams.topMargin;
        m75012m();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i3, i);
        this.f50691e = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1000L);
        this.f50691e.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f50691e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hsj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f111447a.m75006g(x20Var, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i4, i2);
        this.f50692f = valueAnimatorOfInt2;
        valueAnimatorOfInt2.setDuration(1000L);
        this.f50692f.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f50692f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.isj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f116673a.m75007h(valueAnimator);
            }
        });
        gt0.m132177w(this.f50691e, new Runnable() { // from class: l.jsj
            @Override // java.lang.Runnable
            public final void run() {
                this.f122467a.m75008i();
            }
        }, new Runnable() { // from class: l.ksj
            @Override // java.lang.Runnable
            public final void run() {
                this.f128576a.m75009j();
            }
        });
        this.f50691e.start();
        this.f50692f.start();
        this.f50693g.start();
        this.f50694h.start();
        this.f50695i.start();
        setAlpha(1.0f);
    }

    public GiftGearsFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50688b = false;
        this.f50689c = false;
    }

    public GiftGearsFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50688b = false;
        this.f50689c = false;
    }
}
