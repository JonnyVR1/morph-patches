package com.p000p1.mobile.putong.live.livingroom.common.fans;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.agv;
import l.ap0;
import l.hfw;
import l.kvc0;
import l.mqv;
import l.t100;
import l.uvr;
import l.w9j;
import l.x8u;
import l.xdl0;
import l.ypv;
import p002l.h1c0;
import p002l.hcs;
import p002l.i3c0;
import p002l.i4g;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFansItem extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public CommonMaskAvatarView f5029a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f5030b;

    /* JADX INFO: renamed from: c */
    public TextView f5031c;

    /* JADX INFO: renamed from: d */
    public long f5032d;

    /* JADX INFO: renamed from: e */
    public long f5033e;

    /* JADX INFO: renamed from: f */
    public String f5034f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f5035g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f5036h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fans.LiveFansItem$a */
    public class C0341a extends ap0 {
        public C0341a() {
        }

        /* JADX INFO: renamed from: a */
        public void m6350a(@NonNull String str) {
            LiveFansItem.this.f5036h = false;
        }

        /* JADX INFO: renamed from: b */
        public void m6351b() {
            super.b();
            LiveFansItem.this.f5036h = false;
            boolean z = LiveFansItem.this.f5035g;
            LiveFansItem liveFansItem = LiveFansItem.this;
            if (z) {
                liveFansItem.m6348l(((int) liveFansItem.f5032d) - 1);
            } else {
                xdl0.M(liveFansItem.f5030b, false);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m6352g() {
            super.g();
            xdl0.M0(LiveFansItem.this.f5030b, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fans.LiveFansItem$b */
    public class C0342b extends ap0 {
        public C0342b() {
        }

        /* JADX INFO: renamed from: b */
        public void m6353b() {
            super.b();
            xdl0.M(LiveFansItem.this.f5030b, false);
        }

        /* JADX INFO: renamed from: f */
        public void m6354f() {
            super.f();
            LiveFansItem.this.f5033e--;
        }

        /* JADX INFO: renamed from: g */
        public void m6355g() {
            super.g();
            xdl0.M0(LiveFansItem.this.f5030b, true);
            LiveFansItem.this.f5033e--;
        }
    }

    public LiveFansItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5032d = 60L;
        this.f5033e = 60 - 2;
        this.f5034f = "user_id_unknown_flag";
        this.f5035g = false;
        this.f5036h = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m6344h(View view) {
        hcs.m14306a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m6345i(final mqv<i4g> mqvVar) {
        xdl0.M(this.f5031c, uvr.d().u0());
        this.f5031c.setBackgroundResource(i3c0.f12723a0);
        Object obj = mqvVar.a;
        i4g i4gVar = (i4g) obj;
        long j = i4gVar.f13041c;
        hfw.a("FansBoardTAG-LiveFansItem-render，data=", ((i4g) obj).toString());
        if (j == 1) {
            this.f5031c.setBackgroundResource(i3c0.f12819i0);
            this.f5031c.setTextColor(kvc0.a(h1c0.f11834w));
        } else if (j == 2) {
            this.f5031c.setBackgroundResource(i3c0.f12530J);
            this.f5031c.setTextColor(kvc0.a(h1c0.f11792i));
        } else {
            TextView textView = this.f5031c;
            if (j == 3) {
                textView.setBackgroundResource(i3c0.f12975v0);
                this.f5031c.setTextColor(kvc0.a(h1c0.f11819r));
            } else {
                textView.setBackgroundResource(i3c0.f12711Z);
                this.f5031c.setTextColor(kvc0.a(h1c0.f11782e1));
            }
        }
        this.f5031c.setText(x8u.c(i4gVar.f13042d));
        this.f5031c.setTextSize(8.0f);
        agv.c(this.f5029a, t100.d(40.0f), mqvVar, new w9j() { // from class: l.fcs
            public final Object call(Object obj2) {
                return ((i4g) mqvVar.a).f13040b;
            }
        }, 0);
    }

    /* JADX INFO: renamed from: j */
    public void m6346j(String str) {
        if (!this.f5034f.equals(str)) {
            m6347k();
            this.f5034f = str;
            m6349m();
        } else {
            if (this.f5036h || this.f5030b.isAnimating()) {
                return;
            }
            long j = this.f5033e;
            if (j > 0) {
                m6348l((int) j);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m6347k() {
        this.f5034f = "user_id_unknown_flag";
        this.f5033e = this.f5032d - 2;
        this.f5030b.stopAnimation(false);
        xdl0.M(this.f5030b, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m6348l(int i) {
        this.f5030b.g("https://auto.tancdn.com/v1/raw/2238566a-56e3-42c2-ae85-63a2b0cb528711.so", i, new C0342b(), true);
    }

    /* JADX INFO: renamed from: m */
    public final void m6349m() {
        this.f5030b.setClearsAfterStop(true);
        this.f5036h = true;
        this.f5030b.g("https://auto.tancdn.com/v1/raw/3f0ab3c8-b5e0-46a0-bc3c-9214ad09e67510.so", 1, new C0341a(), true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.f5035g = true;
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f5035g = false;
        this.f5036h = false;
        this.f5030b.o();
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6344h(this);
        this.f5032d = ypv.k().Q3();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        String string = this.f5031c.getText().toString();
        int measuredWidth = this.f5031c.getMeasuredWidth();
        for (int i = 8; i >= 6; i--) {
            this.f5031c.setTextSize(8.0f);
            if (this.f5031c.getPaint().measureText(string) <= measuredWidth) {
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
