package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzbre implements Runnable {
    final /* synthetic */ zzbri zza;

    public zzbre(zzbri zzbriVar) {
        this.zza = zzbriVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzbri zzbriVar = this.zza;
            if (zzbriVar.zzh != null && zzbriVar.zzb.zzg() > 0) {
                zzbriVar.zzh.zzn(zzbriVar.zzb, zzbriVar.zzb.zzg());
            }
        } catch (IOException e) {
            this.zza.zzd.zzb(e);
        }
        try {
            zzbri zzbriVar2 = this.zza;
            if (zzbriVar2.zzh != null) {
                zzbriVar2.zzh.close();
            }
        } catch (IOException e2) {
            this.zza.zzd.zzb(e2);
        }
        try {
            zzbri zzbriVar3 = this.zza;
            if (zzbriVar3.zzi != null) {
                zzbriVar3.zzi.close();
            }
        } catch (IOException e3) {
            this.zza.zzd.zzb(e3);
        }
    }
}
