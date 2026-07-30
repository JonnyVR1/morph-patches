package com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

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
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.CrashHelper;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.gjl;
import p149l.hxs;
import p149l.i3c0;
import p149l.ipn;
import p149l.mvi0;
import p149l.t100;
import p149l.vdt;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class HourTopBroadcastView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49970a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f49971b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49972c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f49973d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49974e;

    /* JADX INFO: renamed from: f */
    public VText f49975f;

    /* JADX INFO: renamed from: g */
    public VText f49976g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f49977h;

    public HourTopBroadcastView(Context context) {
        super(context);
    }

    private Drawable getDefaultDrawable() {
        return getContext().getResources().getDrawable(i3c0.f110819P2);
    }

    /* JADX INFO: renamed from: d */
    public final void m74023d(View view) {
        gjl.m126547a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m74024e() {
        dt0.m113503C(this.f49977h);
    }

    /* JADX INFO: renamed from: f */
    public final int[] m74025f(LongLinkSocketMessage.TopEffect topEffect) {
        int color;
        int color2;
        try {
            color = Color.parseColor("#" + topEffect.getStartBackendColor());
            color2 = Color.parseColor("#" + topEffect.getEndBackendColor());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            color = Color.parseColor("#ff5ba1");
            color2 = Color.parseColor("#ff83c9");
        }
        return new int[]{color, color2};
    }

    /* JADX INFO: renamed from: g */
    public final GradientDrawable m74026g(LongLinkSocketMessage.TopEffect topEffect) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.m186890d(24.0f));
        gradientDrawable.setColors(m74025f(topEffect));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: h */
    public boolean m74027h() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m74028i() {
        xdl0.m208344M(this, true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m74029j(d30 d30Var) {
        xdl0.m208344M(this, false);
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m74030k(String str, final d30 d30Var, long j) {
        if (TextUtils.isEmpty(str)) {
            this.f49973d.m68500j("https://auto.tancdn.com/v1/raw/f2058928-21b2-4d80-9725-b137873a9da710.so", 2);
        } else {
            this.f49972c.setImageDrawable(null);
            this.f49973d.m68500j(str, -1);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49971b, "translationY", -t100.m186890d(56.0f), t100.m186890d(59.0f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f49970a, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f49971b, "translationY", t100.m186890d(59.0f), t100.m186890d(49.0f));
        objectAnimatorOfFloat3.setDuration(200L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f49970a, "alpha", 1.0f, 0.9f);
        objectAnimatorOfFloat4.setDuration(600L);
        objectAnimatorOfFloat4.setRepeatMode(2);
        objectAnimatorOfFloat4.setRepeatCount(((int) j) / 600);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f49971b, "translationY", t100.m186890d(49.0f), -t100.m186890d(105.0f));
        objectAnimatorOfFloat5.setDuration(600L);
        objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f49970a, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat6.setDuration(600L);
        objectAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f49977h = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        this.f49977h.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat3);
        this.f49977h.play(objectAnimatorOfFloat2).before(objectAnimatorOfFloat4);
        this.f49977h.play(objectAnimatorOfFloat4).before(objectAnimatorOfFloat5);
        this.f49977h.play(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        bt0.m103750w(this.f49977h, new Runnable() { // from class: l.ejl
            @Override // java.lang.Runnable
            public final void run() {
                this.f91764a.m74028i();
            }
        }, new Runnable() { // from class: l.fjl
            @Override // java.lang.Runnable
            public final void run() {
                this.f97795a.m74029j(d30Var);
            }
        });
        this.f49977h.start();
    }

    /* JADX INFO: renamed from: l */
    public void m74031l(LongLinkGiftMessage.LiveRanking liveRanking, d30 d30Var) {
        hxs.m133406s("context_single_room", this.f49974e, liveRanking.getUserImage());
        this.f49975f.setText(liveRanking.getUserName());
        this.f49976g.setText(ypv.f199497e.getString(R$string.f47493r6, Long.valueOf(liveRanking.getRank())));
        this.f49976g.setTextColor(-218);
        this.f49972c.setImageDrawable(null);
        this.f49972c.setBackground(getDefaultDrawable());
        VDraweeView vDraweeView = this.f49970a;
        hxs.m133408u("context_single_room", vDraweeView, "https://auto.tancdn.com/v1/raw/f9911d44-74c0-4d30-b518-03f4ff09198813.webp", vDraweeView.getWidth(), this.f49970a.getHeight());
        m74030k("https://auto.tancdn.com/v1/raw/e0f94e81-0276-45b7-b69e-fc0f97fc069b10.pdf", d30Var, 1400L);
    }

    /* JADX INFO: renamed from: m */
    public void m74032m(LongLinkSocketMessage.TopEffect topEffect, d30 d30Var) {
        hxs.m133406s("context_single_room", this.f49974e, topEffect.getAvatarUrl());
        this.f49975f.setText(topEffect.getUserName());
        this.f49976g.setText(topEffect.getContent());
        boolean zIsEmpty = TextUtils.isEmpty(topEffect.getSubtitleColor());
        VText vText = this.f49976g;
        if (zIsEmpty) {
            vText.setTextColor(-8935);
        } else {
            vText.setTextColor(Color.parseColor(topEffect.getSubtitleColor()));
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(topEffect.getBackgroundSVGAUrl());
        VDraweeView vDraweeView = this.f49970a;
        if (zIsEmpty2) {
            vDraweeView.setImageResource(i3c0.f110789M7);
        } else {
            hxs.m133406s("context_single_room", vDraweeView, topEffect.getEffectBackgroundUrl());
        }
        long duration = topEffect.getDuration();
        boolean zIsEmpty3 = TextUtils.isEmpty(topEffect.getBackgroundUrl());
        VDraweeView vDraweeView2 = this.f49972c;
        if (zIsEmpty3) {
            vDraweeView2.setImageResource(i3c0.f111162s8);
            this.f49972c.setBackground(m74026g(topEffect));
        } else {
            vDraweeView2.setImageResource(i3c0.f111162s8);
            hxs.m133409v("context_single_room", this.f49972c, topEffect.getBackgroundUrl(), t100.m186890d(180.0f), t100.m186890d(56.0f), false, false, ipn.m137564a(), null);
        }
        String backgroundSVGAUrl = topEffect.getBackgroundSVGAUrl();
        if (duration == 0) {
            duration = 1400;
        }
        m74030k(backgroundSVGAUrl, d30Var, duration);
    }

    /* JADX INFO: renamed from: n */
    public void m74033n(final mvi0 mvi0Var, final LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage) {
        hxs.m133406s("context_single_room", this.f49974e, voiceLiveTopEffectMessage.getAvatarUrl());
        this.f49975f.setText(voiceLiveTopEffectMessage.getTitle());
        this.f49975f.setTextColor(Color.parseColor(voiceLiveTopEffectMessage.getTitleColor()));
        this.f49976g.setText(voiceLiveTopEffectMessage.getContent());
        this.f49976g.setTextColor(Color.parseColor(voiceLiveTopEffectMessage.getContentColor()));
        long duration = voiceLiveTopEffectMessage.getDuration();
        if (!TextUtils.isEmpty(voiceLiveTopEffectMessage.getBackgroundUrl())) {
            this.f49972c.setImageResource(i3c0.f111162s8);
            hxs.m133409v("context_single_room", this.f49972c, voiceLiveTopEffectMessage.getBackgroundUrl(), t100.m186890d(180.0f), t100.m186890d(56.0f), false, false, !vdt.m198092b(2), null);
        }
        xdl0.m208329E0(this.f49972c, new View.OnClickListener() { // from class: l.djl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mvi0Var.m156513l4(voiceLiveTopEffectMessage.getSchema());
            }
        });
        if (duration == 0) {
            duration = 1400;
        }
        m74030k(null, null, duration);
    }

    /* JADX INFO: renamed from: o */
    public void m74034o(String str, String str2, String str3, d30 d30Var) {
        hxs.m133406s("context_single_room", this.f49974e, str);
        this.f49975f.setText(str2);
        this.f49976g.setText(str3);
        this.f49972c.setImageDrawable(null);
        this.f49972c.setBackground(getDefaultDrawable());
        m74030k(null, d30Var, 1400L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m74024e();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74023d(this);
    }

    public HourTopBroadcastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HourTopBroadcastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
