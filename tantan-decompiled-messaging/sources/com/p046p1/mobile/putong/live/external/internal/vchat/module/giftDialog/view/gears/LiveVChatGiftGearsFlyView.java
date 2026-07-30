package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears;

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
import p149l.vpj;
import p149l.xdl0;
import p149l.zju;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftGearsFlyView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f45285a;

    /* JADX INFO: renamed from: b */
    public boolean f45286b;

    /* JADX INFO: renamed from: c */
    public boolean f45287c;

    /* JADX INFO: renamed from: d */
    public ViewGroup.MarginLayoutParams f45288d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f45289e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f45290f;

    /* JADX INFO: renamed from: g */
    public Animator f45291g;

    /* JADX INFO: renamed from: h */
    public Animator f45292h;

    /* JADX INFO: renamed from: i */
    public Animator f45293i;

    public LiveVChatGiftGearsFlyView(@NonNull Context context) {
        super(context);
        this.f45286b = false;
        this.f45287c = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m69608e(View view) {
        zju.m219149a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m69609f() {
        if (this.f45291g == null) {
            Animator animatorM103741n = bt0.m103741n(this, bt0.f77162i, 1.0f, 2.0f);
            this.f45291g = animatorM103741n;
            animatorM103741n.setDuration(1000L);
            this.f45291g.setInterpolator(null);
        }
        if (this.f45292h == null) {
            Animator animatorM103741n2 = bt0.m103741n(this, View.ROTATION, 0.0f, 35.0f);
            this.f45292h = animatorM103741n2;
            animatorM103741n2.setDuration(1000L);
            this.f45292h.setInterpolator(null);
        }
        if (this.f45293i == null) {
            Animator animatorM103741n3 = bt0.m103741n(this, View.ALPHA, 1.0f, 0.0f);
            this.f45293i = animatorM103741n3;
            animatorM103741n3.setDuration(600L);
            this.f45293i.setStartDelay(400L);
            this.f45292h.setInterpolator(null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m69610g(d30 d30Var, ValueAnimator valueAnimator) {
        this.f45288d.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(this.f45288d);
        if (this.f45286b) {
            return;
        }
        d30Var.call();
        this.f45286b = true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m69611h(ValueAnimator valueAnimator) {
        this.f45288d.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(this.f45288d);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m69612i() {
        this.f45287c = true;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m69613j() {
        xdl0.m208345M0(this, false);
        this.f45287c = false;
        this.f45286b = false;
        vpj.m199276b().m199278c(this);
    }

    /* JADX INFO: renamed from: k */
    public void m69614k(int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f45288d;
        marginLayoutParams.leftMargin = iArr[0];
        marginLayoutParams.topMargin = iArr[1];
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: l */
    public void m69615l() {
        this.f45287c = true;
    }

    /* JADX INFO: renamed from: m */
    public final void m69616m() {
        dt0.m113503C(this.f45289e);
        dt0.m113503C(this.f45290f);
        dt0.m113503C(this.f45291g);
        dt0.m113503C(this.f45292h);
    }

    /* JADX INFO: renamed from: n */
    public void m69617n() {
        this.f45287c = false;
        this.f45286b = false;
    }

    /* JADX INFO: renamed from: o */
    public void m69618o(ihs ihsVar) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            this.f45288d = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (this.f45287c) {
            return;
        }
        hxs.m133406s("context_livingAct", this.f45285a, ihsVar.m136283h().url);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69608e(this);
        m69609f();
    }

    /* JADX INFO: renamed from: p */
    public void m69619p(int[] iArr, final d30 d30Var) {
        xdl0.m208345M0(this, true);
        int i = iArr[0];
        int i2 = iArr[1];
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f45288d;
        int i3 = marginLayoutParams.leftMargin;
        int i4 = marginLayoutParams.topMargin;
        m69616m();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i3, i);
        this.f45289e = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1000L);
        this.f45289e.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f45289e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vju
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f181750a.m69610g(d30Var, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i4, i2);
        this.f45290f = valueAnimatorOfInt2;
        valueAnimatorOfInt2.setDuration(1000L);
        this.f45290f.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f45290f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wju
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f186684a.m69611h(valueAnimator);
            }
        });
        bt0.m103750w(this.f45289e, new Runnable() { // from class: l.xju
            @Override // java.lang.Runnable
            public final void run() {
                this.f193246a.m69612i();
            }
        }, new Runnable() { // from class: l.yju
            @Override // java.lang.Runnable
            public final void run() {
                this.f198690a.m69613j();
            }
        });
        this.f45289e.start();
        this.f45290f.start();
        this.f45291g.start();
        this.f45292h.start();
        this.f45293i.start();
        setAlpha(1.0f);
    }

    public LiveVChatGiftGearsFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45286b = false;
        this.f45287c = false;
    }

    public LiveVChatGiftGearsFlyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45286b = false;
        this.f45287c = false;
    }
}
