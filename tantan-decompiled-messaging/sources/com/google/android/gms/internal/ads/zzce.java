package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import p149l.g8y0;

/* JADX INFO: loaded from: classes6.dex */
public class zzce extends Exception {
    public final int zzb;
    public final long zzc;
    private static final String zzd = Integer.toString(0, 36);
    private static final String zze = Integer.toString(1, 36);
    private static final String zzf = Integer.toString(2, 36);
    private static final String zzg = Integer.toString(3, 36);
    private static final String zzh = Integer.toString(4, 36);

    @Deprecated
    public static final g8y0 zza = new g8y0() { // from class: l.g1t0
    };

    public zzce(@Nullable String str, @Nullable Throwable th, int i, long j) {
        super(str, th);
        this.zzb = i;
        this.zzc = j;
    }
}
