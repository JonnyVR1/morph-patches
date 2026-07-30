package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
final class zzgdy extends zzgdz {
    final /* synthetic */ C2251q3 zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgdy(C2251q3 c2251q3, Callable callable, Executor executor) {
        super(c2251q3, executor);
        this.zza = c2251q3;
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
        this.zza.mo13075e(obj);
    }
}
