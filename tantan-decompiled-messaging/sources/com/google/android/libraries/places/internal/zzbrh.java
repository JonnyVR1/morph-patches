package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzbrh implements Runnable {
    final /* synthetic */ zzbri zzc;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.zzc.zzh == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            zza();
        } catch (Exception e) {
            this.zzc.zzd.zzb(e);
        }
    }

    public abstract void zza() throws IOException;
}
