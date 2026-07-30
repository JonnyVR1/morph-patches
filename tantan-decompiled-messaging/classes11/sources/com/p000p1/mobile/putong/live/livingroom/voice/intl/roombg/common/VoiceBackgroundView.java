package com.p000p1.mobile.putong.live.livingroom.voice.intl.roombg.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.ap0;
import l.him0;
import l.hxs;
import l.i7n;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceBackgroundView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6986a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f6987b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView$a */
    public class C0435a extends ap0 {
        public C0435a() {
        }

        /* JADX INFO: renamed from: b */
        public void m8615b() {
            super.b();
            xdl0.M0(VoiceBackgroundView.this.f6986a, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView$b */
    public class C0436b extends ap0 {
        public C0436b() {
        }

        /* JADX INFO: renamed from: b */
        public void m8616b() {
            super.b();
            xdl0.M0(VoiceBackgroundView.this.f6986a, false);
        }
    }

    public VoiceBackgroundView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8612a(View view) {
        him0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8613b() {
        AnimEffectPlayer animEffectPlayer = this.f6987b;
        if (animEffectPlayer != null) {
            animEffectPlayer.o();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m8614c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (!"svga".equals(str) && !str2.endsWith("svga")) {
            xdl0.M0(this.f6987b, false);
            xdl0.M0(this.f6986a, true);
            hxs.k("context_livingAct", this.f6986a, str2);
            return;
        }
        xdl0.M0(this.f6987b, true);
        boolean zB = i7n.b();
        AnimEffectPlayer animEffectPlayer = this.f6987b;
        if (zB) {
            animEffectPlayer.i(str2, 1, new C0435a(), false);
        } else {
            animEffectPlayer.l(str2, -1, new C0436b());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8612a(this);
    }

    public VoiceBackgroundView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceBackgroundView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
