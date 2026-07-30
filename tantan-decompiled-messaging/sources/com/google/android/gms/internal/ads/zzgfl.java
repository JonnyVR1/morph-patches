package com.google.android.gms.internal.ads;

import p149l.gnr;
import p149l.nfw0;
import p149l.qlw0;

/* JADX INFO: loaded from: classes6.dex */
final class zzgfl extends zzgew {
    final /* synthetic */ RunnableFutureC2292y3 zza;
    private final qlw0 zzb;

    public zzgfl(RunnableFutureC2292y3 runnableFutureC2292y3, qlw0 qlw0Var) {
        this.zza = runnableFutureC2292y3;
        this.zzb = qlw0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        qlw0 qlw0Var = this.zzb;
        gnr gnrVarZza = qlw0Var.zza();
        nfw0.m159282d(gnrVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", qlw0Var);
        return gnrVarZza;
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
    public final /* synthetic */ void zze(Object obj) {
        this.zza.m13025u((gnr) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
