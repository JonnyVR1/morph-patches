package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbdt implements Runnable {
    final Runnable zza;
    boolean zzb;
    boolean zzc;

    public zzbdt(Runnable runnable) {
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zzc = true;
        this.zza.run();
    }
}
