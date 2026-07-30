package com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

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
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.CrashHelper;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.irn;
import p153l.it0;
import p153l.izs;
import p153l.obc0;
import p153l.q4j0;
import p153l.qa00;
import p153l.wft;
import p153l.x20;
import p153l.xll;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class HourTopBroadcastView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50818a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f50819b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f50820c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f50821d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50822e;

    /* JADX INFO: renamed from: f */
    public VText f50823f;

    /* JADX INFO: renamed from: g */
    public VText f50824g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f50825h;

    public HourTopBroadcastView(Context context) {
        super(context);
    }

    private Drawable getDefaultDrawable() {
        return getContext().getResources().getDrawable(obc0.f146147P2);
    }

    /* JADX INFO: renamed from: d */
    public final void m75206d(View view) {
        xll.m211663a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m75207e() {
        it0.m142009C(this.f50825h);
    }

    /* JADX INFO: renamed from: f */
    public final int[] m75208f(LongLinkSocketMessage.TopEffect topEffect) {
        int color;
        int color2;
        try {
            color = Color.parseColor("#" + topEffect.getStartBackendColor());
            color2 = Color.parseColor("#" + topEffect.getEndBackendColor());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            color = Color.parseColor("#ff5ba1");
            color2 = Color.parseColor("#ff83c9");
        }
        return new int[]{color, color2};
    }

    /* JADX INFO: renamed from: g */
    public final GradientDrawable m75209g(LongLinkSocketMessage.TopEffect topEffect) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(qa00.m175859d(24.0f));
        gradientDrawable.setColors(m75208f(topEffect));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: h */
    public boolean m75210h() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m75211i() {
        bnl0.m105524M(this, true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m75212j(x20 x20Var) {
        bnl0.m105524M(this, false);
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m75213k(String str, final x20 x20Var, long j) {
        if (TextUtils.isEmpty(str)) {
            this.f50821d.m69683j("https://auto.tancdn.com/v1/raw/f2058928-21b2-4d80-9725-b137873a9da710.so", 2);
        } else {
            this.f50820c.setImageDrawable(null);
            this.f50821d.m69683j(str, -1);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50819b, "translationY", -qa00.m175859d(56.0f), qa00.m175859d(59.0f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50818a, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f50819b, "translationY", qa00.m175859d(59.0f), qa00.m175859d(49.0f));
        objectAnimatorOfFloat3.setDuration(200L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f50818a, "alpha", 1.0f, 0.9f);
        objectAnimatorOfFloat4.setDuration(600L);
        objectAnimatorOfFloat4.setRepeatMode(2);
        objectAnimatorOfFloat4.setRepeatCount(((int) j) / 600);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f50819b, "translationY", qa00.m175859d(49.0f), -qa00.m175859d(105.0f));
        objectAnimatorOfFloat5.setDuration(600L);
        objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f50818a, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat6.setDuration(600L);
        objectAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f50825h = animatorSet;
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        this.f50825h.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat3);
        this.f50825h.play(objectAnimatorOfFloat2).before(objectAnimatorOfFloat4);
        this.f50825h.play(objectAnimatorOfFloat4).before(objectAnimatorOfFloat5);
        this.f50825h.play(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        gt0.m132177w(this.f50825h, new Runnable() { // from class: l.vll
            @Override // java.lang.Runnable
            public final void run() {
                this.f184610a.m75211i();
            }
        }, new Runnable() { // from class: l.wll
            @Override // java.lang.Runnable
            public final void run() {
                this.f189705a.m75212j(x20Var);
            }
        });
        this.f50825h.start();
    }

    /* JADX INFO: renamed from: l */
    public void m75214l(LongLinkGiftMessage.LiveRanking liveRanking, x20 x20Var) {
        izs.m142868s("context_single_room", this.f50822e, liveRanking.getUserImage());
        this.f50823f.setText(liveRanking.getUserName());
        this.f50824g.setText(zrv.f205803e.getString(R$string.f48341r6, Long.valueOf(liveRanking.getRank())));
        this.f50824g.setTextColor(-218);
        this.f50820c.setImageDrawable(null);
        this.f50820c.setBackground(getDefaultDrawable());
        VDraweeView vDraweeView = this.f50818a;
        izs.m142870u("context_single_room", vDraweeView, "https://auto.tancdn.com/v1/raw/f9911d44-74c0-4d30-b518-03f4ff09198813.webp", vDraweeView.getWidth(), this.f50818a.getHeight());
        m75213k("https://auto.tancdn.com/v1/raw/e0f94e81-0276-45b7-b69e-fc0f97fc069b10.pdf", x20Var, 1400L);
    }

    /* JADX INFO: renamed from: m */
    public void m75215m(LongLinkSocketMessage.TopEffect topEffect, x20 x20Var) {
        izs.m142868s("context_single_room", this.f50822e, topEffect.getAvatarUrl());
        this.f50823f.setText(topEffect.getUserName());
        this.f50824g.setText(topEffect.getContent());
        boolean zIsEmpty = TextUtils.isEmpty(topEffect.getSubtitleColor());
        VText vText = this.f50824g;
        if (zIsEmpty) {
            vText.setTextColor(-8935);
        } else {
            vText.setTextColor(Color.parseColor(topEffect.getSubtitleColor()));
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(topEffect.getBackgroundSVGAUrl());
        VDraweeView vDraweeView = this.f50818a;
        if (zIsEmpty2) {
            vDraweeView.setImageResource(obc0.f146117M7);
        } else {
            izs.m142868s("context_single_room", vDraweeView, topEffect.getEffectBackgroundUrl());
        }
        long duration = topEffect.getDuration();
        boolean zIsEmpty3 = TextUtils.isEmpty(topEffect.getBackgroundUrl());
        VDraweeView vDraweeView2 = this.f50820c;
        if (zIsEmpty3) {
            vDraweeView2.setImageResource(obc0.f146490s8);
            this.f50820c.setBackground(m75209g(topEffect));
        } else {
            vDraweeView2.setImageResource(obc0.f146490s8);
            izs.m142871v("context_single_room", this.f50820c, topEffect.getBackgroundUrl(), qa00.m175859d(180.0f), qa00.m175859d(56.0f), false, false, irn.m141839a(), null);
        }
        String backgroundSVGAUrl = topEffect.getBackgroundSVGAUrl();
        if (duration == 0) {
            duration = 1400;
        }
        m75213k(backgroundSVGAUrl, x20Var, duration);
    }

    /* JADX INFO: renamed from: n */
    public void m75216n(final q4j0 q4j0Var, final LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage) {
        izs.m142868s("context_single_room", this.f50822e, voiceLiveTopEffectMessage.getAvatarUrl());
        this.f50823f.setText(voiceLiveTopEffectMessage.getTitle());
        this.f50823f.setTextColor(Color.parseColor(voiceLiveTopEffectMessage.getTitleColor()));
        this.f50824g.setText(voiceLiveTopEffectMessage.getContent());
        this.f50824g.setTextColor(Color.parseColor(voiceLiveTopEffectMessage.getContentColor()));
        long duration = voiceLiveTopEffectMessage.getDuration();
        if (!TextUtils.isEmpty(voiceLiveTopEffectMessage.getBackgroundUrl())) {
            this.f50820c.setImageResource(obc0.f146490s8);
            izs.m142871v("context_single_room", this.f50820c, voiceLiveTopEffectMessage.getBackgroundUrl(), qa00.m175859d(180.0f), qa00.m175859d(56.0f), false, false, !wft.m206159b(2), null);
        }
        bnl0.m105509E0(this.f50820c, new View.OnClickListener() { // from class: l.ull
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q4j0Var.m175247l4(voiceLiveTopEffectMessage.getSchema());
            }
        });
        if (duration == 0) {
            duration = 1400;
        }
        m75213k(null, null, duration);
    }

    /* JADX INFO: renamed from: o */
    public void m75217o(String str, String str2, String str3, x20 x20Var) {
        izs.m142868s("context_single_room", this.f50822e, str);
        this.f50823f.setText(str2);
        this.f50824g.setText(str3);
        this.f50820c.setImageDrawable(null);
        this.f50820c.setBackground(getDefaultDrawable());
        m75213k(null, x20Var, 1400L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m75207e();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75206d(this);
    }

    public HourTopBroadcastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HourTopBroadcastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
