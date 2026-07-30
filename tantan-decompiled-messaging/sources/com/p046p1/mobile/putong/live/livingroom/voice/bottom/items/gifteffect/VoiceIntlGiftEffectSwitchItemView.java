package com.p046p1.mobile.putong.live.livingroom.voice.bottom.items.gifteffect;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VText;
import p149l.mep0;
import p149l.sen0;
import p149l.t100;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceIntlGiftEffectSwitchItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f52934a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f52935b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f52936c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f52937d;

    /* JADX INFO: renamed from: e */
    public View f52938e;

    /* JADX INFO: renamed from: f */
    public View f52939f;

    /* JADX INFO: renamed from: g */
    public VText f52940g;

    /* JADX INFO: renamed from: h */
    public ObjectAnimator f52941h;

    public VoiceIntlGiftEffectSwitchItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m77789a(View view) {
        sen0.m183675a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f52941h;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        this.f52941h.cancel();
        this.f52941h = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77789a(this);
        mep0.m154302d1(this.f52934a, t100.f167261j);
    }

    public VoiceIntlGiftEffectSwitchItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceIntlGiftEffectSwitchItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
