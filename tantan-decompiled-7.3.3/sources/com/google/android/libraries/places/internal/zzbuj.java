package com.google.android.libraries.places.internal;

import p153l.wtq0;

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
        wtq0.m207906a("url == null");
        return null;
    }
}
