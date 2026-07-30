package com.google.android.libraries.places.api.model;

import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzm extends zzca {
    private int zza;
    private int zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.libraries.places.api.model.zzca
    public final zzca zza(int i) {
        this.zzc = i;
        this.zzd = (byte) (this.zzd | 4);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzca
    public final zzca zzb(int i) {
        this.zzb = i;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zzca zzc(int i) {
        this.zza = i;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzca
    public final LocalDate zzd() {
        if (this.zzd == 7) {
            return new zzba(this.zza, this.zzb, this.zzc);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb.append(" year");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" month");
        }
        if ((this.zzd & 4) == 0) {
            sb.append(" day");
        }
        qkq0.m175383a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
