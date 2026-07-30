package com.google.android.libraries.places.internal;

import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbik {
    private final Random zza = new Random();
    private final long zzb = 1000000000;
    private final long zzc = 120000000000L;
    private long zzd = 1000000000;

    public final long zza() {
        long j = this.zzd;
        double d = j;
        this.zzd = Math.min((long) (1.6d * d), this.zzc);
        double d2 = 0.2d * d;
        double d3 = d * (-0.2d);
        zzmt.zze(d2 >= d3);
        return j + ((long) ((this.zza.nextDouble() * (d2 - d3)) + d3));
    }
}
