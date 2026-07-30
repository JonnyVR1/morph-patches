package com.google.android.gms.maps;

import android.os.RemoteException;
import p149l.bnr0;
import p149l.e4k;
import p149l.esl;
import p149l.ne50;

/* JADX INFO: renamed from: com.google.android.gms.maps.a */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC2439a extends bnr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ne50 f10426a;

    public BinderC2439a(MapFragment.C2427a c2427a, ne50 ne50Var) {
        this.f10426a = ne50Var;
    }

    @Override // p149l.xlr0
    /* JADX INFO: renamed from: K0 */
    public final void mo15031K0(esl eslVar) throws RemoteException {
        this.f10426a.mo35928P2(new e4k(eslVar));
    }
}
