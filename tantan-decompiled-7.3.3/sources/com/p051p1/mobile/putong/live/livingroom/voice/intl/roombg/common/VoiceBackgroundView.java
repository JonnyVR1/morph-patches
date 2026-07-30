package com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.i9n;
import p153l.izs;
import p153l.lrm0;
import p153l.wo0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceBackgroundView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54228a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f54229b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView$a */
    public class C13196a extends wo0 {
        public C13196a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105525M0(VoiceBackgroundView.this.f54228a, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView$b */
    public class C13197b extends wo0 {
        public C13197b() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105525M0(VoiceBackgroundView.this.f54228a, false);
        }
    }

    public VoiceBackgroundView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79594a(View view) {
        lrm0.m155632a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79595b() {
        AnimEffectPlayer animEffectPlayer = this.f54229b;
        if (animEffectPlayer != null) {
            animEffectPlayer.m69688o();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m79596c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (!"svga".equals(str) && !str2.endsWith("svga")) {
            bnl0.m105525M0(this.f54229b, false);
            bnl0.m105525M0(this.f54228a, true);
            izs.m142860k("context_livingAct", this.f54228a, str2);
            return;
        }
        bnl0.m105525M0(this.f54229b, true);
        boolean zM139127b = i9n.m139127b();
        AnimEffectPlayer animEffectPlayer = this.f54229b;
        if (zM139127b) {
            animEffectPlayer.m69682i(str2, 1, new C13196a(), false);
        } else {
            animEffectPlayer.mo69685l(str2, -1, new C13197b());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79594a(this);
    }

    public VoiceBackgroundView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceBackgroundView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
