package com.p051p1.mobile.putong.core.p058ui.wallet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import p153l.a4i0;
import p153l.fdc0;
import p153l.z3i0;

/* JADX INFO: loaded from: classes12.dex */
public class TanTanCoinCheckstandFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public String f39070A;

    /* JADX INFO: renamed from: B */
    public z3i0 f39071B;

    /* JADX INFO: renamed from: C */
    public a4i0 f39072C;

    /* JADX INFO: renamed from: z */
    public boolean f39073z;

    /* JADX INFO: renamed from: M4 */
    public static TanTanCoinCheckstandFrag m59264M4(boolean z, String str) {
        TanTanCoinCheckstandFrag tanTanCoinCheckstandFrag = new TanTanCoinCheckstandFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("change_top_bg", z);
        bundle.putString("url", str);
        tanTanCoinCheckstandFrag.setArguments(bundle);
        return tanTanCoinCheckstandFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f39073z = getArguments().getBoolean("change_top_bg");
        this.f39070A = getArguments().getString("url");
        this.f39071B = new z3i0(this, this);
        a4i0 a4i0Var = new a4i0(this);
        this.f39072C = a4i0Var;
        this.f39071B.mo52715C(a4i0Var);
        this.f39071B.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f39071B.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f39071B.m218478k0(this.f39073z);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f39072C.inflateView(layoutInflater, viewGroup);
        getChildFragmentManager().m2568m().m2812s(fdc0.f98433p1, TanTanCoinCheckstandH5Frag.m59269d5(this.f39070A)).mo2709j();
        return viewInflateView;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return getClass().getName();
    }
}
