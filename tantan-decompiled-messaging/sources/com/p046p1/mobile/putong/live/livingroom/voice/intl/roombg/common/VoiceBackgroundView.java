package com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p149l.ap0;
import p149l.him0;
import p149l.hxs;
import p149l.i7n;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceBackgroundView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53380a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f53381b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView$a */
    public class C13033a extends ap0 {
        public C13033a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208345M0(VoiceBackgroundView.this.f53380a, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView$b */
    public class C13034b extends ap0 {
        public C13034b() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208345M0(VoiceBackgroundView.this.f53380a, false);
        }
    }

    public VoiceBackgroundView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78411a(View view) {
        him0.m131292a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78412b() {
        AnimEffectPlayer animEffectPlayer = this.f53381b;
        if (animEffectPlayer != null) {
            animEffectPlayer.m68505o();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m78413c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (!"svga".equals(str) && !str2.endsWith("svga")) {
            xdl0.m208345M0(this.f53381b, false);
            xdl0.m208345M0(this.f53380a, true);
            hxs.m133398k("context_livingAct", this.f53380a, str2);
            return;
        }
        xdl0.m208345M0(this.f53381b, true);
        boolean zM134916b = i7n.m134916b();
        AnimEffectPlayer animEffectPlayer = this.f53381b;
        if (zM134916b) {
            animEffectPlayer.m68499i(str2, 1, new C13033a(), false);
        } else {
            animEffectPlayer.mo68502l(str2, -1, new C13034b());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78411a(this);
    }

    public VoiceBackgroundView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceBackgroundView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
