package com.google.android.gms.internal.ads;

import p153l.mgx0;
import p153l.mor;
import p153l.ngx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2285u5 extends mgx0 {

    /* JADX INFO: renamed from: a */
    public final C2301w5 f10112a;

    /* JADX INFO: renamed from: b */
    public ngx0 f10113b = m13407a();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzhbx f10114c;

    public C2285u5(zzhbx zzhbxVar) {
        this.f10114c = zzhbxVar;
        this.f10112a = new C2301w5(zzhbxVar, null);
    }

    /* JADX INFO: renamed from: a */
    public final ngx0 m13407a() {
        C2301w5 c2301w5 = this.f10112a;
        if (c2301w5.hasNext()) {
            return c2301w5.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10113b != null;
    }

    @Override // p153l.ngx0
    public final byte zza() {
        ngx0 ngx0Var = this.f10113b;
        if (ngx0Var == null) {
            mor.m159308a();
            return (byte) 0;
        }
        byte bZza = ngx0Var.zza();
        if (!this.f10113b.hasNext()) {
            this.f10113b = m13407a();
        }
        return bZza;
    }
}
