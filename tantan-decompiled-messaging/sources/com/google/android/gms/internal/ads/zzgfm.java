package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
final class zzgfm extends zzgew {
    final /* synthetic */ RunnableFutureC2292y3 zza;
    private final Callable zzb;

    public zzgfm(RunnableFutureC2292y3 runnableFutureC2292y3, Callable callable) {
        this.zza = runnableFutureC2292y3;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zzd(Throwable th) {
        this.zza.mo13022f(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zze(Object obj) {
        this.zza.mo13021e(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
