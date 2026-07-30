package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
final class zzfg extends zzes {
    final /* synthetic */ RunnableFutureC2436u zza;
    private final Callable zzb;

    public zzfg(RunnableFutureC2436u runnableFutureC2436u, Callable callable) {
        this.zza = runnableFutureC2436u;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final void zzc(Throwable th) {
        this.zza.m14951o(th);
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final void zzd(Object obj) {
        this.zza.m14950n(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final boolean zzf() {
        return this.zza.isDone();
    }
}
