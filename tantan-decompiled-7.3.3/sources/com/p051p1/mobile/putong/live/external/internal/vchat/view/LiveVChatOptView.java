package com.p051p1.mobile.putong.live.external.internal.vchat.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12668a;
import com.p051p1.mobile.putong.live.external.internal.vchat.LiveVChatOptItemView;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.btu;
import p153l.fwk;
import p153l.iam;
import p153l.iqu;
import p153l.nbc0;
import p153l.pqu;
import p153l.qa00;
import p153l.y20;
import p153l.yuk0;
import p153l.zvk;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatOptView extends ConstraintLayout implements iam<iqu> {

    /* JADX INFO: renamed from: d */
    public VText f46251d;

    /* JADX INFO: renamed from: e */
    public LiveVChatOptItemView f46252e;

    /* JADX INFO: renamed from: f */
    public LiveVChatOptItemView f46253f;

    /* JADX INFO: renamed from: g */
    public LiveVChatOptItemView f46254g;

    /* JADX INFO: renamed from: h */
    public LiveVChatOptItemView f46255h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f46256i;

    /* JADX INFO: renamed from: j */
    public iqu f46257j;

    /* JADX INFO: renamed from: k */
    public String f46258k;

    /* JADX INFO: renamed from: l */
    public String f46259l;

    /* JADX INFO: renamed from: m */
    public long f46260m;

    public LiveVChatOptView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m70935r() {
        this.f46256i.setImageResource(nbc0.f141131U0);
        LiveVChatOptItemView liveVChatOptItemView = this.f46254g;
        int i = nbc0.f141137X0;
        liveVChatOptItemView.m70391c(i, i);
        this.f46254g.setBackgroundResource(nbc0.f141172k);
        this.f46253f.m70391c(nbc0.f141135W0, nbc0.f141133V0);
        this.f46252e.m70391c(nbc0.f141141Z0, nbc0.f141139Y0);
        LiveVChatOptItemView liveVChatOptItemView2 = this.f46255h;
        int i2 = nbc0.f141144a1;
        liveVChatOptItemView2.m70391c(i2, i2);
        this.f46255h.setBackgroundResource(nbc0.f141172k);
        bnl0.m105509E0(this.f46256i, new View.OnClickListener() { // from class: l.jqu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122242a.m70936t0(view);
            }
        });
        this.f46252e.setSelectListener(new y20() { // from class: l.kqu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128392a.m70937u0((Boolean) obj);
            }
        });
        this.f46253f.setSelectListener(new y20() { // from class: l.lqu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133251a.m70949v0((Boolean) obj);
            }
        });
        bnl0.m105509E0(this.f46254g, new View.OnClickListener() { // from class: l.mqu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138274a.m70938w0(view);
            }
        });
        bnl0.m105509E0(this.f46255h, new View.OnClickListener() { // from class: l.nqu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143260a.m70939y0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m70936t0(View view) {
        this.f46257j.m97926H2().m212326S(yuk0.f201636e);
        btu.m106398n(this.f46257j.m97931N2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m70937u0(Boolean bool) {
        this.f46257j.m97928K2().LiveVideoChatEvent.m70384k().mo199273j(Boolean.valueOf(!bool.booleanValue()));
        btu.m106401q(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m70938w0(View view) {
        iqu iquVar = this.f46257j;
        if (iquVar != null) {
            C12668a.m70429p(iquVar, false);
        }
        btu.m106399o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m70939y0(View view) {
        iqu iquVar = this.f46257j;
        if (iquVar != null) {
            iquVar.m141724k3();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: B0 */
    public void m70940B0(boolean z, String str, long j) {
        bnl0.m105524M(this.f46251d, z && bnl0.m105529O0(this));
        if (j < 0) {
            return;
        }
        String strM70943n0 = m70943n0(j * 1000);
        String str2 = TextUtils.equals(str, "randomCoupon") ? "随机匹配剩余时长\n" : "倒计时";
        this.f46251d.setText(str2 + strM70943n0);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public void m70941D0(String str, long j) {
        this.f46259l = str;
        this.f46260m = j;
        if (TextUtils.isEmpty(str)) {
            m70947r0();
        } else if (bnl0.m105529O0(this)) {
            m70942E0(str, j);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m70942E0(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m70947r0();
        zvk zvkVarM221766k = new zvk(this.f46257j.act()).m221776u(str).m221760e(Color.parseColor("#fe7e1d")).m221766k(true);
        int i = qa00.f156322i;
        this.f46258k = fwk.m127777h().m127791t(zvkVarM221766k.m221771p(i).m221775t(13).m221777v(false).m221774s(i, i, i, i).m221764i(zvk.f206227D).m221759d(new zvk.InterfaceC21906b() { // from class: l.oqu
            @Override // p153l.zvk.InterfaceC21906b
            /* JADX INFO: renamed from: a */
            public final void mo96261a(String str2) {
                this.f148647a.m70950z0(str2);
            }
        }).m221756a(j * 1000), this.f46254g);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public String m70943n0(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return "00:00";
        }
        double d2 = d - (((long) ((int) (d / 3600000.0d))) * 3600000);
        int i = (int) (d2 / 60000.0d);
        return String.format(Locale.getDefault(), "%02d:%02d ", Integer.valueOf(i), Integer.valueOf((int) ((d2 - (((long) i) * Constants.ONE_MIN_IN_MILLIS)) / 1000.0d)));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m70944o0(View view) {
        pqu.m173420a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70944o0(this);
        m70935r();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(iqu iquVar) {
        this.f46257j = iquVar;
    }

    /* JADX INFO: renamed from: q0 */
    public void m70946q0() {
        boolean zM105529O0 = bnl0.m105529O0(this);
        boolean z = !zM105529O0;
        bnl0.m105524M(this, z);
        if (!TextUtils.isEmpty(this.f46258k)) {
            fwk.m127777h().m127788q(this.f46258k, z);
        } else {
            if (zM105529O0) {
                return;
            }
            m70942E0(this.f46259l, this.f46260m);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m70947r0() {
        if (!TextUtils.isEmpty(this.f46258k)) {
            fwk.m127777h().m127779g(this.f46258k);
        }
        this.f46258k = null;
    }

    /* JADX INFO: renamed from: s0 */
    public void m70948s0(boolean z, boolean z2) {
        bnl0.m105524M(this, z);
        if (z) {
            bnl0.m105525M0(this.f46252e, !z2);
            bnl0.m105525M0(this.f46253f, !z2);
            bnl0.m105525M0(this.f46254g, !z2);
            this.f46252e.setSelectedUI(false);
            this.f46253f.setSelectedUI(true);
        }
    }

    public void setGiftButtonVisible(boolean z) {
        bnl0.m105524M(this.f46255h, z);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m70949v0(Boolean bool) {
        this.f46257j.m97928K2().LiveVideoChatEvent.m70374a().mo199273j(Boolean.valueOf(!bool.booleanValue()));
        btu.m106402r(bool.booleanValue());
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m70950z0(String str) {
        this.f46258k = "";
        this.f46259l = "";
    }

    public LiveVChatOptView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatOptView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
