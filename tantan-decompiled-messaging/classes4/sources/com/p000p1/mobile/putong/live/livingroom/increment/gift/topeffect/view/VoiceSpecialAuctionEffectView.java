package com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

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
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.bt0;
import l.dt0;
import l.hxs;
import l.t100;
import l.w8u;
import l.xdl0;
import l.zmf0;
import p002l.pko0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VoiceSpecialAuctionEffectView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceSpecialAuctionEffectView f6092d;

    /* JADX INFO: renamed from: e */
    public VImage f6093e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f6094f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f6095g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f6096h;

    /* JADX INFO: renamed from: i */
    public TextView f6097i;

    /* JADX INFO: renamed from: j */
    public TextView f6098j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f6099k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f6100l;

    /* JADX INFO: renamed from: m */
    public TextView f6101m;

    /* JADX INFO: renamed from: n */
    public VImage f6102n;

    /* JADX INFO: renamed from: o */
    public VImage f6103o;

    /* JADX INFO: renamed from: p */
    public TextView f6104p;

    /* JADX INFO: renamed from: q */
    public TextView f6105q;

    /* JADX INFO: renamed from: r */
    public VImage f6106r;

    /* JADX INFO: renamed from: s */
    public VImage f6107s;

    /* JADX INFO: renamed from: t */
    public TextView f6108t;

    /* JADX INFO: renamed from: u */
    public AnimEffectPlayer f6109u;

    /* JADX INFO: renamed from: v */
    public AnimatorSet f6110v;

    public VoiceSpecialAuctionEffectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m7697m0(View view) {
        pko0.m20382a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public void m7698n0() {
        dt0.C(this.f6110v);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m7699o0() {
        xdl0.M(this.f6094f, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        m7698n0();
        super/*android.view.View*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7697m0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m7700p0() {
        xdl0.M0(this.f6095g, true);
        xdl0.M0(this.f6096h, true);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m7701q0() {
        this.f6109u.j("https://auto.tancdn.com/v1/raw/c24979af-4b8a-4c03-80a3-d82e4e61377114.pdf", 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m7702r0() {
        xdl0.M(this, true);
        this.f6094f.setScaleX(0.5f);
        this.f6094f.setScaleY(0.5f);
        xdl0.M(this.f6094f, false);
        this.f6095g.setTranslationX(-t100.d(40.0f));
        this.f6096h.setTranslationX(t100.d(40.0f));
        xdl0.M0(this.f6095g, false);
        xdl0.M0(this.f6096h, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m7703s0() {
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m7704t0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6093e, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        bt0.f(objectAnimatorOfFloat, new Runnable() { // from class: l.kko0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14367a.m7699o0();
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6094f, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(350L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat2.setStartDelay(150L);
        bt0.f(objectAnimatorOfFloat2, new Runnable() { // from class: l.lko0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14916a.m7700p0();
            }
        });
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f6094f, "scaleX", 0.5f, 1.0f);
        objectAnimatorOfFloat3.setDuration(500L);
        objectAnimatorOfFloat3.setStartDelay(150L);
        objectAnimatorOfFloat3.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f6094f, "scaleY", 0.5f, 1.0f);
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat4.setInterpolator(new OvershootInterpolator());
        objectAnimatorOfFloat4.setStartDelay(150L);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f6095g, "translationX", -t100.d(40.0f), 0.0f);
        objectAnimatorOfFloat5.setDuration(150L);
        objectAnimatorOfFloat5.setInterpolator(new OvershootInterpolator());
        objectAnimatorOfFloat5.setStartDelay(500L);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f6096h, "translationX", t100.d(40.0f), 0.0f);
        objectAnimatorOfFloat6.setDuration(150L);
        objectAnimatorOfFloat6.setInterpolator(new OvershootInterpolator());
        objectAnimatorOfFloat6.setStartDelay(500L);
        Animator animatorJ = bt0.j(1000);
        Animator animatorJ2 = bt0.j(3000);
        bt0.f(animatorJ, new Runnable() { // from class: l.mko0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15433a.m7701q0();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6110v = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6).before(animatorJ).before(animatorJ2);
        bt0.w(this.f6110v, new Runnable() { // from class: l.nko0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16091a.m7702r0();
            }
        }, new Runnable() { // from class: l.oko0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16685a.m7703s0();
            }
        });
        this.f6110v.start();
    }

    /* JADX INFO: renamed from: u0 */
    public void m7705u0(zmf0 zmf0Var) {
        m7706v0(zmf0Var);
        m7704t0();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: v0 */
    public final void m7706v0(zmf0 zmf0Var) {
        hxs.s("context_livingAct", this.f6095g, zmf0Var.a());
        hxs.s("context_livingAct", this.f6096h, zmf0Var.d());
        this.f6097i.setText(w8u.p(zmf0Var.b(), 4));
        this.f6098j.setText(w8u.p(zmf0Var.e(), 4));
        hxs.s("context_livingAct", this.f6099k, zmf0Var.c());
        hxs.s("context_livingAct", this.f6100l, zmf0Var.f());
        this.f6104p.setText("恭喜" + w8u.p(zmf0Var.b(), 4) + "与" + w8u.p(zmf0Var.e(), 4) + "结成");
        this.f6105q.setText(zmf0Var.g());
        this.f6108t.setText(zmf0Var.h());
    }

    public VoiceSpecialAuctionEffectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSpecialAuctionEffectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
