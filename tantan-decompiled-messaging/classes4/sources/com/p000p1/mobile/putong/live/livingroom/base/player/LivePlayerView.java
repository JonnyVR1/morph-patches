package com.p000p1.mobile.putong.live.livingroom.base.player;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.base.pusher.C0304a;
import com.p1.mobile.putong.live.base.view.LiveLoadingView;
import l.kvc0;
import l.s7m;
import l.t100;
import l.xdl0;
import p002l.c880;
import p002l.g5c0;
import p002l.i3c0;
import p002l.nat;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LivePlayerView extends FrameLayout implements s7m<c880> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f3892a;

    /* JADX INFO: renamed from: b */
    public ViewStub f3893b;

    /* JADX INFO: renamed from: c */
    public VText f3894c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f3895d;

    /* JADX INFO: renamed from: e */
    public VText f3896e;

    /* JADX INFO: renamed from: f */
    public ImageView f3897f;

    /* JADX INFO: renamed from: g */
    public ViewStub f3898g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f3899h;

    /* JADX INFO: renamed from: i */
    public c880 f3900i;

    /* JADX INFO: renamed from: j */
    public LiveLoadingView f3901j;

    public LivePlayerView(@NonNull Context context) {
        super(context);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5300C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public final void m5301c(View view) {
        nat.m18638a(this, view);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m5306i1(c880 c880Var) {
        this.f3900i = c880Var;
    }

    public void destroy() {
        m5312p();
        setWaterMarkVisible(false);
    }

    /* JADX INFO: renamed from: e */
    public void m5303e() {
        m5315u(false);
        m5304f();
    }

    /* JADX INFO: renamed from: f */
    public void m5304f() {
        LinearLayout linearLayout = this.f3899h;
        if (linearLayout != null) {
            xdl0.M(linearLayout, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m5305i() {
        LinearLayout linearLayout = this.f3899h;
        if (linearLayout != null) {
            xdl0.M(linearLayout.findViewById(g5c0.f10968U), false);
            xdl0.M(this.f3899h.findViewById(g5c0.f11179q1), false);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m5307j() {
        LiveLoadingView liveLoadingView = this.f3901j;
        return liveLoadingView != null && liveLoadingView.e();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m5308k(View view) {
        this.f3900i.m10858K4();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m5309l(View view) {
        this.f3900i.m10858K4();
    }

    /* JADX INFO: renamed from: m */
    public void m5310m() {
        m5303e();
        setPlayerCoverVisible(true);
        m5314s(true);
    }

    /* JADX INFO: renamed from: n */
    public void m5311n(boolean z) {
        xdl0.M(this.f3892a, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5301c(this);
        C0304a.INSTANCE.m5369a(this.f3897f);
        xdl0.X(this.f3895d, xdl0.F0() + t100.d(50.0f));
    }

    /* JADX INFO: renamed from: p */
    public void m5312p() {
        m5314s(false);
        m5303e();
        setPlayerCoverVisible(true);
    }

    /* JADX INFO: renamed from: q */
    public void m5313q(String str) {
        m5315u(false);
        if (this.f3899h == null) {
            LinearLayout linearLayout = (LinearLayout) this.f3893b.inflate();
            this.f3899h = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f3899h.findViewById(g5c0.f11179q1).setOnClickListener(new View.OnClickListener() { // from class: l.lat
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14749a.m5308k(view);
                }
            });
        }
        ((TextView) this.f3899h.findViewById(g5c0.f11206t1)).setText(str);
        this.f3899h.findViewById(g5c0.f10828E3).setBackground(getContext().getDrawable(i3c0.f12612Q));
        xdl0.M(this.f3899h.findViewById(g5c0.f11179q1), true);
        xdl0.M(this.f3899h.findViewById(g5c0.f10968U), true);
        xdl0.M(this.f3899h, true);
    }

    /* JADX INFO: renamed from: s */
    public void m5314s(boolean z) {
        xdl0.M(this.f3894c, z);
    }

    public void setPlayerCoverVisible(boolean z) {
    }

    public void setWaterMarkUserId(String str) {
        this.f3896e.setText(String.format("%s", str));
    }

    public void setWaterMarkVisible(boolean z) {
        xdl0.M(this.f3895d, z);
    }

    /* JADX INFO: renamed from: u */
    public void m5315u(boolean z) {
        if (this.f3901j == null) {
            this.f3901j = this.f3898g.inflate();
        }
        LiveLoadingView liveLoadingView = this.f3901j;
        if (z) {
            xdl0.M(liveLoadingView, true);
            this.f3901j.g();
        } else {
            liveLoadingView.h();
            xdl0.M(this.f3898g, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m5316v(String str) {
        m5315u(false);
        if (this.f3899h == null) {
            LinearLayout linearLayout = (LinearLayout) this.f3893b.inflate();
            this.f3899h = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f3899h.findViewById(g5c0.f11179q1).setOnClickListener(new View.OnClickListener() { // from class: l.mat
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15301a.m5309l(view);
                }
            });
        }
        if (TextUtils.isEmpty(str)) {
            str = kvc0.d(R$string.f3310h0);
        }
        ((TextView) this.f3899h.findViewById(g5c0.f11206t1)).setText(str);
        this.f3899h.findViewById(g5c0.f10828E3).setBackground(null);
        xdl0.M(this.f3899h, true);
        m5305i();
        m5314s(false);
    }

    /* JADX INFO: renamed from: w */
    public void m5317w(boolean z) {
        this.f3895d.setTranslationY(z ? t100.d(24.0f) : 0);
    }

    public LivePlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
