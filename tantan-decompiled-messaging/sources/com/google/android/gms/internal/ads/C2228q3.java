package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2228q3 extends AbstractC2212o3 {

    /* JADX INFO: renamed from: p */
    public zzgdz f10025p;

    public C2228q3(zzfzv zzfzvVar, boolean z, Executor executor, Callable callable) {
        super(zzfzvVar, z, false);
        this.f10025p = new zzgdy(this, callable, executor);
        m13083R();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2212o3
    /* JADX INFO: renamed from: P */
    public final void mo13081P(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2212o3
    /* JADX INFO: renamed from: Q */
    public final void mo13082Q() {
        zzgdz zzgdzVar = this.f10025p;
        if (zzgdzVar != null) {
            zzgdzVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2212o3
    /* JADX INFO: renamed from: U */
    public final void mo13086U(int i) {
        super.mo13086U(i);
        if (i == 1) {
            this.f10025p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    /* JADX INFO: renamed from: s */
    public final void mo13023s() {
        zzgdz zzgdzVar = this.f10025p;
        if (zzgdzVar != null) {
            zzgdzVar.zzh();
        }
    }
}
