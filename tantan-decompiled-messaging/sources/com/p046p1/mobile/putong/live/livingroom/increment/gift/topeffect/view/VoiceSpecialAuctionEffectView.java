package com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

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
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.bt0;
import p149l.dt0;
import p149l.hxs;
import p149l.pko0;
import p149l.t100;
import p149l.w8u;
import p149l.xdl0;
import p149l.zmf0;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceSpecialAuctionEffectView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceSpecialAuctionEffectView f50050d;

    /* JADX INFO: renamed from: e */
    public VImage f50051e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f50052f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f50053g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f50054h;

    /* JADX INFO: renamed from: i */
    public TextView f50055i;

    /* JADX INFO: renamed from: j */
    public TextView f50056j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f50057k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f50058l;

    /* JADX INFO: renamed from: m */
    public TextView f50059m;

    /* JADX INFO: renamed from: n */
    public VImage f50060n;

    /* JADX INFO: renamed from: o */
    public VImage f50061o;

    /* JADX INFO: renamed from: p */
    public TextView f50062p;

    /* JADX INFO: renamed from: q */
    public TextView f50063q;

    /* JADX INFO: renamed from: r */
    public VImage f50064r;

    /* JADX INFO: renamed from: s */
    public VImage f50065s;

    /* JADX INFO: renamed from: t */
    public TextView f50066t;

    /* JADX INFO: renamed from: u */
    public AnimEffectPlayer f50067u;

    /* JADX INFO: renamed from: v */
    public AnimatorSet f50068v;

    public VoiceSpecialAuctionEffectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m74132m0(View view) {
        pko0.m170052a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public void m74133n0() {
        dt0.m113503C(this.f50068v);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m74134o0() {
        xdl0.m208344M(this.f50052f, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m74133n0();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74132m0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m74135p0() {
        xdl0.m208345M0(this.f50053g, true);
        xdl0.m208345M0(this.f50054h, true);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m74136q0() {
        this.f50067u.m68500j("https://auto.tancdn.com/v1/raw/c24979af-4b8a-4c03-80a3-d82e4e61377114.pdf", 1);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m74137r0() {
        xdl0.m208344M(this, true);
        this.f50052f.setScaleX(0.5f);
        this.f50052f.setScaleY(0.5f);
        xdl0.m208344M(this.f50052f, false);
        this.f50053g.setTranslationX(-t100.m186890d(40.0f));
        this.f50054h.setTranslationX(t100.m186890d(40.0f));
        xdl0.m208345M0(this.f50053g, false);
        xdl0.m208345M0(this.f50054h, false);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m74138s0() {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m74139t0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50051e, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        bt0.m103733f(objectAnimatorOfFloat, new Runnable() { // from class: l.kko0
            @Override // java.lang.Runnable
            public final void run() {
                this.f123580a.m74134o0();
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50052f, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(350L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat2.setStartDelay(150L);
        bt0.m103733f(objectAnimatorOfFloat2, new Runnable() { // from class: l.lko0
            @Override // java.lang.Runnable
            public final void run() {
                this.f128595a.m74135p0();
            }
        });
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f50052f, "scaleX", 0.5f, 1.0f);
        objectAnimatorOfFloat3.setDuration(500L);
        objectAnimatorOfFloat3.setStartDelay(150L);
        objectAnimatorOfFloat3.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f50052f, "scaleY", 0.5f, 1.0f);
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat4.setInterpolator(new OvershootInterpolator());
        objectAnimatorOfFloat4.setStartDelay(150L);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f50053g, "translationX", -t100.m186890d(40.0f), 0.0f);
        objectAnimatorOfFloat5.setDuration(150L);
        objectAnimatorOfFloat5.setInterpolator(new OvershootInterpolator());
        objectAnimatorOfFloat5.setStartDelay(500L);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f50054h, "translationX", t100.m186890d(40.0f), 0.0f);
        objectAnimatorOfFloat6.setDuration(150L);
        objectAnimatorOfFloat6.setInterpolator(new OvershootInterpolator());
        objectAnimatorOfFloat6.setStartDelay(500L);
        Animator animatorM103737j = bt0.m103737j(1000);
        Animator animatorM103737j2 = bt0.m103737j(3000);
        bt0.m103733f(animatorM103737j, new Runnable() { // from class: l.mko0
            @Override // java.lang.Runnable
            public final void run() {
                this.f134364a.m74136q0();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50068v = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6).before(animatorM103737j).before(animatorM103737j2);
        bt0.m103750w(this.f50068v, new Runnable() { // from class: l.nko0
            @Override // java.lang.Runnable
            public final void run() {
                this.f139454a.m74137r0();
            }
        }, new Runnable() { // from class: l.oko0
            @Override // java.lang.Runnable
            public final void run() {
                this.f144454a.m74138s0();
            }
        });
        this.f50068v.start();
    }

    /* JADX INFO: renamed from: u0 */
    public void m74140u0(zmf0 zmf0Var) {
        m74141v0(zmf0Var);
        m74139t0();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: v0 */
    public final void m74141v0(zmf0 zmf0Var) {
        hxs.m133406s("context_livingAct", this.f50053g, zmf0Var.m219326a());
        hxs.m133406s("context_livingAct", this.f50054h, zmf0Var.m219329d());
        this.f50055i.setText(w8u.m202213p(zmf0Var.m219327b(), 4));
        this.f50056j.setText(w8u.m202213p(zmf0Var.m219330e(), 4));
        hxs.m133406s("context_livingAct", this.f50057k, zmf0Var.m219328c());
        hxs.m133406s("context_livingAct", this.f50058l, zmf0Var.m219331f());
        this.f50062p.setText("恭喜" + w8u.m202213p(zmf0Var.m219327b(), 4) + "与" + w8u.m202213p(zmf0Var.m219330e(), 4) + "结成");
        this.f50063q.setText(zmf0Var.m219332g());
        this.f50066t.setText(zmf0Var.m219333h());
    }

    public VoiceSpecialAuctionEffectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSpecialAuctionEffectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
