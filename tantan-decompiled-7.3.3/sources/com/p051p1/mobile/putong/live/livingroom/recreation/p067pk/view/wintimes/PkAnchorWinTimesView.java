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
import p153l.izs;
import p153l.jr70;
import p153l.obc0;
import p153l.zft;

/* JADX INFO: loaded from: classes5.dex */
public class PkAnchorWinTimesView extends PkWinTimesBaseView {

    /* JADX INFO: renamed from: b */
    public PkWinTimesNumView f52628b;

    /* JADX INFO: renamed from: c */
    public VImage f52629c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f52630d;

    /* JADX INFO: renamed from: e */
    public Animator f52631e;

    /* JADX INFO: renamed from: f */
    public Animator f52632f;

    public PkAnchorWinTimesView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52631e = null;
        this.f52632f = null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkWinTimesBaseView
    /* JADX INFO: renamed from: a */
    public void mo77475a() {
        Animator animatorM132173s = gt0.m132173s(gt0.m132180z(gt0.m132170p(this, "translationX", 0L, 408L, new AccelerateInterpolator(), -318.0f, 99.0f), gt0.m132170p(this, "skewValue", 0L, 408L, new AccelerateInterpolator(), -0.1f, -0.5f)), gt0.m132180z(gt0.m132170p(this, "translationX", 0L, 225L, new AccelerateInterpolator(), 99.0f, 0.0f), gt0.m132170p(this, "skewValue", 0L, 225L, new AccelerateInterpolator(), -0.5f, 0.0f)));
        this.f52631e = animatorM132173s;
        gt0.m132176v(animatorM132173s, new Runnable() { // from class: l.gr70
            @Override // java.lang.Runnable
            public final void run() {
                this.f106013a.m77478h();
            }
        });
        this.f52631e.start();
    }

    /* JADX INFO: renamed from: f */
    public final void m77476f(View view) {
        jr70.m146709a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m77477g() {
        izs.m142860k("context_livingAct", this.f52630d, zft.f204193A);
        this.f52628b.m77501c(true);
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m77478h() {
        bnl0.m105525M0(this, true);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m77479i() {
        bnl0.m105524M(this, true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m77480j() {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: k */
    public void m77481k() {
        if (getVisibility() == 8) {
            return;
        }
        Animator animatorM132170p = gt0.m132170p(this, "skewValue", 0L, 208L, new AccelerateInterpolator(), 0.0f, 0.5f);
        gt0.m132176v(animatorM132170p, new Runnable() { // from class: l.hr70
            @Override // java.lang.Runnable
            public final void run() {
                this.f111292a.m77479i();
            }
        });
        Animator animatorM132170p2 = gt0.m132170p(this, "skewValue", 0L, 208L, new AccelerateInterpolator(), 0.5f, -0.5f);
        Animator animatorM132170p3 = gt0.m132170p(this, "translationX", 0L, 375L, new AccelerateInterpolator(), 0.0f, -318.0f);
        gt0.m132160f(animatorM132170p3, new Runnable() { // from class: l.ir70
            @Override // java.lang.Runnable
            public final void run() {
                this.f116512a.m77480j();
            }
        });
        Animator animatorM132173s = gt0.m132173s(animatorM132170p, gt0.m132180z(animatorM132170p2, animatorM132170p3));
        this.f52632f = animatorM132173s;
        animatorM132173s.start();
    }

    /* JADX INFO: renamed from: l */
    public void m77482l() {
        m77493b(this.f52631e);
        m77493b(this.f52632f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77493b(this.f52631e);
        m77493b(this.f52632f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77476f(this);
        m77477g();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkWinTimesBaseView
    public void setWinTimes(long j) {
        this.f52629c.setImageResource(obc0.f146030F4);
        this.f52628b.setNumber(j);
        super.setWinTimes(j);
    }

    public PkAnchorWinTimesView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkAnchorWinTimesView(Context context) {
        this(context, null);
    }
}
