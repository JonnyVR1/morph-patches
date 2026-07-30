package com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.head;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardHeadRatioView;
import p147v.VImage;
import p149l.pxo0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceUserCardHeadView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceUserCardHeadView f53838a;

    /* JADX INFO: renamed from: b */
    public VoiceUserCardHeadRatioView f53839b;

    /* JADX INFO: renamed from: c */
    public CommonMaskAvatarView f53840c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f53841d;

    /* JADX INFO: renamed from: e */
    public VImage f53842e;

    public VoiceUserCardHeadView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78724a(View view) {
        pxo0.m171947a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m78725b() {
        AnimEffectPlayer animEffectPlayer = this.f53841d;
        if (animEffectPlayer != null) {
            animEffectPlayer.m68505o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m78725b();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78724a(this);
        this.f53840c.setMaskUnLimit(true);
    }

    public VoiceUserCardHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceUserCardHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
