package com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.bt0;
import l.d30;
import l.dt0;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.nqn0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VoiceLiveHourTopBroadcastView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6086a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f6087b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f6088c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f6089d;

    /* JADX INFO: renamed from: e */
    public VText f6090e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f6091f;

    public VoiceLiveHourTopBroadcastView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m7686c(View view) {
        nqn0.m18975a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m7687d() {
        dt0.C(this.f6091f);
        AnimEffectPlayer animEffectPlayer = this.f6088c;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f6088c.o();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m7688e() {
        xdl0.M(this, true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m7689f(d30 d30Var) {
        xdl0.M(this, false);
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m7690g(String str, final d30 d30Var, long j) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        AnimEffectPlayer animEffectPlayer = this.f6088c;
        if (zIsEmpty) {
            animEffectPlayer.j("https://auto.tancdn.com/v1/raw/f2058928-21b2-4d80-9725-b137873a9da710.so", 2);
        } else {
            animEffectPlayer.j(str, -1);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6087b, "translationY", -t100.d(56.0f), t100.d(59.0f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6086a, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f6087b, "translationY", t100.d(59.0f), t100.d(49.0f));
        objectAnimatorOfFloat3.setDuration(200L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f6086a, "alpha", 1.0f, 0.9f);
        objectAnimatorOfFloat4.setDuration(600L);
        objectAnimatorOfFloat4.setRepeatMode(2);
        objectAnimatorOfFloat4.setRepeatCount(((int) j) / 600);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f6087b, "translationY", t100.d(49.0f), -t100.d(105.0f));
        objectAnimatorOfFloat5.setDuration(600L);
        objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f6086a, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat6.setDuration(600L);
        objectAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6091f = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        this.f6091f.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat3);
        this.f6091f.play(objectAnimatorOfFloat2).before(objectAnimatorOfFloat4);
        this.f6091f.play(objectAnimatorOfFloat4).before(objectAnimatorOfFloat5);
        this.f6091f.play(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        bt0.w(this.f6091f, new Runnable() { // from class: l.lqn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15005a.m7688e();
            }
        }, new Runnable() { // from class: l.mqn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15597a.m7689f(d30Var);
            }
        });
        this.f6091f.start();
    }

    /* JADX INFO: renamed from: h */
    public void m7691h(VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage, d30 d30Var) {
        hxs.s("context_single_room", this.f6089d, voiceLiveHourLeaderboardTopEffectMessage.getAnchorImage());
        this.f6089d.setOnClickListener(null);
        this.f6090e.setText(voiceLiveHourLeaderboardTopEffectMessage.getTitle());
        this.f6090e.setTextColor(Color.parseColor(voiceLiveHourLeaderboardTopEffectMessage.getTitleColor()));
        VDraweeView vDraweeView = this.f6086a;
        hxs.u("context_single_room", vDraweeView, "https://auto.tancdn.com/v1/raw/f9911d44-74c0-4d30-b518-03f4ff09198813.webp", vDraweeView.getWidth(), this.f6086a.getHeight());
        m7690g("https://auto.tancdn.com/v1/raw/2680822e-9a16-4999-b545-7e4d7370665411.pdf", d30Var, voiceLiveHourLeaderboardTopEffectMessage.getDuration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m7687d();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7686c(this);
    }

    public VoiceLiveHourTopBroadcastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveHourTopBroadcastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
