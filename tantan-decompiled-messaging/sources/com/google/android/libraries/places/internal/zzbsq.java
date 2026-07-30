package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import p149l.aag0;
import p149l.k250;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbsq {
    final /* synthetic */ zzbsu zza;
    private final int zzc;
    private int zzd;
    private int zze;
    private final zzbsp zzf;
    private final zzbwb zzb = new zzbwb();
    private boolean zzg = false;

    public zzbsq(zzbsu zzbsuVar, int i, int i2, zzbsp zzbspVar) {
        this.zza = zzbsuVar;
        this.zzc = i;
        this.zzd = i2;
        this.zzf = zzbspVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb(int i) {
        if (i > 0 && Api.BaseClientBuilder.API_PRIORITY_OTHER - i < this.zzd) {
            k250.m144273a("Window size overflow for stream: ", this.zzc);
            return 0;
        }
        int i2 = this.zzd + i;
        this.zzd = i2;
        return i2;
    }

    public final int zzc() {
        return Math.max(0, Math.min(this.zzd, (int) this.zzb.zzg())) - this.zze;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final int zze() {
        return Math.min(this.zzd, this.zza.zzd.zzd);
    }

    public final int zzf(int i, zzbst zzbstVar) {
        int iMin = Math.min(i, zze());
        int iZzg = 0;
        while (zzk() && iMin > 0) {
            zzbwb zzbwbVar = this.zzb;
            if (iMin >= zzbwbVar.zzg()) {
                iZzg += (int) zzbwbVar.zzg();
                zzj(zzbwbVar, (int) zzbwbVar.zzg(), this.zzg);
            } else {
                iZzg += iMin;
                zzj(zzbwbVar, iMin, false);
            }
            zzbstVar.zza++;
            iMin = Math.min(i - iZzg, zze());
        }
        return iZzg;
    }

    public final void zzg(int i) {
        this.zze += i;
    }

    public final void zzh() {
        this.zze = 0;
    }

    public final void zzi(zzbwb zzbwbVar, int i, boolean z) {
        this.zzb.zzn(zzbwbVar, i);
        this.zzg |= z;
    }

    public final void zzj(zzbwb zzbwbVar, int i, boolean z) {
        do {
            int iMin = Math.min(i, this.zza.zzb.zzd());
            int i2 = -iMin;
            this.zza.zzd.zzb(i2);
            zzb(i2);
            try {
                boolean z2 = false;
                if (zzbwbVar.zzg() == iMin && z) {
                    z2 = true;
                }
                this.zza.zzb.zzf(z2, this.zzc, zzbwbVar, iMin);
                this.zzf.zzs(iMin);
                i -= iMin;
            } catch (IOException e) {
                aag0.m95543a(e);
                return;
            }
        } while (i > 0);
    }

    public final boolean zzk() {
        return this.zzb.zzg() > 0;
    }
}
