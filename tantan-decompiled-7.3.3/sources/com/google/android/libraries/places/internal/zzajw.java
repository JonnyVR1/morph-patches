package com.google.android.libraries.places.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
final class zzajw implements Runnable {
    final Future zza;
    final zzajv zzb;

    public zzajw(Future future, zzajv zzajvVar) {
        this.zza = future;
        this.zzb = zzajvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thZza = zzakf.zza((zzake) this.zza);
        if (thZza != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            Future future = this.zza;
            zzmt.zzr(future.isDone(), "Future was expected to be done: %s", future);
            boolean z = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzmm zzmmVarZzb = zzmn.zzb(this);
        zzmmVarZzb.zzf(this.zzb);
        return zzmmVarZzb.toString();
    }
}
