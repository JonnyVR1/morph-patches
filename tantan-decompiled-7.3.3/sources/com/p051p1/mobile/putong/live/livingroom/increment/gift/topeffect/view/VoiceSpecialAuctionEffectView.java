package com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.gt0;
import p153l.it0;
import p153l.ivf0;
import p153l.izs;
import p153l.qa00;
import p153l.tto0;
import p153l.xau;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceSpecialAuctionEffectView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceSpecialAuctionEffectView f50898d;

    /* JADX INFO: renamed from: e */
    public VImage f50899e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f50900f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f50901g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f50902h;

    /* JADX INFO: renamed from: i */
    public TextView f50903i;

    /* JADX INFO: renamed from: j */
    public TextView f50904j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f50905k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f50906l;

    /* JADX INFO: renamed from: m */
    public TextView f50907m;

    /* JADX INFO: renamed from: n */
    public VImage f50908n;

    /* JADX INFO: renamed from: o */
    public VImage f50909o;

    /* JADX INFO: renamed from: p */
    public TextView f50910p;

    /* JADX INFO: renamed from: q */
    public TextView f50911q;

    /* JADX INFO: renamed from: r */
    public VImage f50912r;

    /* JADX INFO: renamed from: s */
    public VImage f50913s;

    /* JADX INFO: renamed from: t */
    public TextView f50914t;

    /* JADX INFO: renamed from: u */
    public AnimEffectPlayer f50915u;

    /* JADX INFO: renamed from: v */
    public AnimatorSet f50916v;

    public VoiceSpecialAuctionEffectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m75315m0(View view) {
        tto0.m192674a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public void m75316n0() {
        it0.m142009C(this.f50916v);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m75317o0() {
        bnl0.m105524M(this.f50900f, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m75316n0();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75315m0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m75318p0() {
        bnl0.m105525M0(this.f50901g, true);
        bnl0.m105525M0(this.f50902h, true);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m75319q0() {
        this.f50915u.m69683j("https://auto.tancdn.com/v1/raw/c24979af-4b8a-4c03-80a3-d82e4e61377114.pdf", 1);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m75320r0() {
        bnl0.m105524M(this, true);
        this.f50900f.setScaleX(0.5f);
        this.f50900f.setScaleY(0.5f);
        bnl0.m105524M(this.f50900f, false);
        this.f50901g.setTranslationX(-qa00.m175859d(40.0f));
        this.f50902h.setTranslationX(qa00.m175859d(40.0f));
        bnl0.m105525M0(this.f50901g, false);
        bnl0.m105525M0(this.f50902h, false);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m75321s0() {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m75322t0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50899e, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        gt0.m132160f(objectAnimatorOfFloat, new Runnable() { // from class: l.oto0
            @Override // java.lang.Runnable
            public final void run() {
                this.f148996a.m75317o0();
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50900f, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(350L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat2.setStartDelay(150L);
        gt0.m132160f(objectAnimatorOfFloat2, new Runnable() { // from class: l.pto0
            @Override // java.lang.Runnable
            public final void run() {
                this.f154100a.m75318p0();
            }
        });
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f50900f, "scaleX", 0.5f, 1.0f);
        objectAnimatorOfFloat3.setDuration(500L);
        objectAnimatorOfFloat3.setStartDelay(150L);
        objectAnimatorOfFloat3.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f50900f, "scaleY", 0.5f, 1.0f);
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat4.setInterpolator(new OvershootInterpolator());
        objectAnimatorOfFloat4.setStartDelay(150L);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f50901g, "translationX", -qa00.m175859d(40.0f), 0.0f);
        objectAnimatorOfFloat5.setDuration(150L);
        objectAnimatorOfFloat5.setInterpolator(new OvershootInterpolator());
        objectAnimatorOfFloat5.setStartDelay(500L);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f50902h, "translationX", qa00.m175859d(40.0f), 0.0f);
        objectAnimatorOfFloat6.setDuration(150L);
        objectAnimatorOfFloat6.setInterpolator(new OvershootInterpolator());
        objectAnimatorOfFloat6.setStartDelay(500L);
        Animator animatorM132164j = gt0.m132164j(1000);
        Animator animatorM132164j2 = gt0.m132164j(3000);
        gt0.m132160f(animatorM132164j, new Runnable() { // from class: l.qto0
            @Override // java.lang.Runnable
            public final void run() {
                this.f159474a.m75319q0();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50916v = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6).before(animatorM132164j).before(animatorM132164j2);
        gt0.m132177w(this.f50916v, new Runnable() { // from class: l.rto0
            @Override // java.lang.Runnable
            public final void run() {
                this.f164844a.m75320r0();
            }
        }, new Runnable() { // from class: l.sto0
            @Override // java.lang.Runnable
            public final void run() {
                this.f170596a.m75321s0();
            }
        });
        this.f50916v.start();
    }

    /* JADX INFO: renamed from: u0 */
    public void m75323u0(ivf0 ivf0Var) {
        m75324v0(ivf0Var);
        m75322t0();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: v0 */
    public final void m75324v0(ivf0 ivf0Var) {
        izs.m142868s("context_livingAct", this.f50901g, ivf0Var.m142308a());
        izs.m142868s("context_livingAct", this.f50902h, ivf0Var.m142311d());
        this.f50903i.setText(xau.m209906p(ivf0Var.m142309b(), 4));
        this.f50904j.setText(xau.m209906p(ivf0Var.m142312e(), 4));
        izs.m142868s("context_livingAct", this.f50905k, ivf0Var.m142310c());
        izs.m142868s("context_livingAct", this.f50906l, ivf0Var.m142313f());
        this.f50910p.setText("恭喜" + xau.m209906p(ivf0Var.m142309b(), 4) + "与" + xau.m209906p(ivf0Var.m142312e(), 4) + "结成");
        this.f50911q.setText(ivf0Var.m142314g());
        this.f50914t.setText(ivf0Var.m142315h());
    }

    public VoiceSpecialAuctionEffectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSpecialAuctionEffectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
