package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLivePkBountyIndicatorLight;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.bt70;
import p153l.gt0;
import p153l.it0;
import p153l.izs;

/* JADX INFO: loaded from: classes5.dex */
public class PkBountyIndicatorLightItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52598a;

    /* JADX INFO: renamed from: b */
    public VImage f52599b;

    /* JADX INFO: renamed from: c */
    public VImage f52600c;

    /* JADX INFO: renamed from: d */
    public VImage f52601d;

    /* JADX INFO: renamed from: e */
    public VText f52602e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f52603f;

    /* JADX INFO: renamed from: g */
    public Animator f52604g;

    /* JADX INFO: renamed from: h */
    public Animator f52605h;

    /* JADX INFO: renamed from: i */
    public Animator f52606i;

    public PkBountyIndicatorLightItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52604g = null;
        this.f52605h = null;
        this.f52606i = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m77427g(View view) {
        bt70.m106321a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m77428h() {
        it0.m142007A(this.f52604g);
        it0.m142007A(this.f52605h);
        it0.m142007A(this.f52606i);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m77429i() {
        bnl0.m105524M(this.f52599b, true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m77430j() {
        this.f52602e.setTextColor(Color.parseColor("#999999"));
        bnl0.m105524M(this.f52600c, false);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m77431k() {
        bnl0.m105524M(this.f52600c, true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m77432l() {
        this.f52602e.setTextColor(Color.parseColor("#c87724"));
        bnl0.m105524M(this.f52599b, false);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m77433m() {
        m77437q();
        bnl0.m105524M(this.f52600c, true);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m77434n() {
        bnl0.m105524M(this.f52599b, false);
        this.f52602e.setTextColor(Color.parseColor("#c87724"));
    }

    /* JADX INFO: renamed from: o */
    public void m77435o(BLivePkBountyIndicatorLight bLivePkBountyIndicatorLight) {
        if (bLivePkBountyIndicatorLight == null) {
            return;
        }
        boolean z = bLivePkBountyIndicatorLight.showMoney;
        VImage vImage = this.f52601d;
        if (z) {
            bnl0.m105524M(vImage, true);
            if (bLivePkBountyIndicatorLight.f45272on) {
                m77440t();
            }
        } else {
            bnl0.m105524M(vImage, false);
        }
        boolean z2 = bLivePkBountyIndicatorLight.f45272on;
        boolean z3 = bLivePkBountyIndicatorLight.lastOn;
        if (z2 != z3 && z2 && !bLivePkBountyIndicatorLight.showMoney) {
            m77439s();
            return;
        }
        if (z2 != z3 && !z2 && !bLivePkBountyIndicatorLight.showMoney) {
            m77438r();
            return;
        }
        if (z2) {
            bnl0.m105524M(this.f52600c, true);
            bnl0.m105524M(this.f52599b, false);
            this.f52602e.setTextColor(Color.parseColor("#c87724"));
        } else {
            bnl0.m105524M(this.f52599b, true);
            bnl0.m105524M(this.f52600c, false);
            this.f52602e.setTextColor(Color.parseColor("#999999"));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77428h();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77427g(this);
        bnl0.m105524M(this.f52603f, false);
        bnl0.m105524M(this.f52598a, false);
    }

    /* JADX INFO: renamed from: p */
    public void m77436p(BLivePkBountyIndicatorLight bLivePkBountyIndicatorLight) {
        if (bLivePkBountyIndicatorLight == null) {
            return;
        }
        this.f52601d.setAlpha(1.0f);
        this.f52599b.setAlpha(1.0f);
        int i = bLivePkBountyIndicatorLight.number;
        VText vText = this.f52602e;
        if (i != 0) {
            vText.setText(String.valueOf(i));
        } else {
            bnl0.m105524M(vText, false);
        }
        boolean z = bLivePkBountyIndicatorLight.showMoney;
        VImage vImage = this.f52601d;
        if (z) {
            bnl0.m105524M(vImage, true);
        } else {
            bnl0.m105524M(vImage, false);
        }
        if (bLivePkBountyIndicatorLight.f45272on) {
            bnl0.m105524M(this.f52600c, true);
            bnl0.m105524M(this.f52599b, false);
            this.f52602e.setTextColor(Color.parseColor("#c87724"));
        } else {
            bnl0.m105524M(this.f52599b, true);
            bnl0.m105524M(this.f52600c, false);
            this.f52602e.setTextColor(Color.parseColor("#999999"));
        }
    }

    /* JADX INFO: renamed from: q */
    public void m77437q() {
        izs.m142861l("context_livingAct", this.f52598a, "https://auto.tancdn.com/v1/raw/8626caa9-1edf-410c-9b93-d3a9aeefa36b12.webp", 1);
        izs.m142861l("context_livingAct", this.f52603f, "https://auto.tancdn.com/v1/raw/c42191e4-068e-42ad-af74-5a932095964a12.webp", 1);
        bnl0.m105524M(this.f52603f, true);
        bnl0.m105524M(this.f52598a, true);
    }

    /* JADX INFO: renamed from: r */
    public void m77438r() {
        Animator animatorM132170p = gt0.m132170p(this.f52599b, "alpha", 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f);
        this.f52605h = animatorM132170p;
        gt0.m132176v(animatorM132170p, new Runnable() { // from class: l.vs70
            @Override // java.lang.Runnable
            public final void run() {
                this.f185570a.m77429i();
            }
        });
        gt0.m132160f(this.f52605h, new Runnable() { // from class: l.ws70
            @Override // java.lang.Runnable
            public final void run() {
                this.f190600a.m77430j();
            }
        });
        this.f52605h.start();
    }

    /* JADX INFO: renamed from: s */
    public void m77439s() {
        Animator animatorM132170p = gt0.m132170p(this.f52600c, "alpha", 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f);
        this.f52604g = animatorM132170p;
        gt0.m132176v(animatorM132170p, new Runnable() { // from class: l.xs70
            @Override // java.lang.Runnable
            public final void run() {
                this.f196065a.m77431k();
            }
        });
        gt0.m132160f(this.f52604g, new Runnable() { // from class: l.ys70
            @Override // java.lang.Runnable
            public final void run() {
                this.f201376a.m77432l();
            }
        });
        this.f52604g.start();
    }

    /* JADX INFO: renamed from: t */
    public void m77440t() {
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(this.f52600c, "alpha", 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f), gt0.m132170p(this.f52599b, "alpha", 0L, 200L, new AccelerateInterpolator(), 1.0f, 0.0f), gt0.m132170p(this.f52601d, "alpha", 0L, 200L, new AccelerateInterpolator(), 1.0f, 0.0f));
        this.f52606i = animatorM132180z;
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.zs70
            @Override // java.lang.Runnable
            public final void run() {
                this.f205851a.m77433m();
            }
        });
        gt0.m132160f(this.f52606i, new Runnable() { // from class: l.at70
            @Override // java.lang.Runnable
            public final void run() {
                this.f73214a.m77434n();
            }
        });
        this.f52606i.start();
    }

    public PkBountyIndicatorLightItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkBountyIndicatorLightItemView(@NonNull Context context) {
        this(context, null);
    }
}
