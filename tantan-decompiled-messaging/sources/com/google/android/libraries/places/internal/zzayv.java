package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzayv {
    private zzayj zza = zzayj.zza;
    private int zzb;
    private boolean zzc;

    public final zzayv zza(zzayj zzayjVar) {
        zzmt.zzc(zzayjVar, "callOptions cannot be null");
        this.zza = zzayjVar;
        return this;
    }

    public final zzayv zzb(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzayv zzc(int i) {
        this.zzb = i;
        return this;
    }

    public final zzayw zzd() {
        return new zzayw(this.zza, this.zzb, this.zzc);
    }
}
