package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbaj {
    private Object zza;

    public /* synthetic */ zzbaj(zzbai zzbaiVar) {
    }

    public final zzbaj zza(Object obj) {
        this.zza = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzbal zzb() {
        zzmt.zzp(this.zza != null, "config is not set");
        return new zzbal(zzbdo.zza, this.zza, null, 0 == true ? 1 : 0);
    }

    private zzbaj() {
        throw null;
    }
}
