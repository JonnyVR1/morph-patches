package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbue {
    private int zza;
    private final int[] zzb = new int[10];

    public final int zza(int i) {
        return this.zzb[i];
    }

    public final int zzb() {
        if ((this.zza & 2) != 0) {
            return this.zzb[1];
        }
        return -1;
    }

    public final int zzc(int i) {
        return (this.zza & 32) != 0 ? this.zzb[5] : i;
    }

    public final int zzd() {
        return Integer.bitCount(this.zza);
    }

    public final zzbue zze(int i, int i2, int i3) {
        if (i >= 10) {
            return this;
        }
        this.zza = (1 << i) | this.zza;
        this.zzb[i] = i3;
        return this;
    }

    public final boolean zzf(int i) {
        return (this.zza & (1 << i)) != 0;
    }
}
