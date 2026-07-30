package com.google.android.libraries.places.internal;

import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbuj {
    private zzbui zza;
    private final zzbtb zzb = new zzbtb();

    public final zzbuj zzc(String str, String str2) {
        this.zzb.zza(str, str2);
        return this;
    }

    public final zzbuj zzd(zzbui zzbuiVar) {
        this.zza = zzbuiVar;
        return this;
    }

    public final zzbul zze() {
        if (this.zza != null) {
            return new zzbul(this, null);
        }
        qkq0.m175383a("url == null");
        return null;
    }
}
