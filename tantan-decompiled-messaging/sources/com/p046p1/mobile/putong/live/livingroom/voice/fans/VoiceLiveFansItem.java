package com.p046p1.mobile.putong.live.livingroom.voice.fans;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import p149l.agv;
import p149l.ap0;
import p149l.apn0;
import p149l.h1c0;
import p149l.hfw;
import p149l.i3c0;
import p149l.kvc0;
import p149l.mqv;
import p149l.t100;
import p149l.w9j;
import p149l.x8u;
import p149l.xdl0;
import p149l.y4n0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveFansItem extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public CommonMaskAvatarView f53072a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f53073b;

    /* JADX INFO: renamed from: c */
    public TextView f53074c;

    /* JADX INFO: renamed from: d */
    public long f53075d;

    /* JADX INFO: renamed from: e */
    public long f53076e;

    /* JADX INFO: renamed from: f */
    public String f53077f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f53078g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f53079h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.fans.VoiceLiveFansItem$a */
    public class C13014a extends ap0 {
        public C13014a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: a */
        public void mo72837a(@NonNull String str) {
            VoiceLiveFansItem.this.f53079h = false;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            VoiceLiveFansItem.this.f53079h = false;
            boolean z = VoiceLiveFansItem.this.f53078g;
            VoiceLiveFansItem voiceLiveFansItem = VoiceLiveFansItem.this;
            if (z) {
                voiceLiveFansItem.m78081l(((int) voiceLiveFansItem.f53075d) - 1);
            } else {
                xdl0.m208344M(voiceLiveFansItem.f53073b, false);
            }
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            xdl0.m208345M0(VoiceLiveFansItem.this.f53073b, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.fans.VoiceLiveFansItem$b */
    public class C13015b extends ap0 {
        public C13015b() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208344M(VoiceLiveFansItem.this.f53073b, false);
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: f */
        public void mo72838f() {
            super.mo72838f();
            VoiceLiveFansItem.this.f53076e--;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            xdl0.m208345M0(VoiceLiveFansItem.this.f53073b, true);
            VoiceLiveFansItem.this.f53076e--;
        }
    }

    public VoiceLiveFansItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53075d = 60L;
        this.f53076e = 60 - 2;
        this.f53077f = "user_id_unknown_flag";
        this.f53078g = false;
        this.f53079h = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m78077h(View view) {
        apn0.m98163a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m78078i(final mqv<y4n0> mqvVar) {
        this.f53074c.setBackgroundResource(i3c0.f110938a0);
        y4n0 y4n0Var = mqvVar.f135304a;
        y4n0 y4n0Var2 = y4n0Var;
        long j = y4n0Var2.f196309c;
        hfw.m130790a("FansBoardTAG-LiveFansItem-render，data=", y4n0Var.toString());
        if (j == 1) {
            this.f53074c.setBackgroundResource(i3c0.f111034i0);
            this.f53074c.setTextColor(kvc0.m147352a(h1c0.f105414w));
        } else if (j == 2) {
            this.f53074c.setBackgroundResource(i3c0.f110745J);
            this.f53074c.setTextColor(kvc0.m147352a(h1c0.f105372i));
        } else {
            TextView textView = this.f53074c;
            if (j == 3) {
                textView.setBackgroundResource(i3c0.f111190v0);
                this.f53074c.setTextColor(kvc0.m147352a(h1c0.f105399r));
            } else {
                textView.setBackgroundResource(i3c0.f110926Z);
                this.f53074c.setTextColor(kvc0.m147352a(h1c0.f105362e1));
            }
        }
        this.f53074c.setText(x8u.m207433c(y4n0Var2.f196310d));
        this.f53074c.setTextSize(8.0f);
        agv.m96344b(this.f53072a, t100.m186890d(44.0f), mqvVar, new w9j() { // from class: l.yon0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((y4n0) mqvVar.f135304a).f196308b;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public void m78079j(String str) {
        if (!this.f53077f.equals(str)) {
            m78080k();
            this.f53077f = str;
            m78082m();
        } else {
            if (this.f53079h || this.f53073b.isAnimating()) {
                return;
            }
            long j = this.f53076e;
            if (j > 0) {
                m78081l((int) j);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m78080k() {
        this.f53077f = "user_id_unknown_flag";
        this.f53076e = this.f53075d - 2;
        this.f53073b.stopAnimation(false);
        xdl0.m208344M(this.f53073b, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m78081l(int i) {
        this.f53073b.mo68497g("https://auto.tancdn.com/v1/raw/2238566a-56e3-42c2-ae85-63a2b0cb528711.so", i, new C13015b(), true);
    }

    /* JADX INFO: renamed from: m */
    public final void m78082m() {
        this.f53073b.setClearsAfterStop(true);
        this.f53079h = true;
        this.f53073b.mo68497g("https://auto.tancdn.com/v1/raw/3f0ab3c8-b5e0-46a0-bc3c-9214ad09e67510.so", 1, new C13014a(), true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.f53078g = true;
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f53078g = false;
        this.f53079h = false;
        this.f53073b.m68505o();
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78077h(this);
        this.f53075d = ypv.m215672k().m195711Q3();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        String string = this.f53074c.getText().toString();
        int measuredWidth = this.f53074c.getMeasuredWidth();
        for (int i = 8; i >= 6; i--) {
            this.f53074c.setTextSize(8.0f);
            if (this.f53074c.getPaint().measureText(string) <= measuredWidth) {
                return;
            }
        }
    }

    public VoiceLiveFansItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceLiveFansItem(@NonNull Context context) {
        this(context, null);
    }
}
