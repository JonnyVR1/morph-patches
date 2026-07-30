package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbnn implements Runnable {
    final /* synthetic */ zzbno zza;

    public zzbnn(zzbno zzbnoVar) {
        this.zza = zzbnoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zza();
    }
}
