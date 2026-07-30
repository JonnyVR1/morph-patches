package com.p046p1.mobile.putong.core.p053ui.wallet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import p149l.rvh0;
import p149l.svh0;
import p149l.z4c0;

/* JADX INFO: loaded from: classes9.dex */
public class TanTanCoinCheckstandFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public String f38222A;

    /* JADX INFO: renamed from: B */
    public rvh0 f38223B;

    /* JADX INFO: renamed from: C */
    public svh0 f38224C;

    /* JADX INFO: renamed from: z */
    public boolean f38225z;

    /* JADX INFO: renamed from: M4 */
    public static TanTanCoinCheckstandFrag m58081M4(boolean z, String str) {
        TanTanCoinCheckstandFrag tanTanCoinCheckstandFrag = new TanTanCoinCheckstandFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("change_top_bg", z);
        bundle.putString("url", str);
        tanTanCoinCheckstandFrag.setArguments(bundle);
        return tanTanCoinCheckstandFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f38225z = getArguments().getBoolean("change_top_bg");
        this.f38222A = getArguments().getString("url");
        this.f38223B = new rvh0(this, this);
        svh0 svh0Var = new svh0(this);
        this.f38224C = svh0Var;
        this.f38223B.mo51532C(svh0Var);
        this.f38223B.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f38223B.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f38223B.m181287k0(this.f38225z);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f38224C.inflateView(layoutInflater, viewGroup);
        getChildFragmentManager().m2567m().m2811s(z4c0.f201557p1, TanTanCoinCheckstandH5Frag.m58086d5(this.f38222A)).mo2708j();
        return viewInflateView;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return getClass().getName();
    }
}
