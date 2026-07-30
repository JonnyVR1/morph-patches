package com.google.android.gms.maps;

import android.os.RemoteException;
import p153l.hwr0;
import p153l.sul;
import p153l.um50;
import p153l.w6k;

/* JADX INFO: renamed from: com.google.android.gms.maps.a */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC2462a extends hwr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ um50 f10463a;

    public BinderC2462a(MapFragment.C2450a c2450a, um50 um50Var) {
        this.f10463a = um50Var;
    }

    @Override // p153l.dvr0
    /* JADX INFO: renamed from: K0 */
    public final void mo15085K0(sul sulVar) throws RemoteException {
        this.f10463a.mo36931P2(new w6k(sulVar));
    }
}
