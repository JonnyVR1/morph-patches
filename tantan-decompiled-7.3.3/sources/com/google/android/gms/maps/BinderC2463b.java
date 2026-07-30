package com.google.android.gms.maps;

import android.os.RemoteException;
import p153l.hwr0;
import p153l.sul;
import p153l.um50;
import p153l.w6k;

/* JADX INFO: renamed from: com.google.android.gms.maps.b */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC2463b extends hwr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ um50 f10464a;

    public BinderC2463b(MapView.C2452a c2452a, um50 um50Var) {
        this.f10464a = um50Var;
    }

    @Override // p153l.dvr0
    /* JADX INFO: renamed from: K0 */
    public final void mo15085K0(sul sulVar) throws RemoteException {
        this.f10464a.mo36931P2(new w6k(sulVar));
    }
}
