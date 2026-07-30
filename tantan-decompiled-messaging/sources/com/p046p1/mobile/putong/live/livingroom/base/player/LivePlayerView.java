package com.p046p1.mobile.putong.live.livingroom.base.player;

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
import com.p046p1.mobile.putong.live.base.view.LiveLoadingView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.base.pusher.C12715a;
import p147v.VText;
import p149l.c880;
import p149l.g5c0;
import p149l.i3c0;
import p149l.kvc0;
import p149l.nat;
import p149l.s7m;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LivePlayerView extends FrameLayout implements s7m<c880> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f47850a;

    /* JADX INFO: renamed from: b */
    public ViewStub f47851b;

    /* JADX INFO: renamed from: c */
    public VText f47852c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f47853d;

    /* JADX INFO: renamed from: e */
    public VText f47854e;

    /* JADX INFO: renamed from: f */
    public ImageView f47855f;

    /* JADX INFO: renamed from: g */
    public ViewStub f47856g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f47857h;

    /* JADX INFO: renamed from: i */
    public c880 f47858i;

    /* JADX INFO: renamed from: j */
    public LiveLoadingView f47859j;

    public LivePlayerView(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public final void m71919c(View view) {
        nat.m158713a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(c880 c880Var) {
        this.f47858i = c880Var;
    }

    @Override // p149l.s7m
    public void destroy() {
        m71929p();
        setWaterMarkVisible(false);
    }

    /* JADX INFO: renamed from: e */
    public void m71921e() {
        m71932u(false);
        m71922f();
    }

    /* JADX INFO: renamed from: f */
    public void m71922f() {
        LinearLayout linearLayout = this.f47857h;
        if (linearLayout != null) {
            xdl0.m208344M(linearLayout, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m71923i() {
        LinearLayout linearLayout = this.f47857h;
        if (linearLayout != null) {
            xdl0.m208344M(linearLayout.findViewById(g5c0.f100818U), false);
            xdl0.m208344M(this.f47857h.findViewById(g5c0.f101029q1), false);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m71924j() {
        LiveLoadingView liveLoadingView = this.f47859j;
        return liveLoadingView != null && liveLoadingView.m68742e();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m71925k(View view) {
        this.f47858i.m105720K4();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m71926l(View view) {
        this.f47858i.m105720K4();
    }

    /* JADX INFO: renamed from: m */
    public void m71927m() {
        m71921e();
        setPlayerCoverVisible(true);
        m71931s(true);
    }

    /* JADX INFO: renamed from: n */
    public void m71928n(boolean z) {
        xdl0.m208344M(this.f47850a, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71919c(this);
        C12715a.INSTANCE.m71980a(this.f47855f);
        xdl0.m208360X(this.f47853d, xdl0.m208331F0() + t100.m186890d(50.0f));
    }

    /* JADX INFO: renamed from: p */
    public void m71929p() {
        m71931s(false);
        m71921e();
        setPlayerCoverVisible(true);
    }

    /* JADX INFO: renamed from: q */
    public void m71930q(String str) {
        m71932u(false);
        if (this.f47857h == null) {
            LinearLayout linearLayout = (LinearLayout) this.f47851b.inflate();
            this.f47857h = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f47857h.findViewById(g5c0.f101029q1).setOnClickListener(new View.OnClickListener() { // from class: l.lat
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f127242a.m71925k(view);
                }
            });
        }
        ((TextView) this.f47857h.findViewById(g5c0.f101056t1)).setText(str);
        this.f47857h.findViewById(g5c0.f100678E3).setBackground(getContext().getDrawable(i3c0.f110827Q));
        xdl0.m208344M(this.f47857h.findViewById(g5c0.f101029q1), true);
        xdl0.m208344M(this.f47857h.findViewById(g5c0.f100818U), true);
        xdl0.m208344M(this.f47857h, true);
    }

    /* JADX INFO: renamed from: s */
    public void m71931s(boolean z) {
        xdl0.m208344M(this.f47852c, z);
    }

    public void setPlayerCoverVisible(boolean z) {
    }

    public void setWaterMarkUserId(String str) {
        this.f47854e.setText(String.format("%s", str));
    }

    public void setWaterMarkVisible(boolean z) {
        xdl0.m208344M(this.f47853d, z);
    }

    /* JADX INFO: renamed from: u */
    public void m71932u(boolean z) {
        if (this.f47859j == null) {
            this.f47859j = (LiveLoadingView) this.f47856g.inflate();
        }
        LiveLoadingView liveLoadingView = this.f47859j;
        if (z) {
            xdl0.m208344M(liveLoadingView, true);
            this.f47859j.m68744g();
        } else {
            liveLoadingView.m68745h();
            xdl0.m208344M(this.f47856g, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m71933v(String str) {
        m71932u(false);
        if (this.f47857h == null) {
            LinearLayout linearLayout = (LinearLayout) this.f47851b.inflate();
            this.f47857h = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f47857h.findViewById(g5c0.f101029q1).setOnClickListener(new View.OnClickListener() { // from class: l.mat
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f132948a.m71926l(view);
                }
            });
        }
        if (TextUtils.isEmpty(str)) {
            str = kvc0.m147355d(R$string.f47268h0);
        }
        ((TextView) this.f47857h.findViewById(g5c0.f101056t1)).setText(str);
        this.f47857h.findViewById(g5c0.f100678E3).setBackground(null);
        xdl0.m208344M(this.f47857h, true);
        m71923i();
        m71931s(false);
    }

    /* JADX INFO: renamed from: w */
    public void m71934w(boolean z) {
        this.f47853d.setTranslationY(z ? t100.m186890d(24.0f) : 0);
    }

    public LivePlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
