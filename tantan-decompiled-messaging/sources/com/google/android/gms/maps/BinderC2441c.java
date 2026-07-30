package com.google.android.gms.maps;

import android.os.RemoteException;
import p149l.cks0;
import p149l.of50;
import p149l.q3m;
import p149l.uzf0;

/* JADX INFO: renamed from: com.google.android.gms.maps.c */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC2441c extends cks0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ of50 f10428a;

    public BinderC2441c(StreetViewPanoramaFragment.C2431a c2431a, of50 of50Var) {
        this.f10428a = of50Var;
    }

    @Override // p149l.tis0
    /* JADX INFO: renamed from: y0 */
    public final void mo15032y0(q3m q3mVar) throws RemoteException {
        this.f10428a.m164057a(new uzf0(q3mVar));
    }
}
