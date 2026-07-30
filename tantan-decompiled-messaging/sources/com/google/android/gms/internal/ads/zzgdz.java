package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzgdz extends zzgew {
    private final Executor zza;
    final /* synthetic */ C2228q3 zzb;

    public zzgdz(C2228q3 c2228q3, Executor executor) {
        this.zzb = c2228q3;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zzd(Throwable th) {
        this.zzb.f10025p = null;
        if (th instanceof ExecutionException) {
            this.zzb.mo13022f(((ExecutionException) th).getCause());
            return;
        }
        boolean z = th instanceof CancellationException;
        C2228q3 c2228q3 = this.zzb;
        if (z) {
            c2228q3.cancel(false);
        } else {
            c2228q3.mo13022f(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zze(Object obj) {
        this.zzb.f10025p = null;
        zzc(obj);
    }

    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.mo13022f(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
