package com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.gears;

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
import p147v.VDraweeView;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.hxs;
import p149l.ihs;
import p149l.xdl0;
import p149l.ypj;
import p149l.zpj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftGearsFlyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49839a;

    /* JADX INFO: renamed from: b */
    public boolean f49840b;

    /* JADX INFO: renamed from: c */
    public boolean f49841c;

    /* JADX INFO: renamed from: d */
    public ViewGroup.MarginLayoutParams f49842d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f49843e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f49844f;

    /* JADX INFO: renamed from: g */
    public Animator f49845g;

    /* JADX INFO: renamed from: h */
    public Animator f49846h;

    /* JADX INFO: renamed from: i */
    public Animator f49847i;

    public GiftGearsFlyView(@NonNull Context context) {
        super(context);
        this.f49840b = false;
        this.f49841c = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m73821e(View view) {
        zpj.m219676a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m73822f() {
        if (this.f49845g == null) {
            Animator animatorM103741n = bt0.m103741n(this, bt0.f77162i, 1.0f, 2.0f);
            this.f49845g = animatorM103741n;
            animatorM103741n.setDuration(1000L);
            this.f49845g.setInterpolator(null);
        }
        if (this.f49846h == null) {
            Animator animatorM103741n2 = bt0.m103741n(this, View.ROTATION, 0.0f, 35.0f);
            this.f49846h = animatorM103741n2;
            animatorM103741n2.setDuration(1000L);
            this.f49846h.setInterpolator(null);
        }
        if (this.f49847i == null) {
            Animator animatorM103741n3 = bt0.m103741n(this, View.ALPHA, 1.0f, 0.0f);
            this.f49847i = animatorM103741n3;
            animatorM103741n3.setDuration(600L);
            this.f49847i.setStartDelay(400L);
            this.f49846h.setInterpolator(null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m73823g(d30 d30Var, ValueAnimator valueAnimator) {
        this.f49842d.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(this.f49842d);
        if (this.f49840b) {
            return;
        }
        d30Var.call();
        this.f49840b = true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m73824h(ValueAnimator valueAnimator) {
        this.f49842d.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(this.f49842d);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m73825i() {
        this.f49841c = true;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m73826j() {
        xdl0.m208345M0(this, false);
        this.f49841c = false;
        this.f49840b = false;
        ypj.m215637c().m215640d(this);
    }

    /* JADX INFO: renamed from: k */
    public void m73827k(int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f49842d;
        marginLayoutParams.leftMargin = iArr[0];
        marginLayoutParams.topMargin = iArr[1];
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: l */
    public void m73828l() {
        this.f49841c = true;
    }

    /* JADX INFO: renamed from: m */
    public final void m73829m() {
        dt0.m113503C(this.f49843e);
        dt0.m113503C(this.f49844f);
        dt0.m113503C(this.f49845g);
        dt0.m113503C(this.f49846h);
    }

    /* JADX INFO: renamed from: n */
    public void m73830n() {
        this.f49841c = false;
        this.f49840b = false;
    }

    /* JADX INFO: renamed from: o */
    public void m73831o(ihs ihsVar) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f49842d = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (this.f49841c) {
            return;
        }
        hxs.m133406s("context_livingAct", this.f49839a, ihsVar.m136283h().url);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73821e(this);
        m73822f();
    }

    /* JADX INFO: renamed from: p */
    public void m73832p(int[] iArr, final d30 d30Var) {
        xdl0.m208345M0(this, true);
        int i = iArr[0];
        int i2 = iArr[1];
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f49842d;
        int i3 = marginLayoutParams.leftMargin;
        int i4 = marginLayoutParams.topMargin;
        m73829m();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i3, i);
        this.f49843e = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1000L);
        this.f49843e.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f49843e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rpj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f160507a.m73823g(d30Var, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i4, i2);
        this.f49844f = valueAnimatorOfInt2;
        valueAnimatorOfInt2.setDuration(1000L);
        this.f49844f.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f49844f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.spj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f165856a.m73824h(valueAnimator);
            }
        });
        bt0.m103750w(this.f49843e, new Runnable() { // from class: l.tpj
            @Override // java.lang.Runnable
            public final void run() {
                this.f171483a.m73825i();
            }
        }, new Runnable() { // from class: l.upj
            @Override // java.lang.Runnable
            public final void run() {
                this.f177633a.m73826j();
            }
        });
        this.f49843e.start();
        this.f49844f.start();
        this.f49845g.start();
        this.f49846h.start();
        this.f49847i.start();
        setAlpha(1.0f);
    }

    public GiftGearsFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49840b = false;
        this.f49841c = false;
    }

    public GiftGearsFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49840b = false;
        this.f49841c = false;
    }
}
