package com.google.android.libraries.places.internal;

import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzjx extends zzka {
    private String zza;
    private int zzb;
    private byte zzc;
    private int zzd;

    public final zzka zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        mnd0.m159157a("Null packageName");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzka
    public final zzka zzb(int i) {
        this.zzb = i;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzka
    public final zzkb zzc() {
        String str;
        int i;
        zzjy zzjyVar = null;
        if (this.zzc == 1 && (str = this.zza) != null && (i = this.zzd) != 0) {
            return new zzjz(str, this.zzb, i, zzjyVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" packageName");
        }
        if (this.zzc == 0) {
            sb.append(" versionCode");
        }
        if (this.zzd == 0) {
            sb.append(" requestSource");
        }
        wtq0.m207906a("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzka
    public final zzka zzd(int i) {
        this.zzd = i;
        return this;
    }
}
