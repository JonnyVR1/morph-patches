package com.p000p1.mobile.putong.live.livingroom.voice.usercard.submodule.head;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardHeadRatioView;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import l.pxo0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceUserCardHeadView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceUserCardHeadView f7444a;

    /* JADX INFO: renamed from: b */
    public VoiceUserCardHeadRatioView f7445b;

    /* JADX INFO: renamed from: c */
    public CommonMaskAvatarView f7446c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f7447d;

    /* JADX INFO: renamed from: e */
    public VImage f7448e;

    public VoiceUserCardHeadView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8940a(View view) {
        pxo0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m8941b() {
        AnimEffectPlayer animEffectPlayer = this.f7447d;
        if (animEffectPlayer != null) {
            animEffectPlayer.o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m8941b();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8940a(this);
        this.f7446c.setMaskUnLimit(true);
    }

    public VoiceUserCardHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceUserCardHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
