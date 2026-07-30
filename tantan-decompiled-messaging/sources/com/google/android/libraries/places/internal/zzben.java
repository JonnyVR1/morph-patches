package com.google.android.libraries.places.internal;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes7.dex */
public final class zzben {
    final /* synthetic */ zzbeo zza;
    private final long zzb;

    public /* synthetic */ zzben(zzbeo zzbeoVar, long j, zzbem zzbemVar) {
        this.zza = zzbeoVar;
        this.zzb = j;
    }

    public final void zza() {
        zzbeo zzbeoVar = this.zza;
        long j = this.zzb;
        long jMax = Math.max(j + j, j);
        if (zzbeoVar.zzc.compareAndSet(j, jMax)) {
            zzbeo.zza.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{this.zza.zzb, Long.valueOf(jMax)});
        }
    }
}
