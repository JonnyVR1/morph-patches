package com.google.android.libraries.places.internal;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
final class zzboy {
    final Object zza;
    Future zzb;
    boolean zzc;

    public zzboy(Object obj) {
        this.zza = obj;
    }

    public final Future zza() {
        this.zzc = true;
        return this.zzb;
    }

    public final void zzb(Future future) {
        boolean z;
        synchronized (this.zza) {
            try {
                z = this.zzc;
                if (!z) {
                    this.zzb = future;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }
}
