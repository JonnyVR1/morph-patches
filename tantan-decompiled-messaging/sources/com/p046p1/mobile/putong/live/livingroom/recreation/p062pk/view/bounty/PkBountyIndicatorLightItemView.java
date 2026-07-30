package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLivePkBountyIndicatorLight;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.dt0;
import p149l.hxs;
import p149l.vk70;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class PkBountyIndicatorLightItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51750a;

    /* JADX INFO: renamed from: b */
    public VImage f51751b;

    /* JADX INFO: renamed from: c */
    public VImage f51752c;

    /* JADX INFO: renamed from: d */
    public VImage f51753d;

    /* JADX INFO: renamed from: e */
    public VText f51754e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f51755f;

    /* JADX INFO: renamed from: g */
    public Animator f51756g;

    /* JADX INFO: renamed from: h */
    public Animator f51757h;

    /* JADX INFO: renamed from: i */
    public Animator f51758i;

    public PkBountyIndicatorLightItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51756g = null;
        this.f51757h = null;
        this.f51758i = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m76244g(View view) {
        vk70.m198716a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m76245h() {
        dt0.m113501A(this.f51756g);
        dt0.m113501A(this.f51757h);
        dt0.m113501A(this.f51758i);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m76246i() {
        xdl0.m208344M(this.f51751b, true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m76247j() {
        this.f51754e.setTextColor(Color.parseColor("#999999"));
        xdl0.m208344M(this.f51752c, false);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m76248k() {
        xdl0.m208344M(this.f51752c, true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m76249l() {
        this.f51754e.setTextColor(Color.parseColor("#c87724"));
        xdl0.m208344M(this.f51751b, false);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m76250m() {
        m76254q();
        xdl0.m208344M(this.f51752c, true);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m76251n() {
        xdl0.m208344M(this.f51751b, false);
        this.f51754e.setTextColor(Color.parseColor("#c87724"));
    }

    /* JADX INFO: renamed from: o */
    public void m76252o(BLivePkBountyIndicatorLight bLivePkBountyIndicatorLight) {
        if (bLivePkBountyIndicatorLight == null) {
            return;
        }
        boolean z = bLivePkBountyIndicatorLight.showMoney;
        VImage vImage = this.f51753d;
        if (z) {
            xdl0.m208344M(vImage, true);
            if (bLivePkBountyIndicatorLight.f44424on) {
                m76257t();
            }
        } else {
            xdl0.m208344M(vImage, false);
        }
        boolean z2 = bLivePkBountyIndicatorLight.f44424on;
        boolean z3 = bLivePkBountyIndicatorLight.lastOn;
        if (z2 != z3 && z2 && !bLivePkBountyIndicatorLight.showMoney) {
            m76256s();
            return;
        }
        if (z2 != z3 && !z2 && !bLivePkBountyIndicatorLight.showMoney) {
            m76255r();
            return;
        }
        if (z2) {
            xdl0.m208344M(this.f51752c, true);
            xdl0.m208344M(this.f51751b, false);
            this.f51754e.setTextColor(Color.parseColor("#c87724"));
        } else {
            xdl0.m208344M(this.f51751b, true);
            xdl0.m208344M(this.f51752c, false);
            this.f51754e.setTextColor(Color.parseColor("#999999"));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76245h();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76244g(this);
        xdl0.m208344M(this.f51755f, false);
        xdl0.m208344M(this.f51750a, false);
    }

    /* JADX INFO: renamed from: p */
    public void m76253p(BLivePkBountyIndicatorLight bLivePkBountyIndicatorLight) {
        if (bLivePkBountyIndicatorLight == null) {
            return;
        }
        this.f51753d.setAlpha(1.0f);
        this.f51751b.setAlpha(1.0f);
        int i = bLivePkBountyIndicatorLight.number;
        VText vText = this.f51754e;
        if (i != 0) {
            vText.setText(String.valueOf(i));
        } else {
            xdl0.m208344M(vText, false);
        }
        boolean z = bLivePkBountyIndicatorLight.showMoney;
        VImage vImage = this.f51753d;
        if (z) {
            xdl0.m208344M(vImage, true);
        } else {
            xdl0.m208344M(vImage, false);
        }
        if (bLivePkBountyIndicatorLight.f44424on) {
            xdl0.m208344M(this.f51752c, true);
            xdl0.m208344M(this.f51751b, false);
            this.f51754e.setTextColor(Color.parseColor("#c87724"));
        } else {
            xdl0.m208344M(this.f51751b, true);
            xdl0.m208344M(this.f51752c, false);
            this.f51754e.setTextColor(Color.parseColor("#999999"));
        }
    }

    /* JADX INFO: renamed from: q */
    public void m76254q() {
        hxs.m133399l("context_livingAct", this.f51750a, "https://auto.tancdn.com/v1/raw/8626caa9-1edf-410c-9b93-d3a9aeefa36b12.webp", 1);
        hxs.m133399l("context_livingAct", this.f51755f, "https://auto.tancdn.com/v1/raw/c42191e4-068e-42ad-af74-5a932095964a12.webp", 1);
        xdl0.m208344M(this.f51755f, true);
        xdl0.m208344M(this.f51750a, true);
    }

    /* JADX INFO: renamed from: r */
    public void m76255r() {
        Animator animatorM103743p = bt0.m103743p(this.f51751b, "alpha", 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f);
        this.f51757h = animatorM103743p;
        bt0.m103749v(animatorM103743p, new Runnable() { // from class: l.pk70
            @Override // java.lang.Runnable
            public final void run() {
                this.f149946a.m76246i();
            }
        });
        bt0.m103733f(this.f51757h, new Runnable() { // from class: l.qk70
            @Override // java.lang.Runnable
            public final void run() {
                this.f155073a.m76247j();
            }
        });
        this.f51757h.start();
    }

    /* JADX INFO: renamed from: s */
    public void m76256s() {
        Animator animatorM103743p = bt0.m103743p(this.f51752c, "alpha", 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f);
        this.f51756g = animatorM103743p;
        bt0.m103749v(animatorM103743p, new Runnable() { // from class: l.rk70
            @Override // java.lang.Runnable
            public final void run() {
                this.f159782a.m76248k();
            }
        });
        bt0.m103733f(this.f51756g, new Runnable() { // from class: l.sk70
            @Override // java.lang.Runnable
            public final void run() {
                this.f164938a.m76249l();
            }
        });
        this.f51756g.start();
    }

    /* JADX INFO: renamed from: t */
    public void m76257t() {
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(this.f51752c, "alpha", 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f), bt0.m103743p(this.f51751b, "alpha", 0L, 200L, new AccelerateInterpolator(), 1.0f, 0.0f), bt0.m103743p(this.f51753d, "alpha", 0L, 200L, new AccelerateInterpolator(), 1.0f, 0.0f));
        this.f51758i = animatorM103753z;
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.tk70
            @Override // java.lang.Runnable
            public final void run() {
                this.f170822a.m76250m();
            }
        });
        bt0.m103733f(this.f51758i, new Runnable() { // from class: l.uk70
            @Override // java.lang.Runnable
            public final void run() {
                this.f176911a.m76251n();
            }
        });
        this.f51758i.start();
    }

    public PkBountyIndicatorLightItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkBountyIndicatorLightItemView(@NonNull Context context) {
        this(context, null);
    }
}
