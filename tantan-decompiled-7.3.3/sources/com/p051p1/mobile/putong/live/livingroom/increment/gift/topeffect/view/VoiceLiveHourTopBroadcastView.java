package com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.qa00;
import p153l.rzn0;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceLiveHourTopBroadcastView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50892a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f50893b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f50894c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f50895d;

    /* JADX INFO: renamed from: e */
    public VText f50896e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f50897f;

    public VoiceLiveHourTopBroadcastView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m75304c(View view) {
        rzn0.m183803a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m75305d() {
        it0.m142009C(this.f50897f);
        AnimEffectPlayer animEffectPlayer = this.f50894c;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f50894c.m69688o();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m75306e() {
        bnl0.m105524M(this, true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m75307f(x20 x20Var) {
        bnl0.m105524M(this, false);
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m75308g(String str, final x20 x20Var, long j) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        AnimEffectPlayer animEffectPlayer = this.f50894c;
        if (zIsEmpty) {
            animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/f2058928-21b2-4d80-9725-b137873a9da710.so", 2);
        } else {
            animEffectPlayer.m69683j(str, -1);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50893b, "translationY", -qa00.m175859d(56.0f), qa00.m175859d(59.0f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50892a, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f50893b, "translationY", qa00.m175859d(59.0f), qa00.m175859d(49.0f));
        objectAnimatorOfFloat3.setDuration(200L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f50892a, "alpha", 1.0f, 0.9f);
        objectAnimatorOfFloat4.setDuration(600L);
        objectAnimatorOfFloat4.setRepeatMode(2);
        objectAnimatorOfFloat4.setRepeatCount(((int) j) / 600);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f50893b, "translationY", qa00.m175859d(49.0f), -qa00.m175859d(105.0f));
        objectAnimatorOfFloat5.setDuration(600L);
        objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f50892a, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat6.setDuration(600L);
        objectAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50897f = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        this.f50897f.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat3);
        this.f50897f.play(objectAnimatorOfFloat2).before(objectAnimatorOfFloat4);
        this.f50897f.play(objectAnimatorOfFloat4).before(objectAnimatorOfFloat5);
        this.f50897f.play(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        gt0.m132177w(this.f50897f, new Runnable() { // from class: l.pzn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f154941a.m75306e();
            }
        }, new Runnable() { // from class: l.qzn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f160283a.m75307f(x20Var);
            }
        });
        this.f50897f.start();
    }

    /* JADX INFO: renamed from: h */
    public void m75309h(VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage, x20 x20Var) {
        izs.m142868s("context_single_room", this.f50895d, voiceLiveHourLeaderboardTopEffectMessage.getAnchorImage());
        this.f50895d.setOnClickListener(null);
        this.f50896e.setText(voiceLiveHourLeaderboardTopEffectMessage.getTitle());
        this.f50896e.setTextColor(Color.parseColor(voiceLiveHourLeaderboardTopEffectMessage.getTitleColor()));
        VDraweeView vDraweeView = this.f50892a;
        izs.m142870u("context_single_room", vDraweeView, "https://auto.tancdn.com/v1/raw/f9911d44-74c0-4d30-b518-03f4ff09198813.webp", vDraweeView.getWidth(), this.f50892a.getHeight());
        m75308g("https://auto.tancdn.com/v1/raw/2680822e-9a16-4999-b545-7e4d7370665411.pdf", x20Var, voiceLiveHourLeaderboardTopEffectMessage.getDuration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m75305d();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75304c(this);
    }

    public VoiceLiveHourTopBroadcastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveHourTopBroadcastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
