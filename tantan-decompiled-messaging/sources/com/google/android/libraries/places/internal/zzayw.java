package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzayw {
    private final zzayj zza;
    private final int zzb;
    private final boolean zzc;

    public zzayw(zzayj zzayjVar, int i, boolean z) {
        zzmt.zzc(zzayjVar, "callOptions");
        this.zza = zzayjVar;
        this.zzb = i;
        this.zzc = z;
    }

    public static zzayv zza() {
        return new zzayv();
    }

    public final String toString() {
        zzmm zzmmVarZzb = zzmn.zzb(this);
        zzmmVarZzb.zzd("callOptions", this.zza);
        zzmmVarZzb.zzb("previousAttempts", this.zzb);
        zzmmVarZzb.zze("isTransparentRetry", this.zzc);
        return zzmmVarZzb.toString();
    }
}
