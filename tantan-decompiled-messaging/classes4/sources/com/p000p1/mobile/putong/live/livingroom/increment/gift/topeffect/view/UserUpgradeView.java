package com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.bt0;
import l.d30;
import l.dt0;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.fak0;
import p002l.i3c0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UserUpgradeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f6075a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f6076b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f6077c;

    /* JADX INFO: renamed from: d */
    public VText f6078d;

    /* JADX INFO: renamed from: e */
    public VText f6079e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f6080f;

    /* JADX INFO: renamed from: g */
    public VImage f6081g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f6082h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f6083i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f6084j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f6085k;

    public UserUpgradeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m7676c(View view) {
        fak0.m13038a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m7677d() {
        dt0.C(this.f6085k);
    }

    /* JADX INFO: renamed from: e */
    public boolean m7678e() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m7679f() {
        xdl0.M(this, true);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m7680g(d30 d30Var) {
        xdl0.M(this, false);
        d30Var.call();
    }

    /* JADX INFO: renamed from: h */
    public final void m7681h(final d30 d30Var) {
        this.f6084j.j("https://auto.tancdn.com/v1/raw/64673fea-4f02-4f5e-9ef6-96f6de4c4d0d11.so", 1);
        this.f6083i.j("https://auto.tancdn.com/v1/raw/4f9fe897-56cc-4fa8-86c4-f8aa02e2fd0011.so", -1);
        this.f6077c.j("https://auto.tancdn.com/v1/raw/77cbc051-9a53-4a89-81c0-40c8f6fc7b1e11.so", -1);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6076b, "translationY", -t100.d(136.0f), 0.0f);
        objectAnimatorOfFloat.setDuration(650L);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6076b, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(650L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f6075a, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(650L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f6076b, "translationX", 1.0f, 0.9f, 1.2f, 1.0f);
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat4.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f6076b, "translationY", 1.0f, 0.9f, 1.2f, 1.0f);
        objectAnimatorOfFloat5.setDuration(500L);
        objectAnimatorOfFloat5.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f6076b, "translationY", 0.0f, (float) (((double) t100.d(136.0f)) * (-0.1d)), -t100.d(136.0f));
        objectAnimatorOfFloat6.setDuration(500L);
        objectAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat6.setStartDelay(2350L);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f6076b, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat7.setDuration(500L);
        objectAnimatorOfFloat7.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat7.setStartDelay(2350L);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f6075a, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat8.setDuration(500L);
        objectAnimatorOfFloat8.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat8.setStartDelay(2350L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6085k = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        this.f6085k.play(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5);
        this.f6085k.play(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8);
        this.f6085k.play(objectAnimatorOfFloat4).after(objectAnimatorOfFloat);
        this.f6085k.play(objectAnimatorOfFloat6).after(objectAnimatorOfFloat5);
        bt0.w(this.f6085k, new Runnable() { // from class: l.dak0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9147a.m7679f();
            }
        }, new Runnable() { // from class: l.eak0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9651a.m7680g(d30Var);
            }
        });
        this.f6085k.start();
    }

    /* JADX INFO: renamed from: i */
    public void m7682i(BLiveUserUpgrade bLiveUserUpgrade, d30 d30Var) {
        m7683j(bLiveUserUpgrade);
        m7681h(d30Var);
    }

    /* JADX INFO: renamed from: j */
    public void m7683j(BLiveUserUpgrade bLiveUserUpgrade) {
        this.f6078d.setText(bLiveUserUpgrade.userName);
        hxs.t("context_livingAct", this.f6082h, bLiveUserUpgrade.avatarUrl, t100.x);
        BLiveUserLevel bLiveUserLevel = bLiveUserUpgrade.liveUserLevel;
        if (bLiveUserLevel != null) {
            hxs.s("context_livingAct", this.f6080f, bLiveUserLevel.backendUrl);
        }
        this.f6079e.setText(R$string.f2838Kj);
        this.f6081g.setImageResource(i3c0.f12431A8);
        this.f6077c.setBackground(getContext().getResources().getDrawable(i3c0.f12443B8));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m7677d();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7676c(this);
    }

    public UserUpgradeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserUpgradeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
