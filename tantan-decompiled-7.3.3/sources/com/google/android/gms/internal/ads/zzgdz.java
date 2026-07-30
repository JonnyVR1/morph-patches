package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzgdz extends zzgew {
    private final Executor zza;
    final /* synthetic */ C2251q3 zzb;

    public zzgdz(C2251q3 c2251q3, Executor executor) {
        this.zzb = c2251q3;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zzd(Throwable th) {
        this.zzb.f10062p = null;
        if (th instanceof ExecutionException) {
            this.zzb.mo13076f(((ExecutionException) th).getCause());
            return;
        }
        boolean z = th instanceof CancellationException;
        C2251q3 c2251q3 = this.zzb;
        if (z) {
            c2251q3.cancel(false);
        } else {
            c2251q3.mo13076f(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zze(Object obj) {
        this.zzb.f10062p = null;
        zzc(obj);
    }

    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.mo13076f(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
