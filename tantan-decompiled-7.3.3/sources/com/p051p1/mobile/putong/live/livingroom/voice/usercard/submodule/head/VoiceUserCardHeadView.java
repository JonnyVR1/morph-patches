package com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.head;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardHeadRatioView;
import p151v.VImage;
import p153l.t6p0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceUserCardHeadView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceUserCardHeadView f54686a;

    /* JADX INFO: renamed from: b */
    public VoiceUserCardHeadRatioView f54687b;

    /* JADX INFO: renamed from: c */
    public CommonMaskAvatarView f54688c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f54689d;

    /* JADX INFO: renamed from: e */
    public VImage f54690e;

    public VoiceUserCardHeadView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79907a(View view) {
        t6p0.m189543a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m79908b() {
        AnimEffectPlayer animEffectPlayer = this.f54689d;
        if (animEffectPlayer != null) {
            animEffectPlayer.m69688o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m79908b();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79907a(this);
        this.f54688c.setMaskUnLimit(true);
    }

    public VoiceUserCardHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceUserCardHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
