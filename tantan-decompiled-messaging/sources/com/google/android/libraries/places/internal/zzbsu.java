package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import p149l.aag0;
import p149l.j6f;
import p149l.k250;

/* JADX INFO: loaded from: classes7.dex */
final class zzbsu {
    private final zzbsr zza;
    private final zzbts zzb;
    private int zzc;
    private final zzbsq zzd;

    public zzbsu(zzbsr zzbsrVar, zzbts zzbtsVar) {
        this.zza = zzbsrVar;
        zzmt.zzc(zzbtsVar, "frameWriter");
        this.zzb = zzbtsVar;
        this.zzc = j6f.COLOR_SPACE_UNCALIBRATED;
        this.zzd = new zzbsq(this, 0, j6f.COLOR_SPACE_UNCALIBRATED, null);
    }

    public final int zza(zzbsq zzbsqVar, int i) {
        if (zzbsqVar == null) {
            int iZzb = this.zzd.zzb(i);
            zzg();
            return iZzb;
        }
        int iZzb2 = zzbsqVar.zzb(i);
        zzbst zzbstVar = new zzbst(null);
        zzbsqVar.zzf(zzbsqVar.zze(), zzbstVar);
        if (!zzbstVar.zza()) {
            return iZzb2;
        }
        zzf();
        return iZzb2;
    }

    public final zzbsq zzc(zzbsp zzbspVar, int i) {
        return new zzbsq(this, i, this.zzc, zzbspVar);
    }

    public final void zze(boolean z, zzbsq zzbsqVar, zzbwb zzbwbVar, boolean z2) {
        zzmt.zzc(zzbwbVar, "source");
        int iZze = zzbsqVar.zze();
        boolean zZzk = zzbsqVar.zzk();
        int iZzg = (int) zzbwbVar.zzg();
        if (zZzk || iZze < iZzg) {
            if (!zZzk && iZze > 0) {
                zzbsqVar.zzj(zzbwbVar, iZze, false);
            }
            zzbsqVar.zzi(zzbwbVar, (int) zzbwbVar.zzg(), z);
        } else {
            zzbsqVar.zzj(zzbwbVar, iZzg, z);
        }
        if (z2) {
            zzf();
        }
    }

    public final void zzf() {
        try {
            this.zzb.zzg();
        } catch (IOException e) {
            aag0.m95543a(e);
        }
    }

    public final void zzg() {
        int i;
        zzbsq[] zzbsqVarArrZzV = this.zza.zzV();
        Collections.shuffle(Arrays.asList(zzbsqVarArrZzV));
        int length = zzbsqVarArrZzV.length;
        int iZzd = this.zzd.zzd();
        while (true) {
            i = 0;
            if (length <= 0 || iZzd <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(iZzd / length);
            for (int i2 = 0; i2 < length && iZzd > 0; i2++) {
                zzbsq zzbsqVar = zzbsqVarArrZzV[i2];
                int iMin = Math.min(iZzd, Math.min(zzbsqVar.zzc(), iCeil));
                if (iMin > 0) {
                    zzbsqVar.zzg(iMin);
                    iZzd -= iMin;
                }
                if (zzbsqVar.zzc() > 0) {
                    zzbsqVarArrZzV[i] = zzbsqVar;
                    i++;
                }
            }
            length = i;
        }
        zzbst zzbstVar = new zzbst(null);
        zzbsq[] zzbsqVarArrZzV2 = this.zza.zzV();
        int length2 = zzbsqVarArrZzV2.length;
        while (i < length2) {
            zzbsq zzbsqVar2 = zzbsqVarArrZzV2[i];
            zzbsqVar2.zzf(zzbsqVar2.zza(), zzbstVar);
            zzbsqVar2.zzh();
            i++;
        }
        if (zzbstVar.zza()) {
            zzf();
        }
    }

    public final boolean zzh(int i) {
        if (i < 0) {
            k250.m144273a("Invalid initial window size: ", i);
            return false;
        }
        int i2 = i - this.zzc;
        this.zzc = i;
        for (zzbsq zzbsqVar : this.zza.zzV()) {
            zzbsqVar.zzb(i2);
        }
        return i2 > 0;
    }
}
