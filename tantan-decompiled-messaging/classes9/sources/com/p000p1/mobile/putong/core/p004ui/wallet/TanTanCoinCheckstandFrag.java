package com.p000p1.mobile.putong.core.p004ui.wallet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongFrag;
import l.z4c0;
import p006l.rvh0;
import p006l.svh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TanTanCoinCheckstandFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public String f8003A;

    /* JADX INFO: renamed from: B */
    public rvh0 f8004B;

    /* JADX INFO: renamed from: C */
    public svh0 f8005C;

    /* JADX INFO: renamed from: z */
    public boolean f8006z;

    /* JADX INFO: renamed from: M4 */
    public static TanTanCoinCheckstandFrag m11607M4(boolean z, String str) {
        TanTanCoinCheckstandFrag tanTanCoinCheckstandFrag = new TanTanCoinCheckstandFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("change_top_bg", z);
        bundle.putString("url", str);
        tanTanCoinCheckstandFrag.setArguments(bundle);
        return tanTanCoinCheckstandFrag;
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        this.f8006z = getArguments().getBoolean("change_top_bg");
        this.f8003A = getArguments().getString("url");
        this.f8004B = new rvh0(this, this);
        svh0 svh0Var = new svh0(this);
        this.f8005C = svh0Var;
        this.f8004B.C(svh0Var);
        this.f8004B.m23334Z();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        this.f8004B.m23335a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m11608g4(Bundle bundle) {
        super.g4(bundle);
        this.f8004B.m23336k0(this.f8006z);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f8005C.inflateView(layoutInflater, viewGroup);
        getChildFragmentManager().m().s(z4c0.p1, TanTanCoinCheckstandH5Frag.m11613d5(this.f8003A)).j();
        return viewInflateView;
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public String pageId() {
        return getClass().getName();
    }
}
