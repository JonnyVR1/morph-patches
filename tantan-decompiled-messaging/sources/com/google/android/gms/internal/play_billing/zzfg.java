package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
final class zzfg extends zzes {
    final /* synthetic */ RunnableFutureC2413u zza;
    private final Callable zzb;

    public zzfg(RunnableFutureC2413u runnableFutureC2413u, Callable callable) {
        this.zza = runnableFutureC2413u;
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
        this.zza.m14897o(th);
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final void zzd(Object obj) {
        this.zza.m14896n(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final boolean zzf() {
        return this.zza.isDone();
    }
}
