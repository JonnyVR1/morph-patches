package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
final class zzbob implements Runnable {
    final /* synthetic */ zzboe zza;

    public /* synthetic */ zzbob(zzboe zzboeVar, zzboa zzboaVar) {
        this.zza = zzboeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzboe zzboeVar = this.zza;
        zzboc zzbocVar = null;
        if (!zzboeVar.zzf) {
            zzboeVar.zzg = null;
            return;
        }
        long jZzk = zzboeVar.zzk();
        long j = zzboeVar.zze - jZzk;
        zzboe zzboeVar2 = this.zza;
        if (j > 0) {
            zzboeVar2.zzg = zzboeVar2.zza.schedule(new zzbod(zzboeVar2, zzbocVar), zzboeVar2.zze - jZzk, TimeUnit.NANOSECONDS);
            return;
        }
        zzboeVar2.zzf = false;
        this.zza.zzg = null;
        this.zza.zzc.run();
    }
}
