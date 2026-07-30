package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzqq implements zzqr {
    private final String zza;
    private final zzpu zzb;

    public zzqq() {
        zzpv zzpvVar = zzpv.NO_OP;
        this.zza = "";
        this.zzb = zzpvVar;
    }

    @Override // com.google.android.libraries.places.internal.zzqr
    public final zzpw zza(String str) {
        return new zzqz(this.zza, str, true, this.zzb, true, true);
    }
}
