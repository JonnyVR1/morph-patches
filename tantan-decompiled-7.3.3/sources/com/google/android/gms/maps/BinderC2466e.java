package com.google.android.gms.maps;

import android.os.RemoteException;
import p153l.hwr0;
import p153l.sul;
import p153l.um50;
import p153l.w6k;

/* JADX INFO: renamed from: com.google.android.gms.maps.e */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC2466e extends hwr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ um50 f10467a;

    public BinderC2466e(SupportMapFragment.C2458a c2458a, um50 um50Var) {
        this.f10467a = um50Var;
    }

    @Override // p153l.dvr0
    /* JADX INFO: renamed from: K0 */
    public final void mo15085K0(sul sulVar) throws RemoteException {
        this.f10467a.mo36931P2(new w6k(sulVar));
    }
}
