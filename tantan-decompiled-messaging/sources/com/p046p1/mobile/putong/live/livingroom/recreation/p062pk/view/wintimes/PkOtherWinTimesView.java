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
import p149l.by70;
import p149l.hxs;
import p149l.i3c0;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes5.dex */
public class PkOtherWinTimesView extends PkWinTimesBaseView {

    /* JADX INFO: renamed from: b */
    public VDraweeView f51785b;

    /* JADX INFO: renamed from: c */
    public PkWinTimesNumView f51786c;

    /* JADX INFO: renamed from: d */
    public VImage f51787d;

    /* JADX INFO: renamed from: e */
    public Animator f51788e;

    /* JADX INFO: renamed from: f */
    public Animator f51789f;

    public PkOtherWinTimesView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51788e = null;
        this.f51789f = null;
    }

    /* JADX INFO: renamed from: g */
    private void m76303g() {
        hxs.m133398k("context_single_room", this.f51785b, ydt.f197599B);
        this.f51786c.m76318c(false);
        xdl0.m208345M0(this, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m76304h() {
        xdl0.m208345M0(this, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m76305i() {
        xdl0.m208344M(this, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m76306j() {
        xdl0.m208344M(this, false);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes.PkWinTimesBaseView
    /* JADX INFO: renamed from: a */
    public void mo76292a() {
        Animator animatorM103746s = bt0.m103746s(bt0.m103753z(bt0.m103743p(this, "translationX", 0L, 408L, new AccelerateInterpolator(), 318.0f, -99.0f), bt0.m103743p(this, "skewValue", 0L, 408L, new AccelerateInterpolator(), 0.1f, 0.5f)), bt0.m103753z(bt0.m103743p(this, "translationX", 0L, 225L, new AccelerateInterpolator(), -99.0f, 0.0f), bt0.m103743p(this, "skewValue", 0L, 225L, new AccelerateInterpolator(), 0.5f, 0.0f)));
        this.f51788e = animatorM103746s;
        bt0.m103749v(animatorM103746s, new Runnable() { // from class: l.yx70
            @Override // java.lang.Runnable
            public final void run() {
                this.f200578a.m76304h();
            }
        });
        this.f51788e.start();
    }

    /* JADX INFO: renamed from: f */
    public final void m76307f(View view) {
        by70.m104434a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m76308k() {
        if (getVisibility() == 8) {
            return;
        }
        Animator animatorM103743p = bt0.m103743p(this, "skewValue", 0L, 208L, new AccelerateInterpolator(), 0.0f, -0.5f);
        bt0.m103749v(animatorM103743p, new Runnable() { // from class: l.zx70
            @Override // java.lang.Runnable
            public final void run() {
                this.f205386a.m76305i();
            }
        });
        Animator animatorM103743p2 = bt0.m103743p(this, "skewValue", 0L, 208L, new AccelerateInterpolator(), -0.5f, 0.5f);
        Animator animatorM103743p3 = bt0.m103743p(this, "translationX", 0L, 375L, new AccelerateInterpolator(), 0.0f, 318.0f);
        bt0.m103733f(animatorM103743p3, new Runnable() { // from class: l.ay70
            @Override // java.lang.Runnable
            public final void run() {
                this.f72256a.m76306j();
            }
        });
        Animator animatorM103746s = bt0.m103746s(animatorM103743p, bt0.m103753z(animatorM103743p2, animatorM103743p3));
        this.f51789f = animatorM103746s;
        animatorM103746s.start();
    }

    /* JADX INFO: renamed from: l */
    public void m76309l() {
        m76310b(this.f51788e);
        m76310b(this.f51789f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76310b(this.f51788e);
        m76310b(this.f51789f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76307f(this);
        m76303g();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.wintimes.PkWinTimesBaseView
    public void setWinTimes(long j) {
        this.f51787d.setImageResource(i3c0.f110727H5);
        this.f51786c.setNumber(j);
        super.setWinTimes(j);
    }

    public PkOtherWinTimesView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkOtherWinTimesView(Context context) {
        this(context, null);
    }
}
