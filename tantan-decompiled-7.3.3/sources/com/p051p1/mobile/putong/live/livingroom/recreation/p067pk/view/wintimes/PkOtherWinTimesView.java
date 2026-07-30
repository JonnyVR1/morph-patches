package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.gt0;
import p153l.h680;
import p153l.izs;
import p153l.obc0;
import p153l.zft;

/* JADX INFO: loaded from: classes5.dex */
public class PkOtherWinTimesView extends PkWinTimesBaseView {

    /* JADX INFO: renamed from: b */
    public VDraweeView f52633b;

    /* JADX INFO: renamed from: c */
    public PkWinTimesNumView f52634c;

    /* JADX INFO: renamed from: d */
    public VImage f52635d;

    /* JADX INFO: renamed from: e */
    public Animator f52636e;

    /* JADX INFO: renamed from: f */
    public Animator f52637f;

    public PkOtherWinTimesView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52636e = null;
        this.f52637f = null;
    }

    /* JADX INFO: renamed from: g */
    private void m77486g() {
        izs.m142860k("context_single_room", this.f52633b, zft.f204194B);
        this.f52634c.m77501c(false);
        bnl0.m105525M0(this, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m77487h() {
        bnl0.m105525M0(this, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m77488i() {
        bnl0.m105524M(this, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m77489j() {
        bnl0.m105524M(this, false);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkWinTimesBaseView
    /* JADX INFO: renamed from: a */
    public void mo77475a() {
        Animator animatorM132173s = gt0.m132173s(gt0.m132180z(gt0.m132170p(this, "translationX", 0L, 408L, new AccelerateInterpolator(), 318.0f, -99.0f), gt0.m132170p(this, "skewValue", 0L, 408L, new AccelerateInterpolator(), 0.1f, 0.5f)), gt0.m132180z(gt0.m132170p(this, "translationX", 0L, 225L, new AccelerateInterpolator(), -99.0f, 0.0f), gt0.m132170p(this, "skewValue", 0L, 225L, new AccelerateInterpolator(), 0.5f, 0.0f)));
        this.f52636e = animatorM132173s;
        gt0.m132176v(animatorM132173s, new Runnable() { // from class: l.e680
            @Override // java.lang.Runnable
            public final void run() {
                this.f92264a.m77487h();
            }
        });
        this.f52636e.start();
    }

    /* JADX INFO: renamed from: f */
    public final void m77490f(View view) {
        h680.m133681a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m77491k() {
        if (getVisibility() == 8) {
            return;
        }
        Animator animatorM132170p = gt0.m132170p(this, "skewValue", 0L, 208L, new AccelerateInterpolator(), 0.0f, -0.5f);
        gt0.m132176v(animatorM132170p, new Runnable() { // from class: l.f680
            @Override // java.lang.Runnable
            public final void run() {
                this.f97382a.m77488i();
            }
        });
        Animator animatorM132170p2 = gt0.m132170p(this, "skewValue", 0L, 208L, new AccelerateInterpolator(), -0.5f, 0.5f);
        Animator animatorM132170p3 = gt0.m132170p(this, "translationX", 0L, 375L, new AccelerateInterpolator(), 0.0f, 318.0f);
        gt0.m132160f(animatorM132170p3, new Runnable() { // from class: l.g680
            @Override // java.lang.Runnable
            public final void run() {
                this.f102400a.m77489j();
            }
        });
        Animator animatorM132173s = gt0.m132173s(animatorM132170p, gt0.m132180z(animatorM132170p2, animatorM132170p3));
        this.f52637f = animatorM132173s;
        animatorM132173s.start();
    }

    /* JADX INFO: renamed from: l */
    public void m77492l() {
        m77493b(this.f52636e);
        m77493b(this.f52637f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77493b(this.f52636e);
        m77493b(this.f52637f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77490f(this);
        m77486g();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkWinTimesBaseView
    public void setWinTimes(long j) {
        this.f52635d.setImageResource(obc0.f146055H5);
        this.f52634c.setNumber(j);
        super.setWinTimes(j);
    }

    public PkOtherWinTimesView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkOtherWinTimesView(Context context) {
        this(context, null);
    }
}
