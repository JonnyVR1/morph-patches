package com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.hxs;
import p149l.nqn0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceLiveHourTopBroadcastView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50044a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f50045b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f50046c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f50047d;

    /* JADX INFO: renamed from: e */
    public VText f50048e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f50049f;

    public VoiceLiveHourTopBroadcastView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m74121c(View view) {
        nqn0.m160650a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m74122d() {
        dt0.m113503C(this.f50049f);
        AnimEffectPlayer animEffectPlayer = this.f50046c;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f50046c.m68505o();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m74123e() {
        xdl0.m208344M(this, true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m74124f(d30 d30Var) {
        xdl0.m208344M(this, false);
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m74125g(String str, final d30 d30Var, long j) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        AnimEffectPlayer animEffectPlayer = this.f50046c;
        if (zIsEmpty) {
            animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/f2058928-21b2-4d80-9725-b137873a9da710.so", 2);
        } else {
            animEffectPlayer.m68500j(str, -1);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50045b, "translationY", -t100.m186890d(56.0f), t100.m186890d(59.0f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50044a, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f50045b, "translationY", t100.m186890d(59.0f), t100.m186890d(49.0f));
        objectAnimatorOfFloat3.setDuration(200L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f50044a, "alpha", 1.0f, 0.9f);
        objectAnimatorOfFloat4.setDuration(600L);
        objectAnimatorOfFloat4.setRepeatMode(2);
        objectAnimatorOfFloat4.setRepeatCount(((int) j) / 600);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f50045b, "translationY", t100.m186890d(49.0f), -t100.m186890d(105.0f));
        objectAnimatorOfFloat5.setDuration(600L);
        objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f50044a, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat6.setDuration(600L);
        objectAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50049f = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        this.f50049f.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat3);
        this.f50049f.play(objectAnimatorOfFloat2).before(objectAnimatorOfFloat4);
        this.f50049f.play(objectAnimatorOfFloat4).before(objectAnimatorOfFloat5);
        this.f50049f.play(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        bt0.m103750w(this.f50049f, new Runnable() { // from class: l.lqn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f129367a.m74123e();
            }
        }, new Runnable() { // from class: l.mqn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f135282a.m74124f(d30Var);
            }
        });
        this.f50049f.start();
    }

    /* JADX INFO: renamed from: h */
    public void m74126h(VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage, d30 d30Var) {
        hxs.m133406s("context_single_room", this.f50047d, voiceLiveHourLeaderboardTopEffectMessage.getAnchorImage());
        this.f50047d.setOnClickListener(null);
        this.f50048e.setText(voiceLiveHourLeaderboardTopEffectMessage.getTitle());
        this.f50048e.setTextColor(Color.parseColor(voiceLiveHourLeaderboardTopEffectMessage.getTitleColor()));
        VDraweeView vDraweeView = this.f50044a;
        hxs.m133408u("context_single_room", vDraweeView, "https://auto.tancdn.com/v1/raw/f9911d44-74c0-4d30-b518-03f4ff09198813.webp", vDraweeView.getWidth(), this.f50044a.getHeight());
        m74125g("https://auto.tancdn.com/v1/raw/2680822e-9a16-4999-b545-7e4d7370665411.pdf", d30Var, voiceLiveHourLeaderboardTopEffectMessage.getDuration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m74122d();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74121c(this);
    }

    public VoiceLiveHourTopBroadcastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveHourTopBroadcastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
