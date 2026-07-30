package com.google.android.gms.internal.ads;

import p153l.hpr;
import p153l.tow0;
import p153l.wuw0;

/* JADX INFO: loaded from: classes6.dex */
final class zzgfl extends zzgew {
    final /* synthetic */ RunnableFutureC2315y3 zza;
    private final wuw0 zzb;

    public zzgfl(RunnableFutureC2315y3 runnableFutureC2315y3, wuw0 wuw0Var) {
        this.zza = runnableFutureC2315y3;
        this.zzb = wuw0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        wuw0 wuw0Var = this.zzb;
        hpr hprVarZza = wuw0Var.zza();
        tow0.m192089d(hprVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", wuw0Var);
        return hprVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zzd(Throwable th) {
        this.zza.mo13076f(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final /* synthetic */ void zze(Object obj) {
        this.zza.m13079u((hpr) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
