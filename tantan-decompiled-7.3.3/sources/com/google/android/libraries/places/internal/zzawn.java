package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzawn {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i, int i2);

    public abstract void zzi(Object obj, int i, long j);

    public abstract void zzj(Object obj, int i, Object obj2);

    public abstract void zzk(Object obj, int i, zzask zzaskVar);

    public abstract void zzl(Object obj, int i, long j);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public final boolean zzp(Object obj, zzavs zzavsVar) throws IOException {
        int iZzd = zzavsVar.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzavsVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zzi(obj, i, zzavsVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzk(obj, i, zzavsVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzauf.zza();
            }
            zzh(obj, i, zzavsVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i3 = i << 3;
        while (zzavsVar.zzc() != Integer.MAX_VALUE && zzp(objZzf, zzavsVar)) {
        }
        if ((4 | i3) != zzavsVar.zzd()) {
            throw zzauf.zzb();
        }
        zzg(objZzf);
        zzj(obj, i, objZzf);
        return true;
    }

    public abstract boolean zzq(zzavs zzavsVar);

    public abstract void zzr(Object obj, zzasy zzasyVar) throws IOException;

    public abstract void zzs(Object obj, zzasy zzasyVar) throws IOException;
}
