package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzazt extends zzbbs {
    public final String toString() {
        zzmm zzmmVarZzb = zzmn.zzb(this);
        zzmmVarZzb.zzd("delegate", zzb());
        return zzmmVarZzb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbbs
    public final zzbbr zza() {
        return zzb().zza();
    }

    public abstract zzbbs zzb();
}
