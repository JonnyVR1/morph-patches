package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
final class zzgdy extends zzgdz {
    final /* synthetic */ C2228q3 zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgdy(C2228q3 c2228q3, Callable callable, Executor executor) {
        super(c2228q3, executor);
        this.zza = c2228q3;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    public final void zzc(Object obj) {
        this.zza.mo13021e(obj);
    }
}
