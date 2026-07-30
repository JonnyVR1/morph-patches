package com.google.android.gms.maps;

import android.os.RemoteException;
import p149l.bnr0;
import p149l.e4k;
import p149l.esl;
import p149l.ne50;

/* JADX INFO: renamed from: com.google.android.gms.maps.e */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC2443e extends bnr0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ne50 f10430a;

    public BinderC2443e(SupportMapFragment.C2435a c2435a, ne50 ne50Var) {
        this.f10430a = ne50Var;
    }

    @Override // p149l.xlr0
    /* JADX INFO: renamed from: K0 */
    public final void mo15031K0(esl eslVar) throws RemoteException {
        this.f10430a.mo35928P2(new e4k(eslVar));
    }
}
