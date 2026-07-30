package com.p051p1.mobile.putong.live.livingroom.common.fans;

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
import p153l.fhw;
import p153l.ies;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.qcj;
import p153l.vxr;
import p153l.w5g;
import p153l.wo0;
import p153l.yau;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansItem extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public CommonMaskAvatarView f49835a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f49836b;

    /* JADX INFO: renamed from: c */
    public TextView f49837c;

    /* JADX INFO: renamed from: d */
    public long f49838d;

    /* JADX INFO: renamed from: e */
    public long f49839e;

    /* JADX INFO: renamed from: f */
    public String f49840f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f49841g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f49842h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fans.LiveFansItem$a */
    public class C12915a extends wo0 {
        public C12915a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: a */
        public void mo74020a(@NonNull String str) {
            LiveFansItem.this.f49842h = false;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            LiveFansItem.this.f49842h = false;
            boolean z = LiveFansItem.this.f49841g;
            LiveFansItem liveFansItem = LiveFansItem.this;
            if (z) {
                liveFansItem.m74018l(((int) liveFansItem.f49838d) - 1);
            } else {
                bnl0.m105524M(liveFansItem.f49836b, false);
            }
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            bnl0.m105525M0(LiveFansItem.this.f49836b, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fans.LiveFansItem$b */
    public class C12916b extends wo0 {
        public C12916b() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105524M(LiveFansItem.this.f49836b, false);
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: f */
        public void mo74021f() {
            super.mo74021f();
            LiveFansItem.this.f49839e--;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            bnl0.m105525M0(LiveFansItem.this.f49836b, true);
            LiveFansItem.this.f49839e--;
        }
    }

    public LiveFansItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49838d = 60L;
        this.f49839e = 60 - 2;
        this.f49840f = "user_id_unknown_flag";
        this.f49841g = false;
        this.f49842h = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m74014h(View view) {
        ies.m139646a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m74015i(final nsv<w5g> nsvVar) {
        bnl0.m105524M(this.f49837c, vxr.m203876d().m171026u0());
        this.f49837c.setBackgroundResource(obc0.f146266a0);
        w5g w5gVar = nsvVar.f143542a;
        w5g w5gVar2 = w5gVar;
        long j = w5gVar2.f187508c;
        fhw.m125605a("FansBoardTAG-LiveFansItem-render，data=", w5gVar.toString());
        if (j == 1) {
            this.f49837c.setBackgroundResource(obc0.f146362i0);
            this.f49837c.setTextColor(n3d0.m161277a(n9c0.f140875w));
        } else if (j == 2) {
            this.f49837c.setBackgroundResource(obc0.f146073J);
            this.f49837c.setTextColor(n3d0.m161277a(n9c0.f140833i));
        } else {
            TextView textView = this.f49837c;
            if (j == 3) {
                textView.setBackgroundResource(obc0.f146518v0);
                this.f49837c.setTextColor(n3d0.m161277a(n9c0.f140860r));
            } else {
                textView.setBackgroundResource(obc0.f146254Z);
                this.f49837c.setTextColor(n3d0.m161277a(n9c0.f140823e1));
            }
        }
        this.f49837c.setText(yau.m214935c(w5gVar2.f187509d));
        this.f49837c.setTextSize(8.0f);
        biv.m104518c(this.f49835a, qa00.m175859d(40.0f), nsvVar, new qcj() { // from class: l.ges
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((w5g) nsvVar.f143542a).f187507b;
            }
        }, 0);
    }

    /* JADX INFO: renamed from: j */
    public void m74016j(String str) {
        if (!this.f49840f.equals(str)) {
            m74017k();
            this.f49840f = str;
            m74019m();
        } else {
            if (this.f49842h || this.f49836b.isAnimating()) {
                return;
            }
            long j = this.f49839e;
            if (j > 0) {
                m74018l((int) j);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m74017k() {
        this.f49840f = "user_id_unknown_flag";
        this.f49839e = this.f49838d - 2;
        this.f49836b.stopAnimation(false);
        bnl0.m105524M(this.f49836b, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m74018l(int i) {
        this.f49836b.mo69680g("https://auto.tancdn.com/v1/raw/2238566a-56e3-42c2-ae85-63a2b0cb528711.so", i, new C12916b(), true);
    }

    /* JADX INFO: renamed from: m */
    public final void m74019m() {
        this.f49836b.setClearsAfterStop(true);
        this.f49842h = true;
        this.f49836b.mo69680g("https://auto.tancdn.com/v1/raw/3f0ab3c8-b5e0-46a0-bc3c-9214ad09e67510.so", 1, new C12915a(), true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.f49841g = true;
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f49841g = false;
        this.f49842h = false;
        this.f49836b.m69688o();
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74014h(this);
        this.f49838d = zrv.m221193k().m203498Q3();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        String string = this.f49837c.getText().toString();
        int measuredWidth = this.f49837c.getMeasuredWidth();
        for (int i = 8; i >= 6; i--) {
            this.f49837c.setTextSize(8.0f);
            if (this.f49837c.getPaint().measureText(string) <= measuredWidth) {
                return;
            }
        }
    }

    public LiveFansItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveFansItem(@NonNull Context context) {
        this(context, null);
    }
}
