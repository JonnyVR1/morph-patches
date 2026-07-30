package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2251q3 extends AbstractC2235o3 {

    /* JADX INFO: renamed from: p */
    public zzgdz f10062p;

    public C2251q3(zzfzv zzfzvVar, boolean z, Executor executor, Callable callable) {
        super(zzfzvVar, z, false);
        this.f10062p = new zzgdy(this, callable, executor);
        m13137R();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2235o3
    /* JADX INFO: renamed from: P */
    public final void mo13135P(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2235o3
    /* JADX INFO: renamed from: Q */
    public final void mo13136Q() {
        zzgdz zzgdzVar = this.f10062p;
        if (zzgdzVar != null) {
            zzgdzVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2235o3
    /* JADX INFO: renamed from: U */
    public final void mo13140U(int i) {
        super.mo13140U(i);
        if (i == 1) {
            this.f10062p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    /* JADX INFO: renamed from: s */
    public final void mo13077s() {
        zzgdz zzgdzVar = this.f10062p;
        if (zzgdzVar != null) {
            zzgdzVar.zzh();
        }
    }
}
