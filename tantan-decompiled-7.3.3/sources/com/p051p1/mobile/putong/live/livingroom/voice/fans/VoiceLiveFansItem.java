package com.p051p1.mobile.putong.live.livingroom.voice.fans;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import p153l.biv;
import p153l.bnl0;
import p153l.cen0;
import p153l.eyn0;
import p153l.fhw;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.qcj;
import p153l.wo0;
import p153l.yau;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceLiveFansItem extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public CommonMaskAvatarView f53920a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f53921b;

    /* JADX INFO: renamed from: c */
    public TextView f53922c;

    /* JADX INFO: renamed from: d */
    public long f53923d;

    /* JADX INFO: renamed from: e */
    public long f53924e;

    /* JADX INFO: renamed from: f */
    public String f53925f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f53926g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f53927h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.fans.VoiceLiveFansItem$a */
    public class C13177a extends wo0 {
        public C13177a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: a */
        public void mo74020a(@NonNull String str) {
            VoiceLiveFansItem.this.f53927h = false;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            VoiceLiveFansItem.this.f53927h = false;
            boolean z = VoiceLiveFansItem.this.f53926g;
            VoiceLiveFansItem voiceLiveFansItem = VoiceLiveFansItem.this;
            if (z) {
                voiceLiveFansItem.m79264l(((int) voiceLiveFansItem.f53923d) - 1);
            } else {
                bnl0.m105524M(voiceLiveFansItem.f53921b, false);
            }
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            bnl0.m105525M0(VoiceLiveFansItem.this.f53921b, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.fans.VoiceLiveFansItem$b */
    public class C13178b extends wo0 {
        public C13178b() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105524M(VoiceLiveFansItem.this.f53921b, false);
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: f */
        public void mo74021f() {
            super.mo74021f();
            VoiceLiveFansItem.this.f53924e--;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            bnl0.m105525M0(VoiceLiveFansItem.this.f53921b, true);
            VoiceLiveFansItem.this.f53924e--;
        }
    }

    public VoiceLiveFansItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53923d = 60L;
        this.f53924e = 60 - 2;
        this.f53925f = "user_id_unknown_flag";
        this.f53926g = false;
        this.f53927h = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m79260h(View view) {
        eyn0.m123214a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m79261i(final nsv<cen0> nsvVar) {
        this.f53922c.setBackgroundResource(obc0.f146266a0);
        cen0 cen0Var = nsvVar.f143542a;
        cen0 cen0Var2 = cen0Var;
        long j = cen0Var2.f81393c;
        fhw.m125605a("FansBoardTAG-LiveFansItem-render，data=", cen0Var.toString());
        if (j == 1) {
            this.f53922c.setBackgroundResource(obc0.f146362i0);
            this.f53922c.setTextColor(n3d0.m161277a(n9c0.f140875w));
        } else if (j == 2) {
            this.f53922c.setBackgroundResource(obc0.f146073J);
            this.f53922c.setTextColor(n3d0.m161277a(n9c0.f140833i));
        } else {
            TextView textView = this.f53922c;
            if (j == 3) {
                textView.setBackgroundResource(obc0.f146518v0);
                this.f53922c.setTextColor(n3d0.m161277a(n9c0.f140860r));
            } else {
                textView.setBackgroundResource(obc0.f146254Z);
                this.f53922c.setTextColor(n3d0.m161277a(n9c0.f140823e1));
            }
        }
        this.f53922c.setText(yau.m214935c(cen0Var2.f81394d));
        this.f53922c.setTextSize(8.0f);
        biv.m104517b(this.f53920a, qa00.m175859d(44.0f), nsvVar, new qcj() { // from class: l.cyn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((cen0) nsvVar.f143542a).f81392b;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public void m79262j(String str) {
        if (!this.f53925f.equals(str)) {
            m79263k();
            this.f53925f = str;
            m79265m();
        } else {
            if (this.f53927h || this.f53921b.isAnimating()) {
                return;
            }
            long j = this.f53924e;
            if (j > 0) {
                m79264l((int) j);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m79263k() {
        this.f53925f = "user_id_unknown_flag";
        this.f53924e = this.f53923d - 2;
        this.f53921b.stopAnimation(false);
        bnl0.m105524M(this.f53921b, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m79264l(int i) {
        this.f53921b.mo69680g("https://auto.tancdn.com/v1/raw/2238566a-56e3-42c2-ae85-63a2b0cb528711.so", i, new C13178b(), true);
    }

    /* JADX INFO: renamed from: m */
    public final void m79265m() {
        this.f53921b.setClearsAfterStop(true);
        this.f53927h = true;
        this.f53921b.mo69680g("https://auto.tancdn.com/v1/raw/3f0ab3c8-b5e0-46a0-bc3c-9214ad09e67510.so", 1, new C13177a(), true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.f53926g = true;
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f53926g = false;
        this.f53927h = false;
        this.f53921b.m69688o();
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79260h(this);
        this.f53923d = zrv.m221193k().m203498Q3();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        String string = this.f53922c.getText().toString();
        int measuredWidth = this.f53922c.getMeasuredWidth();
        for (int i = 8; i >= 6; i--) {
            this.f53922c.setTextSize(8.0f);
            if (this.f53922c.getPaint().measureText(string) <= measuredWidth) {
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
