package com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.ljk0;
import p153l.obc0;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class UserUpgradeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f50881a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f50882b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f50883c;

    /* JADX INFO: renamed from: d */
    public VText f50884d;

    /* JADX INFO: renamed from: e */
    public VText f50885e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f50886f;

    /* JADX INFO: renamed from: g */
    public VImage f50887g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f50888h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f50889i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f50890j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f50891k;

    public UserUpgradeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m75294c(View view) {
        ljk0.m154511a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m75295d() {
        it0.m142009C(this.f50891k);
    }

    /* JADX INFO: renamed from: e */
    public boolean m75296e() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m75297f() {
        bnl0.m105524M(this, true);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m75298g(x20 x20Var) {
        bnl0.m105524M(this, false);
        x20Var.call();
    }

    /* JADX INFO: renamed from: h */
    public final void m75299h(final x20 x20Var) {
        this.f50890j.m69683j("https://auto.tancdn.com/v1/raw/64673fea-4f02-4f5e-9ef6-96f6de4c4d0d11.so", 1);
        this.f50889i.m69683j("https://auto.tancdn.com/v1/raw/4f9fe897-56cc-4fa8-86c4-f8aa02e2fd0011.so", -1);
        this.f50883c.m69683j("https://auto.tancdn.com/v1/raw/77cbc051-9a53-4a89-81c0-40c8f6fc7b1e11.so", -1);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50882b, "translationY", -qa00.m175859d(136.0f), 0.0f);
        objectAnimatorOfFloat.setDuration(650L);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50882b, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(650L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f50881a, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(650L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f50882b, "translationX", 1.0f, 0.9f, 1.2f, 1.0f);
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat4.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f50882b, "translationY", 1.0f, 0.9f, 1.2f, 1.0f);
        objectAnimatorOfFloat5.setDuration(500L);
        objectAnimatorOfFloat5.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f50882b, "translationY", 0.0f, (float) (((double) qa00.m175859d(136.0f)) * (-0.1d)), -qa00.m175859d(136.0f));
        objectAnimatorOfFloat6.setDuration(500L);
        objectAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat6.setStartDelay(2350L);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f50882b, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat7.setDuration(500L);
        objectAnimatorOfFloat7.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat7.setStartDelay(2350L);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f50881a, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat8.setDuration(500L);
        objectAnimatorOfFloat8.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat8.setStartDelay(2350L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50891k = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        this.f50891k.play(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5);
        this.f50891k.play(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8);
        this.f50891k.play(objectAnimatorOfFloat4).after(objectAnimatorOfFloat);
        this.f50891k.play(objectAnimatorOfFloat6).after(objectAnimatorOfFloat5);
        gt0.m132177w(this.f50891k, new Runnable() { // from class: l.jjk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f121192a.m75297f();
            }
        }, new Runnable() { // from class: l.kjk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f127106a.m75298g(x20Var);
            }
        });
        this.f50891k.start();
    }

    /* JADX INFO: renamed from: i */
    public void m75300i(BLiveUserUpgrade bLiveUserUpgrade, x20 x20Var) {
        m75301j(bLiveUserUpgrade);
        m75299h(x20Var);
    }

    /* JADX INFO: renamed from: j */
    public void m75301j(BLiveUserUpgrade bLiveUserUpgrade) {
        this.f50884d.setText(bLiveUserUpgrade.userName);
        izs.m142869t("context_livingAct", this.f50888h, bLiveUserUpgrade.avatarUrl, qa00.f156337x);
        BLiveUserLevel bLiveUserLevel = bLiveUserUpgrade.liveUserLevel;
        if (bLiveUserLevel != null) {
            izs.m142868s("context_livingAct", this.f50886f, bLiveUserLevel.backendUrl);
        }
        this.f50885e.setText(R$string.f47644Kj);
        this.f50887g.setImageResource(obc0.f145974A8);
        this.f50883c.setBackground(getContext().getResources().getDrawable(obc0.f145986B8));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m75295d();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75294c(this);
    }

    public UserUpgradeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserUpgradeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
