package com.google.android.gms.internal.ads;

import p149l.g7x0;
import p149l.h7x0;
import p149l.lmr;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2262u5 extends g7x0 {

    /* JADX INFO: renamed from: a */
    public final C2278w5 f10075a;

    /* JADX INFO: renamed from: b */
    public h7x0 f10076b = m13353a();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzhbx f10077c;

    public C2262u5(zzhbx zzhbxVar) {
        this.f10077c = zzhbxVar;
        this.f10075a = new C2278w5(zzhbxVar, null);
    }

    /* JADX INFO: renamed from: a */
    public final h7x0 m13353a() {
        C2278w5 c2278w5 = this.f10075a;
        if (c2278w5.hasNext()) {
            return c2278w5.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10076b != null;
    }

    @Override // p149l.h7x0
    public final byte zza() {
        h7x0 h7x0Var = this.f10076b;
        if (h7x0Var == null) {
            lmr.m150601a();
            return (byte) 0;
        }
        byte bZza = h7x0Var.zza();
        if (!this.f10076b.hasNext()) {
            this.f10076b = m13353a();
        }
        return bZza;
    }
}
