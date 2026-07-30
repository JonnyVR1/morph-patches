package com.p046p1.mobile.putong.live.livingroom.common.fans;

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
import p149l.h1c0;
import p149l.hcs;
import p149l.hfw;
import p149l.i3c0;
import p149l.i4g;
import p149l.kvc0;
import p149l.mqv;
import p149l.t100;
import p149l.uvr;
import p149l.w9j;
import p149l.x8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansItem extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public CommonMaskAvatarView f48987a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f48988b;

    /* JADX INFO: renamed from: c */
    public TextView f48989c;

    /* JADX INFO: renamed from: d */
    public long f48990d;

    /* JADX INFO: renamed from: e */
    public long f48991e;

    /* JADX INFO: renamed from: f */
    public String f48992f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f48993g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f48994h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fans.LiveFansItem$a */
    public class C12752a extends ap0 {
        public C12752a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: a */
        public void mo72837a(@NonNull String str) {
            LiveFansItem.this.f48994h = false;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            LiveFansItem.this.f48994h = false;
            boolean z = LiveFansItem.this.f48993g;
            LiveFansItem liveFansItem = LiveFansItem.this;
            if (z) {
                liveFansItem.m72835l(((int) liveFansItem.f48990d) - 1);
            } else {
                xdl0.m208344M(liveFansItem.f48988b, false);
            }
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            xdl0.m208345M0(LiveFansItem.this.f48988b, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fans.LiveFansItem$b */
    public class C12753b extends ap0 {
        public C12753b() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208344M(LiveFansItem.this.f48988b, false);
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: f */
        public void mo72838f() {
            super.mo72838f();
            LiveFansItem.this.f48991e--;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            xdl0.m208345M0(LiveFansItem.this.f48988b, true);
            LiveFansItem.this.f48991e--;
        }
    }

    public LiveFansItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48990d = 60L;
        this.f48991e = 60 - 2;
        this.f48992f = "user_id_unknown_flag";
        this.f48993g = false;
        this.f48994h = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m72831h(View view) {
        hcs.m130492a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m72832i(final mqv<i4g> mqvVar) {
        xdl0.m208344M(this.f48989c, uvr.m196087d().m162719u0());
        this.f48989c.setBackgroundResource(i3c0.f110938a0);
        i4g i4gVar = mqvVar.f135304a;
        i4g i4gVar2 = i4gVar;
        long j = i4gVar2.f111443c;
        hfw.m130790a("FansBoardTAG-LiveFansItem-render，data=", i4gVar.toString());
        if (j == 1) {
            this.f48989c.setBackgroundResource(i3c0.f111034i0);
            this.f48989c.setTextColor(kvc0.m147352a(h1c0.f105414w));
        } else if (j == 2) {
            this.f48989c.setBackgroundResource(i3c0.f110745J);
            this.f48989c.setTextColor(kvc0.m147352a(h1c0.f105372i));
        } else {
            TextView textView = this.f48989c;
            if (j == 3) {
                textView.setBackgroundResource(i3c0.f111190v0);
                this.f48989c.setTextColor(kvc0.m147352a(h1c0.f105399r));
            } else {
                textView.setBackgroundResource(i3c0.f110926Z);
                this.f48989c.setTextColor(kvc0.m147352a(h1c0.f105362e1));
            }
        }
        this.f48989c.setText(x8u.m207433c(i4gVar2.f111444d));
        this.f48989c.setTextSize(8.0f);
        agv.m96345c(this.f48987a, t100.m186890d(40.0f), mqvVar, new w9j() { // from class: l.fcs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((i4g) mqvVar.f135304a).f111442b;
            }
        }, 0);
    }

    /* JADX INFO: renamed from: j */
    public void m72833j(String str) {
        if (!this.f48992f.equals(str)) {
            m72834k();
            this.f48992f = str;
            m72836m();
        } else {
            if (this.f48994h || this.f48988b.isAnimating()) {
                return;
            }
            long j = this.f48991e;
            if (j > 0) {
                m72835l((int) j);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m72834k() {
        this.f48992f = "user_id_unknown_flag";
        this.f48991e = this.f48990d - 2;
        this.f48988b.stopAnimation(false);
        xdl0.m208344M(this.f48988b, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m72835l(int i) {
        this.f48988b.mo68497g("https://auto.tancdn.com/v1/raw/2238566a-56e3-42c2-ae85-63a2b0cb528711.so", i, new C12753b(), true);
    }

    /* JADX INFO: renamed from: m */
    public final void m72836m() {
        this.f48988b.setClearsAfterStop(true);
        this.f48994h = true;
        this.f48988b.mo68497g("https://auto.tancdn.com/v1/raw/3f0ab3c8-b5e0-46a0-bc3c-9214ad09e67510.so", 1, new C12752a(), true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.f48993g = true;
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f48993g = false;
        this.f48994h = false;
        this.f48988b.m68505o();
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72831h(this);
        this.f48990d = ypv.m215672k().m195711Q3();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        String string = this.f48989c.getText().toString();
        int measuredWidth = this.f48989c.getMeasuredWidth();
        for (int i = 8; i >= 6; i--) {
            this.f48989c.setTextSize(8.0f);
            if (this.f48989c.getPaint().measureText(string) <= measuredWidth) {
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
