package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.bt0;
import p149l.dj70;
import p149l.hxs;
import p149l.i3c0;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes5.dex */
public class PkAnchorWinTimesView extends PkWinTimesBaseView {

    /* JADX INFO: renamed from: b */
    public PkWinTimesNumView f51780b;

    /* JADX INFO: renamed from: c */
    public VImage f51781c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f51782d;

    /* JADX INFO: renamed from: e */
    public Animator f51783e;

    /* JADX INFO: renamed from: f */
    public Animator f51784f;

    public PkAnchorWinTimesView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51783e = null;
        this.f51784f = null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes.PkWinTimesBaseView
    /* JADX INFO: renamed from: a */
    public void mo76292a() {
        Animator animatorM103746s = bt0.m103746s(bt0.m103753z(bt0.m103743p(this, "translationX", 0L, 408L, new AccelerateInterpolator(), -318.0f, 99.0f), bt0.m103743p(this, "skewValue", 0L, 408L, new AccelerateInterpolator(), -0.1f, -0.5f)), bt0.m103753z(bt0.m103743p(this, "translationX", 0L, 225L, new AccelerateInterpolator(), 99.0f, 0.0f), bt0.m103743p(this, "skewValue", 0L, 225L, new AccelerateInterpolator(), -0.5f, 0.0f)));
        this.f51783e = animatorM103746s;
        bt0.m103749v(animatorM103746s, new Runnable() { // from class: l.aj70
            @Override // java.lang.Runnable
            public final void run() {
                this.f70092a.m76295h();
            }
        });
        this.f51783e.start();
    }

    /* JADX INFO: renamed from: f */
    public final void m76293f(View view) {
        dj70.m112022a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m76294g() {
        hxs.m133398k("context_livingAct", this.f51782d, ydt.f197598A);
        this.f51780b.m76318c(true);
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m76295h() {
        xdl0.m208345M0(this, true);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m76296i() {
        xdl0.m208344M(this, true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m76297j() {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: k */
    public void m76298k() {
        if (getVisibility() == 8) {
            return;
        }
        Animator animatorM103743p = bt0.m103743p(this, "skewValue", 0L, 208L, new AccelerateInterpolator(), 0.0f, 0.5f);
        bt0.m103749v(animatorM103743p, new Runnable() { // from class: l.bj70
            @Override // java.lang.Runnable
            public final void run() {
                this.f75888a.m76296i();
            }
        });
        Animator animatorM103743p2 = bt0.m103743p(this, "skewValue", 0L, 208L, new AccelerateInterpolator(), 0.5f, -0.5f);
        Animator animatorM103743p3 = bt0.m103743p(this, "translationX", 0L, 375L, new AccelerateInterpolator(), 0.0f, -318.0f);
        bt0.m103733f(animatorM103743p3, new Runnable() { // from class: l.cj70
            @Override // java.lang.Runnable
            public final void run() {
                this.f81156a.m76297j();
            }
        });
        Animator animatorM103746s = bt0.m103746s(animatorM103743p, bt0.m103753z(animatorM103743p2, animatorM103743p3));
        this.f51784f = animatorM103746s;
        animatorM103746s.start();
    }

    /* JADX INFO: renamed from: l */
    public void m76299l() {
        m76310b(this.f51783e);
        m76310b(this.f51784f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76310b(this.f51783e);
        m76310b(this.f51784f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76293f(this);
        m76294g();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes.PkWinTimesBaseView
    public void setWinTimes(long j) {
        this.f51781c.setImageResource(i3c0.f110702F4);
        this.f51780b.setNumber(j);
        super.setWinTimes(j);
    }

    public PkAnchorWinTimesView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkAnchorWinTimesView(Context context) {
        this(context, null);
    }
}
