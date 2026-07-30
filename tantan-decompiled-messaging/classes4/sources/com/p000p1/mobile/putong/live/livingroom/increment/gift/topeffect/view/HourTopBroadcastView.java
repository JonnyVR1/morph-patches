package com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantanapp.common.utils.CrashHelper;
import l.bt0;
import l.d30;
import l.dt0;
import l.hxs;
import l.ipn;
import l.t100;
import l.vdt;
import l.xdl0;
import l.ym2;
import l.ypv;
import p002l.gjl;
import p002l.i3c0;
import p002l.mvi0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class HourTopBroadcastView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6012a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f6013b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f6014c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f6015d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6016e;

    /* JADX INFO: renamed from: f */
    public VText f6017f;

    /* JADX INFO: renamed from: g */
    public VText f6018g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f6019h;

    public HourTopBroadcastView(Context context) {
        super(context);
    }

    private Drawable getDefaultDrawable() {
        return getContext().getResources().getDrawable(i3c0.f12604P2);
    }

    /* JADX INFO: renamed from: d */
    public final void m7584d(View view) {
        gjl.m13865a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m7585e() {
        dt0.C(this.f6019h);
    }

    /* JADX INFO: renamed from: f */
    public final int[] m7586f(LongLinkSocketMessage.TopEffect topEffect) {
        int color;
        int color2;
        try {
            color = Color.parseColor("#" + topEffect.getStartBackendColor());
            color2 = Color.parseColor("#" + topEffect.getEndBackendColor());
        } catch (Exception e) {
            CrashHelper.c(e);
            color = Color.parseColor("#ff5ba1");
            color2 = Color.parseColor("#ff83c9");
        }
        return new int[]{color, color2};
    }

    /* JADX INFO: renamed from: g */
    public final GradientDrawable m7587g(LongLinkSocketMessage.TopEffect topEffect) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.d(24.0f));
        gradientDrawable.setColors(m7586f(topEffect));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: h */
    public boolean m7588h() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m7589i() {
        xdl0.M(this, true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m7590j(d30 d30Var) {
        xdl0.M(this, false);
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m7591k(String str, final d30 d30Var, long j) {
        if (TextUtils.isEmpty(str)) {
            this.f6015d.j("https://auto.tancdn.com/v1/raw/f2058928-21b2-4d80-9725-b137873a9da710.so", 2);
        } else {
            this.f6014c.setImageDrawable((Drawable) null);
            this.f6015d.j(str, -1);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6013b, "translationY", -t100.d(56.0f), t100.d(59.0f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6012a, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f6013b, "translationY", t100.d(59.0f), t100.d(49.0f));
        objectAnimatorOfFloat3.setDuration(200L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f6012a, "alpha", 1.0f, 0.9f);
        objectAnimatorOfFloat4.setDuration(600L);
        objectAnimatorOfFloat4.setRepeatMode(2);
        objectAnimatorOfFloat4.setRepeatCount(((int) j) / 600);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f6013b, "translationY", t100.d(49.0f), -t100.d(105.0f));
        objectAnimatorOfFloat5.setDuration(600L);
        objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f6012a, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat6.setDuration(600L);
        objectAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6019h = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        this.f6019h.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat3);
        this.f6019h.play(objectAnimatorOfFloat2).before(objectAnimatorOfFloat4);
        this.f6019h.play(objectAnimatorOfFloat4).before(objectAnimatorOfFloat5);
        this.f6019h.play(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        bt0.w(this.f6019h, new Runnable() { // from class: l.ejl
            @Override // java.lang.Runnable
            public final void run() {
                this.f9826a.m7589i();
            }
        }, new Runnable() { // from class: l.fjl
            @Override // java.lang.Runnable
            public final void run() {
                this.f10427a.m7590j(d30Var);
            }
        });
        this.f6019h.start();
    }

    /* JADX INFO: renamed from: l */
    public void m7592l(LongLinkGiftMessage.LiveRanking liveRanking, d30 d30Var) {
        hxs.s("context_single_room", this.f6016e, liveRanking.getUserImage());
        this.f6017f.setText(liveRanking.getUserName());
        this.f6018g.setText(ypv.e.getString(R$string.f3535r6, Long.valueOf(liveRanking.getRank())));
        this.f6018g.setTextColor(-218);
        this.f6014c.setImageDrawable((Drawable) null);
        this.f6014c.setBackground(getDefaultDrawable());
        VDraweeView vDraweeView = this.f6012a;
        hxs.u("context_single_room", vDraweeView, "https://auto.tancdn.com/v1/raw/f9911d44-74c0-4d30-b518-03f4ff09198813.webp", vDraweeView.getWidth(), this.f6012a.getHeight());
        m7591k("https://auto.tancdn.com/v1/raw/e0f94e81-0276-45b7-b69e-fc0f97fc069b10.pdf", d30Var, 1400L);
    }

    /* JADX INFO: renamed from: m */
    public void m7593m(LongLinkSocketMessage.TopEffect topEffect, d30 d30Var) {
        hxs.s("context_single_room", this.f6016e, topEffect.getAvatarUrl());
        this.f6017f.setText(topEffect.getUserName());
        this.f6018g.setText(topEffect.getContent());
        boolean zIsEmpty = TextUtils.isEmpty(topEffect.getSubtitleColor());
        VText vText = this.f6018g;
        if (zIsEmpty) {
            vText.setTextColor(-8935);
        } else {
            vText.setTextColor(Color.parseColor(topEffect.getSubtitleColor()));
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(topEffect.getBackgroundSVGAUrl());
        VDraweeView vDraweeView = this.f6012a;
        if (zIsEmpty2) {
            vDraweeView.setImageResource(i3c0.f12574M7);
        } else {
            hxs.s("context_single_room", vDraweeView, topEffect.getEffectBackgroundUrl());
        }
        long duration = topEffect.getDuration();
        boolean zIsEmpty3 = TextUtils.isEmpty(topEffect.getBackgroundUrl());
        VDraweeView vDraweeView2 = this.f6014c;
        if (zIsEmpty3) {
            vDraweeView2.setImageResource(i3c0.f12947s8);
            this.f6014c.setBackground(m7587g(topEffect));
        } else {
            vDraweeView2.setImageResource(i3c0.f12947s8);
            hxs.v("context_single_room", this.f6014c, topEffect.getBackgroundUrl(), t100.d(180.0f), t100.d(56.0f), false, false, ipn.a(), (ym2) null);
        }
        String backgroundSVGAUrl = topEffect.getBackgroundSVGAUrl();
        if (duration == 0) {
            duration = 1400;
        }
        m7591k(backgroundSVGAUrl, d30Var, duration);
    }

    /* JADX INFO: renamed from: n */
    public void m7594n(final mvi0 mvi0Var, final LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage) {
        hxs.s("context_single_room", this.f6016e, voiceLiveTopEffectMessage.getAvatarUrl());
        this.f6017f.setText(voiceLiveTopEffectMessage.getTitle());
        this.f6017f.setTextColor(Color.parseColor(voiceLiveTopEffectMessage.getTitleColor()));
        this.f6018g.setText(voiceLiveTopEffectMessage.getContent());
        this.f6018g.setTextColor(Color.parseColor(voiceLiveTopEffectMessage.getContentColor()));
        long duration = voiceLiveTopEffectMessage.getDuration();
        if (!TextUtils.isEmpty(voiceLiveTopEffectMessage.getBackgroundUrl())) {
            this.f6014c.setImageResource(i3c0.f12947s8);
            hxs.v("context_single_room", this.f6014c, voiceLiveTopEffectMessage.getBackgroundUrl(), t100.d(180.0f), t100.d(56.0f), false, false, !vdt.b(2), (ym2) null);
        }
        xdl0.E0(this.f6014c, new View.OnClickListener() { // from class: l.djl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mvi0Var.m18237l4(voiceLiveTopEffectMessage.getSchema());
            }
        });
        if (duration == 0) {
            duration = 1400;
        }
        m7591k(null, null, duration);
    }

    /* JADX INFO: renamed from: o */
    public void m7595o(String str, String str2, String str3, d30 d30Var) {
        hxs.s("context_single_room", this.f6016e, str);
        this.f6017f.setText(str2);
        this.f6018g.setText(str3);
        this.f6014c.setImageDrawable((Drawable) null);
        this.f6014c.setBackground(getDefaultDrawable());
        m7591k(null, d30Var, 1400L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m7585e();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7584d(this);
    }

    public HourTopBroadcastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HourTopBroadcastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
