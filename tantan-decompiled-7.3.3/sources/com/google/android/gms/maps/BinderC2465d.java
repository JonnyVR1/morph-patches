package com.google.android.gms.maps;

import android.os.RemoteException;
import p153l.b8g0;
import p153l.h6m;
import p153l.its0;
import p153l.un50;

/* JADX INFO: renamed from: com.google.android.gms.maps.d */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC2465d extends its0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ un50 f10466a;

    public BinderC2465d(StreetViewPanoramaView.C2456a c2456a, un50 un50Var) {
        this.f10466a = un50Var;
    }

    @Override // p153l.zrs0
    /* JADX INFO: renamed from: y0 */
    public final void mo15086y0(h6m h6mVar) throws RemoteException {
        this.f10466a.m196829a(new b8g0(h6mVar));
    }
}
