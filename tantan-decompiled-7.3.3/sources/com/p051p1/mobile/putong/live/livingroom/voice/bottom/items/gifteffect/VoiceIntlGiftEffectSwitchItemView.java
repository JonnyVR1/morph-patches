package com.p051p1.mobile.putong.live.livingroom.voice.bottom.items.gifteffect;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VText;
import p153l.qa00;
import p153l.qnp0;
import p153l.wnn0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceIntlGiftEffectSwitchItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f53782a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f53783b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f53784c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f53785d;

    /* JADX INFO: renamed from: e */
    public View f53786e;

    /* JADX INFO: renamed from: f */
    public View f53787f;

    /* JADX INFO: renamed from: g */
    public VText f53788g;

    /* JADX INFO: renamed from: h */
    public ObjectAnimator f53789h;

    public VoiceIntlGiftEffectSwitchItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78972a(View view) {
        wnn0.m207219a(this, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f53789h;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        this.f53789h.cancel();
        this.f53789h = null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78972a(this);
        qnp0.m177261d1(this.f53782a, qa00.f156323j);
    }

    public VoiceIntlGiftEffectSwitchItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceIntlGiftEffectSwitchItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
